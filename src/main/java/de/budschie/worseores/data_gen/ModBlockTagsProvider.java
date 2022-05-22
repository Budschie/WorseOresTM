package de.budschie.worseores.data_gen;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static de.budschie.worseores.blocks.BlockRegistry.*;

public class ModBlockTagsProvider extends TagsProvider<Block>
{
	protected ModBlockTagsProvider(DataGenerator dataGenerator, String modId, @Nullable ExistingFileHelper existingFileHelper)
	{
		super(dataGenerator, Registry.BLOCK, modId, existingFileHelper);
	}

	@Override
	public String getName()
	{
		return "Worse Ores Block Tags";
	}

	@Override
	protected void addTags()
	{
		// Add pickaxe mineables
		addTags(BlockTags.MINEABLE_WITH_PICKAXE, COPPER_ORE, COMPRESSED_ALOTOSTUFFIUM, AMADEUM_ORE, APPETITE_ORE, ENDERITE_ORE, EXPLODEMITE_ORE, IDLIKEABITE_ORE, SMITEANDLITE_ORE, NOFITE_ORE, KILLIUM_ORE, RANDOMIUM_ORE, DOGECOIN_ORE, MOBIUM_ORE, DREAMIUM_ORE, TRIPLITE_ORE, LITEINNITE_ORE, MEMENITE_ORE, BESTFORGE_ORE, DIAMOND_ORE, DIAMOND_BLOCK, DEEPSLATE_ALOTOSTUFFIUM_ORE, DEEPSLATE_KILLIUM_ORE, DEEPSLATE_RANDOMIUM_ORE);
		addTags(BlockTags.NEEDS_STONE_TOOL, COPPER_ORE, COMPRESSED_ALOTOSTUFFIUM, AMADEUM_ORE, APPETITE_ORE, ENDERITE_ORE, EXPLODEMITE_ORE, IDLIKEABITE_ORE, SMITEANDLITE_ORE, NOFITE_ORE, KILLIUM_ORE, RANDOMIUM_ORE, DOGECOIN_ORE, MOBIUM_ORE, DREAMIUM_ORE, TRIPLITE_ORE, LITEINNITE_ORE, MEMENITE_ORE, DIAMOND_ORE, DIAMOND_BLOCK, DEEPSLATE_ALOTOSTUFFIUM_ORE, DEEPSLATE_KILLIUM_ORE, DEEPSLATE_RANDOMIUM_ORE);
		
		// Add sand mineables
		addTags(BlockTags.MINEABLE_WITH_SHOVEL, APPETITE_ORE);
		
	}
	
	private void addTags(TagKey<Block> key, RegistryObject<Block>... blocks)
	{
		for(RegistryObject<Block> block : blocks)
			this.tag(key).add(block.get());
	}
}
