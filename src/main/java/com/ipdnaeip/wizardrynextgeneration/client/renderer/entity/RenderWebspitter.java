package com.ipdnaeip.wizardrynextgeneration.client.renderer.entity;

import com.ipdnaeip.wizardrynextgeneration.WizardryNextGeneration;
import com.ipdnaeip.wizardrynextgeneration.client.renderer.entity.layers.LayerWebspitterEyes;
import com.ipdnaeip.wizardrynextgeneration.entity.living.EntityWebspitter;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderWebspitter extends RenderLiving<EntityWebspitter> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WizardryNextGeneration.MODID, "textures/entity/webspitter.png");


    public RenderWebspitter(RenderManager manager) {
        super(manager, new ModelSpider(), 1.0F);
        this.addLayer(new LayerWebspitterEyes<>(this));
        }

    @Nullable
    protected ResourceLocation getEntityTexture(EntityWebspitter entity) {
        return TEXTURE;
    }
}
