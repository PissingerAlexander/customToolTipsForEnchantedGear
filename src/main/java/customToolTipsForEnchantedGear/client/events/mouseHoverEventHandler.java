package customToolTipsForEnchantedGear.client.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "custom_tool_tips_for_enchanted_gear", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class mouseHoverEventHandler {

    @SubscribeEvent
    public static void mouseOverItem(ItemTooltipEvent event) {
        System.out.println(event.getItemStack().getItem().getClass());
        if (event.getItemStack().isEnchanted()) {
            System.out.println(event.getItemStack().getEnchantmentTags());
        } else {
            System.out.println("Ist nicht verzaubert");
        }
    }
}
