package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class SpongeBloody extends Block {

    public static final String REGISTRY_NAME = "sponge_bloody";

    public static SpongeBloody instance;
    public static BlockItem itemInstance;

    public SpongeBloody() {
        super(Properties.from(Blocks.WET_SPONGE));

        instance = (SpongeBloody) this.setRegistryName(MOD_ID, SpongeBloody.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}