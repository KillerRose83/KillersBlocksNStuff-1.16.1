package com.killer.killersblocksnstuff.util.enums;

import com.killer.killersblocksnstuff.KillersBlocksNStuff;
import com.killer.killersblocksnstuff.init.KbnsItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum KbnsArmorMaterial implements IArmorMaterial {

    VIBRANIUM(KillersBlocksNStuff.MOD_ID + ":vibranium",1000,new int[] {5, 8, 11, 5},23,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,2.0f, ()->{return Ingredient.fromItems(KbnsItems.VIBRANIUM_INGOT.get());
    }
    );

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent SoundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    KbnsArmorMaterial(String name, int maxDamageFactor, int [] damageReductionAmountArray, int enchantability,
                      SoundEvent soundEvent,float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.SoundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    ;

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return 800;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.SoundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return 0;
    }
}
