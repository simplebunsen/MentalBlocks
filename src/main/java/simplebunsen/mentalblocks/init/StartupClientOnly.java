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

        RenderTypeLookup.setRenderLayer(CopperPlating.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(CucumberBlock.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(EggplantBlock.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(MudBrick.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(MudBrickSturdy.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(PlankPlywood.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(SandObsidian.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(Slade.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(SladeBrick.instance, RenderType.getSolid());

        RenderTypeLookup.setRenderLayer(SladeCarved.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(SladeColumn.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(SpongeBloody.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StoneCarvedColumn.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StoneCarvedSnaking.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StoneTilesSmall.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(StoneTilesSmallMossy.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(TerracottaTileLarge.instance, RenderType.getSolid());
        RenderTypeLookup.setRenderLayer(TerracottaTileLight.instance, RenderType.getSolid());




    }
}
