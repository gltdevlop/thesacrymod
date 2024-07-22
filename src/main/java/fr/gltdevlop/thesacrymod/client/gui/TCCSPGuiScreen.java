package fr.gltdevlop.thesacrymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import fr.gltdevlop.thesacrymod.world.inventory.TCCSPGuiMenu;
import fr.gltdevlop.thesacrymod.network.TCCSPGuiButtonMessage;
import fr.gltdevlop.thesacrymod.ThesacrymodMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TCCSPGuiScreen extends AbstractContainerScreen<TCCSPGuiMenu> {
	private final static HashMap<String, Object> guistate = TCCSPGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_spawn;

	public TCCSPGuiScreen(TCCSPGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 225;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("thesacrymod:textures/screens/tccsp_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.tccsp_gui.label_the_copper_currupted_spawner"), 33, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.tccsp_gui.label_64_copper"), 17, 54, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.thesacrymod.tccsp_gui.label_12_redstone"), 76, 54, -12829636);
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
		button_spawn = new Button(this.leftPos + 147, this.topPos + 31, 61, 20, Component.translatable("gui.thesacrymod.tccsp_gui.button_spawn"), e -> {
			if (true) {
				ThesacrymodMod.PACKET_HANDLER.sendToServer(new TCCSPGuiButtonMessage(0, x, y, z));
				TCCSPGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_spawn", button_spawn);
		this.addRenderableWidget(button_spawn);
	}
}
