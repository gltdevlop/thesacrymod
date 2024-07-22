
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ThesacrymodModTabs {
	public static CreativeModeTab TAB_THE_SACRYMOD;

	public static void load() {
		TAB_THE_SACRYMOD = new CreativeModeTab("tabthe_sacrymod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.COPPER_INGOT);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
