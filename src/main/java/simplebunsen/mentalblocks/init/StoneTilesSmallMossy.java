package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class StoneTilesSmallMossy extends Block {

    public static final String REGISTRY_NAME = "stone_tiles_small_mossy";

    public static StoneTilesSmallMossy instance;
    public static BlockItem itemInstance;

    public StoneTilesSmallMossy() {
        super(Properties.from(Blocks.STONE));

        instance = (StoneTilesSmallMossy) this.setRegistryName(MOD_ID, StoneTilesSmallMossy.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}