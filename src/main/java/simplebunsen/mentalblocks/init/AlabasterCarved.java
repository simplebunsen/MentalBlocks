package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;

public class AlabasterCarved extends Block {

    public AlabasterCarved() {
        super(Properties.from(StartupCommon.alabasterBrick)
                //Block.Properties.create(Material.ROCK)
                //.harvestLevel(0) //WOOD
                //.harvestTool(ToolType.PICKAXE)
                //.hardnessAndResistance(1.5f,6f)
        );
    }
}
