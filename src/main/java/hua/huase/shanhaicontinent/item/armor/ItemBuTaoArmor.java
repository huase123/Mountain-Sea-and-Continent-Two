package hua.huase.shanhaicontinent.item.armor;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBuTaoArmor extends ItemArmor implements ArmorApi
{


    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (this.isInCreativeTab(tab)) {
            list.add(new ItemStack(this, 1, 0));
            list.add(new ItemStack(this, 1, 1));
            list.add(new ItemStack(this, 1, 2));
            list.add(new ItemStack(this, 1, 3));
            list.add(new ItemStack(this, 1, 4));
            list.add(new ItemStack(this, 1, 5));
            list.add(new ItemStack(this, 1, 6));
            list.add(new ItemStack(this, 1, 7));
            list.add(new ItemStack(this, 1, 8));
            list.add(new ItemStack(this, 1, 9));
            list.add(new ItemStack(this, 1, 10));
            list.add(new ItemStack(this, 1, 11));
            list.add(new ItemStack(this, 1, 12));
            list.add(new ItemStack(this, 1, 13));
            list.add(new ItemStack(this, 1, 14));
            list.add(new ItemStack(this, 1, 15));
        }
    }


    public ItemBuTaoArmor(String name, CreativeTabs Tabs,EntityEquipmentSlot equipmentSlot)
    {
        super(EnumHelper.addArmorMaterial(
                "butao",
                ExampleMod.MODID+":butao",
                -1,
                new int[]{5,7,8,4},
                26,
                SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
                6),0,equipmentSlot);


        this.setUnlocalizedName(ExampleMod.MODID + ".butao." + name);



        this.setRegistryName("butao_" + name);
        this.setCreativeTab(Tabs);
        this.setHasSubtypes(true);


    }
    public boolean isEnchantable(ItemStack stack)
    {
        return true;
    }


    public int getMetadata(int damage)
    {
        return damage;
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "_grade" + stack.getMetadata();
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);

        int v = (int) Math.pow(2,itemstack.getMetadata());
        int damageReduceAmount1 = ((ItemArmor) itemstack.getItem()).damageReduceAmount;

        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.armor.huang.butao.list0"));
        list.add(I18n.translateToLocalFormatted("hungu:wugong", v * damageReduceAmount1 * 0.25f * 1.0f));
        list.add(I18n.translateToLocalFormatted("hungu:wufang", v * damageReduceAmount1 * 0.25f * 1.2f));
        list.add(I18n.translateToLocalFormatted("hungu:maxshengming", v * damageReduceAmount1 * 0.25f * 10.0f));
    }


    @Override
    public void addAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
        if(entityLivingBase instanceof EntityPlayer) {

            PlayerCapability capability = entityLivingBase.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
//            entityLivingBase.getAttributeMap().applyAttributeModifiers(this.Multimap(capability,itemStack.getItem().getUnlocalizedName()));
            if (equipmentSlot == this.armorType) {
                int v = (int) Math.pow(2,itemStack.getMetadata());
                int damageReduceAmount1 = ((ItemArmor) itemStack.getItem()).damageReduceAmount;
                if (itemStack.getTagCompound() == null) {
                    NBTTagCompound compound = new NBTTagCompound();
                    compound.setInteger("wugong", v);
                    itemStack.setTagCompound(compound);
                }
                itemStack.getTagCompound().setInteger("wugong", v);
                capability.addWugong( v * damageReduceAmount1 * 0.25f * 1.0f);
                capability.addWufang( v * damageReduceAmount1 * 0.25f * 1.2f);
                capability.addMaxshengming(v * damageReduceAmount1 * 0.25f * 10.0f);
            }


            NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBase);
        }
    }

    @Override
    public void removeAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
        if(entityLivingBase instanceof EntityPlayer){
            PlayerCapability capability = entityLivingBase.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
//            entityLivingBase.getAttributeMap().removeAttributeModifiers(this.Multimap(capability,itemStack.getItem().getUnlocalizedName()));

            if(equipmentSlot==this.armorType) {
                if (itemStack.getTagCompound() == null) return;
                int v = itemStack.getTagCompound().getInteger("wugong");
                int damageReduceAmount1 = ((ItemArmor) itemStack.getItem()).damageReduceAmount;
                capability.addWugong( -v * damageReduceAmount1 * 0.25f * 1.0f);
                capability.addWufang( -v * damageReduceAmount1 * 0.25f * 1.2f);
                capability.addMaxshengming(-v * damageReduceAmount1 * 0.25f * 10.0f);
            }


            NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBase);
        }
    }




//设置盔甲模型
    @SideOnly(Side.CLIENT)
    @Nullable
    public net.minecraft.client.model.ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, net.minecraft.client.model.ModelBiped _default)
    {
//        return new ModelFireDragonArmor(0.5F, false);
//        return new ModelDragonsteelFireArmor(1.2F);
        return null;
    }


//    设置材质
    @Nullable
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {


        return null;
//
//        String s1 = String.format("shanhaicontinent:textures/models/armor/butao_layer_%d.png",stack.getMetadata());
//        String s1 = String.format("shanhaicontinent:textures/models/armor/luoluoniao.png");
//        return s1;
    }

}
