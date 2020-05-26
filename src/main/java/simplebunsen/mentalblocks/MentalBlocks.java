package simplebunsen.mentalblocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import simplebunsen.mentalblocks.init.ItemInit;


@Mod(MentalBlocks.MOD_ID)
public class MentalBlocks
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mentalblocks";
    public static IEventBus MOD_EVENT_BUS;
    public static MentalBlocks instance;

//    //TODO: Make this toggleable by config. Logic should be there already.
//    public static boolean putBlocksInSeperateTab = true;
//    public static ItemGroup desiredBlockTab = ItemGroup.BUILDING_BLOCKS;

    public MentalBlocks() {

        instance = this;
        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

        registerCommonEvents();
        DistExecutor.runWhenOn(Dist.CLIENT, () -> MentalBlocks::registerClientOnlyEvents);

        //MinecraftForge.EVENT_BUS.register(this);

        /*
        putBlocksInSeperateTab = config.myoption;
        if(putBlocksInSeperateTab) {
            desiredBlockTab = MentalBlocksItemGroup.instance;
        }
         */
    }

    private void registerCommonEvents() {
        MOD_EVENT_BUS.register(simplebunsen.mentalblocks.init.StartupCommon.class);
    }

    public static void registerClientOnlyEvents() {
        MOD_EVENT_BUS.register(simplebunsen.mentalblocks.init.StartupClientOnly.class);
    }

    //(weird?) way to setup my creative tab
    public static class MentalBlocksItemGroup extends ItemGroup {
        public static final MentalBlocksItemGroup instance =
                new MentalBlocksItemGroup(ItemGroup.GROUPS.length, MOD_ID);

        private MentalBlocksItemGroup(int index, String label) {
            super(index, label);
            //desiredBlockTab = this;
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemInit.paintbrush);
        }
    }
}
