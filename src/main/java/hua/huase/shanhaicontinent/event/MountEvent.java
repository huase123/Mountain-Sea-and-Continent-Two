package hua.huase.shanhaicontinent.event;

import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class MountEvent {

//    public static Map<Integer,Integer> stageHashMap=new HashMap<>();
//    @SideOnly(Side.CLIENT)
////    @SubscribeEvent
//    public static void playerTick(TickEvent.PlayerTickEvent event) {
//
//    }




    @SubscribeEvent
    public static void itemCrafted(EntityMountEvent event) {
        Entity entityMounting = event.getEntityMounting();
        Entity entityBeingMounted = event.getEntityBeingMounted();
        if(entityBeingMounted != null && entityMounting != null && entityBeingMounted instanceof EntityBoat && entityMounting.hasCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY,null) && entityMounting.getCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY,null).getNianxian()>0){
            if(!entityBeingMounted.world.isRemote){
                if (entityBeingMounted.world.getGameRules().getBoolean("doEntityDrops")) {
                    entityBeingMounted.dropItemWithOffset(((EntityBoat)entityBeingMounted).getItemBoat(), 1, 0.0F);
                }
                entityBeingMounted.setDead();
            }
            event.setCanceled(true);
        }

    }

}
