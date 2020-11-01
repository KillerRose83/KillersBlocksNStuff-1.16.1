package com.killer.killersblocksnstuff.util.enums;

import com.killer.killersblocksnstuff.init.KbnsItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum KbnsItemTier implements IItemTier {

    VIBRANIUM(8, 2600, 12.0f, 6.0f, 35, () ->{
        return Ingredient.fromItems(KbnsItems.VIBRANIUM_INGOT.get());
    } ) ;

    private final int harvestlevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    KbnsItemTier(int harvestlevel, int maxUses, float effeciency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestlevel = harvestlevel;
        this.maxUses = maxUses;
        this.efficiency = effeciency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
