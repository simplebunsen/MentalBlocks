package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class MudBrickSturdy extends Block {

    public static final String REGISTRY_NAME = "mud_brick_sturdy";

    public static MudBrickSturdy instance;
    public static BlockItem itemInstance;

    public MudBrickSturdy() {
        super(Properties.from(Blocks.COARSE_DIRT)
                .harvestLevel(0) //WOOD
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(1.5f,6f)
        );

        instance = (MudBrickSturdy) this.setRegistryName(MOD_ID, MudBrickSturdy.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}