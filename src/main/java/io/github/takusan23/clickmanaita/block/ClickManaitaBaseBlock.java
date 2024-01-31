package io.github.takusan23.clickmanaita.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

/**
 * 砧板(方块)基础类
 * <p>
 * 有两种可以引用的构造函数
 */
public class ClickManaitaBaseBlock extends Block {

    /**
     * 复制后的物品数量
     */
    private int dropSize = 2;

    /**
     * 已弃用，请使用需要两个参数的构造函数
     */
    @Deprecated
    public ClickManaitaBaseBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    /**
     * @param properties  创造物品栏等设定
     * @param argDropSize 复制后的物品数量
     */
    public ClickManaitaBaseBlock(BlockBehaviour.Properties properties, int argDropSize) {
        super(properties);
        dropSize = argDropSize;
    }

    /**
     * 右键时，砧板做出的反应
     * <p>
     * 有什么不推荐的吗？
     */
    @Override
    public @NotNull InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        for (int i = 0; i < dropSize; i++) {
            // 复制当前拥有的物品
            ItemStack currentItem = player.getMainHandItem().copy();
            // 设置为只有一个
            currentItem.setCount(1);
            // 在地面上生成物品
            Block.popResource(level, blockPos, currentItem);
        }
        return InteractionResult.SUCCESS;
    }
}
