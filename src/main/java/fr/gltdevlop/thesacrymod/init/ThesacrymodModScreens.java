
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fr.gltdevlop.thesacrymod.client.gui.TCCSPGuiScreen;
import fr.gltdevlop.thesacrymod.client.gui.StartGuideScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThesacrymodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ThesacrymodModMenus.TCCSP_GUI.get(), TCCSPGuiScreen::new);
			MenuScreens.register(ThesacrymodModMenus.START_GUIDE.get(), StartGuideScreen::new);
		});
	}
}
