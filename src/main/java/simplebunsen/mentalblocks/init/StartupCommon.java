package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;
import static simplebunsen.mentalblocks.MentalBlocks.MentalBlocksItemGroup;

public class StartupCommon {
    public static AlabasterBrick alabasterBrick;
    public static BlockItem itemAlabasterBrick;

    public static AlabasterCarved alabasterCarved;
    public static BlockItem itemAlabasterCarved;

    @SubscribeEvent
    public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
        //Alabaster Brick
        alabasterBrick = (AlabasterBrick) new AlabasterBrick().setRegistryName(MOD_ID, "alabaster_brick");
        blockRegisterEvent.getRegistry().register(alabasterBrick);

        //Carved Alabaster
        alabasterCarved = (AlabasterCarved) new AlabasterCarved().setRegistryName(MOD_ID, "alabaster_carved");
        blockRegisterEvent.getRegistry().register(alabasterCarved);

        //...
    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        final int MAX_STACK_SIZE_BLOCKS = 64;

        final Item.Properties simpleBlockItemProperties = new Item.Properties().maxStackSize(MAX_STACK_SIZE_BLOCKS)
                .group(MentalBlocksItemGroup.instance);

        //Alabaster Brick
        itemAlabasterBrick = new BlockItem(alabasterBrick, simpleBlockItemProperties);
        itemAlabasterBrick.setRegistryName(alabasterBrick.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAlabasterBrick);

        //Carved Alabaster
        itemAlabasterCarved = new BlockItem(alabasterCarved, simpleBlockItemProperties);
        itemAlabasterCarved.setRegistryName(alabasterCarved.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAlabasterCarved);
    }




}
