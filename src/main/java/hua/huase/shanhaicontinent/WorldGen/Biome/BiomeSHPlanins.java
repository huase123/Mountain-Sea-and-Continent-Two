package hua.huase.shanhaicontinent.WorldGen.Biome;

import com.google.common.collect.Lists;
import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.WorldGen.HanderBiome;
import hua.huase.shanhaicontinent.entity.seamentitymob.SeaMLuoLuoNiao;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.ChunkPrimer;

import java.util.List;
import java.util.Random;

public class BiomeSHPlanins extends BiomeBase
{
    public BiomeSHPlanins(BiomeSHPlanins.Type type , String name)
    {
        super(new BiomeProperties(name+"_"+type.name())
                .setBaseHeight(-3.1f)
                .setHeightVariation(0.0f)
                ,type);


        spawnableCreatureList.add(new Biome.SpawnListEntry(SeaMLuoLuoNiao.class, 10, 0, 1));
        spawnableMonsterList.add(new Biome.SpawnListEntry(SeaMLuoLuoNiao.class, 10, 0, 1));

        this.setRegistryName(ExampleMod.MODID,name+"_"+type.name());
        HanderBiome.biomeslist.add(this);
//        this.spawnableCreatureList.clear();
    }
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
    {
        int i = worldIn.getSeaLevel();
        IBlockState iblockstate = this.topBlock;
        IBlockState iblockstate1 = this.fillerBlock;
        int j = -1;
        int k = (int)(noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
        int l = x & 15;
        int i1 = z & 15;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for (int j1 = 255; j1 >= 0; --j1)
        {
            if (j1 <= 1)
            {
                chunkPrimerIn.setBlockState(i1, j1, l, BEDROCK);
            }
            else
            {
                IBlockState iblockstate2 = chunkPrimerIn.getBlockState(i1, j1, l);

                if (iblockstate2.getMaterial() == Material.AIR)
                {
                    j = -1;
                }
                else if (iblockstate2.getBlock() == Blocks.STONE)
                {
                    if (j == -1)
                    {
                        if (k <= 0)
                        {
                            iblockstate = AIR;
                            iblockstate1 = STONE;
                        }
                        else if (j1 >= i - 4 && j1 <= i + 1)
                        {
                            iblockstate = this.topBlock;
                            iblockstate1 = this.fillerBlock;
                        }

                        if (j1 < i && (iblockstate == null || iblockstate.getMaterial() == Material.AIR))
                        {
                            if (this.getTemperature(blockpos$mutableblockpos.setPos(x, j1, z)) < 0.15F)
                            {
                                iblockstate = ICE;
                            }
                            else
                            {
                                iblockstate = WATER;
                            }
                        }

                        j = k;

                        if (j1 >= i - 1)
                        {
                            chunkPrimerIn.setBlockState(i1, j1, l, iblockstate);
                        }
                        else if (j1 < i - 7 - k)
                        {
                            iblockstate = AIR;
                            iblockstate1 = STONE;
                            chunkPrimerIn.setBlockState(i1, j1, l, GRAVEL);
                        }
                        else
                        {
                            chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1);
                        }
                    }
                    else if (j > 0)
                    {
                        --j;
                        chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1);

                        if (j == 0 && iblockstate1.getBlock() == Blocks.SAND && k > 1)
                        {
                            j = rand.nextInt(4) + Math.max(0, j1 - 63);
                            iblockstate1 = iblockstate1.getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND ? RED_SANDSTONE : SANDSTONE;
                        }
                    }
                }
            }
        }
    }
    public TempCategory getTempCategory()
    {
        return TempCategory.OCEAN;
    }


    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        this.decorator.decorate(worldIn, rand, this, pos);
    }


    public BiomeDecorator createBiomeDecorator()
    {
        return getModdedBiomeDecorator(new BiomeDecorator());
    }



    public List<SpawnListEntry> getSpawnableList(EnumCreatureType creatureType)
    {
        switch (creatureType)
        {
            case MONSTER:
                return this.spawnableMonsterList;
            case CREATURE:
                return this.spawnableCreatureList;
            case WATER_CREATURE:
                return this.spawnableWaterCreatureList;
            case AMBIENT:
                return this.spawnableCaveCreatureList;
            default:
                // Forge: Return a non-empty list for non-vanilla EnumCreatureTypes
                if (!this.modSpawnableLists.containsKey(creatureType)) this.modSpawnableLists.put(creatureType, Lists.<SpawnListEntry>newArrayList());
                return this.modSpawnableLists.get(creatureType);
        }
    }


}
