package hua.huase.shanhaicontinent.WorldGen.structureal;

import hua.huase.shanhaicontinent.block.FlowerBlock;
import hua.huase.shanhaicontinent.handers.HanderAny;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class WorldGenFlowerBlock {
    private IBlockState state;

    public WorldGenFlowerBlock()
    {
    }

    public void setGeneratedBlock(IBlockState state)
    {
        this.state = state;
    }

    public static boolean generate(World worldIn, Random rand, BlockPos position)
    {

        int soulsoilmeta = 0;
        int flowermeta = 6;
        if(worldIn.provider.getDimension()==1212){
            soulsoilmeta = 2;
            flowermeta = 7;
        } else if (worldIn.provider.getDimension()==1213) {
            soulsoilmeta = 3;
            flowermeta = 8;
        } else if (worldIn.provider.getDimension()==1214) {
            soulsoilmeta = 4;
            flowermeta = 9;
        } else if (worldIn.provider.getDimension()==1215) {
            soulsoilmeta = 5;
            flowermeta = 9;
        } else if (worldIn.provider.getDimension()==1216) {
            soulsoilmeta = 6;
            flowermeta = 9;
        } else if (worldIn.provider.getDimension()==1217) {
            soulsoilmeta = 7;
            flowermeta = 9;
        } else if (worldIn.provider.getDimension()==1218) {
            soulsoilmeta = 8;
            flowermeta = 9;
        } else{
            soulsoilmeta = 0;
            flowermeta = 6;
        }


        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!worldIn.isAirBlock(blockpos) &&worldIn.isAirBlock(blockpos.up()) && (!worldIn.provider.isNether() || blockpos.getY() < 255))
            {
                IBlockState state = worldIn.getBlockState(blockpos);
                if(state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.FARMLAND){

                    worldIn.setBlockState(blockpos, HanderAny.soulsoil.getStateFromMeta(rand.nextInt(soulsoilmeta+1)), 2);
                    worldIn.setBlockState(blockpos.up(), FlowerBlock.flowerBlocksList.get(rand.nextInt(FlowerBlock.flowerBlocksList.size())).getStateFromMeta(rand.nextInt(flowermeta)), 2);
                }
            }
        }

        return true;
    }
    public static boolean generateBianhua(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 3; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), 0, rand.nextInt(8) - rand.nextInt(8));

            if (!worldIn.isAirBlock(blockpos) &&worldIn.isAirBlock(blockpos.up()))
            {
                IBlockState state = worldIn.getBlockState(blockpos);
                if(state.getBlock() == Blocks.LAVA){

                    worldIn.setBlockState(blockpos, HanderAny.soulsoil.getStateFromMeta(8), 2);
                    worldIn.setBlockState(blockpos.up(), HanderAny.bianhua.getStateFromMeta(rand.nextInt(8)), 2);
                }
            }
        }

        return true;
    }
}
