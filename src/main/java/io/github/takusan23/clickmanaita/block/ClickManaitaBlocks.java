package io.github.takusan23.clickmanaita.block;

import io.github.takusan23.clickmanaita.ClickManaita;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * 用于定义、注册 ClickManaita MOD方块的类
 */
public class ClickManaitaBlocks {

    /**
     * 用于注册方块
     */
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ClickManaita.MOD_ID);

    /**
     * 木制砧板
     * 2倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_WOOD_BLOCK = BLOCKS.register("clickmanaita_block_wood", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F).sound(SoundType.WOOD).ignitedByLava(), 2));

    /**
     * 石制砧板
     * 4倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_STONE_BLOCK = BLOCKS.register("clickmanaita_block_stone", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 4));

    /**
     * 铁制砧板
     * 8倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_IRON_BLOCK = BLOCKS.register("clickmanaita_block_iron", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), 8));

    /**
     * 金制砧板
     * 16倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_GOLD_BLOCK = BLOCKS.register("clickmanaita_block_gold", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL), 16));
    /**
     * 钻石制砧板
     * 32倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_DIAMOND_BLOCK = BLOCKS.register("clickmanaita_block_diamond", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), 32));

    /**
     * 绿宝石制砧板
     * 64倍
     */
    public static final DeferredBlock<ClickManaitaBaseBlock> CLICKMANAITA_EMERANLD_BLOCK = BLOCKS.register("clickmanaita_block_emerald", () -> new ClickManaitaBaseBlock(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), 64));

    /**
     * 注册
     * <p>
     * {@link ClickManaita}中描述的相应参数的值
     */
    public static void register(IEventBus eventBus) {
        // 注册方块
        BLOCKS.register(eventBus);
    }

}
