package com.killer.killersblocksnstuff.Blocks;


import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(KillersBlocksNStuff.KBNS_TAB));
    }
}

