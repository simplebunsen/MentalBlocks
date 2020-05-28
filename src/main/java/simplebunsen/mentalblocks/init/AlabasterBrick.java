package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;

public class AlabasterBrick extends Block {

    public static final String REGISTRY_NAME = "alabaster_brick";

    public static AlabasterBrick instance;
    public static BlockItem itemInstance;

    public AlabasterBrick() {
        super(Block.Properties.create(Material.ROCK)
                .harvestLevel(0) //WOOD
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(1.5f,6f)
        );
        instance = (AlabasterBrick) this.setRegistryName(MOD_ID, AlabasterBrick.REGISTRY_NAME);
        itemInstance = new BlockItem(instance, BlockUtil.simpleBlockItemProperties);
        itemInstance.setRegistryName(instance.getRegistryName());
    }
}
