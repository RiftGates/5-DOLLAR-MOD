package com.person98.mod2;



import com.person98.mod2.client.model.OreMobModel;
import com.person98.mod2.client.renderer.OreMobRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class Mod2Client implements ClientModInitializer {

    public static final EntityModelLayer MODEL_COAL_ORE_MOB_LAYER = createModelLayer("coal_ore_mob");
    public static final EntityModelLayer MODEL_IRON_ORE_MOB_LAYER = createModelLayer("iron_ore_mob");
    public static final EntityModelLayer MODEL_GOLD_ORE_MOB_LAYER = createModelLayer("gold_ore_mob");
    public static final EntityModelLayer MODEL_DIAMOND_ORE_MOB_LAYER = createModelLayer("diamond_ore_mob");
    public static final EntityModelLayer MODEL_EMERALD_ORE_MOB_LAYER = createModelLayer("emerald_ore_mob");
    public static final EntityModelLayer MODEL_LAPIS_ORE_MOB_LAYER = createModelLayer("lapis_ore_mob");
    public static final EntityModelLayer MODEL_REDSTONE_ORE_MOB_LAYER = createModelLayer("redstone_ore_mob");
    public static final EntityModelLayer MODEL_COPPER_ORE_MOB_LAYER = createModelLayer("copper_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_COAL_ORE_MOB_LAYER = createModelLayer("deep_coal_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_IRON_ORE_MOB_LAYER = createModelLayer("deep_iron_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_GOLD_ORE_MOB_LAYER = createModelLayer("deep_gold_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_DIAMOND_ORE_MOB_LAYER = createModelLayer("deep_diamond_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_EMERALD_ORE_MOB_LAYER = createModelLayer("deep_emerald_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_LAPIS_ORE_MOB_LAYER = createModelLayer("deep_lapis_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_REDSTONE_ORE_MOB_LAYER = createModelLayer("deep_redstone_ore_mob");
    public static final EntityModelLayer MODEL_DEEP_COPPER_ORE_MOB_LAYER = createModelLayer("deep_copper_ore_mob");



    // Continue for other ores...

    private static EntityModelLayer createModelLayer(String id) {
        return new EntityModelLayer(new Identifier("mod2", id), "main");
    }

    @Override
    public void onInitializeClient() {
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.COAL_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/coalore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.IRON_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/ironore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.GOLD_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/goldore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DIAMOND_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/diamondore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.EMERALD_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/emeraldore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.LAPIS_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/lapisore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.REDSTONE_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/redstoneore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.COPPER_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/copperore.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_COAL_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepcoal.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_IRON_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepiron.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_GOLD_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepgold.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_DIAMOND_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepdiamond.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_EMERALD_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepemerald.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_LAPIS_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deeplapis.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_REDSTONE_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepredstone.png"));
        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(Mod2.DEEP_COPPER_ORE_MOB, (context) -> new OreMobRenderer<>(context, "textures/entity/deepcopper.png"));


        // Continue for other ores...

        EntityModelLayerRegistry.registerModelLayer(MODEL_COAL_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_IRON_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GOLD_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DIAMOND_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_EMERALD_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_LAPIS_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_REDSTONE_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_COPPER_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_COAL_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_IRON_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_GOLD_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_DIAMOND_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_EMERALD_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_LAPIS_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_REDSTONE_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_DEEP_COPPER_ORE_MOB_LAYER, OreMobModel::getTexturedModelData);


        // Continue for other ores...
    }
}