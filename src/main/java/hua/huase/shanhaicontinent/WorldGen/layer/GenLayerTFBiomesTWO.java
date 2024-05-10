package hua.huase.shanhaicontinent.WorldGen.layer;

import hua.huase.shanhaicontinent.WorldGen.HanderBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Applies the twilight forest biomes to the map
 *
 * @author Ben
 */
public class GenLayerTFBiomesTWO extends GenLayer {

	private static final int RARE_BIOME_CHANCE = 2;

	protected static final List<Supplier<Biome>> commonBiomes = Arrays.asList(
			() -> HanderBiome.biomeSHPlanins_TWO
	);
	protected static final List<Supplier<Biome>> rareBiomes = Arrays.asList(
			() -> HanderBiome.biomeSHPlanins_TWO,
			() -> HanderBiome.biomeSHOcean_TWO,
			() -> HanderBiome.biomeSHNether_TWO,
			() -> HanderBiome.biomeSHIce_TWO,
			() -> HanderBiome.biomeSHHills_TWO
	);

	public GenLayerTFBiomesTWO(long l, GenLayer genlayer) {
		super(l);
		parent = genlayer;
	}

	public GenLayerTFBiomesTWO(long l) {
		super(l);
	}

	@Override
	public int[] getInts(int x, int z, int width, int depth) {

		int dest[] = IntCache.getIntCache(width * depth);

		for (int dz = 0; dz < depth; dz++) {
			for (int dx = 0; dx < width; dx++) {
				initChunkSeed(dx + x, dz + z);
				if (nextInt(RARE_BIOME_CHANCE) == 0) {
					// make rare biome
					dest[dx + dz * width] = Biome.getIdForBiome(getRandomBiome(rareBiomes));
				} else {
					// make common biome
					dest[dx + dz * width] = Biome.getIdForBiome(getRandomBiome(commonBiomes));
				}
			}
		}

//		for (int i = 0; i < width * depth; i++)
//		{
//			if (dest[i] < 0 || dest[i] > TFBiomeBase.fireSwamp.biomeID)
//			{
//				System.err.printf("Made a bad ID, %d at %d, %d while generating\n", dest[i], x, z);
//			}
//		}

		return dest;
	}

	private Biome getRandomBiome(List<Supplier<Biome>> biomes) {
		return biomes.get(nextInt(biomes.size())).get();
	}
}
