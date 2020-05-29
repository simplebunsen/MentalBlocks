package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class TerracottaTileLight extends Block {

    public static final String REGISTRY_NAME = "terracotta_tile_light";

    public static TerracottaTileLight instance;
    public static BlockItem itemInstance;

    public TerracottaTileLight() {
        super(Properties.from(Blocks.COARSE_DIRT)
                .harvestLevel(0) //WOOD
                .harvestTool(ToolType.PICKAXE)
        );

        instance = (TerracottaTileLight) this.setRegistryName(MOD_ID, TerracottaTileLight.REGISTRY_NAME);

        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}