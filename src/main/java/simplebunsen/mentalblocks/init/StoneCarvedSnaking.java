package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class StoneCarvedSnaking extends Block {

    public static final String REGISTRY_NAME = "stone_carved_snaking";

    public static StoneCarvedSnaking instance;
    public static BlockItem itemInstance;

    public StoneCarvedSnaking() {
        super(Properties.from(Blocks.STONE));

        instance = (StoneCarvedSnaking) this.setRegistryName(MOD_ID, StoneCarvedSnaking.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}