package com.bajtix.onesblocks.world;

import com.bajtix.onesblocks.lists.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {

    public static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            //Count range config: [Vein count] [Min height] [Min height] [Max height]
            ConfiguredPlacement mossyStoneConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10, 20, 20, 100));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.func_225566_b_(
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    BlockList.mossy_stone.getDefaultState(),
                                    60 //per vein
                            )
                    ).func_227228_a_(mossyStoneConfig)
            );

            ConfiguredPlacement elfiumOreConfig = Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10, 10, 10, 100));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.func_225566_b_(
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE/*FillerBlockType.create("onesblocks2:mossy_stone","onesblocks2:mossy_stone", new BlockMatcher(BlockList.mossy_stone))*/,
                                    BlockList.elfium_ore.getDefaultState(),
                                    6 //per vein
                            )
                    ).func_227228_a_(elfiumOreConfig)
            );


        }
    }

}
