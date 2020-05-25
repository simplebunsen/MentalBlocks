package simplebunsen.mentalblocks.init;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import simplebunsen.mentalblocks.MentalBlocks;

@Mod.EventBusSubscriber(modid = MentalBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MentalBlocks.MOD_ID)
public class BlockInit {
    public static final Block template_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2f, 6f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(0)
                .sound(SoundType.SAND))
                .setRegistryName("template_block"));

    }
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(template_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
            .setRegistryName("template_block"));
    }
}
