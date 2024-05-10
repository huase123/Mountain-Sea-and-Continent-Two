package hua.huase.shanhaicontinent.WorldGen;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface WorldApi {
     static BlockPos getWorldTopBlockPos (World world,BlockPos blockPos,int top){
        BlockPos pos = new BlockPos(blockPos.getX(), top, blockPos.getZ());
        for (IBlockState iblockstate = world.getBlockState(pos); iblockstate.getBlock().isAir(iblockstate, world, pos) || pos.getY() > 5; iblockstate = world.getBlockState(pos))
        {
            pos = pos.down();
        }
        return pos.up();
    }
}
