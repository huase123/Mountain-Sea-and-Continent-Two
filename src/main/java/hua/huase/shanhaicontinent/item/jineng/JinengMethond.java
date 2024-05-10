package hua.huase.shanhaicontinent.item.jineng;

import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.item.jineng.huang.WuHunHuangyishenweizhong;
import hua.huase.shanhaicontinent.item.jineng.jingubang.Wuqijingubang;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JinengMethond {

    static Map<String,List<Item>> monsterCapabilityLists = new HashMap<>();

    static boolean isBinding(ItemStack stack, Entity entityPlayer) {
        if(stack.getTagCompound()!=null && entityPlayer instanceof EntityPlayer && stack.getTagCompound().getString("playername").equals(entityPlayer.getName())){

            PlayerCapability capability = entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            Map<String, List<MonsterCapability>> monsterCapabilityLists1 = capability.getMonsterCapabilityLists();


            for (Map.Entry<String, List<MonsterCapability>> stringListEntry : monsterCapabilityLists1.entrySet()) {
                int i=0;

//                nbt.setTag(stringListEntry.getKey()+":monsterCapability",new NBTTagCompound());
                for (MonsterCapability monsterCapability : stringListEntry.getValue()) {
                    Item item = monsterCapabilityLists.get(stringListEntry.getKey()).get(i);
                    if(stack.getItem().equals(item)){
                        return true;
                    }
                    i++;
                }

            }
//            return true;
        }

        stack.setCount(0);
        return false;
    }



    static ItemStack isJinengMethond(ItemStack heldItem, Item item) {

        if(heldItem.getItem() instanceof WuHunHuangyishenweizhong || heldItem.getItem() instanceof Wuqijingubang){
            if(heldItem.getTagCompound()!=null){
                byte b= 0;
                NBTTagCompound wuhunjineng = heldItem.getTagCompound().getCompoundTag("wuhunjineng"+b);
                while (!wuhunjineng.equals(new NBTTagCompound())){
                    ItemStack jineng = new ItemStack(wuhunjineng);
                    if((!jineng.isEmpty()) && jineng.getItem().equals(item)){
                        heldItem=jineng;
                        break;
                    }
                    ++b;
                    wuhunjineng = heldItem.getTagCompound().getCompoundTag("wuhunjineng"+b);
                }
            }else {
                return heldItem;
            }
        }

        return heldItem;
    }


    static void addJinengItem(Item item,String s){
        if(monsterCapabilityLists.get(s)==null)monsterCapabilityLists.put(s,new ArrayList<>());
        monsterCapabilityLists.get(s).add(item);
    }


    @SideOnly(Side.CLIENT)
    static String getItemStackName(ItemStack itemStack)
    {
        String s = itemStack.getDisplayName();

        if (itemStack.hasDisplayName())
        {
            s = TextFormatting.ITALIC + s;
        }

        s = s + TextFormatting.RESET;

        if (false)
        {
            String s1 = "";

            if (!s.isEmpty())
            {
                s = s + " (";
                s1 = ")";
            }

            int i = Item.getIdFromItem(itemStack.getItem());

            if (itemStack.getHasSubtypes())
            {
                s = s + String.format("#%04d/%d%s", i, itemStack.getItemDamage(), s1);
            }
            else
            {
                s = s + String.format("#%04d%s", i, s1);
            }
        }
        else if (!itemStack.hasDisplayName() && itemStack.getItem() == Items.FILLED_MAP)
        {
            s = s + " #" + itemStack.getItemDamage();
        }
        return s;
    }

    void removeAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot);
    void addAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot);
}
