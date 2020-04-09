package com.bajtix.onesblocks.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
    /*
    WOOD    Harvest Level 0   Durability 59     Efficiency 2.0F    Attack Damage 0.0F  Enchantability 15
    STONE   Harvest Level 1   Durability 131    Efficiency 4.0F    Attack Damage 1.0F  Enchantability 5
    IRON    Harvest Level 2   Durability 250    Efficiency 6.0F    Attack Damage 2.0F  Enchantability 14
    DIAMOND Harvest Level 3   Durability 1561   Efficiency 8.0F    Attack Damage 3.0F  Enchantability 10
    GOLD    Harvest Level 0   Durability 32     Efficiency 12.0F   Attack Damage 0.0F  Enchantability 22
    */

    sandstone(2f, 2.1f, 120, 1, 8, ItemList.sandstone_brick);


    //region Definition
    private float attackDamage, efficiency;
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
        return attackDamage - 1;
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
    //endregionini
}
