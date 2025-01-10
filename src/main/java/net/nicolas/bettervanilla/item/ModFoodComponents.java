package net.nicolas.bettervanilla.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent SQUID = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent CALAMARI = new FoodComponent.Builder().nutrition(5).saturationModifier(6.2f).build();
    public static final FoodComponent BEAR = new FoodComponent.Builder().nutrition(3).saturationModifier(1.5f).build();
    public static final FoodComponent COOKED_BEAR = new FoodComponent.Builder().nutrition(8).saturationModifier(10.6f).build();
    public static final FoodComponent FROG_LEGS = new FoodComponent.Builder().nutrition(2).saturationModifier(0.8f).build();
    public static final FoodComponent COOKED_FROG_LEGS = new FoodComponent.Builder().nutrition(4).saturationModifier(8f).build();

}
