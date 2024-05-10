package hua.huase.shanhaicontinent.item.gui;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.handers.HanderAny;
import hua.huase.shanhaicontinent.network.FMLTutorGuiHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemWanFaJieShao extends Item {



    public ItemWanFaJieShao(String name, CreativeTabs Tabs){
        super();
        setRegistryName(name);
        setUnlocalizedName(ExampleMod.MODID  +"."+  name);
        setCreativeTab(Tabs);
        HanderAny.wanfajieshao= this;
        setMaxStackSize(64);
        HanderAny.itemList.add(this);
    }
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        if (worldIn.isRemote)
        {
            BlockPos pos = playerIn.getPosition();
            int x = pos.getX(), y = pos.getY(), z = pos.getZ();
            playerIn.openGui(ExampleMod.MODID, FMLTutorGuiHandler.WANFASHUOMING, worldIn, x, y, z);
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }



}
