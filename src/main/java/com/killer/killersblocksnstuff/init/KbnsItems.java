package com.killer.killersblocksnstuff.init;

import com.killer.killersblocksnstuff.Blocks.BlockItemBase;
import com.killer.killersblocksnstuff.Items.ItemBase;
import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import com.killer.killersblocksnstuff.util.enums.KbnsArmorMaterial;
import com.killer.killersblocksnstuff.util.enums.KbnsItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class KbnsItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KillersBlocksNStuff.MOD_ID);


    // Items
    public static final RegistryObject<Item> VIBRANIUM_POWDER = ITEMS.register("vibranium_powder", ItemBase::new);
    public static final RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot", ItemBase::new);
    public static final RegistryObject<Item> REINFORCED_TOOL_ROD = ITEMS.register("reinforced_tool_rod", ItemBase::new);
    public static final RegistryObject<Item> VOID_STONE_POWDER = ITEMS.register("void_stone_powder", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword", ()-> new SwordItem(KbnsItemTier.VIBRANIUM, 0,-2.2f, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<PickaxeItem> VIBRANIUM_PICKAXE = ITEMS.register("vibranium_pickaxe", ()-> new PickaxeItem(KbnsItemTier.VIBRANIUM, -2,-2.2f, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<AxeItem> VIBRANIUM_AXE = ITEMS.register("vibranium_axe", ()-> new AxeItem(KbnsItemTier.VIBRANIUM, 2,-2.9f, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<ShovelItem> VIBRANIUM_SHOVEL = ITEMS.register("vibranium_shovel", ()-> new ShovelItem(KbnsItemTier.VIBRANIUM, 3,-2.4f, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<HoeItem> VIBRANIUM_HOE = ITEMS.register("vibranium_hoe", ()-> new HoeItem(KbnsItemTier.VIBRANIUM, -3,-2.6f, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet", ()->
            new ArmorItem(KbnsArmorMaterial.VIBRANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate", ()->
            new ArmorItem(KbnsArmorMaterial.VIBRANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings", ()->
            new ArmorItem(KbnsArmorMaterial.VIBRANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots", ()->
            new ArmorItem(KbnsArmorMaterial.VIBRANIUM, EquipmentSlotType.FEET, new Item.Properties().group(KillersBlocksNStuff.KBNS_TAB)));

    // Block Items
    public static final RegistryObject<Item> VIBRANIUM_ORE_ITEM = ITEMS.register("vibranium_ore", () -> new BlockItemBase(KbnsBlocks.VIBRANIUM_ORE.get()));
    public static final RegistryObject<Item> VIBRANIUM_BLOCK_ITEM = ITEMS.register("vibranium_block", () -> new BlockItemBase(KbnsBlocks.VIBRANIUM_BLOCK.get()));
    public static final RegistryObject<Item> VOID_STONE_ITEM = ITEMS.register("void_stone", () -> new BlockItemBase(KbnsBlocks.VOID_STONE.get()));



}
