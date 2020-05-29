package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class SandObsidian extends Block {

    public static final String REGISTRY_NAME = "sand_obsidian";

    public static SandObsidian instance;
    public static BlockItem itemInstance;

    public SandObsidian() {
        super(Properties.from(Blocks.SAND));
        instance = (SandObsidian) this.setRegistryName(MOD_ID, SandObsidian.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
