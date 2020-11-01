package com.killer.killersblocksnstuff.init;

import com.killer.killersblocksnstuff.Blocks.VibraniumBlock;
import com.killer.killersblocksnstuff.Blocks.VibraniumOre;
import com.killer.killersblocksnstuff.Blocks.VoidStone;
import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class KbnsBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KillersBlocksNStuff.MOD_ID);


    // Blocks
    public static final RegistryObject<Block> VIBRANIUM_ORE = BLOCKS.register("vibranium_ore", VibraniumOre::new);
    public static final RegistryObject<Block> VIBRANIUM_BLOCK = BLOCKS.register("vibranium_block", VibraniumBlock::new);
    public static final RegistryObject<Block> VOID_STONE = BLOCKS.register("void_stone", VoidStone::new);
}
