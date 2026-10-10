package com.fathirzzz96.hoodsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class HoodsMod implements ModInitializer {
    public static final String MOD_ID = "hoodsmod";
    public static final Item HOOD_ITEM = new HoodItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hood_item"), HOOD_ITEM);
    }
}
