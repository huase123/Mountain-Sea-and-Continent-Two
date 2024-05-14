package hua.huase.shanhaicontinent.item.jineng.haotianchui;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.handers.HanderAny;
import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class WuqijnHtcSMZC extends Item implements JinengMethond
{
    public WuqijnHtcSMZC(String name, CreativeTabs Tabs)
    {
        super();

        this.setUnlocalizedName(ExampleMod.MODID + name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabs);
        setMaxStackSize(1);
        HanderAny.itemList.add(this);
        JinengMethond.addJinengItem(this,"haotianchui");
    }


    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        if(JinengMethond.isBinding(stack,attacker)){
            stack.damageItem(0, attacker);
            attacker.hurtResistantTime=4;
            return true;
        }
        return false;
    }


    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {
        return JinengMethond.isBinding(stack,entityLiving);
    }


    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return true;
    }


    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player)
    {
        if(!JinengMethond.isBinding(item,player)){
            return false;
        }
            return true;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!JinengMethond.isBinding(playerIn.getHeldItem(handIn),playerIn)) {

            return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
        }
        playerIn.getCooldownTracker().setCooldown(this, 10);
//        if(!worldIn.isRemote){
        if(true){
            ItemStack itemstack = playerIn.getHeldItem(handIn);
            if(itemstack.getTagCompound()!=null){
                byte b= 0;
                NBTTagCompound wuhunjineng = itemstack.getTagCompound().getCompoundTag("wuhunjineng"+b);
                while (!wuhunjineng.equals(new NBTTagCompound())){
                    ItemStack jineng = new ItemStack(wuhunjineng);
                    if((!jineng.isEmpty()) && jineng.getItem() instanceof JinengMethond){
                        if (!playerIn.getCooldownTracker().hasCooldown(jineng.getItem()))
                        {
                            jineng.useItemRightClick(playerIn.world, playerIn, handIn);
                        }
                    }
                    ++b;
                    wuhunjineng = itemstack.getTagCompound().getCompoundTag("wuhunjineng"+b);
                }
            }
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

//添加数据
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt)
    {
        return null;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {

        if(itemstack.getTagCompound()!=null&&itemstack.getTagCompound().getString("playername")!=null){
            list.add(net.minecraft.util.text.translation.I18n.translateToLocal("itembanding.player.sccuess")
                    +""+
                    itemstack.getTagCompound().getString("playername")
            );
        }else {
            list.add(net.minecraft.util.text.translation.I18n.translateToLocal("itembanding.player.fail"));
        }
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.haotianchui.jineng.smzc.list0"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.haotianchui.jineng.smzc.list1"));
        list.add(I18n.translateToLocal("item.addhunji.list0"));
        if(itemstack.getTagCompound()!=null&&itemstack.getTagCompound().getInteger("nianxian")>0){
            int integer = itemstack.getTagCompound().getInteger("nianxian");
            list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.lingque.cd")
                    +""
                    + new BigDecimal(60-Math.log10(integer)*5).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue()
                    +"s"
            );
        }

    }


    @Override
    public void addAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
        if(JinengMethond.isBinding(itemStack,entityLivingBase)) {


            PlayerCapability capability = entityLivingBase.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            entityLivingBase.getAttributeMap().applyAttributeModifiers(this.Multimap(capability));
            if (equipmentSlot == EntityEquipmentSlot.OFFHAND) {
                float v0 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getWugong() * 0.05f;
                float v1 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getBaojilv() * 0.05f;
                float v2 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getBaojishanghai() * 0.05f;
//                float v1 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getWufang() * 0.04f;
//                float v2 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getZhenshang() * 0.04f;
//                float v4 = ((int) ((capability.getDengji()) / 10f) + 1) * capability.getKangbao() * 0.04f;
                if (itemStack.getTagCompound() == null) {
                    NBTTagCompound compound = new NBTTagCompound();
                    compound.setFloat("wugong", v0);
                    compound.setFloat("baojilv", v1);
                    compound.setFloat("baojishanghai", v2);
                    itemStack.setTagCompound(compound);
                }
                itemStack.getTagCompound().setFloat("wugong", v0);
                itemStack.getTagCompound().setFloat("baojilv", v1);
                itemStack.getTagCompound().setFloat("baojishanghai", v2);
                capability.addWugong(v0);
                capability.addBaojilv(v1);
                capability.addBaojishanghai(v2);
                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBase);
            }
        }
    }

    @Override
    public void removeAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
        if(entityLivingBase instanceof EntityPlayer){
            PlayerCapability capability = entityLivingBase.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            entityLivingBase.getAttributeMap().removeAttributeModifiers(this.Multimap(capability));

            if(equipmentSlot==EntityEquipmentSlot.OFFHAND) {
                if (itemStack.getTagCompound() == null) return;
                float v0 = itemStack.getTagCompound().getFloat("wugong");
                float v1 = itemStack.getTagCompound().getFloat("baojilv");
                float v2 = itemStack.getTagCompound().getFloat("baojishanghai");
                capability.addWugong(-v0);
                capability.addBaojilv(-v1);
                capability.addBaojishanghai(-v2);
                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBase);
            }
        }
    }

    public Multimap<String, AttributeModifier> Multimap(PlayerCapability capability){

        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();
        multimap.clear();


        multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Weapon modifier", 1.0D, 2));
        multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Weapon modifier", -2d+capability.getDengji()/20f, 0));
//        multimap.put(EntityPlayer.REACH_DISTANCE.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Weapon modifier", 2.0D, 0));
//        multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Weapon modifier", (double)capability.getWugong(), 0));
//        multimap.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Weapon modifier", capability.getMaxshengming(), 0));

        return multimap;
    }



}
