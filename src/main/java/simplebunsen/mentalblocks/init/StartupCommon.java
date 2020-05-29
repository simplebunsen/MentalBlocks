package simplebunsen.mentalblocks.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static simplebunsen.mentalblocks.MentalBlocks.MOD_ID;
import static simplebunsen.mentalblocks.MentalBlocks.MentalBlocksItemGroup;

public class StartupCommon {

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

        //Copper Plating
        new CopperPlating();
        blockRegisterEvent.getRegistry().register(CopperPlating.instance);

        //Cucumber
        new CucumberBlock();
        blockRegisterEvent.getRegistry().register(CucumberBlock.instance);

        //Eggplant
        new EggplantBlock();
        blockRegisterEvent.getRegistry().register(EggplantBlock.instance);

        //Mud Brick
        new MudBrick();
        blockRegisterEvent.getRegistry().register(MudBrick.instance);

        //Sturdy Mud Brick
        new MudBrickSturdy();
        blockRegisterEvent.getRegistry().register(MudBrickSturdy.instance);

        //Plywood Plank
        new PlankPlywood();
        blockRegisterEvent.getRegistry().register(PlankPlywood.instance);

        //Sand Obsidian
        new SandObsidian();
        blockRegisterEvent.getRegistry().register(SandObsidian.instance);

        //Slade
        new Slade();
        blockRegisterEvent.getRegistry().register(Slade.instance);

        //Slade Brick
        new SladeBrick();
        blockRegisterEvent.getRegistry().register(SladeBrick.instance);

        //Slade Carved
        new SladeCarved();
        blockRegisterEvent.getRegistry().register(SladeCarved.instance);

        //Slade Column
        new SladeColumn();
        blockRegisterEvent.getRegistry().register(SladeColumn.instance);

        //Sponge Bloody
        new SpongeBloody();
        blockRegisterEvent.getRegistry().register(SpongeBloody.instance);

        //Stone Carved Column
        new StoneCarvedColumn();
        blockRegisterEvent.getRegistry().register(StoneCarvedColumn.instance);

        //Stone Carved Snaking
        new StoneCarvedSnaking();
        blockRegisterEvent.getRegistry().register(StoneCarvedSnaking.instance);

        //Stone Tiles Small
        new StoneTilesSmall();
        blockRegisterEvent.getRegistry().register(StoneTilesSmall.instance);

        //Stone Tiles Small Mossy
        new StoneTilesSmallMossy();
        blockRegisterEvent.getRegistry().register(StoneTilesSmallMossy.instance);

        //Terracotta Tile Large
        new TerracottaTileLarge();
        blockRegisterEvent.getRegistry().register(TerracottaTileLarge.instance);

        //Terracotta Tile Light
        new TerracottaTileLight();
        blockRegisterEvent.getRegistry().register(TerracottaTileLight.instance);

        //...
    }

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        //TODO: remove
        //TODO: maybe put iteminstances in array of blockitems to loop over below
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
//TODO:
        //Concrete Paver
        itemRegisterEvent.getRegistry().register(CopperPlating.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(CucumberBlock.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(EggplantBlock.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(MudBrick.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(MudBrickSturdy.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(PlankPlywood.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(SandObsidian.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(Slade.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(SladeBrick.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(SladeCarved.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(SladeColumn.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(SpongeBloody.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(StoneCarvedColumn.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(StoneCarvedSnaking.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(StoneTilesSmall.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(StoneTilesSmallMossy.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(TerracottaTileLarge.itemInstance);

        //Concrete Paver
        itemRegisterEvent.getRegistry().register(TerracottaTileLight.itemInstance);

    }




}
