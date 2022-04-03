package de.budschie.worseores.items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class DiamondItemTier implements Tier
{
	@Override
	public int getUses()
	{
		return 1200;
	}

	@Override
	public float getSpeed()
	{
		return -1;
	}

	@Override
	public float getAttackDamageBonus()
	{
		return -5;
	}

	@Override
	public int getLevel()
	{
		return 100000;
	}

	@Override
	public int getEnchantmentValue()
	{
		return 100000;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(() -> ItemRegistry.DIAMOND.get());
	}

}
