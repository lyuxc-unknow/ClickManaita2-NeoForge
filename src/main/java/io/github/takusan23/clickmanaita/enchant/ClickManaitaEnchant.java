package io.github.takusan23.clickmanaita.enchant;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

/**
 * 实施内容（右键单击时增加）
 * <p>
 * {@link io.github.takusan23.clickmanaita.ClickManaitaPlayerEvent}を見てください
 */
public class ClickManaitaEnchant extends Enchantment {

    protected ClickManaitaEnchant(Rarity rarity, EquipmentSlot... equipmentSlots) {
        super(rarity, EnchantmentCategory.BREAKABLE, equipmentSlots);
    }

    @Override
    public int getMinCost(int level) {
        return 1 + 10 * (level - 1);
    }

    @Override
    public int getMaxCost(int level) {
        return super.getMinCost(level) + 50;
    }

    @Override
    public int getMinLevel() {
        return super.getMinLevel();
    }

    public int getMaxLevel() {
        return 5;
    }

}
