package com.lovglomas.justanotherchiselmod.block;

import com.lovglomas.justanotherchiselmod.Justanotherchiselmod;
import com.lovglomas.justanotherchiselmod.ModCreativeTab.ModCreativeTab;
import com.lovglomas.justanotherchiselmod.item.ModItems;
import com.lovglomas.justanotherchiselmod.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Justanotherchiselmod.MODID);

    public static final RegistryObject<Block> TECHNICAL_LAMP = registerBlock("technical_lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).strength(0.2f).sound(SoundType.GLASS).lightLevel(litInvBlockEmission(0))), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> MARBLE = registerBlock("marble", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_ARRAY = registerBlock("marble_array", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_BRAID = registerBlock("marble_braid", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CHAOTIC_BRICKS = registerBlock("marble_chaotic_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CHAOTIC_MEDIUM = registerBlock("marble_chaotic_medium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CHAOTIC_SMALL = registerBlock("marble_chaotic_small", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CIRCULAR = registerBlock("marble_circular", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CRACKED_BRICKS = registerBlock("marble_cracked_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CRACKED = registerBlock("marble_cracked", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_CUTS = registerBlock("marble_cuts", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_DENT = registerBlock("marble_dent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_ENCASED_BRICKS = registerBlock("marble_encased_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_FRENCH_1 = registerBlock("marble_french_1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_FRENCH_2 = registerBlock("marble_french_2", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_JELLYBEAN = registerBlock("marble_jellybean", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_LAYERS = registerBlock("marble_layers", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_MOSAIC = registerBlock("marble_mosaic", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_ORNATE = registerBlock("marble_ornate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_PANEL = registerBlock("marble_panel", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_PRISM = registerBlock("marble_prism", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_ROAD = registerBlock("marble_road", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_SLANTED = registerBlock("marble_slanted", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_SMALL_BRICKS = registerBlock("marble_small_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_SOFT_BRICKS = registerBlock("marble_soft_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_TILES_LARGE = registerBlock("marble_tiles_large", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_TILES_MEDIUM = registerBlock("marble_tiles_medium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_TILES_SMALL = registerBlock("marble_tiles_small", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_TRIPLE_BRICKS = registerBlock("marble_triple_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_TWISTED = registerBlock("marble_twisted", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_WEAVER = registerBlock("marble_weaver", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> MARBLE_ZAG = registerBlock("marble_zag", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_ARRAY = registerBlock("limestone_array", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f)),ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRAID = registerBlock("limestone_braid", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CHAOTIC_BRICKS = registerBlock("limestone_chaotic_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CHAOTIC_MEDIUM = registerBlock("limestone_chaotic_medium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CHAOTIC_SMALL = registerBlock("limestone_chaotic_small", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CIRCULAR = registerBlock("limestone_circular", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CRACKED_BRICKS = registerBlock("limestone_cracked_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CRACKED = registerBlock("limestone_cracked", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_CUTS = registerBlock("limestone_cuts", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_DENT = registerBlock("limestone_dent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_ENCASED_BRICKS = registerBlock("limestone_encased_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_FRENCH_1 = registerBlock("limestone_french_1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_FRENCH_2 = registerBlock("limestone_french_2", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_JELLYBEAN = registerBlock("limestone_jellybean", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_LAYERS = registerBlock("limestone_layers", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_MOSAIC = registerBlock("limestone_mosaic", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_ORNATE = registerBlock("limestone_ornate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_PANEL = registerBlock("limestone_panel", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_PILLAR = registerBlock("limestone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_PRISM = registerBlock("limestone_prism", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_ROAD = registerBlock("limestone_road", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_SLANTED = registerBlock("limestone_slanted", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_SMALL_BRICKS = registerBlock("limestone_small_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_SOFT_BRICKS = registerBlock("limestone_soft_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_TILES_LARGE = registerBlock("limestone_tiles_large", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_TILES_MEDIUM = registerBlock("limestone_tiles_medium", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_TILES_SMALL = registerBlock("limestone_tiles_small", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_TRIPLE_BRICKS = registerBlock("limestone_triple_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_TWISTED = registerBlock("limestone_twisted", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_WEAVER = registerBlock("limestone_weaver", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LIMESTONE_ZAG = registerBlock("limestone_zag", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> DARK_LIMESTONE = registerBlock("dark_limestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_FRENCH_2 = registerBlock("dark_limestone_french_2", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_FRENCH = registerBlock("dark_limestone_french", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_SMALL_BRICKS = registerBlock("dark_limestone_small_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_SMALL_TILES = registerBlock("dark_limestone_small_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_CREEP = registerBlock("dark_limestone_creep", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_MOSSY_TILES = registerBlock("dark_limestone_mossy_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_DUNGEON_ORNATE = registerBlock("dark_limestone_dungeon_ornate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_DUNGEON_VENT = registerBlock("dark_limestone_dungeon_vent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_CREEP = registerBlock("dark_limestone_light_creep", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_DENT = registerBlock("dark_limestone_light_dent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_EMBOSS = registerBlock("dark_limestone_light_emboss", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_FOUR = registerBlock("dark_limestone_light_four", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_MARKER = registerBlock("dark_limestone_light_marker", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> DARK_LIMESTONE_LIGHT_PANEL = registerBlock("dark_limestone_light_panel", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> FACTORY = registerBlock("factory", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_CIRCUIT = registerBlock("factory_circuit", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_COLUMN = registerBlock("factory_column", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_GOLD_PLATE = registerBlock("factory_gold_plate", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_GOLD_PLATING = registerBlock("factory_gold_plating", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_GRINDER = registerBlock("factory_grinder", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_YHAZARD = registerBlock("factory_yhazard", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_OHAZARD = registerBlock("factory_ohazard", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_BOX = registerBlock("factory_box", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_PLATEX = registerBlock("factory_platex", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_PLATING = registerBlock("factory_plating", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_RUST = registerBlock("factory_rust", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_RUST_2 = registerBlock("factory_rust_2", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_RUST_PLATE = registerBlock("factory_rust_plate", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_WIREFRAME = registerBlock("factory_wireframe", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_WIREFRAME_WHITE = registerBlock("factory_wireframe_white", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_WIREFRAME_BLUE = registerBlock("factory_wireframe_blue", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_FRAME_BLUE = registerBlock("factory_frame_blue", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_ICE = registerBlock("factory_ice", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_GOLD_SYMBOL = registerBlock("factory_gold_symbol", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_TILE_MOSAIC = registerBlock("factory_tile_mosaic", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_TILERED = registerBlock("factory_tilered", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> FACTORY_VENT = registerBlock("factory_vent", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> TECHNICAL_CABLE = registerBlock("technical_cable", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_CAUTION_TAPE = registerBlock("technical_caution_tape", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_GRATE = registerBlock("technical_grate", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_GRATE_RUSTY = registerBlock("technical_grate_rusty", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_INDUSTRIAL_RELIC = registerBlock("technical_industrial_relic", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_INSULATION = registerBlock("technical_insulation", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_HEX_PLATES = registerBlock("technical_hex_plates", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_OLD = registerBlock("technical_old", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_PIPES_LARGE = registerBlock("technical_pipes_large", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_PIPES_SMALL = registerBlock("technical_pipes_small", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_RUSTY_PLATES = registerBlock("technical_rusty_plates", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SCAFFOLD = registerBlock("technical_scaffold", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SCAFFOLD_TRANSPARENT = registerBlock("technical_scaffold_transparent", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SPINNING = registerBlock("technical_spinning", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_VENT = registerBlock("technical_vent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_VENT_GLOWING = registerBlock("technical_vent_glowing", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_WIRES = registerBlock("technical_wires", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_ENGINEERING = registerBlock("technical_engineering", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_ENGINEERING_1 = registerBlock("technical_engineering_1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_ENGINEERING_2 = registerBlock("technical_engineering_2", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_ENGINEERING_3 = registerBlock("technical_engineering_3", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_EXHAUSTPLATING = registerBlock("technical_exhaustplating", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SHIFTPANELS = registerBlock("technical_shiftpanels", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_DURACELL = registerBlock("technical_duracell", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_OLD_SERVER = registerBlock("technical_old_server", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_PIPING = registerBlock("technical_piping", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SCAFFOLD_LARGE = registerBlock("technical_scaffold_large", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_SCAFFOLD_LARGE_1 = registerBlock("technical_scaffold_large_1", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_STURDY = registerBlock("technical_sturdy", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_TAPEDRIVE = registerBlock("technical_tapedrive", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_GREENPANELS = registerBlock("technical_greenpanels", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> TECHNICAL_ORANGEPANELS = registerBlock("technical_orangepanels", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> LAB_BLOCK = registerBlock("lab_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_DOTTED = registerBlock("lab_doted", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_TILE = registerBlock("lab_tile", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_ROUNLED = registerBlock("lab_rounled", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_VENTS = registerBlock("lab_vent", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_L_TILES = registerBlock("lab_l_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_M_TILES = registerBlock("lab_m_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_DM_TILES = registerBlock("lab_dm_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_CHECK_TILES = registerBlock("lab_check_tiles", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_SCREEN = registerBlock("lab_screen", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_F_SCREEN = registerBlock("lab_f_screen", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_L_STEEL = registerBlock("lab_l_steel", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_M_STEEL = registerBlock("lab_m_steel", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_L_ARROW = registerBlock("lab_l_arrow", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_R_ARROW = registerBlock("lab_r_arrow", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> LAB_CONSOLE = registerBlock("lab_console", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.FACTORY_SOUNDS)), ModCreativeTab.JACM_TAB);

    public static final RegistryObject<Block> CLOUD = registerBlock("cloud", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> CLOUD_GRID = registerBlock("cloud_grid", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> CLOUD_LARGE = registerBlock("cloud_large", () -> new  Block(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> CLOUD_SMALL = registerBlock("cloud_small", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)), ModCreativeTab.JACM_TAB);
    public static final RegistryObject<Block> CLOUD_VERTICAL = registerBlock("cloud_vertical", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).noOcclusion().sound(SoundType.WOOL)), ModCreativeTab.JACM_TAB);


    private static ToIntFunction<BlockState> litInvBlockEmission(int p_50760_) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? p_50760_ : 15;
        };
    }

    private static ToIntFunction<BlockState> litBlockEmission(int p_50760_) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? p_50760_ : 0;
        };
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
