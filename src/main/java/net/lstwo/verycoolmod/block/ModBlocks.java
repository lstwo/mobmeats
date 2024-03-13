package net.lstwo.verycoolmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lstwo.verycoolmod.FullBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static List<FullBlock> blocks = new ArrayList<>();

    public static final Block TEST_BLOCK = createBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).sounds(BlockSoundGroup.METAL).strength(4),
            new FabricItemSettings(), "test_block");

    public static Block createBlock(FabricBlockSettings blockSettings, FabricItemSettings itemSettings, String name) {
        Block block = new Block(blockSettings);
        BlockItem blockItem = new BlockItem(block, itemSettings);
        blocks.add(new FullBlock(block, blockItem, name));
        return block;
    }
    public static void registerBlocks() {
        for(FullBlock block : blocks) {
            Registry.register(Registries.BLOCK, new Identifier("verycoolmod", block.getName()), block.getBlock());
            Registry.register(Registries.ITEM, new Identifier("verycoolmod", block.getName()), block.getBlockItem());
        }
    }
}
