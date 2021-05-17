package de.budschie.worseores.entity;

import java.util.HashMap;

import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeMod;

public class TripleHeadedSheepEntity extends CreatureEntity
{
	protected TripleHeadedSheepEntity(EntityType<? extends CreatureEntity> type, World worldIn)
	{
		super(type, worldIn);
	}
	
	public static AttributeModifierMap setupAttributes()
	{
		HashMap<Attribute, ModifiableAttributeInstance> attributeMap = new HashMap<>();
		
		attributeMap.put(Attributes.MAX_HEALTH, new ModifiableAttributeInstance(Attributes.MAX_HEALTH, inst -> inst.setBaseValue(1)));
		attributeMap.put(Attributes.MOVEMENT_SPEED, new ModifiableAttributeInstance(Attributes.MOVEMENT_SPEED, inst -> inst.setBaseValue(.05)));
		attributeMap.put(Attributes.ATTACK_DAMAGE, new ModifiableAttributeInstance(Attributes.ATTACK_DAMAGE, inst -> inst.setBaseValue(2000)));
		attributeMap.put(Attributes.FOLLOW_RANGE, new ModifiableAttributeInstance(Attributes.FOLLOW_RANGE, inst -> inst.setBaseValue(20)));
		attributeMap.put(Attributes.ARMOR, new ModifiableAttributeInstance(Attributes.ARMOR, inst -> inst.setBaseValue(10)));
		attributeMap.put(Attributes.ARMOR_TOUGHNESS, new ModifiableAttributeInstance(Attributes.ARMOR_TOUGHNESS, inst -> inst.setBaseValue(0)));
		attributeMap.put(Attributes.KNOCKBACK_RESISTANCE, new ModifiableAttributeInstance(Attributes.KNOCKBACK_RESISTANCE, inst -> inst.setBaseValue(0)));
		attributeMap.put(ForgeMod.ENTITY_GRAVITY.get(), new ModifiableAttributeInstance(ForgeMod.ENTITY_GRAVITY.get(), inst -> inst.setBaseValue(1)));
		attributeMap.put(ForgeMod.SWIM_SPEED.get(), new ModifiableAttributeInstance(ForgeMod.SWIM_SPEED.get(), inst -> inst.setBaseValue(1)));
		attributeMap.put(Attributes.ATTACK_KNOCKBACK, new ModifiableAttributeInstance(Attributes.ATTACK_KNOCKBACK, inst -> inst.setBaseValue(1)));
        
		AttributeModifierMap modMap = new AttributeModifierMap(attributeMap);
		return modMap;
	}

	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, .4f, false));
		this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(1, new SwimGoal(this));
		
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false));
	}
	
	@Override
	protected float getSoundPitch()
	{
		return 0.5f;
	}
	
	@Override
	public void playAmbientSound()
	{
		System.out.println(this.getAttributeValue(Attributes.ATTACK_DAMAGE));
		
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getSoundPitch());
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getSoundPitch() + 0.3f);
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getSoundPitch() + 0.2f);
	}
	
	@Override
	protected void playHurtSound(DamageSource source)
	{
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getSoundPitch());
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getSoundPitch() + 0.3f);
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getSoundPitch() + 0.2f);
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.ENTITY_SHEEP_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.ENTITY_SHEEP_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_SHEEP_DEATH;
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn)
	{
	      this.playSound(SoundEvents.ENTITY_SHEEP_STEP, 0.25F, 0.5F);
	}
}
