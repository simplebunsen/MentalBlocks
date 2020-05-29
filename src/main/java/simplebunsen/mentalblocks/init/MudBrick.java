package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class MudBrick extends Block {

    public static final String REGISTRY_NAME = "mud_brick";

    public static MudBrick instance;
    public static BlockItem itemInstance;

    public MudBrick() {
        super(Properties.from(Blocks.COARSE_DIRT)
                .harvestLevel(0) //WOOD
                .harvestTool(ToolType.PICKAXE)
        );

        instance = (MudBrick) this.setRegistryName(MOD_ID, MudBrick.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}