package de.budschie.worseores.data_gen;

import de.budschie.worseores.blocks.BlockRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModModelDataProvider extends BlockStateProvider
{
	ExistingFileHelper helper;
	
	public ModModelDataProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper)
	{
		super(gen, modid, exFileHelper);
		
		this.helper = exFileHelper;
	}

	private void blockWithItem(Block block)
	{
		simpleBlock(block);
		simpleBlockItem(block, new ModelFile.ExistingModelFile(new ResourceLocation(block.getRegistryName().getNamespace(), "block/" + block.getRegistryName().getPath()), this.helper));
	}

	@Override
	protected void registerStatesAndModels()
	{
		blockWithItem(BlockRegistry.DEEPSLATE_ALOTOSTUFFIUM_ORE.get());
		blockWithItem(BlockRegistry.DEEPSLATE_KILLIUM_ORE.get());
		blockWithItem(BlockRegistry.DEEPSLATE_RANDOMIUM_ORE.get());
	}
}
