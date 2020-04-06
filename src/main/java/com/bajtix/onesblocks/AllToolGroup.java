package com.bajtix.onesblocks;

import net.minecraft.item.*;

public class AllToolGroup {
    public Item
            pickaxe,
            axe,
            sword,
            shovel,
            hoe;

    /**
     * @param tier     Item tier
     * @param pickaxev Values for pickaxe
     * @param axev     Values for axe
     * @param swordv   Values for sword
     * @param shovelv  Values for shovel
     * @param hoev     Values for hoe
     * @param group    Item group
     * @param regName  Name of material registered as setRegistry
     */
    public AllToolGroup(IItemTier tier, ToolValues pickaxev, ToolValues axev, ToolValues swordv, ToolValues shovelv, ToolValues hoev, ItemGroup group, String regName) {
        pickaxe = new PickaxeItem(tier, pickaxev.val1, pickaxev.val2 - 4f, new Item.Properties().group(group)).setRegistryName(regName + "_pickaxe");
        axe = new AxeItem(tier, axev.val1, axev.val2 - 4f, new Item.Properties().group(group)).setRegistryName(regName + "_axe");
        sword = new SwordItem(tier, swordv.val1, swordv.val2 - 4f, new Item.Properties().group(group)).setRegistryName(regName + "_sword");
        shovel = new ShovelItem(tier, shovelv.val1, pickaxev.val2 - 4f, new Item.Properties().group(group)).setRegistryName(regName + "_shovel");
        hoe = new HoeItem(tier, hoev.val1 - 4, new Item.Properties().group(group)).setRegistryName(regName + "_hoe");
    }

    public Item[] getTools() {
        return new Item[]{pickaxe, axe, sword, hoe, shovel};
    }

    public static class ToolValues {
        public int val1;
        public float val2;

        /**
         * @param val1 For sword: +Damage; For axe: ..; For Pickaxe: ..;
         * @param val2 For sword: AttackSpeed; For axe: ..; For Pickaxe ..;
         */
        public ToolValues(int val1, float val2) {
            this.val1 = val1;
            this.val2 = val2;
        }


    }
}
