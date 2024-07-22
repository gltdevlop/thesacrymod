
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.gltdevlop.thesacrymod.block.TCCSpawnBlock;
import fr.gltdevlop.thesacrymod.block.CopperdirtBlock;
import fr.gltdevlop.thesacrymod.block.CopperGrassBlock;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

public class ThesacrymodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThesacrymodMod.MODID);
	public static final RegistryObject<Block> COPPER_GRASS = REGISTRY.register("copper_grass", () -> new CopperGrassBlock());
	public static final RegistryObject<Block> COPPERDIRT = REGISTRY.register("copperdirt", () -> new CopperdirtBlock());
	public static final RegistryObject<Block> TCC_SPAWN = REGISTRY.register("tcc_spawn", () -> new TCCSpawnBlock());
}
