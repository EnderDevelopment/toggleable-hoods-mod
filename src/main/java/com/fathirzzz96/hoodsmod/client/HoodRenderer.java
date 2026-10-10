package com.fathirzzz96.hoodsmod.client;

import com.fathirzzz96.hoodsmod.HoodItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

@Environment(EnvType.CLIENT)
public
class HoodRenderer extends FeatureRenderer<PlayerEntity, PlayerEntityModel<PlayerEntity>> {
    public HoodRenderer(FeatureRendererContext<PlayerEntity, PlayerEntityModel<PlayerEntity>> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, PlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemStack stack = entity.getMainHandStack();
        if (stack.getItem() instanceof HoodItem) {
            boolean isHoodUp = stack.getOrCreateNbt().getBoolean("isHoodUp");
            // Render hood based on isHoodUp
        }
    }
}
