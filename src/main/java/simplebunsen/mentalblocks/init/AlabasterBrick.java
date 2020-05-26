package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AlabasterBrick extends Block {

    public AlabasterBrick() {
        super(Block.Properties.create(Material.ROCK)
                .harvestLevel(0) //WOOD
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(1.5f,6f)
        );
    }
}
