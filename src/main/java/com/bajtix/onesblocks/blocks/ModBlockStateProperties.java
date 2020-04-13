package com.bajtix.onesblocks.blocks;

import net.minecraft.state.IntegerProperty;

public class ModBlockStateProperties {
    public static final IntegerProperty VASE_COUNT;

    static {
        VASE_COUNT = IntegerProperty.create("vase", 1, 3);
    }


}
