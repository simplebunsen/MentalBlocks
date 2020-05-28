package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class ClothWet extends Block {

    public static final String REGISTRY_NAME = "cloth_wet";

    public static ClothWet instance;
    public static BlockItem itemInstance;

    public ClothWet() {
        super(Properties.from(Blocks.WHITE_WOOL));

        instance = (ClothWet) this.setRegistryName(MOD_ID, ClothWet.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}