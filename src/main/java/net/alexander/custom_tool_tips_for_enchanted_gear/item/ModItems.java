package net.alexander.custom_tool_tips_for_enchanted_gear.item;

import net.alexander.custom_tool_tips_for_enchanted_gear.CustomToolTipsForEnchantedGear;
import net.alexander.custom_tool_tips_for_enchanted_gear.item.custom.CustomSword;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CustomToolTipsForEnchantedGear.MOD_ID);

    public static final RegistryObject<CustomSword> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new CustomSword(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(250).tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
