package fr.gltdevlop.thesacrymod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import fr.gltdevlop.thesacrymod.network.ThesacrymodModVariables;
import fr.gltdevlop.thesacrymod.init.ThesacrymodModItems;

@Mod.EventBusSubscriber
public class PFirstTimeProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ThesacrymodModVariables.MapVariables.get(world).PlayerJCount == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ThesacrymodModItems.STARTING_GUIDE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
