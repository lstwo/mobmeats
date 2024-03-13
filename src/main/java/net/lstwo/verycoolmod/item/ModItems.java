package net.lstwo.verycoolmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lstwo.verycoolmod.FoodPreset;
import net.lstwo.verycoolmod.FullItem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<FullItem> items = new ArrayList<>();

    public static final Item DOG_MEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "dog_meat");
    public static final Item COOKED_DOG_MEAT = createFood(7, 12, "cooked_dog_meat");

    public static final Item CAT_MEAT = createFood(true, 3, 2, StatusEffects.HUNGER, 1, 600, .3f, "cat_meat");
    public static final Item COOKED_CAT_MEAT = createFood(9, 8, "cooked_cat_meat");

    public static final Item DRAGON_MEAT = createFood(19, 21, "dragon_meat");
    public static final Item COOKED_DRAGON_MEAT = createFood(new FoodComponent.Builder().meat().hunger(35)
            .saturationModifier(28).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000, 3), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 60, 3), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 1), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 2), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 2), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 2), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 4800, 5), 1).build(), "cooked_dragon_meat");

    public static final Item VILLAGER_MEAT = createFood(new FoodComponent.Builder().meat().hunger(5)
            .saturationModifier(4).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), .3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600), .9f).build(), "villager_meat");
    public static final Item COOKED_VILLAGER_MEAT = createFood(14, 10, "cooked_villager_meat");

    public static final Item WITCH_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(5)
            .saturationModifier(4).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), .3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600), .5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600), .5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA), .9f).build()).rarity(Rarity.UNCOMMON), "witch_meat");
    public static final Item COOKED_WITCH_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(14)
            .saturationModifier(10).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300), .25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300), .25f).build()).rarity(Rarity.UNCOMMON), "cooked_witch_meat");

    public static final Item SILVERFISH_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(1)
            .saturationModifier(2).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), .3f).build()), "silverfish_meat");
    public static final Item COOKED_SILVERFISH_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(5)
            .saturationModifier(10).build()), "cooked_silverfish_meat");

    public static final Item IRON_GOLEM_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(6)
            .saturationModifier(4).build()), "iron_golem_meat");
    public static final Item COOKED_IRON_GOLEM_MEAT = createItem(new FabricItemSettings().food(new FoodComponent.Builder().meat().hunger(16)
            .saturationModifier(12).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4000, 4), 1).build()),
            "cooked_iron_golem_meat");

    public static final Item BAT_MEAT = createFood(true, 2, 3, StatusEffects.POISON, 1, 600, .3f, "bat_meat");
    public static final Item COOKED_BAT_MEAT = createFood(5, 8, "cooked_bat_meat");
    public static final Item BEEFSHROOM = createFood(2, 4, "beefshroom");
    public static final Item BIG_ENDERMEAT = createFood(5, 7, "big_endermeat");
    public static final Item COOKED_BIG_ENDERMEAT = createFood(12, 16, "cooked_big_endermeat");
    public static final Item BIG_MEAT = createFood(true, 4, 8, StatusEffects.HUNGER, 1, 600, .3f, "big_meat");
    public static final Item COOKED_BIG_MEAT = createFood(11, 15, "cooked_big_meat");
    public static final Item BLAZE_MEAT = createFood(2, 4, "blaze_meat");
    public static final Item COOKED_BLAZE_MEAT = createFood(true, 8, 12, StatusEffects.FIRE_RESISTANCE, 1, 600, 1,
            "cooked_blaze_meat");
    public static final Item CREEPER_MEAT = createFood(3, 4, "creeper_meat");
    public static final Item COOKED_CREEPER_MEAT = createFood(7, 12, "cooked_creeper_meat");
    public static final Item ILLAGER_MEAT = createFood(true, 2, 4, StatusEffects.BAD_OMEN, 1, 600, .3f, "illager_meat");
    public static final Item COOKED_ILLAGER_MEAT = createFood(true, 9, 14, StatusEffects.BAD_OMEN, 1, 600, .15f,
            "cooked_illager_meat");
    public static final Item LARGE_MEAT = createFood(true, 4, 10, StatusEffects.HUNGER, 1, 600, .3f, "large_meat");
    public static final Item COOKED_LARGE_MEAT = createFood(12, 15, "cooked_large_meat");
    public static final Item LITTLE_MEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "little_meat");
    public static final Item COOKED_LITTLE_MEAT = createFood(6, 6, "cooked_little_meat");
    public static final Item MEDIUM_MEAT = createFood(true, 4, 4, StatusEffects.HUNGER, 1, 600, .3f, "medium_meat");
    public static final Item COOKED_MEDIUM_MEAT = createFood(12, 12, "cooked_medium_meat");
    public static final Item RAVAGER_MEAT = createFood(true, 5, 4, StatusEffects.HUNGER, 1, 600, .3f, "ravager_meat");
    public static final Item COOKED_RAVAGER_MEAT = createFood(18, 22, "cooked_ravager_meat");
    public static final Item REGULAR_MEAT = createFood(true, 4, 4, StatusEffects.HUNGER, 1, 600, .3f, "regular_meat");
    public static final Item COOKED_REGULAR_MEAT = createFood(14, 12, "cooked_regular_meat");
    public static final Item SMALL_ENDERMEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "small_endermeat");
    public static final Item COOKED_SMALL_ENDERMEAT = createFood(7, 12, "cooked_small_endermeat");
    public static final Item SMALL_MEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "small_meat");
    public static final Item COOKED_SMALL_MEAT = createFood(7, 12, "cooked_small_meat");
    public static final Item SPIDER_MEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "spider_meat");
    public static final Item COOKED_SPIDER_MEAT = createFood(7, 12, "cooked_spider_meat");
    public static final Item SQUID_MEAT = createFood(true, 2, 4, StatusEffects.HUNGER, 1, 600, .3f, "squid_meat");
    public static final Item COOKED_SQUID_MEAT = createFood(7, 12, "cooked_squid_meat");

    public static Item createItem(FabricItemSettings itemSettings, String name) {
        Item item = new Item(itemSettings);
        items.add(new FullItem(item, name));
        return item;
    }

    public static Item createFood(int hunger, int saturation, String name) {
        return createItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation)
                .meat().build()), name);
    }

    public static Item createFood(int hunger, int saturation, StatusEffect effect, int duration, String name) {
        return createItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation)
                .statusEffect(new StatusEffectInstance(effect, duration), 1).build()), name);
    }

    public static Item createFood(boolean meat, int hunger, int saturation, StatusEffect effect, int duration, String name) {
        return createItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation)
                .statusEffect(new StatusEffectInstance(effect, duration), 1).build()), name);
    }

    public static Item createFood(int hunger, int saturation, StatusEffect effect, int duration, float chance, String name) {
        return createItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation)
                .statusEffect(new StatusEffectInstance(effect, duration), chance).build()), name);
    }

    public static Item createFood(boolean meat, int hunger, int saturation, StatusEffect effect, int amplification, int duration, float chance, String name) {
        return createItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation)
                 .statusEffect(new StatusEffectInstance(effect, duration, amplification), chance).build()), name);
    }

    public static Item createFood(FoodComponent foodComponent, String name) {
        return createItem(new FabricItemSettings().food(foodComponent), name);
    }

    public static void registerItems() {
        for(FullItem item : items) {
            Registry.register(Registries.ITEM, new Identifier("verycoolmod", item.getName()), item.getItem());
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
                content.add(item.getItem());
            });
        }
    }
}
