package hua.huase.shanhaicontinent.entity.jineng.haotianchui;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.entity.jinengitem.EntityJinengItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class EntityJinengHtcHTJJ extends Entity {
    public static final String ID = "EntityJinengHtcHTJJ";
    public static final String NAME = ExampleMod.MODID + ".EntityJinengHtcHTJJ";

    private EntityPlayer entityPlayer;


    private static final DataParameter<Integer> PLAYER_ID =
            EntityDataManager.createKey(EntityJinengItem.class, DataSerializers.VARINT);
    public EntityJinengHtcHTJJ(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.0F);
    }

    @Override
    protected void entityInit() {

        this.getDataManager().register(PLAYER_ID, 0);
    }

    public EntityJinengHtcHTJJ(World worldIn, EntityPlayer entityPlayer) {
        super(worldIn);
        this.entityPlayer = entityPlayer;

        this.getDataManager().set(PLAYER_ID, entityPlayer.getEntityId());
        this.setPosition(entityPlayer.posX,entityPlayer.posY,entityPlayer.posZ);
        this.setSize(10.0F, 1.4F);
    }

    @SideOnly(Side.CLIENT)
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
//        this.setPosition(x, y, z);
//        this.setRotation(yaw, pitch);
    }



    public void onUpdate()
    {

        if(!this.world.isRemote){
            if(this.ticksExisted>=200){
                this.setDead();
                return;
            }
            if(entityPlayer==null){
                this.setDead();
                return;
            }
            if(this.ticksExisted%20==0){

//                this.setPosition(entityPlayer.posX,entityPlayer.posY,entityPlayer.posZ);

                this.posX = entityPlayer.posX;
                this.posY = entityPlayer.posY;
                this.posZ = entityPlayer.posZ;
                List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(entityPlayer, entityPlayer.getEntityBoundingBox().grow(8.0D,6.0D,8.0D));
                for (Entity entity : list) {
                    if (entity!=null&&entity instanceof EntityLivingBase && entity !=entityPlayer)
                    {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayer),entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getWugong()*0.6f);
                        this.world.playSound((EntityPlayer)null, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 2.0F, 2.0F);

                    }
                }
            }



            for (int i = 0; i < 10; i++) {
                double d0 = (double)(-MathHelper.sin(i * 0.017453292F));
                double d1 = (double)MathHelper.cos(i * 0.017453292F);

//                ((WorldServer)entityPlayer.world).spawnParticle(EnumParticleTypes.LAVA, entityPlayer.posX + this.rand.nextFloat()*20f-10f, entityPlayer.posY , entityPlayer.posZ + this.rand.nextFloat()*20f-10f, 0, d0, 0.0D, d1, 1.0D);

            }




        }else {

            Entity entityByID = this.world.getEntityByID(this.getDataManager().get(PLAYER_ID));
            if(entityByID==null){
                this.setDead();
                return;
            }
            this.setPosition(entityByID.posX,entityByID.posY,entityByID.posZ);

        }

        super.onUpdate();



    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("PlayerId", this.getDataManager().get(PLAYER_ID));
    }

    //    反序列化
    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        this.getDataManager().set(PLAYER_ID, compound.getInteger("PlayerId"));
    }


}