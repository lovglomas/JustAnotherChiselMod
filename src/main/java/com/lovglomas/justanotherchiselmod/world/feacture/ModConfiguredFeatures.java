package com.lovglomas.justanotherchiselmod.world.feacture;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.lovglomas.justanotherchiselmod.Justanotherchiselmod;
import com.lovglomas.justanotherchiselmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Justanotherchiselmod.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MARBLE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MARBLE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LIMESTONE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LIMESTONE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_DARK_LIMESTONE = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DARK_LIMESTONE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MARBLE = CONFIGURED_FEATURES.register("marble", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MARBLE.get(), 60)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> LIMESTONE = CONFIGURED_FEATURES.register("limestone", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LIMESTONE.get(), 60)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DARK_LIMESTONE = CONFIGURED_FEATURES.register("dark_limestone", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_DARK_LIMESTONE.get(), 60)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
