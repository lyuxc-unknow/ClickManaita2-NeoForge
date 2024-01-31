package io.github.takusan23.clickmanaita.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * 砧板方块的BlockItem
 * <p>
 * 为了在物品栏中添加提示文本而制作了类
 */
public class ClickManaitaBlockItem extends BlockItem {

    /**
     * 提示颜色
     */
    private String toolTipColor;

    /**
     * 提示显示的文本
     */
    private String toolTipText;

    public ClickManaitaBlockItem(Block blockIn, Item.Properties builder) {
        super(blockIn, builder);
    }

    /**
     * 设置提示的颜色
     *
     * @param toolTipColor 颜色。可以为#252525等
     */
    public void setToolTipColor(String toolTipColor) {
        this.toolTipColor = toolTipColor;
    }

    /**
     * 设置提示文本
     *
     * @param toolTipText 要显示的字符串
     */
    public void setToolTipText(String toolTipText) {
        this.toolTipText = toolTipText;
    }

    /**
     * 显示工具提示
     */
    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
        MutableComponent text = Component.literal(toolTipText);
        text.setStyle(Style.EMPTY.withColor(TextColor.parseColor(toolTipColor).get().orThrow()));
        list.add(text);
    }

}
