package com.killer.killersblocksnstuff.world.gen;


import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import com.killer.killersblocksnstuff.init.KbnsBlocks;
import com.killer.killersblocksnstuff.init.KbnsItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;



@Mod.EventBusSubscriber(modid = KillersBlocksNStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KbnsOreGenHandler {

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
            "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Nether Generation
            if (biome.getCategory() == Biome.Category.NETHER) {
                genOre(biome, 0, 0, 0, 80, OreFeatureConfig.FillerBlockType.NETHERRACK, KbnsBlocks.VIBRANIUM_ORE.get().getDefaultState(), 0);
                //End Generation
            } else if (biome.getCategory() == Biome.Category.THEEND) {
                genOre(biome, 6, 0, 0, 45, END_STONE, KbnsBlocks.VIBRANIUM_ORE.get().getDefaultState(), 1-4);
                genOre(biome, 16, 0, 0, 80, END_STONE, KbnsBlocks.VOID_STONE.get().getDefaultState(), 4-20);
                //World Generation
            } else {
                genOre(biome, 0, 0, 0, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, KbnsBlocks.VIBRANIUM_ORE.get().getDefaultState(), 0);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
