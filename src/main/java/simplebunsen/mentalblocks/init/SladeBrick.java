package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class SladeBrick extends Block {

    public static final String REGISTRY_NAME = "slade_brick";

    public static SladeBrick instance;
    public static BlockItem itemInstance;

    public SladeBrick() {
        super(Properties.from(Blocks.STONE));

        instance = (SladeBrick) this.setRegistryName(MOD_ID, SladeBrick.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}