package com.killer.killersblocksnstuff.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class VoidStone extends Block {
    public VoidStone() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(0.2f, 3f)
                .sound(SoundType.GLASS)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .notSolid()
                .harvestTool(ToolType.AXE)
                .harvestTool(ToolType.SHOVEL)
                .harvestTool(ToolType.HOE)
                .func_235838_a_((lightLevel) -> 15)

        );
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
        return 0;
    }
}