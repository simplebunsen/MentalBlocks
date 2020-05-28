package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class ClothBound extends Block {

    public static final String REGISTRY_NAME = "cloth_bound";

    public static ClothBound instance;
    public static BlockItem itemInstance;

    public ClothBound() {
        super(Properties.from(Blocks.WHITE_WOOL));

        instance = (ClothBound) this.setRegistryName(MOD_ID, ClothBound.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
