package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class PlankPlywood extends Block {

    public static final String REGISTRY_NAME = "plank_plywood";

    public static PlankPlywood instance;
    public static BlockItem itemInstance;

    public PlankPlywood() {
        super(Properties.from(Blocks.OAK_PLANKS));
        instance = (PlankPlywood) this.setRegistryName(MOD_ID, PlankPlywood.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
