package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class StoneTilesSmall extends Block {

    public static final String REGISTRY_NAME = "stone_tiles_small";

    public static StoneTilesSmall instance;
    public static BlockItem itemInstance;

    public StoneTilesSmall() {
        super(Properties.from(Blocks.STONE));

        instance = (StoneTilesSmall) this.setRegistryName(MOD_ID, StoneTilesSmall.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}