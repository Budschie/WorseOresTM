package de.budschie.worseores.items;

import de.budschie.worseores.References;
import de.budschie.worseores.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
	public static final DiamondArmorMaterial DIAMOND_ARMOR_MATERIAL = new DiamondArmorMaterial();
	public static final DiamondItemTier DIAMOND_ITEM_TIER = new DiamondItemTier();
	
	// This may be bad, but fuck it lol
	public static final ItemGroup TROLL_ORES = new ItemGroup("worseores.troll_ores")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(COPPER_ORE.get());
		}
	};
	
	public static final ItemGroup TROLL_ITEMS = new ItemGroup("worseores.troll_items")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ALOTOSTUFFIUM_SHARD.get());
		}
	};
	
	public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);
	
	public static final RegistryObject<Item> COPPER_ORE = createItemBlock(BlockRegistry.COPPER_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> ALOTOSTUFFIUM_ORE = createItemBlock(BlockRegistry.ALOTOSTUFFIUM_ORE, new Properties().group(TROLL_ORES).isImmuneToFire());
	public static final RegistryObject<Item> AMADEUM_ORE = createItemBlock(BlockRegistry.AMADEUM_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> APPETITE_ORE = createItemBlock(BlockRegistry.APPETITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> EXPLODEMITE_ORE = createItemBlock(BlockRegistry.EXPLODEMITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> ENDERITE_ORE = createItemBlock(BlockRegistry.ENDERITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> IDLIKEABITE_ORE = createItemBlock(BlockRegistry.IDLIKEABITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> NOFITE_ORE = createItemBlock(BlockRegistry.NOFITE_ORE, new Properties().group(TROLL_ORES).isImmuneToFire());
	public static final RegistryObject<Item> KILLIUM_ORE = createItemBlock(BlockRegistry.KILLIUM_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> RANDONIUM_ORE = createItemBlock(BlockRegistry.RANDOMIUM_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> MEMENITE_ORE = createItemBlock(BlockRegistry.MEMENITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> LITEINNITE_ORE = createItemBlock(BlockRegistry.LITEINNITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> SMITEANDLITE_ORE = createItemBlock(BlockRegistry.SMITEANDLITE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> BESTFORGE_ORE = createItemBlock(BlockRegistry.BESTFORGE_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> DOGECOIN_ORE = createItemBlock(BlockRegistry.DOGECOIN_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> MOBIUM_ORE = createItemBlock(BlockRegistry.MOBIUM_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> DREAMIUM_ORE = createItemBlock(BlockRegistry.DREAMIUM_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> DIAMOND_ORE = createItemBlock(BlockRegistry.DIAMOND_ORE, new Properties().group(TROLL_ORES));
	public static final RegistryObject<Item> DIAMOND_BLOCK = createItemBlock(BlockRegistry.DIAMOND_BLOCK, new Properties().group(TROLL_ITEMS));
	public static final RegistryObject<Item> TRIPLITE_ORE = createItemBlock(BlockRegistry.TRIPLITE_ORE, new Properties().group(TROLL_ORES));
	
	public static final RegistryObject<Item> ALOTOSTUFFIUM_SHARD = ITEM_REGISTRY.register("alotostuffium_shard", () -> new Item(new Properties().group(TROLL_ITEMS).isImmuneToFire()));
	public static final RegistryObject<Item> COMPRESSED_ALOTOSTUFFIUM = createItemBlock(BlockRegistry.COMPRESSED_ALOTOSTUFFIUM, new Properties().group(TROLL_ITEMS).isImmuneToFire());
	
	public static final RegistryObject<Item> NOFITE_INGOT = ITEM_REGISTRY.register("nofite_ingot", () -> new Item(new Properties().group(TROLL_ITEMS).isImmuneToFire()));
	public static final RegistryObject<Item> NOFITE_SWORD = ITEM_REGISTRY.register("nofite_sword", () -> new NofiteSword(new Properties().group(TROLL_ITEMS).isImmuneToFire()));
	
	public static final RegistryObject<Item> DIAMOND = ITEM_REGISTRY.register("diamond", () -> new Item(new Properties().group(TROLL_ITEMS)));
	
	public static final RegistryObject<Item> DIAMOND_HELMET = ITEM_REGISTRY.register("diamond_helmet", () -> new ArmorItem(DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.HEAD, new Properties().group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_LEGGINGS = ITEM_REGISTRY.register("diamond_leggings", () -> new ArmorItem(DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.LEGS, new Properties().group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_BOOTS = ITEM_REGISTRY.register("diamond_boots", () -> new ArmorItem(DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.FEET, new Properties().group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_CHESTPLATE = ITEM_REGISTRY.register("diamond_chestplate", () -> new ArmorItem(DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.CHEST, new Properties().group(TROLL_ITEMS)));
	
	public static final RegistryObject<Item> DIAMOND_SWORD = ITEM_REGISTRY.register("diamond_sword", () -> new SwordItem(DIAMOND_ITEM_TIER, 3, -2.4F, (new Item.Properties()).group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_SHOVEL = ITEM_REGISTRY.register("diamond_shovel", () -> new ShovelItem(DIAMOND_ITEM_TIER, 1.5F, -3.0F, (new Item.Properties()).group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_PICKAXE = ITEM_REGISTRY.register("diamond_pickaxe", () -> new PickaxeItem(DIAMOND_ITEM_TIER, 1, -2.8F, (new Item.Properties()).group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_AXE = ITEM_REGISTRY.register("diamond_axe", () -> new AxeItem(DIAMOND_ITEM_TIER, 5.0F, -3.0F, (new Item.Properties()).group(TROLL_ITEMS)));
	public static final RegistryObject<Item> DIAMOND_HOE = ITEM_REGISTRY.register("diamond_hoe", () -> new HoeItem(DIAMOND_ITEM_TIER, -3, 0.0F, (new Item.Properties()).group(TROLL_ITEMS)));
	
	public static final RegistryObject<Item> ANCIENT_BRICK_OF_KNOWLEDGE = ITEM_REGISTRY.register("ancient_brick_of_knowledge", () -> new AncientBrickOfKnowledge(new Properties().group(TROLL_ITEMS)));
	
	/*
	 *    public static final Item DIAMOND_SWORD = register("diamond_sword", new SwordItem(ItemTier.DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	   public static final Item DIAMOND_SHOVEL = register("diamond_shovel", new ShovelItem(ItemTier.DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	   public static final Item DIAMOND_PICKAXE = register("diamond_pickaxe", new PickaxeItem(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	   public static final Item DIAMOND_AXE = register("diamond_axe", new AxeItem(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	   public static final Item DIAMOND_HOE = register("diamond_hoe", new HoeItem(ItemTier.DIAMOND, -3, 0.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));

	 */
	
	public static RegistryObject<Item> createItemBlock(RegistryObject<Block> block, Properties properties)
	{
		return ITEM_REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}
