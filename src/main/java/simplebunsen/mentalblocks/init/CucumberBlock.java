package simplebunsen.mentalblocks.init;

import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class CucumberBlock extends RotatedPillarBlock {

    public static final String REGISTRY_NAME = "cucumber_block";

    public static CucumberBlock instance;
    public static BlockItem itemInstance;

    public CucumberBlock() {
        super(Properties.from(Blocks.MELON));
        instance = (CucumberBlock) this.setRegistryName(MOD_ID, CucumberBlock.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
