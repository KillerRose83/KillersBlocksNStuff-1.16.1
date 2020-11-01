package com.killer.killersblocksnstuff.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VibraniumBlock extends Block {
    public VibraniumBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(7.0f, -1f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)

        );
    }
}