package net.lstwo.verycoolmod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class FoodPreset {
    public int hunger;
    public int saturation;
    public boolean meat;
    public StatusEffect effect;
    public int duration;
    int amplification;
    public float chance;
    public FoodComponent foodComponent;

    public FoodPreset(int hunger, int saturation, StatusEffect effect, int amplification, int duration, float chance) {
        this.foodComponent = new FoodComponent.Builder().hunger(hunger).meat().saturationModifier(saturation).statusEffect(new StatusEffectInstance(effect, duration,
                        amplification), chance).build();
    }

    public FoodPreset(FoodComponent foodComponent) {
        this.foodComponent = foodComponent;
    }
}
