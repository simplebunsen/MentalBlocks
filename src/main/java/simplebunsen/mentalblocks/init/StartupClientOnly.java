package simplebunsen.mentalblocks.init;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClientOnly {

    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(AlabasterBrick.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StartupCommon.alabasterCarved, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StartupCommon.alabasterColumn, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StartupCommon.alabasterPlain, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StartupCommon.asphaltPlain, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(AdobeBrick.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(ClothBound.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(ClothDry.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(ClothWet.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(ConcretePavement.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(ConcretePaver.instance, RenderType.getSolid());



    }
}
