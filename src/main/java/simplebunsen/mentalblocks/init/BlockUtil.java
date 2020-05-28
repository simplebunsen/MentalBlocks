package simplebunsen.mentalblocks.init;

import net.minecraft.item.Item;

import static simplebunsen.mentalblocks.MentalBlocks.MentalBlocksItemGroup;

public class BlockUtil {
    public static final int MAX_STACK_SIZE_BLOCKS = 64;
    public static final Item.Properties simpleBlockItemProperties = new Item.Properties().maxStackSize(MAX_STACK_SIZE_BLOCKS)
            .group(MentalBlocksItemGroup.instance);
}
