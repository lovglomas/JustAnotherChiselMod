package com.lovglomas.justanotherchiselmod.sound;

import com.lovglomas.justanotherchiselmod.Justanotherchiselmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Justanotherchiselmod.MODID);

    public static final RegistryObject<SoundEvent> FACTORY_SOUND_BREACK = registerSoundEvent("factory_block_break");
    public static final RegistryObject<SoundEvent> FACTORY_SOUND_STEP = registerSoundEvent("factory_block_step");
    public static final RegistryObject<SoundEvent> FACTORY_SOUND_PLACE = registerSoundEvent("factory_block_place");
    public static final RegistryObject<SoundEvent> FACTORY_SOUND_HIT= registerSoundEvent("factory_block_hit");
    public static final RegistryObject<SoundEvent> FACTORY_SOUND_FALL = registerSoundEvent("factory_block_fall");

    public static final ForgeSoundType FACTORY_SOUNDS = new ForgeSoundType(3f, 1f, ModSounds.FACTORY_SOUND_BREACK, ModSounds.FACTORY_SOUND_STEP, ModSounds.FACTORY_SOUND_PLACE, ModSounds.FACTORY_SOUND_HIT, ModSounds.FACTORY_SOUND_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Justanotherchiselmod.MODID, name)));
    }
    public static void register (IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
