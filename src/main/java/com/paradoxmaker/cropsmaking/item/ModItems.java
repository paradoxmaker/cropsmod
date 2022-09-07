package com.paradoxmaker.cropsmaking.item;

import com.paradoxmaker.cropsmaking.Cropsmaking;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cropsmaking.MODID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SHALLOT = ITEMS.register("shallot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> CASAVA = ITEMS.register("casava",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> CHILLI = ITEMS.register("chilli",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> tomato = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> banasword = ITEMS.register("banasword",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(100)));


    public static final RegistryObject<Item> tuna = ITEMS.register("tuna",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> RAW_TUNA = ITEMS.register("raw_tunas",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(2).saturationMod(4f).build())));

    public static final RegistryObject<Item> cooked_tuna = ITEMS.register("cooked_tuna",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(8).saturationMod(6f)
                    .effect(()->new MobEffectInstance(MobEffects.DOLPHINS_GRACE),10f).build())));

    public static final RegistryObject<Item> raw_squid = ITEMS.register("raw_squid",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(1).saturationMod(2f).build())));

    public static final RegistryObject<Item> cooked_squid = ITEMS.register("cooked_squid",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(4f).build())));

    public static final RegistryObject<Item> shrimp = ITEMS.register("shrimp",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(1).saturationMod(4f).build())));

    public static final RegistryObject<Item> cooked_shrimp = ITEMS.register("cooked_shrimp",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder()
                    .nutrition(6).saturationMod(4f).build())));
    public static void register(IEventBus eb){
        ITEMS.register(eb);
    }
}
