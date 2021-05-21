package de.budschie.worseores.blocks;

import de.budschie.worseores.References;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
	public static final Properties DEFAULT_ORE_PROPERTIES = Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE);
	public static final Properties DEFAULT_ORE_PROPERTIES_WITH_LIGHT = Properties.create(Material.ROCK).hardnessAndResistance(3, 120).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE).setLightLevel(imnotinerestedintheblockstate -> 15);
	public static final Properties DEFAULT_ORE_WITH_ANVIL_PROPERTIES = Properties.create(Material.ROCK).hardnessAndResistance(3, 120).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.ANVIL);
	public static final Properties FAST_SPEED_ORE_PROPERTIES = Properties.create(Material.ROCK).hardnessAndResistance(0, 0).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE);
	public static final Properties DEFAULT_SANDORE_PROPERTIES = Properties.create(Material.SAND).hardnessAndResistance(.5f, 10).sound(SoundType.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL);
	public static final Properties DIAMOND_PROPERTIES = Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F);
	public static final Properties DIAMOND_BLOCK_PROPERTIES = Properties.create(Material.IRON, MaterialColor.DIAMOND).setRequiresTool().hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL);
	
	public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MODID);

	public static final RegistryObject<Block> COPPER_ORE = BLOCK_REGISTRY.register("copper_ore", () -> new CopperOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> ALOTOSTUFFIUM_ORE = BLOCK_REGISTRY.register("alotostuffium_ore", () -> new CopperOre(FAST_SPEED_ORE_PROPERTIES));
	public static final RegistryObject<Block> COMPRESSED_ALOTOSTUFFIUM = BLOCK_REGISTRY.register("compressed_alotostuffium", () -> new Block(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> AMADEUM_ORE = BLOCK_REGISTRY.register("amadeum_ore", () -> new AmadeumOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> APPETITE_ORE = BLOCK_REGISTRY.register("appetite_ore", () -> new AppetiteOre(DEFAULT_SANDORE_PROPERTIES));
	public static final RegistryObject<Block> ENDERITE_ORE = BLOCK_REGISTRY.register("enderite_ore", () -> new EnderiteOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> EXPLODEMITE_ORE = BLOCK_REGISTRY.register("explodemite_ore", () -> new ExplodemiteOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> IDLIKEABITE_ORE = BLOCK_REGISTRY.register("idlikeabite_ore", () -> new IdlikeabiteOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> SMITEANDLITE_ORE = BLOCK_REGISTRY.register("smiteandlite_ore", () -> new SmiteandliteOre(DEFAULT_ORE_PROPERTIES));
	
	public static final RegistryObject<Block> NOFITE_ORE = BLOCK_REGISTRY.register("nofite_ore", () -> new Block(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> KILLIUM_ORE = BLOCK_REGISTRY.register("killium_ore", () -> new Block(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> RANDOMIUM_ORE = BLOCK_REGISTRY.register("randomium_ore", () -> new Block(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> MEMENITE_ORE = BLOCK_REGISTRY.register("memenite_ore", () -> new MemeniteOre(DEFAULT_ORE_WITH_ANVIL_PROPERTIES));
	public static final RegistryObject<Block> LITEINNITE_ORE = BLOCK_REGISTRY.register("liteinnite_ore", () -> new Block(DEFAULT_ORE_PROPERTIES_WITH_LIGHT));

	public static final RegistryObject<Block> BESTFORGE_ORE = BLOCK_REGISTRY.register("bestforge_ore", () -> new BestforgeOre(FAST_SPEED_ORE_PROPERTIES));
	
	public static final RegistryObject<Block> DOGECOIN_ORE = BLOCK_REGISTRY.register("dogecoin_ore", () -> new DogecoinOre(DEFAULT_ORE_PROPERTIES));
	
	public static final RegistryObject<Block> MOBIUM_ORE = BLOCK_REGISTRY.register("mobium_ore", () -> new MobiumOre(DEFAULT_ORE_PROPERTIES));
	
	public static final RegistryObject<Block> DREAMIUM_ORE = BLOCK_REGISTRY.register("dreamium_ore", () -> new DreamiumOre(DEFAULT_ORE_PROPERTIES));
	public static final RegistryObject<Block> DIAMOND_ORE = BLOCK_REGISTRY.register("diamond_ore", () -> new Block(DIAMOND_PROPERTIES));
	public static final RegistryObject<Block> DIAMOND_BLOCK = BLOCK_REGISTRY.register("diamond_block", () -> new Block(DIAMOND_BLOCK_PROPERTIES));
	
	public static final RegistryObject<Block> TRIPLITE_ORE = BLOCK_REGISTRY.register("triplite_ore", () -> new TripliteOre(DEFAULT_ORE_PROPERTIES));
}
