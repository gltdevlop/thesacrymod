
package fr.gltdevlop.thesacrymod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import fr.gltdevlop.thesacrymod.init.ThesacrymodModTabs;

public abstract class CopperArmorItem extends ArmorItem {
	public CopperArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 9, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}

			@Override
			public String getName() {
				return "copper_armor";
			}

			@Override
			public float getToughness() {
				return 2.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CopperArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "thesacrymod:textures/models/armor/copperamor_layer_1.png";
		}
	}

	public static class Chestplate extends CopperArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "thesacrymod:textures/models/armor/copperamor_layer_1.png";
		}
	}

	public static class Leggings extends CopperArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "thesacrymod:textures/models/armor/copperamor_layer_2.png";
		}
	}

	public static class Boots extends CopperArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ThesacrymodModTabs.TAB_THE_SACRYMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "thesacrymod:textures/models/armor/copperamor_layer_1.png";
		}
	}
}
