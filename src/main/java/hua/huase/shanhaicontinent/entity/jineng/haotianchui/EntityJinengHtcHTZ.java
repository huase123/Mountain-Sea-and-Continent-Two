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

public class EntityJinengHtcHTZ extends EntityThrowable {
    public static final String ID = "EntityJinengHtcHTZ";
    public static final String NAME = ExampleMod.MODID + ".EntityJinengHtcHTZ";

    private EntityPlayer entityPlayer;

    private int ticksLiving;

    public EntityJinengHtcHTZ(World worldIn) {
        super(worldIn);
        this.setSize(4.5F, 1.4F);
    }

    public EntityJinengHtcHTZ(World worldIn, EntityPlayer entityPlayer) {
        super(worldIn,entityPlayer);
        this.setSize(4.5F, 1.4F);
    }



    public void shoot(Entity entityThrower, float rotationPitchIn, float rotationYawIn, float pitchOffset, float velocity, float inaccuracy)
    {


        this.entityPlayer = (EntityPlayer) entityThrower;
        this.ticksLiving = 0;
        float f = -MathHelper.sin(rotationYawIn * 0.017453292F);
        float f1 = -MathHelper.sin((rotationPitchIn + pitchOffset) * 0.017453292F);
        float f2 = MathHelper.cos(rotationYawIn * 0.017453292F);
        this.shoot(0, -0.1, 0, velocity, inaccuracy);
        this.posX = entityThrower.posX+f*6;
        this.posY = entityThrower.posY+5;
        this.posZ = entityThrower.posZ+f2*6;
        this.motionY += entityThrower.motionY;
    }


    protected float getGravityVelocity()
    {
        return 0.00F;
    }


    public void onUpdate()
    {
        super.onUpdate();
        this.ticksLiving++;
        if(ticksLiving>=20){
            this.setDead();
        }



        List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().grow(1.0D));
        for (Entity entity : list) {
            if (!this.world.isRemote&&entity!=null&&entity instanceof EntityLivingBase && entityPlayer!=null && entity !=entityPlayer)
            {
                entity.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getWugong()*2f);
            }
        }


    }
    @Override
    protected void onImpact(RayTraceResult result) {
        if (!this.world.isRemote&&result.entityHit!=null&&result.entityHit instanceof EntityLivingBase&&result.entityHit !=entityPlayer)
        {

//            result.entityHit.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),20);
        }
    }

}
