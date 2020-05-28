package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;
import static simplebunsen.mentalblocks.MentalBlocks.MentalBlocksItemGroup;

public class StartupCommon {

//    public static AlabasterBrick alabasterBrick;
//    public static BlockItem itemAlabasterBrick;

    public static AlabasterCarved alabasterCarved;
    public static BlockItem itemAlabasterCarved;

    public static AlabasterColumn alabasterColumn;
    public static BlockItem itemAlabasterColumn;

    public static AlabasterPlain alabasterPlain;
    public static BlockItem itemAlabasterPlain;

    public static AsphaltPlain asphaltPlain;
    public static BlockItem itemAsphaltPlain;


    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
        //Alabaster Brick
        new AlabasterBrick();
        blockRegisterEvent.getRegistry().register(AlabasterBrick.instance);

        //Carved Alabaster
        alabasterCarved = (AlabasterCarved) new AlabasterCarved().setRegistryName(MOD_ID, "alabaster_carved");
        blockRegisterEvent.getRegistry().register(alabasterCarved);

        //Alabaster Column
        alabasterColumn = (AlabasterColumn) new AlabasterColumn().setRegistryName(MOD_ID, "alabaster_column");
        blockRegisterEvent.getRegistry().register(alabasterColumn);

        //Plain Alabaster
        alabasterPlain = (AlabasterPlain) new AlabasterPlain().setRegistryName(MOD_ID, "alabaster_plain");
        blockRegisterEvent.getRegistry().register(alabasterPlain);
        
        //Plain Asphalt
        asphaltPlain = (AsphaltPlain) new AsphaltPlain().setRegistryName(MOD_ID, "asphalt_plain");
        blockRegisterEvent.getRegistry().register(asphaltPlain);

        //Adobe Brick
        new AdobeBrick();
        blockRegisterEvent.getRegistry().register(AdobeBrick.instance);

        //Bound Cloth
        new ClothBound();
        blockRegisterEvent.getRegistry().register(ClothBound.instance);

        //Dry Cloth
        new ClothDry();
        blockRegisterEvent.getRegistry().register(ClothDry.instance);

        //Wet Cloth
        new ClothWet();
        blockRegisterEvent.getRegistry().register(ClothWet.instance);
        
        //Concrete Pavement
        new ConcretePavement();
        blockRegisterEvent.getRegistry().register(ConcretePavement.instance);

        //Concrete Paver
        new ConcretePaver();
        blockRegisterEvent.getRegistry().register(ConcretePaver.instance);

        //...
    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        //TODO: remove
        final int MAX_STACK_SIZE_BLOCKS = 64;
        final Item.Properties simpleBlockItemProperties = new Item.Properties().maxStackSize(MAX_STACK_SIZE_BLOCKS)
                .group(MentalBlocksItemGroup.instance);

        //Alabaster Brick
        itemRegisterEvent.getRegistry().register(AlabasterBrick.itemInstance);

        //Carved Alabaster
        itemAlabasterCarved = new BlockItem(alabasterCarved, simpleBlockItemProperties);
        itemAlabasterCarved.setRegistryName(alabasterCarved.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAlabasterCarved);

        //Column Alabaster
        itemAlabasterColumn = new BlockItem(alabasterColumn, simpleBlockItemProperties);
        itemAlabasterColumn.setRegistryName(alabasterColumn.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAlabasterColumn);

        //Plain Alabaster
        itemAlabasterPlain = new BlockItem(alabasterPlain, simpleBlockItemProperties);
        itemAlabasterPlain.setRegistryName(alabasterPlain.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAlabasterPlain);

        //Plain Asphalt
        itemAsphaltPlain = new BlockItem(asphaltPlain, simpleBlockItemProperties);
        itemAsphaltPlain.setRegistryName(asphaltPlain.getRegistryName());
        itemRegisterEvent.getRegistry().register(itemAsphaltPlain);

        //Adobe Brick
        itemRegisterEvent.getRegistry().register(AdobeBrick.itemInstance);

        //Bound Cloth
        itemRegisterEvent.getRegistry().register(ClothBound.itemInstance);

        //Dry Cloth
        itemRegisterEvent.getRegistry().register(ClothDry.itemInstance);

        //Wet Cloth
        itemRegisterEvent.getRegistry().register(ClothWet.itemInstance);

        //Concrete Pavement
        itemRegisterEvent.getRegistry().register(ConcretePavement.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(ConcretePaver.itemInstance);
    }




}
