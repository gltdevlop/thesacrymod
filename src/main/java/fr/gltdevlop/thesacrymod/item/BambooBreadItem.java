
package fr.gltdevlop.thesacrymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import fr.gltdevlop.thesacrymod.init.ThesacrymodModTabs;

public class BambooBreadItem extends Item {
	public BambooBreadItem() {
		super(new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).alwaysEat()

				.build()));
	}
}
