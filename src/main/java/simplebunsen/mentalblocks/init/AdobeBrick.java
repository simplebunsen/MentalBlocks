package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class AdobeBrick extends Block {

    public static final String REGISTRY_NAME = "adobe_brick";

    public static AdobeBrick instance;
    public static BlockItem itemInstance;

    public AdobeBrick() {
        super(Properties.from(Blocks.STONE));

        instance = (AdobeBrick) this.setRegistryName(MOD_ID, AdobeBrick.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}