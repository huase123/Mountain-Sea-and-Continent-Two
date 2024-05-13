package hua.huase.shanhaicontinent.entity.jineng.haotianchui;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;

public class EntityJinengHtcLTYJ extends EntityThrowable {
    public static final String ID = "EntityJinengHtcLTYJ";
    public static final String NAME = ExampleMod.MODID + ".EntityJinengHtcLTYJ";

    private EntityPlayer entityPlayer;


    public EntityJinengHtcLTYJ(World worldIn) {
        super(worldIn);
        this.setSize(3.0F, 1.4F);
    }

    public EntityJinengHtcLTYJ(World worldIn, EntityPlayer entityPlayer) {
        super(worldIn,entityPlayer);
        this.setSize(3.0F, 1.4F);
    }



    public void shoot(Entity entityThrower, float rotationPitchIn, float rotationYawIn, float pitchOffset, float velocity, float inaccuracy)
    {

        this.entityPlayer = (EntityPlayer) entityThrower;
        float f = -MathHelper.sin(rotationYawIn * 0.017453292F);
        float f1 = -MathHelper.sin((rotationPitchIn + pitchOffset) * 0.017453292F);
        float f2 = MathHelper.cos(rotationYawIn * 0.017453292F);
        this.shoot(0, -0.1, 0, velocity, inaccuracy);
        this.posX = entityThrower.posX+f*10;
        this.posY = entityThrower.posY+8;
        this.posZ = entityThrower.posZ+f2*10;
        this.motionY += entityThrower.motionY;


        this.rotationYaw = rotationYawIn;
    }



    protected float getGravityVelocity()
    {
        return 0.00F;
    }


    public void onUpdate()
    {
        super.onUpdate();
        if(this.ticksExisted>=30){
            this.setDead();
        }



        List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).grow(8.0D,0,8));
        for (Entity entity : list) {
            if (!this.world.isRemote&&entity!=null&&entity instanceof EntityLivingBase && entityPlayer!=null && entity !=entityPlayer)
            {
                entity.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getWugong()*2f);
            }
        }


    }
    @Override
    protected void onImpact(RayTraceResult result) {
//        if (!this.world.isRemote&&result.entityHit!=null&&result.entityHit instanceof EntityLivingBase&&result.entityHit !=entityPlayer)
//        {
//
////            result.entityHit.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),20);
//        }
    }

}
