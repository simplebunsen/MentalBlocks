package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class ConcretePaver extends Block {

    public static final String REGISTRY_NAME = "concrete_paver";

    public static ConcretePaver instance;
    public static BlockItem itemInstance;

    public ConcretePaver() {
        super(Properties.from(Blocks.SMOOTH_STONE));
        instance = (ConcretePaver) this.setRegistryName(MOD_ID, ConcretePaver.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
