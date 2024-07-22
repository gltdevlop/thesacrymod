
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fr.gltdevlop.thesacrymod.world.inventory.TCCSPGuiMenu;
import fr.gltdevlop.thesacrymod.world.inventory.StartGuideMenu;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

public class ThesacrymodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ThesacrymodMod.MODID);
	public static final RegistryObject<MenuType<TCCSPGuiMenu>> TCCSP_GUI = REGISTRY.register("tccsp_gui", () -> IForgeMenuType.create(TCCSPGuiMenu::new));
	public static final RegistryObject<MenuType<StartGuideMenu>> START_GUIDE = REGISTRY.register("start_guide", () -> IForgeMenuType.create(StartGuideMenu::new));
}
