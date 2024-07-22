
package fr.gltdevlop.thesacrymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import fr.gltdevlop.thesacrymod.entity.ThecorruptedcopperEntity;

public class ThecorruptedcopperRenderer extends HumanoidMobRenderer<ThecorruptedcopperEntity, HumanoidModel<ThecorruptedcopperEntity>> {
	public ThecorruptedcopperRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ThecorruptedcopperEntity entity) {
		return new ResourceLocation("thesacrymod:textures/entities/5e266517f7e05fad.png");
	}
}
