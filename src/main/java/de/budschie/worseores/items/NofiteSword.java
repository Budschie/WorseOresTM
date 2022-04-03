package de.budschie.worseores.items;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class NofiteSword extends SwordItem
{

	public NofiteSword(Properties builderIn)
	{
		super(new Tier()
		{
			@Override
			public Ingredient getRepairIngredient()
			{
				return Ingredient.of(() -> ItemRegistry.NOFITE_INGOT.get());
			}
			
			@Override
			public int getUses()
			{
				return 1256;
			}
			
			@Override
			public int getLevel()
			{
				return 69;
			}
			
			@Override
			public int getEnchantmentValue()
			{
				// ITS OVER NINETHOUSAND
				return 9001;
			}
			
			@Override
			public float getSpeed()
			{
				return 10;
			}
			
			@Override
			public float getAttackDamageBonus()
			{
				return 110;
			}
		}, 110, 1, builderIn);
	}
}
