package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class CopperPlating extends Block {

    public static final String REGISTRY_NAME = "copper_plating";

    public static CopperPlating instance;
    public static BlockItem itemInstance;

    public CopperPlating() {
        super(Properties.from(Blocks.IRON_BLOCK));
        instance = (CopperPlating) this.setRegistryName(MOD_ID, CopperPlating.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
