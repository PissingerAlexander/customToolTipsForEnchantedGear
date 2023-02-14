package net.alexander.custom_tool_tips_for_enchanted_gear.event_handlers;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Matrix4f;
import net.alexander.custom_tool_tips_for_enchanted_gear.CustomToolTipsForEnchantedGear;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;  //????????
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.client.event.RenderGuiOverlayEvent; //????????
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = CustomToolTipsForEnchantedGear.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ToolTipColorEventHandler {

    @SubscribeEvent
    public static void newBackgroundColor(RenderTooltipEvent event) {
       if (!(event.getItemStack().getItem() instanceof SwordItem)) return;
       if (event.getItemStack().isEnchanted()) {
           event.setCanceled(true);

           PoseStack itemPoseStack = event.getPoseStack();
           itemPoseStack.pushPose();

           itemPoseStack.popPose();
       }
    }
}
