package de.budschie.worseores.entity;

import java.util.HashMap;

import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
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
	
	private static ModifiableAttributeInstance createAttribute(Attribute attrib, double value)
	{
		ModifiableAttributeInstance instance = new ModifiableAttributeInstance(Attributes.MAX_HEALTH, inst -> inst.setBaseValue(value));
		instance.setBaseValue(value);
		
		return instance;
	}
	
	public static AttributeModifierMap setupAttributes()
	{
		HashMap<Attribute, ModifiableAttributeInstance> attributeMap = new HashMap<>();
		
		attributeMap.put(Attributes.MAX_HEALTH, createAttribute(Attributes.MAX_HEALTH, 40));
        attributeMap.put(Attributes.ATTACK_DAMAGE, createAttribute(Attributes.ATTACK_DAMAGE, 10));
        attributeMap.put(Attributes.MOVEMENT_SPEED, createAttribute(Attributes.MOVEMENT_SPEED, 0.35));
        attributeMap.put(Attributes.FOLLOW_RANGE, createAttribute(Attributes.FOLLOW_RANGE, 20));
        attributeMap.put(Attributes.ARMOR, createAttribute(Attributes.ARMOR, 0));
        attributeMap.put(Attributes.ARMOR_TOUGHNESS, createAttribute(Attributes.ARMOR_TOUGHNESS, 0));
        attributeMap.put(Attributes.KNOCKBACK_RESISTANCE, createAttribute(Attributes.KNOCKBACK_RESISTANCE, 0));
        attributeMap.put(ForgeMod.ENTITY_GRAVITY.get(), createAttribute(ForgeMod.ENTITY_GRAVITY.get(), 1));
        attributeMap.put(ForgeMod.SWIM_SPEED.get(), createAttribute(ForgeMod.SWIM_SPEED.get(), 3));
        attributeMap.put(Attributes.ATTACK_KNOCKBACK, createAttribute(Attributes.ATTACK_KNOCKBACK, 1));
        
		AttributeModifierMap modMap = new AttributeModifierMap(attributeMap);
		
		return modMap;
	}
	
	

	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1, false));
		this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(1, new SwimGoal(this));
		
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, LivingEntity.class, false));
	}
	
	@Override
	protected float getSoundPitch()
	{
		return 0.5f;
	}
	
	@Override
	public void playAmbientSound()
	{
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
