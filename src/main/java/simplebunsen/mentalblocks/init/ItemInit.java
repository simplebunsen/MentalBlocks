package simplebunsen.mentalblocks.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import simplebunsen.mentalblocks.MentalBlocks;

@Mod.EventBusSubscriber(modid = MentalBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MentalBlocks.MOD_ID)
public class ItemInit {
    public static final Item paintbrush = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new Item(new Item.Properties()
                                                        .group(ItemGroup.COMBAT))
                                                        .setRegistryName("paintbrush"));

    }
}
