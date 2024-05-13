package hua.huase.shanhaicontinent.entity.jineng.haotianchui;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import java.util.List;

public class EntityJinengHtcLTLC extends Entity {
    public static final String ID = "EntityJinengHtcLTLC";
    public static final String NAME = ExampleMod.MODID + ".EntityJinengHtcLTLC";

    private EntityPlayer entityPlayer;

    private int ticksLiving;

    public EntityJinengHtcLTLC(World worldIn) {
        super(worldIn);
        this.setSize(4.5F, 1.4F);
    }

    public EntityJinengHtcLTLC(World worldIn, EntityPlayer entityPlayer) {
        super(worldIn);
        this.entityPlayer = entityPlayer;
        this.setSize(4.5F, 1.4F);
    }


    @Override
    protected void entityInit() {


    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
    }

    //    反序列化
    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
    }


    public void onUpdate()
    {
        super.onUpdate();
        this.ticksLiving++;
        if(ticksLiving>=60){
            this.setDead();
        }


        if(this.ticksExisted>=20){
            List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().grow(1.0D));
            for (Entity entity : list) {
                if (!this.world.isRemote&&entity!=null&&entity instanceof EntityLivingBase && entityPlayer!=null && entity !=entityPlayer)
                {
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getWugong()*20f);

                }
            }
            if(this.ticksExisted%5==0 && !this.world.isRemote){

                this.world.playSound((EntityPlayer)null, this.posX, this.posY, this.posZ, SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.PLAYERS, 2.0F, 0.5F);
            }
        }


    }


}
