package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class AlabasterCarved extends Block {

    public AlabasterCarved() {
        super(Properties.from(Blocks.STONE)
                //Block.Properties.create(Material.ROCK)
                //.harvestLevel(0) //WOOD
                //.harvestTool(ToolType.PICKAXE)
                //.hardnessAndResistance(1.5f,6f)
        );
    }
}
