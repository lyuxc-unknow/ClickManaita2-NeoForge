package io.github.takusan23.clickmanaita;

import io.github.takusan23.clickmanaita.block.ClickManaitaBlocks;
import io.github.takusan23.clickmanaita.creativetab.ClickManaitaCreativeTab;
import io.github.takusan23.clickmanaita.enchant.RegisterEnchant;
import io.github.takusan23.clickmanaita.item.ClickManaitaItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod("clickmanaita")
public class ClickManaita {

    /**
     * MODのID
     */
    public static final String MOD_ID = "clickmanaita";

    /**
     * コンストラクタ
     */
    public ClickManaita(IEventBus modEventBus) {
        // ブロック登録
        ClickManaitaBlocks.register(modEventBus);
        // アイテム（ブロックのアイテム）登録
        ClickManaitaItems.register(modEventBus);
        // クリエイティブタブ登録
        ClickManaitaCreativeTab.register(modEventBus);
        // エンチャントを登録
        RegisterEnchant.register(modEventBus);
        // プレイヤーイベント
        NeoForge.EVENT_BUS.register(new ClickManaitaPlayerEvent());
    }
}
