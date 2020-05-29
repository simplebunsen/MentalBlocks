package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class StoneCarvedColumn extends Block {

    public static final String REGISTRY_NAME = "stone_carved_column";

    public static StoneCarvedColumn instance;
    public static BlockItem itemInstance;

    public StoneCarvedColumn() {
        super(Properties.from(Blocks.STONE));

        instance = (StoneCarvedColumn) this.setRegistryName(MOD_ID, StoneCarvedColumn.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}