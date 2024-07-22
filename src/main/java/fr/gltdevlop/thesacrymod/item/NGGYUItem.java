
package fr.gltdevlop.thesacrymod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import fr.gltdevlop.thesacrymod.init.ThesacrymodModTabs;

public class NGGYUItem extends RecordItem {
	public NGGYUItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thesacrymod:never")), new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD).stacksTo(1).rarity(Rarity.RARE), 10000);
	}
}
