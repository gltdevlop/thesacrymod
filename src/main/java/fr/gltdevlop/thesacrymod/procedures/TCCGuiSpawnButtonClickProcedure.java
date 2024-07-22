package fr.gltdevlop.thesacrymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;

import fr.gltdevlop.thesacrymod.init.ThesacrymodModEntities;
import fr.gltdevlop.thesacrymod.entity.ThecorruptedcopperEntity;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

public class TCCGuiSpawnButtonClickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).is(new ResourceLocation("thesacrymod:copper_corrupted"))) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.COPPER_INGOT) {
				if (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) == 64) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE) {
						if (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(1) >= 12) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
							if (entity instanceof Player _player)
								_player.getFoodData().setFoodLevel(1);
							ThesacrymodMod.queueServerWork(50, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (entity.getX()), (entity.getY()), (entity.getZ()), 40, 3, 3, 3, 1);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new ThecorruptedcopperEntity(ThesacrymodModEntities.THECORRUPTEDCOPPER.get(), _level);
									entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
							});
						}
					}
				}
			}
		}
	}
}
