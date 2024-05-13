package hua.huase.shanhaicontinent.entity.jineng.haotianchui;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import java.util.List;

public class EntityJinengHtcTDWJ extends EntityThrowable {
    public static final String ID = "EntityJinengHtcTDWJ";
    public static final String NAME = ExampleMod.MODID + ".EntityJinengHtcTDWJ";

    private EntityPlayer entityPlayer;


    public EntityJinengHtcTDWJ(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.0F);
    }

    public EntityJinengHtcTDWJ(World worldIn, EntityPlayer entityPlayer) {
        super(worldIn,entityPlayer);
        this.setSize(1.0F, 1.0F);
    }



    public void shoot(Entity entityThrower, float rotationPitchIn, float rotationYawIn, float pitchOffset, float velocity, float inaccuracy)
    {
        this.entityPlayer = (EntityPlayer) entityThrower;
        float f = -MathHelper.sin(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
        float f1 = -MathHelper.sin((rotationPitchIn + pitchOffset) * 0.017453292F);
        float f2 = MathHelper.cos(rotationYawIn * 0.017453292F) * MathHelper.cos(rotationPitchIn * 0.017453292F);
        this.shoot(f, f1, f2, velocity, inaccuracy);
        this.motionX += entityThrower.motionX;
        this.motionZ += entityThrower.motionZ;

        if (!entityThrower.onGround)
        {
            this.motionY += entityThrower.motionY;
        }
    }


    protected float getGravityVelocity()
    {
        return 0.00F;
    }


    public void onUpdate()
    {

        super.onUpdate();

        if(entityPlayer==null)
        {
            return;
        }
        if(this.ticksExisted>=40){
            this.setDead();
            return;
        }

        if (!this.world.isRemote){
            for (int i = 0; i < 10; i++) {
                double d0 = (double)(-MathHelper.sin(i * 0.017453292F));
                double d1 = (double)MathHelper.cos(i * 0.017453292F);

                ((WorldServer)entityPlayer.world).spawnParticle(EnumParticleTypes.CLOUD, this.posX + this.rand.nextFloat()*20f-10f, this.posY , this.posZ + this.rand.nextFloat()*20f-10f, 0, 0, 0.0D, 0, 1.0D);

            }

        }


        List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().grow(10.0D,2.0D,10.0D));
        for (Entity entity : list) {
            if(entity.isDead)return;
            if (!this.world.isRemote&&entity!=null&&entity instanceof EntityLivingBase && entityPlayer!=null && entity !=entityPlayer)
            {
                entity.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getWugong()*2f);
                ((WorldServer)entityPlayer.world).spawnParticle(EnumParticleTypes.SNOW_SHOVEL, entity.posX , entity.posY , entity.posZ , 5, 0, 0.0D, 1, 0.5D);
//                entity.world.playSound((EntityPlayer)null, entity.posX, entity.posY, entity.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, SoundCategory.PLAYERS, 1.0F, 1.0F);

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
