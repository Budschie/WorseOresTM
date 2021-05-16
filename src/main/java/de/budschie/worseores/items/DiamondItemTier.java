package de.budschie.worseores.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class DiamondItemTier implements IItemTier
{
	@Override
	public int getMaxUses()
	{
		return 1200;
	}

	@Override
	public float getEfficiency()
	{
		return -1;
	}

	@Override
	public float getAttackDamage()
	{
		return -5;
	}

	@Override
	public int getHarvestLevel()
	{
		return 100000;
	}

	@Override
	public int getEnchantability()
	{
		return 100000;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return Ingredient.fromItems(() -> ItemRegistry.DIAMOND.get());
	}

}
