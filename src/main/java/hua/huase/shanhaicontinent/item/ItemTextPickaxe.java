package hua.huase.shanhaicontinent.item;

import com.google.common.collect.Multimap;
import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.handers.HanderAny;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.UUID;

import static hua.huase.shanhaicontinent.handers.HanderAny.shportal;

public class ItemTextPickaxe extends ItemPickaxe
{
    public ItemTextPickaxe(String name, CreativeTabs Tabs)
    {
        super(EnumHelper.addToolMaterial(
                "weishenqi",
                4,
                0,
                1.0F,
                12F,
                26));
        this.setUnlocalizedName(ExampleMod.MODID + name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabs);
//        this.setHasSubtypes(true);
        this.attackSpeed=2.0f;

        HanderAny.itemList.add(this);
    }



    @SuppressWarnings("incomplete-switch")
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.DIAMOND_ORE)
                {
                    this.setBlock(itemstack, player, worldIn, pos, HanderAny.shportal.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }
            }

            return EnumActionResult.PASS;
        }
    }


    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
//            stack.damageItem(1, player);
        }
    }



    public boolean isEnchantable(ItemStack stack)
    {
        return true;
    }

   @Override
   public float getDestroySpeed(ItemStack stack, IBlockState state)
   {
       float speed = super.getDestroySpeed(stack, state);
       return  speed*60;
   }

    public boolean canHarvestBlock(IBlockState blockIn) {
        return true;
    }
/*

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(2, attacker);
        return true;
    }

*/


    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {

        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
        multimap.clear();

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {

//            multimap.put(SharedMonsterAttributes.LUCK.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Tool modifier", 9.0D, 0));
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Tool modifier", 0.8D, 2));
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Tool modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "Tool modifier", (double)this.attackSpeed, 0));



        }

        return multimap;
    }




    public boolean onEntityItemUpdate(net.minecraft.entity.item.EntityItem entityItem)
    {

        if(entityItem!=null){
            World entityWorld = entityItem.getEntityWorld();
            BlockPos position = entityItem.getPosition();
            boolean equals = entityWorld.getBlockState(position.down()).equals(Blocks.DIAMOND_ORE.getDefaultState());
            if(equals){
                entityWorld.setBlockState(position.down(),shportal.getDefaultState());
            }
        }

        return false;
    }




    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
//        list.remove(list.size()-1);
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("kaitianfu_list1"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("kaitianfu_list2"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("kaitianfu_list3"));
        list.add(net.minecraft.util.text.translation.I18n.translateToLocal("kaitianfu_list4"));
    }



}
