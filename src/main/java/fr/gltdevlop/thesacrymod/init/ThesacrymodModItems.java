
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import fr.gltdevlop.thesacrymod.item.StartingGuideItem;
import fr.gltdevlop.thesacrymod.item.NGGYUItem;
import fr.gltdevlop.thesacrymod.item.CopperSwordItem;
import fr.gltdevlop.thesacrymod.item.CopperShovelItem;
import fr.gltdevlop.thesacrymod.item.CopperPickaxeItem;
import fr.gltdevlop.thesacrymod.item.CopperHoeItem;
import fr.gltdevlop.thesacrymod.item.CopperAxeItem;
import fr.gltdevlop.thesacrymod.item.CopperArmorItem;
import fr.gltdevlop.thesacrymod.item.CompressedCopperItem;
import fr.gltdevlop.thesacrymod.item.BambooBreadItem;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

public class ThesacrymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThesacrymodMod.MODID);
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_GRASS = block(ThesacrymodModBlocks.COPPER_GRASS, ThesacrymodModTabs.TAB_THE_SACRYMOD);
	public static final RegistryObject<Item> COPPERDIRT = block(ThesacrymodModBlocks.COPPERDIRT, ThesacrymodModTabs.TAB_THE_SACRYMOD);
	public static final RegistryObject<Item> THECORRUPTEDCOPPER_SPAWN_EGG = REGISTRY.register("thecorruptedcopper_spawn_egg",
			() -> new ForgeSpawnEggItem(ThesacrymodModEntities.THECORRUPTEDCOPPER, -3381760, -65536, new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD)));
	public static final RegistryObject<Item> TCC_SPAWN = block(ThesacrymodModBlocks.TCC_SPAWN, ThesacrymodModTabs.TAB_THE_SACRYMOD);
	public static final RegistryObject<Item> COMPRESSED_COPPER = REGISTRY.register("compressed_copper", () -> new CompressedCopperItem());
	public static final RegistryObject<Item> NGGYU = REGISTRY.register("nggyu", () -> new NGGYUItem());
	public static final RegistryObject<Item> STARTING_GUIDE = REGISTRY.register("starting_guide", () -> new StartingGuideItem());
	public static final RegistryObject<Item> BAMBOO_BREAD = REGISTRY.register("bamboo_bread", () -> new BambooBreadItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
