package fr.gltdevlop.thesacrymod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

import fr.gltdevlop.thesacrymod.network.ThesacrymodModVariables;

@Mod.EventBusSubscriber
public class PJCountProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		ThesacrymodModVariables.MapVariables.get(world).PlayerJCount = ThesacrymodModVariables.MapVariables.get(world).PlayerJCount + 1;
		ThesacrymodModVariables.MapVariables.get(world).syncData(world);
	}
}
