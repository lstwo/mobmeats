package net.lstwo.verycoolmod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class FullBlock {
    Block block;
    BlockItem blockItem;
    String name;

    public FullBlock(Block block, BlockItem blockItem, String name) {
        this.block = block;
        this.blockItem = blockItem;
        this.name = name;
    }

    public Block getBlock() {
        return block;
    }

    public BlockItem getBlockItem() {
        return blockItem;
    }

    public String getName() {
        return name;
    }
}
