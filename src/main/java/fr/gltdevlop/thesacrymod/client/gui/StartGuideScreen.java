package fr.gltdevlop.thesacrymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import fr.gltdevlop.thesacrymod.world.inventory.StartGuideMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StartGuideScreen extends AbstractContainerScreen<StartGuideMenu> {
	private final static HashMap<String, Object> guistate = StartGuideMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StartGuideScreen(StartGuideMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 219;
		this.imageHeight = 191;
	}

	private static final ResourceLocation texture = new ResourceLocation("thesacrymod:textures/screens/start_guide.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_the_sacry_mod_starting_guidee"), 27, 9, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_mobs"), 35, 33, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_the_corrupted_copper_spawner"), 34, 65, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_you_can_spawn_the_corrupted_copp"), 10, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_the_corrupted_copper_biome"), 16, 53, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_tools_armors"), 10, 87, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_use_can_craft_the_copper_armor_a"), 18, 100, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_tools_by_using_copper_ingots_and"), 25, 110, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.start_guide.label_compressed_copper"), 62, 120, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
