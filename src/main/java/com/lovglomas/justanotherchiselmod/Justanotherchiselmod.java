package com.lovglomas.justanotherchiselmod;

import com.lovglomas.justanotherchiselmod.block.ModBlocks;
import com.lovglomas.justanotherchiselmod.item.ModItems;
import com.lovglomas.justanotherchiselmod.sound.ModSounds;
import com.lovglomas.justanotherchiselmod.world.feacture.ModConfiguredFeatures;
import com.lovglomas.justanotherchiselmod.world.feacture.ModPlacedFeatures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Justanotherchiselmod.MODID)
public class Justanotherchiselmod {
    public static final String MODID = "justanotherchiselmod";

    public Justanotherchiselmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModBlocks.register(bus);
        ModConfiguredFeatures.register(bus);
        ModPlacedFeatures.register(bus);
        ModSounds.register(bus);
    }
}
