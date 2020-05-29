package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class Slade extends Block {

    public static final String REGISTRY_NAME = "slade";

    public static Slade instance;
    public static BlockItem itemInstance;

    public Slade() {
        super(Properties.from(Blocks.STONE));

        instance = (Slade) this.setRegistryName(MOD_ID, Slade.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}