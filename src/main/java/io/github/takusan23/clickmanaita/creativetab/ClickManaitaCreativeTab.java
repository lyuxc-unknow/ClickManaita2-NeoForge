package io.github.takusan23.clickmanaita.creativetab;

import io.github.takusan23.clickmanaita.ClickManaita;
import io.github.takusan23.clickmanaita.item.ClickManaitaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * 注册创造物品栏
 */
public class ClickManaitaCreativeTab {

    public static final DeferredRegister<CreativeModeTab> ITEM_GROUP = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClickManaita.MOD_ID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> CREATIVE_TAB = ITEM_GROUP.register(
            "clickmanaita_creative_tab",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> new ItemStack(ClickManaitaItems.CLICKMANAITA_WOOD.get()))
                    .title(Component.translatable("itemGroup.clickmanaita_creative_tab"))
                    .displayItems((displayParameters, output) -> {
                        // 添加物品
                        output.accept(ClickManaitaItems.CLICKMANAITA_WOOD.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_STONE.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_IRON.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_GOLD.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_DIAMOND.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_EMERALD.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_CUSTOM_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_WOOD_BLOCK_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_STONE_BLOCK_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_IRON_BLOCK_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_GOLD_BLOCK_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_DIAMOND_BLOCK_ITEM.get());
                        output.accept(ClickManaitaItems.CLICKMANAITA_EMERALD_BLOCK_ITEM.get());
                    })
                    .build()
    );

    /**
     * 注册创造物品栏
     * <p>
     * {@link ClickManaita}中描述的相应参数的值
     */
    public static void register(IEventBus iEventBus) {
        ITEM_GROUP.register(iEventBus);
    }
}
