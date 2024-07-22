
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import fr.gltdevlop.thesacrymod.ThesacrymodMod;

public class ThesacrymodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThesacrymodMod.MODID);
	public static final RegistryObject<SoundEvent> NEVER = REGISTRY.register("never", () -> new SoundEvent(new ResourceLocation("thesacrymod", "never")));
}
