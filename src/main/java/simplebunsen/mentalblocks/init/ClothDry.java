package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class ClothDry extends Block {

    public static final String REGISTRY_NAME = "cloth_dry";

    public static ClothDry instance;
    public static BlockItem itemInstance;

    public ClothDry() {
        super(Properties.from(Blocks.WHITE_WOOL));

        instance = (ClothDry) this.setRegistryName(MOD_ID, ClothDry.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}