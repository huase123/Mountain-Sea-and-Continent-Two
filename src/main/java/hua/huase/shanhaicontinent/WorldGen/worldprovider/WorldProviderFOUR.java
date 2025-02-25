package hua.huase.shanhaicontinent.WorldGen.worldprovider;

import hua.huase.shanhaicontinent.WorldGen.BiomeProvider.BiomeProviderFOUR;
import hua.huase.shanhaicontinent.WorldGen.ChunkGeneratorGarden.ChunkGeneratorGardenONE;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static hua.huase.shanhaicontinent.WorldGen.HanderBiome.dimensionTypeSH_FOUR;


public  class WorldProviderFOUR extends WorldProvider {
    private static final IRenderHandler cloudRenderer = new IRenderHandler() {
        @Override
        public void render(float partialTicks, WorldClient world, Minecraft mc) {

        }
    };
    private static final Vec3d zeroVector = new Vec3d(0.0, 0.0, 0.0);

    public WorldProviderFOUR() {
        this.doesWaterVaporize = false;
    }
    public void init()
    {
        this.hasSkyLight = true;
        this.biomeProvider = new BiomeProviderFOUR(world);
    }



    public IChunkGenerator createChunkGenerator() {
//        return new UW_ChunkGeneratorGarden(this.world, true,this.world.getWorldTime(), new BlockPos(0,8,0));

//        return new ChunkGeneratorHell(this.world, this.world.getWorldInfo().isMapFeaturesEnabled(), this.world.getSeed());
//        return super.createChunkGenerator();
        return new ChunkGeneratorGardenONE(world, world.getSeed()+4, world.getWorldInfo().isMapFeaturesEnabled(), world.getWorldInfo().getGeneratorOptions());

//        return new ChunkGeneratorMy(this.world, false, this.world.getSeed(), this.getSpawnCoordinate());
    }


    public String getSaveFolder() {
        return "DIM" + this.getDimension();
    }

    public boolean shouldClientCheckLighting() {
        return true;
    }


    public double getMovementFactor() {
        return 8.0;
    }

    public boolean isDaytime()
    {
        return world.getSkylightSubtracted() < 4;
    }


    public void calculateInitialWeather() {
        this.resetRainAndThunder();
    }

    public void updateWeather() {
        world.updateWeatherBody();
    }

    public Teleporter getDefaultTeleporter() {
        return null;
    }

    @SideOnly(Side.CLIENT)
    public IRenderHandler getCloudRenderer() {
        return cloudRenderer;
    }

    @SideOnly(Side.CLIENT)
    public IRenderHandler getWeatherRenderer() {
        return cloudRenderer;
    }

    public long getWorldTime() {

        return super.getWorldTime();
    }

//    public float calculateCelestialAngle(long par1, float par3) {
//        return 0.225f;
//    }

    public boolean canDoLightning(Chunk chunk) {
//        return false;
        return super.canDoLightning(chunk);
    }

    public boolean canDoRainSnowIce(Chunk chunk) {
        return false;
    }

    public DimensionType getDimensionType() {
        return dimensionTypeSH_FOUR;
    }



    public boolean canRespawnHere()
    {
        return false;
    }



}