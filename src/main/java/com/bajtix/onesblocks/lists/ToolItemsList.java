package com.bajtix.onesblocks.lists;

import com.bajtix.onesblocks.AllToolGroup;
import com.bajtix.onesblocks.MainClass;
import net.minecraft.item.Item;
import org.apache.commons.lang3.ArrayUtils;

public class ToolItemsList {

    public static AllToolGroup sandstone_tools = new AllToolGroup(
            ToolMaterialList.sandstone,
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            MainClass.mainGroup,
            "sandstone"
    );


    public static AllToolGroup elfium_tools = new AllToolGroup(
            ToolMaterialList.sandstone,
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            new AllToolGroup.ToolValues(0, 0),
            MainClass.mainGroup,
            "elfium"
    );

    public static Item[] tools = ArrayUtils.addAll(
            sandstone_tools.getTools(),
            elfium_tools.getTools()
    );

}
