package hua.huase.shanhaicontinent.item.jineng.huang;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.entity.jineng.huang.EntityWuHunHuangSNSL;
import hua.huase.shanhaicontinent.handers.HanderAny;
import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.List;

public class WuHunHuangSNSL extends Item implements JinengMethond
{
    public WuHunHuangSNSL(String name, CreativeTabs Tabs)
    {
        super();
        this.setUnlocalizedName(ExampleMod.MODID + name);

        this.setRegistryName(name);
        this.setCreativeTab(Tabs);
        setMaxStackSize(1);
        HanderAny.itemList.add(this);
        JinengMethond.addJinengItem(this,"huang");
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
        ItemStack heldItem = playerIn.getHeldItem(handIn);
        heldItem = JinengMethond.isJinengMethond(heldItem,this);

        if(!JinengMethond.isBinding(heldItem,playerIn)) {
            return ActionResult.newResult(EnumActionResult.SUCCESS, heldItem);
        }

        if(heldItem.getTagCompound()!=null&&heldItem.getTagCompound().getInteger("nianxian")>0){
            playerIn.getCooldownTracker().setCooldown(this, (int) (80-Math.log10(heldItem.getTagCompound().getInteger("nianxian"))*10));
        }else {
            return ActionResult.newResult(EnumActionResult.SUCCESS, heldItem);
        }

//        playerIn.getCooldownTracker().setCooldown(this, 120);
//        playerIn.setActiveHand(handIn);

        playerIn.world.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.PLAYERS, 8.0F, 0.8F +  0.1F);
        if(!worldIn.isRemote){

            EntityWuHunHuangSNSL jiNengThread = new EntityWuHunHuangSNSL(worldIn,playerIn);
            jiNengThread.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw,0,2f,0.0f);
            worldIn.spawnEntity(jiNengThread);
            worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F);

        }

        return ActionResult.newResult(EnumActionResult.SUCCESS, heldItem);
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
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.wuhun.huang.snsl.list0"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.wuhun.huang.snsl.list1"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.wuhun.huang.snsl.list2"));
        if(itemstack.getTagCompound()!=null&&itemstack.getTagCompound().getInteger("nianxian")>0){
            int integer = itemstack.getTagCompound().getInteger("nianxian");
            list.add(net.minecraft.util.text.translation.I18n.translateToLocal("item.lingque.cd")
                    +""
                    + new BigDecimal(4-Math.log10(integer)/2).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue()
                    +"s"
            );
        }
    }


    public void addAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
        if(JinengMethond.isBinding(itemStack,entityLivingBase)) {
        }
    }

    public void removeAttributeModifiers(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityEquipmentSlot equipmentSlot) {
    }



}
