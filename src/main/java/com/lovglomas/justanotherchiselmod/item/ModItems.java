package com.lovglomas.justanotherchiselmod.item;

import com.lovglomas.justanotherchiselmod.Justanotherchiselmod;
import com.lovglomas.justanotherchiselmod.ModCreativeTab.ModCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Justanotherchiselmod.MODID);

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel", () -> new Item(new Item.Properties().tab(ModCreativeTab.JACM_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
