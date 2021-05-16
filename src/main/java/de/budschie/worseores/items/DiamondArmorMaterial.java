package de.budschie.worseores.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class DiamondArmorMaterial implements IArmorMaterial
{	
	@Override
	public int getDurability(EquipmentSlotType slotIn)
	{
		return 1200;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn)
	{
		return 1;
	}

	@Override
	public int getEnchantability()
	{
		return 10000;
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return Ingredient.fromItems(() -> ItemRegistry.DIAMOND.get());
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
