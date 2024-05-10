package hua.huase.shanhaicontinent.event;

import hua.huase.shanhaicontinent.item.armor.ArmorApi;
import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import hua.huase.shanhaicontinent.item.jineng.huang.WuHunHuangyishenweizhong;
import hua.huase.shanhaicontinent.item.jineng.jingubang.Wuqijingubang;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemAnvilUpdateEvent {

//    public static Map<Integer,Integer> stageHashMap=new HashMap<>();
//    @SideOnly(Side.CLIENT)
////    @SubscribeEvent
//    public static void playerTick(TickEvent.PlayerTickEvent event) {
//
//    }




    @SubscribeEvent
    public static void itemCrafted(AnvilUpdateEvent event) {
        ItemStack left = event.getLeft();
        ItemStack right = event.getRight();
        if(left.getItem() instanceof ArmorApi && right.getItem() instanceof ArmorApi && ((ItemArmor)(left.getItem())).armorType == ((ItemArmor)(right.getItem())).armorType && left.getMetadata() == right.getMetadata() ){
            if(left.getMetadata()<=14){

                ItemStack copy = left.copy();
                copy.setItemDamage(left.getMetadata()+1);
                event.setOutput(copy);
                event.setCost(left.getMetadata()+1);
                event.setMaterialCost(1);
            }

        }

        if(left.getItem() instanceof JinengMethond && right.getItem() instanceof JinengMethond &&
                (left.getItem() instanceof WuHunHuangyishenweizhong || left.getItem() instanceof Wuqijingubang) &&
                (!(right.getItem() instanceof WuHunHuangyishenweizhong) && !(right.getItem() instanceof Wuqijingubang))){
            if(left.getTagCompound().getString("playername").equals(right.getTagCompound().getString("playername"))){
                ItemStack copy = left.copy();
                NBTTagCompound tagCompound = copy.getTagCompound();
                if(tagCompound!=null){
                    NBTTagCompound compound = right.serializeNBT();
                    byte b= 0;
                    NBTTagCompound wuhunjineng = tagCompound.getCompoundTag("wuhunjineng"+b);
                    while (!wuhunjineng.equals(new NBTTagCompound()) && !wuhunjineng.equals(compound)){
                        ++b;
                        wuhunjineng = tagCompound.getCompoundTag("wuhunjineng"+b);
                    }
                    tagCompound.setTag("wuhunjineng"+b,compound);
                }
                event.setOutput(copy);
                event.setCost(10);
                event.setMaterialCost(1);
            }

        }


    }

}
