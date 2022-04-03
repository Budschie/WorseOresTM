package de.budschie.worseores.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class DiamondArmorMaterial implements ArmorMaterial
{	
	@Override
	public int getDurabilityForSlot(EquipmentSlot slotIn)
	{
		return 1200;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slotIn)
	{
		return 1;
	}

	@Override
	public int getEnchantmentValue()
	{
		return 10000;
	}

	@Override
	public SoundEvent getEquipSound()
	{
		return SoundEvents.ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(() -> ItemRegistry.DIAMOND.get());
	}

	@Override
	public String getName()
	{
		return "diamond";
	}

	@Override
	public float getToughness()
	{
		return 1;
	}

	@Override
	public float getKnockbackResistance()
	{
		return 10000;
	}
}
