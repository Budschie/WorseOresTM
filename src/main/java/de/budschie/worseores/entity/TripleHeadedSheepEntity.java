package de.budschie.worseores.entity;

import java.util.HashMap;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeMod;

public class TripleHeadedSheepEntity extends PathfinderMob
{
	protected TripleHeadedSheepEntity(EntityType<? extends PathfinderMob> type, Level worldIn)
	{
		super(type, worldIn);
	}
	
	private static AttributeInstance createAttribute(Attribute attrib, double value)
	{
		AttributeInstance instance = new AttributeInstance(Attributes.MAX_HEALTH, inst -> inst.setBaseValue(value));
		instance.setBaseValue(value);
		
		return instance;
	}
	
	public static AttributeSupplier setupAttributes()
	{
		HashMap<Attribute, AttributeInstance> attributeMap = new HashMap<>();
		
		attributeMap.put(Attributes.MAX_HEALTH, createAttribute(Attributes.MAX_HEALTH, 40));
        attributeMap.put(Attributes.ATTACK_DAMAGE, createAttribute(Attributes.ATTACK_DAMAGE, 10));
        attributeMap.put(Attributes.MOVEMENT_SPEED, createAttribute(Attributes.MOVEMENT_SPEED, 0.35));
        attributeMap.put(Attributes.FOLLOW_RANGE, createAttribute(Attributes.FOLLOW_RANGE, 20));
        attributeMap.put(Attributes.ARMOR, createAttribute(Attributes.ARMOR, 0));
        attributeMap.put(Attributes.ARMOR_TOUGHNESS, createAttribute(Attributes.ARMOR_TOUGHNESS, 0));
        attributeMap.put(Attributes.KNOCKBACK_RESISTANCE, createAttribute(Attributes.KNOCKBACK_RESISTANCE, 0));
        attributeMap.put(ForgeMod.ENTITY_GRAVITY.get(), createAttribute(ForgeMod.ENTITY_GRAVITY.get(), 0.08D));
        attributeMap.put(ForgeMod.SWIM_SPEED.get(), createAttribute(ForgeMod.SWIM_SPEED.get(), 3));
        attributeMap.put(Attributes.ATTACK_KNOCKBACK, createAttribute(Attributes.ATTACK_KNOCKBACK, 1));
        
		AttributeSupplier modMap = new AttributeSupplier(attributeMap);
		
		return modMap;
	}
	
	

	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1, false));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(1, new FloatGoal(this));
		
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, LivingEntity.class, false));
	}
	
	@Override
	public float getVoicePitch()
	{
		return 0.5f;
	}
	
	@Override
	public void playAmbientSound()
	{
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getVoicePitch());
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getVoicePitch() + 0.3f);
        this.playSound(getAmbientSound(), this.getSoundVolume(), this.getVoicePitch() + 0.2f);
	}
	
	@Override
	protected void playHurtSound(DamageSource source)
	{
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getVoicePitch());
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getVoicePitch() + 0.3f);
        this.playSound(getHurtSound(source), this.getSoundVolume(), this.getVoicePitch() + 0.2f);
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.SHEEP_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.SHEEP_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.SHEEP_DEATH;
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn)
	{
	      this.playSound(SoundEvents.SHEEP_STEP, 0.25F, 0.5F);
	}
}
