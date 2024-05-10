package hua.huase.shanhaicontinent.WorldGen.worldstructureal;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class StructurealHander {

    public static void registerStructureal() {
//结构注册

//        MapGenStructureIO.registerStructure(MapGenEndCityMy.Start.class, "ECPxx");
//        StructureEndCityPieces.registerPieces();

        MapGenStructureIO.registerStructure(JvXianGe.Start.class, "JvXianGe");
        JvXianGePieces.registerPieces();

        MapGenStructureIO.registerStructure(GuFengXueWu.Start.class, "GuFengXueWu");
        GuFengXueWuPieces.registerPieces();
    }

//    static JvXianGe guFengXueWu ;
    static GuFengXueWu guFengXueWu = new GuFengXueWu();;

    @SubscribeEvent
    public static void registerStructureal(PopulateChunkEvent.Pre event) {
        if(event.getWorld().provider.getDimension()==0||event.getWorld().provider.getDimension()==-1||event.getWorld().provider.getDimension()==1){
            guFengXueWu.generate(event.getWorld(),event.getChunkX(),event.getChunkZ(),null);
        }


    }


    @SubscribeEvent
    public static void registerStructureal(PopulateChunkEvent.Post event) {

        if(event.getWorld().provider.getDimension()==0||event.getWorld().provider.getDimension()==-1||event.getWorld().provider.getDimension()==1){
            guFengXueWu.generateStructure(event.getWorld(),event.getRand(),new ChunkPos(event.getChunkX(),event.getChunkZ()));
        }


    }


}
