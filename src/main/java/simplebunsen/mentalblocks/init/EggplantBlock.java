package simplebunsen.mentalblocks.init;

import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class EggplantBlock extends RotatedPillarBlock {

    public static final String REGISTRY_NAME = "eggplant_block";

    public static EggplantBlock instance;
    public static BlockItem itemInstance;

    public EggplantBlock() {
        super(Properties.from(Blocks.MELON));
        instance = (EggplantBlock) this.setRegistryName(MOD_ID, EggplantBlock.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
