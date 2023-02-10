package net.alexander.customToolTipsForEnchantedGear.client.items.swords;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class CustomEnchantedSword extends SwordItem {

    public CustomEnchantedSword(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
        System.out.println("Custom Sword");
    }
}
