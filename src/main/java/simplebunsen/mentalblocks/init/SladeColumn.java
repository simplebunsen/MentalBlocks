package simplebunsen.mentalblocks.init;

import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class SladeColumn extends RotatedPillarBlock {

    public static final String REGISTRY_NAME = "slade_column";

    public static SladeColumn instance;
    public static BlockItem itemInstance;

    public SladeColumn() {
        super(Properties.from(Blocks.STONE));

        instance = (SladeColumn) this.setRegistryName(MOD_ID, SladeColumn.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}