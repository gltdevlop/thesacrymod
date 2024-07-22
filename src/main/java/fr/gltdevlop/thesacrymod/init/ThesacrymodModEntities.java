
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gltdevlop.thesacrymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import fr.gltdevlop.thesacrymod.entity.ThecorruptedcopperEntity;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThesacrymodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ThesacrymodMod.MODID);
	public static final RegistryObject<EntityType<ThecorruptedcopperEntity>> THECORRUPTEDCOPPER = register("thecorruptedcopper", EntityType.Builder.<ThecorruptedcopperEntity>of(ThecorruptedcopperEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThecorruptedcopperEntity::new).fireImmune().sized(1f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ThecorruptedcopperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THECORRUPTEDCOPPER.get(), ThecorruptedcopperEntity.createAttributes().build());
	}
}
