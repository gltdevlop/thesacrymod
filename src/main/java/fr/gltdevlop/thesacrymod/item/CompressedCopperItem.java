
package fr.gltdevlop.thesacrymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import fr.gltdevlop.thesacrymod.init.ThesacrymodModTabs;

public class CompressedCopperItem extends Item {
	public CompressedCopperItem() {
		super(new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD).stacksTo(16).rarity(Rarity.RARE));
	}
}
