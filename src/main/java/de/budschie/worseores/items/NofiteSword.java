package de.budschie.worseores.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;

public class NofiteSword extends SwordItem
{

	public NofiteSword(Properties builderIn)
	{
		super(new IItemTier()
		{
			@Override
			public Ingredient getRepairMaterial()
			{
				return Ingredient.fromItems(() -> ItemRegistry.NOFITE_INGOT.get());
			}
			
			@Override
			public int getMaxUses()
			{
				return 1256;
			}
			
			@Override
			public int getHarvestLevel()
			{
				return 69;
			}
			
			@Override
			public int getEnchantability()
			{
				// ITS OVER NINETHOUSAND
				return 9001;
			}
			
			@Override
			public float getEfficiency()
			{
				return 10;
			}
			
			@Override
			public float getAttackDamage()
			{
				return 110;
			}
		}, 110, 1, builderIn);
	}
}
