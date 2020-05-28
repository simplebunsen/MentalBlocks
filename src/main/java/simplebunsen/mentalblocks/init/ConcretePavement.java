package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class ConcretePavement extends Block {

    public static final String REGISTRY_NAME = "concrete_pavement";

    public static ConcretePavement instance;
    public static BlockItem itemInstance;

    public ConcretePavement() {
        super(Properties.from(Blocks.SMOOTH_STONE));
        instance = (ConcretePavement) this.setRegistryName(MOD_ID, ConcretePavement.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
