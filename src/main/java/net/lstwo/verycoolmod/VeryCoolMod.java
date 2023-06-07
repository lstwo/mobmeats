package net.lstwo.verycoolmod;

import net.fabricmc.api.ModInitializer;
import net.lstwo.verycoolmod.block.ModBlocks;
import net.lstwo.verycoolmod.item.ModItems;

public class VeryCoolMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
