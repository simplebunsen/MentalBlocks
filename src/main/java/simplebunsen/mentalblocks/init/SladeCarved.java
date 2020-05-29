package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class SladeCarved extends Block {

    public static final String REGISTRY_NAME = "slade_carved";

    public static SladeCarved instance;
    public static BlockItem itemInstance;

    public SladeCarved() {
        super(Properties.from(Blocks.STONE));

        instance = (SladeCarved) this.setRegistryName(MOD_ID, SladeCarved.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}