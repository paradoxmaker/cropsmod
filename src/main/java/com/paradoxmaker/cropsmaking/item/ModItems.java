package com.paradoxmaker.cropsmaking.item;

import com.paradoxmaker.cropsmaking.Cropsmaking;
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
    public static void register(IEventBus eb){
        ITEMS.register(eb);
    }
}
