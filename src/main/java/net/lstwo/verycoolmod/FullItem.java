package net.lstwo.verycoolmod;

import net.minecraft.item.Item;

public class FullItem {
    String name;
    Item item;

    public FullItem(Item item, String name) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Item getItem() {
        return item;
    }
}
