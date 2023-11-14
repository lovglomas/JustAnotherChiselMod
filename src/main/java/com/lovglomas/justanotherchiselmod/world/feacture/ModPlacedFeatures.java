package com.lovglomas.justanotherchiselmod.world.feacture;

import com.lovglomas.justanotherchiselmod.Justanotherchiselmod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Justanotherchiselmod.MODID);

   public static final RegistryObject<PlacedFeature> MARBLE_ORE_PLACED = PLACED_FEATURES.register("marble_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.MARBLE.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(70)))));

    public static final RegistryObject<PlacedFeature> LIMESTONE_ORE_PLACED = PLACED_FEATURES.register("limestone_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.LIMESTONE.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(70)))));
    public static final RegistryObject<PlacedFeature> DARK_LIMESTONE_ORE_PLACED = PLACED_FEATURES.register("dark_limestone_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.DARK_LIMESTONE.getHolder().get(), commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(10)))));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
