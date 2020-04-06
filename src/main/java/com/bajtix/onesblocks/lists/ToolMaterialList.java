package com.bajtix.onesblocks.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
    sandstone(5f,4f, 128, 1, 25, ItemList.sandstone_brick);



    private float attackDamage,efficiency;
    private int durability, harvestLevel, enchantability;
    private Item repairMaterial;

    ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMaxUses() {
        return durability;
    }

    public float getEfficiency() {
        return efficiency;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public int getEnchantability() {
        return enchantability;
    }

    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(repairMaterial);
    }
}
