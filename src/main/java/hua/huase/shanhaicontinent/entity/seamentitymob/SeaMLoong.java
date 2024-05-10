package hua.huase.shanhaicontinent.entity.seamentitymob;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapabilityProvider;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.entity.EntityRegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

import java.util.Random;
import java.util.UUID;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.NIANLING;
import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.random;
import static net.minecraft.init.Biomes.SKY;

public class SeaMLoong extends EntityMob implements IEntityMultiPart,SeaMEntityMobBase, IMob {



    public static final String ID = "SeaM_Loong";
//    生成的群系，PLAINS平原  SAVANNA 热带草原    SAVANNA_PLATEAU 热带高原  MUTATED_PLAINS向日葵平原
public static final Biome[] BIOMES = new Biome[] {SKY};
    public boolean getCanSpawnHere()
    {
        return (this.rand.nextInt(20) == 0) ;
    }

    public MultiPartEntityPart[] LoongPartArray;
    public static final EntityEntry Loong =
            EntityEntryBuilder.create()
                    .entity(SeaMLoong.class)
                    .id(SeaMLoong.ID, EntityRegistryHandler.entityID++)
                    .name(ExampleMod.MODID + "." + SeaMLoong.ID)
                    .tracker(80, 3, true)
                    .spawn(EnumCreatureType.MONSTER, 100, 4, 4, SeaMLoong.BIOMES)
                    .egg(0xe52222, 0xd7ef39).build();

    public SeaMLoong(World worldIn)
    {
        super(worldIn);
        this.experienceValue = 30;
        this.LoongPartArray = new MultiPartEntityPart[32];
        for (int i = 0; i < this.LoongPartArray.length; i++) {
            this.LoongPartArray[i] = new MultiPartEntityPart(this, "head"+i, 0.5F, 2.0F);
        }


//        this.setSize(3.0f, 1.6f);
        this.setSize(5f, 1.2f);

        this.moveHelper = new SeaMLoong.AIMoveControl(this);
        if(worldIn.isRemote){
            if(this.hasCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY, null)){
                int nianxian = this.getCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY, null).getNianxian();
                this.setSize((float) (this.width*(1f+Math.log10(nianxian*0.5f))), (float) (this.height*(1f+Math.log10(nianxian*0.5f))));
            }
        }
    }
    //经验掉落
    protected int getExperiencePoints(EntityPlayer player)
    {
        int nianxian = this.getCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY, null).getNianxian();
        this.experienceValue = (int)((float)this.experienceValue * Math.log10(nianxian));
        return super.getExperiencePoints(player);
    }

    public Entity[] getParts()
    {
        return this.LoongPartArray;
    }
    public void onUpdate()
    {
        this.noClip = true;
        super.onUpdate();
        this.noClip = false;
        this.setNoGravity(true);
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public boolean attackEntityFromPart(MultiPartEntityPart dragonPart, DamageSource source, float damage) {
        return super.attackEntityFrom(source, damage);
    }


    class AIMoveControl extends EntityMoveHelper
    {
        public AIMoveControl(SeaMLoong vex)
        {
            super(vex);
        }

        public void onUpdateMoveHelper()
        {
            if (this.action == EntityMoveHelper.Action.MOVE_TO)
            {
                double d0 = this.posX - SeaMLoong.this.posX;
                double d1 = this.posY - SeaMLoong.this.posY;
                double d2 = this.posZ - SeaMLoong.this.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                d3 = (double)MathHelper.sqrt(d3);

                if (d3 < SeaMLoong.this.getEntityBoundingBox().getAverageEdgeLength())
                {
                    this.action = EntityMoveHelper.Action.WAIT;
                    SeaMLoong.this.motionX *= 0.5D;
                    SeaMLoong.this.motionY *= 0.5D;
                    SeaMLoong.this.motionZ *= 0.5D;
                }
                else
                {
                    SeaMLoong.this.motionX += d0 / d3 * 0.05D * this.speed;
                    SeaMLoong.this.motionY += d1 / d3 * 0.05D * this.speed;
                    SeaMLoong.this.motionZ += d2 / d3 * 0.05D * this.speed;

                    if (SeaMLoong.this.getAttackTarget() == null)
                    {
                        SeaMLoong.this.rotationYaw = -((float)MathHelper.atan2(SeaMLoong.this.motionX, SeaMLoong.this.motionZ)) * (180F / (float)Math.PI);
                        SeaMLoong.this.renderYawOffset = SeaMLoong.this.rotationYaw;
                    }
                    else
                    {
                        double d4 = SeaMLoong.this.getAttackTarget().posX - SeaMLoong.this.posX;
                        double d5 = SeaMLoong.this.getAttackTarget().posZ - SeaMLoong.this.posZ;
                        SeaMLoong.this.rotationYaw = -((float)MathHelper.atan2(d4, d5)) * (180F / (float)Math.PI);
                        SeaMLoong.this.renderYawOffset = SeaMLoong.this.rotationYaw;
                    }
                }
            }
        }
    }

    //该对象初始化时被调用
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.getDataManager().register(COLOR, (byte) 0);
        this.getDataManager().register(LIVINGENTITYCAPABILITY,new PlayerCapability().serializeNBT());

        IAttributeInstance entityAttribute = this.getEntityAttribute(NIANLING);
    }
    //    掉落物战利品表
    private static final ResourceLocation LOOT_TABLE = LootTableList.register(
            new ResourceLocation(ExampleMod.MODID + ":entities/loong"));

    @Override
    protected ResourceLocation getLootTable()
    {
        return LOOT_TABLE;
//        return GUFENGXIAOWU_CHESTS;
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
//        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0, false));//攻击
        this.tasks.addTask(4, new SeaMLoong.AIChargeAttack());
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.tasks.addTask(8, new SeaMLoong.AIMoveRandom(this));
//        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
//        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
//        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {SeaMLoong.class}));
//        this.targetTasks.addTask(2, new SeaMLoong.AICopyOwnerTarget(this));
//        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }


    class AIChargeAttack extends EntityAIBase
    {
        public AIChargeAttack()
        {
            this.setMutexBits(1);
        }

        public boolean shouldExecute()
        {
            if (SeaMLoong.this.getAttackTarget() != null && !SeaMLoong.this.getMoveHelper().isUpdating() )
            {
                return SeaMLoong.this.getDistanceSq(SeaMLoong.this.getAttackTarget()) > 0.0D;
            }
            else
            {
                return false;
            }
        }

        public boolean shouldContinueExecuting()
        {
            return SeaMLoong.this.getMoveHelper().isUpdating()  && SeaMLoong.this.getAttackTarget() != null && SeaMLoong.this.getAttackTarget().isEntityAlive();
        }

        public void startExecuting()
        {
            EntityLivingBase entitylivingbase = SeaMLoong.this.getAttackTarget();
//            Vec3d vec3d = entitylivingbase.getPositionEyes(1.0F);
            Vec3d vec3d = new Vec3d(entitylivingbase.posX,entitylivingbase.posY,entitylivingbase.posZ);
            SeaMLoong.this.moveHelper.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1.3D);
            if(SeaMLoong.this.rand.nextInt(3) == 0){

                SeaMLoong.this.playSound(SoundEvents.ENTITY_ENDERDRAGON_GROWL, 0.3F, 0.3F);
            }
        }

        public void resetTask()
        {


        }

        public void updateTask()
        {
            EntityLivingBase entitylivingbase = SeaMLoong.this.getAttackTarget();
            AxisAlignedBB entityBoundingBox = entitylivingbase.getEntityBoundingBox();
            if (SeaMLoong.this.getEntityBoundingBox().intersects(entityBoundingBox.grow(1)))
            {
                SeaMLoong.this.attackEntityAsMob(entitylivingbase);
            }
            else
            {
                double d0 = SeaMLoong.this.getDistance(entitylivingbase);

                if (d0 < 1.0D && d0 > -1.0D)
//                if (true)
                {
//                    Vec3d vec3d = entitylivingbase.getPositionEyes(1.0F);
                    Vec3d vec3d = new Vec3d(entitylivingbase.posX,entitylivingbase.posY,entitylivingbase.posZ);
                    int i = random.nextInt(3);
                    SeaMLoong.this.moveHelper.setMoveTo(vec3d.x, vec3d.y, vec3d.z + i, 1.3D);
                }
            }
        }
    }


    class AICopyOwnerTarget extends EntityAITarget
    {
        public AICopyOwnerTarget(EntityCreature creature)
        {
            super(creature, false);
        }

        public boolean shouldExecute()
        {
            return SeaMLoong.this != null && SeaMLoong.this.getAttackTarget() != null && this.isSuitableTarget(SeaMLoong.this.getAttackTarget(), false);

        }

        public void startExecuting()
        {
            SeaMLoong.this.setAttackTarget(SeaMLoong.this.getAttackTarget());
            super.startExecuting();
        }
    }

    class AIMoveRandom extends EntityAIBase
    {
        private final SeaMLoong parentEntity;

        public AIMoveRandom(SeaMLoong ghast)
        {
            this.parentEntity = ghast;
            this.setMutexBits(1);
        }

        public boolean shouldExecute()
        {
            EntityMoveHelper entitymovehelper = this.parentEntity.getMoveHelper();

            if (!entitymovehelper.isUpdating())
            {
                return true;
            }
            else
            {
                double d0 = entitymovehelper.getX() - this.parentEntity.posX;
                double d1 = entitymovehelper.getY() - this.parentEntity.posY;
                double d2 = entitymovehelper.getZ() - this.parentEntity.posZ;
                double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                return d3 < 1.0D || d3 > 3600.0D;
            }
        }

        public boolean shouldContinueExecuting()
        {
            return false;
        }

        public void startExecuting()
        {
            Random random = this.parentEntity.getRNG();
            double d0 = this.parentEntity.posX + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d1 = this.parentEntity.posY + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            double d2 = this.parentEntity.posZ + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
            this.parentEntity.getMoveHelper().setMoveTo(d0, d1, d2, 0.3D);
        }
    }



    //用于servce与client相互同步参数
    private static final DataParameter<Byte> COLOR =
            EntityDataManager.createKey(SeaMLoong.class, DataSerializers.BYTE);
    private static final DataParameter<NBTTagCompound> LIVINGENTITYCAPABILITY =
            EntityDataManager.createKey(SeaMLoong.class, DataSerializers.COMPOUND_TAG);


    public byte getColor()
    {
        return this.getDataManager().get(COLOR);
    }
    public NBTTagCompound getLivingEntityCapability()
    {
        return this.getDataManager().get(LIVINGENTITYCAPABILITY);
    }

//    序列化
    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setByte("Color", this.getDataManager().get(COLOR));
        compound.setTag("LivingEntityCapability", this.getDataManager().get(LIVINGENTITYCAPABILITY));
    }

    //    反序列化
    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.getDataManager().set(COLOR, compound.getByte("Color"));
        this.getDataManager().set(LIVINGENTITYCAPABILITY, compound.getCompoundTag("LivingEntityCapability"));
    }


    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
//        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200);//血量
//        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0);//攻击力
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);//速度
//        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(30.1);
    }


    private static final UUID MAX_HEALTHID = UUID.fromString("1707f7535-349a-4613-b33f-4a5eaf4d0ed7");
    private static final UUID ATTACK_DAMAGEID = UUID.fromString("2707f7535-349a-4613-b33f-4a5eaf4d0ed7");
    private static final UUID MOVEMENT_SPEEDID = UUID.fromString("3707f7535-349a-4613-b33f-4a5eaf4d0ed7");
//    private static final UUID ATTACK_SPEEDID = UUID.fromString("4707f7535-349a-4613-b33f-4a5eaf4d0ed7");
//    生成时被调用
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData data)
    {
//        IAttributeInstance attributehealth = this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
//        attributehealth.applyModifier(new AttributeModifier(MAX_HEALTHID,"shanhaicontinent.health",this.rand.nextInt(200), 0));
//        IAttributeInstance attributehealth = this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
//        attributehealth.applyModifier(new AttributeModifier(MAX_HEALTHID,"shanhaicontinent.health",3200, 0));
//        this.setHealth(3000);
//
//        IAttributeInstance attributeattack = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
//        attributeattack.applyModifier(new AttributeModifier(ATTACK_DAMAGEID,"shanhaicontinent.attack",this.rand.nextInt(20), 0));
//
//        IAttributeInstance attributeattackspeed = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
//        attributeattackspeed.applyModifier(new AttributeModifier(ATTACK_SPEEDID,"shanhaicontinent.attackspeed",-10, 0));

        this.getDataManager().set(COLOR, (byte) this.rand.nextInt(3));

        if(this.hasCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY, null)){
            int nianxian = this.getCapability(CapabilityRegistryHandler.MONSTER_CAPABILITY, null).getNianxian();
            this.setSize((float) (this.width*(1f+Math.log10(nianxian*0.5f))), (float) (this.height*(1f+Math.log10(nianxian*0.5f))));
        }

        return super.onInitialSpawn(difficulty, data);
    }

//    获取到攻击目标时被调用
    @Override
    public void setAttackTarget(EntityLivingBase entity)
    {
        super.setAttackTarget(entity);
        IAttributeInstance attributemovespeed = this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);//生物的移动速度
        if (entity == null)
        {
            attributemovespeed.removeModifier(MOVEMENT_SPEEDID);
        }
        else if (attributemovespeed.getModifier(MOVEMENT_SPEEDID) == null)
        {
            attributemovespeed.applyModifier(new AttributeModifier(MOVEMENT_SPEEDID, "shanhaicontinent.movespeed", 0.1, 2).setSaved(false));
        }
    }


    public void onLivingUpdate()
    {
        if (this.world.isRemote)
        {
            for (int i = 0; i < 2; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.2D, 0.0D, 0.0D);
            }
            this.world.spawnParticle(EnumParticleTypes.REDSTONE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + (double)this.height*0.8D - this.rand.nextDouble() * 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D);
        }

        this.renderYawOffset = this.rotationYaw;
        for (int i = 0; i < this.LoongPartArray.length; i++) {

            float f17 = this.rotationYaw * 0.017453292F;
            float f3 = MathHelper.sin(f17);
            float f18 = MathHelper.cos(f17);
            LoongPartArray[i].onUpdate();
//            LoongPartArray[i].setLocationAndAngles(this.posX+i + (double)(f3 * 0.5F), this.posY, this.posZ - (double)(f18 * 0.5F), 0.0F, 0.0F);
            LoongPartArray[i].setLocationAndAngles(this.posX + (double)(0.5 * f3 * (-i*1.0 + 16)), this.posY + 1.0D, this.posZ + (double)(0.5 * f18 * (i*1.0 - 16)), 0.0F, 0.0F);
        }

//
//
//        Vec3d[] avec3d = new Vec3d[this.LoongPartArray.length];
//
//        for (int j = 0; j < this.LoongPartArray.length; ++j)
//        {
//            avec3d[j] = new Vec3d(this.LoongPartArray[j].posX, this.LoongPartArray[j].posY, this.LoongPartArray[j].posZ);
//        }
//
////        float f14 = (float)(this.getMovementOffsets(5, 1.0F)[1] - this.getMovementOffsets(10, 1.0F)[1]) * 10.0F * 0.017453292F;
////        float f16 = MathHelper.cos(f14);
////        float f2 = MathHelper.sin(f14);
//        float f17 = this.rotationYaw * 0.017453292F;
//        float f3 = MathHelper.sin(f17);
//        float f18 = MathHelper.cos(f17);
//        this.dragonPartBody.onUpdate();
//        this.dragonPartBody.setLocationAndAngles(this.posX + (double)(f3 * 0.5F), this.posY, this.posZ - (double)(f18 * 0.5F), 0.0F, 0.0F);
//        this.dragonPartWing1.onUpdate();
//        this.dragonPartWing1.setLocationAndAngles(this.posX + (double)(f18 * 4.5F), this.posY + 2.0D, this.posZ + (double)(f3 * 4.5F), 0.0F, 0.0F);
//        this.dragonPartWing2.onUpdate();
//        this.dragonPartWing2.setLocationAndAngles(this.posX - (double)(f18 * 4.5F), this.posY + 2.0D, this.posZ - (double)(f3 * 4.5F), 0.0F, 0.0F);
//
////        if (!this.world.isRemote && this.hurtTime == 0)
////        {
////            this.collideWithEntities(this.world.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartWing1.getEntityBoundingBox().grow(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
////            this.collideWithEntities(this.world.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartWing2.getEntityBoundingBox().grow(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
////            this.attackEntitiesInList(this.world.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartHead.getEntityBoundingBox().grow(1.0D)));
////            this.attackEntitiesInList(this.world.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartNeck.getEntityBoundingBox().grow(1.0D)));
////        }
//
////        double[] adouble = this.getMovementOffsets(5, 1.0F);
//        float f19 = MathHelper.sin(this.rotationYaw * 0.017453292F - this.randomYawVelocity * 0.01F);
//        float f4 = MathHelper.cos(this.rotationYaw * 0.017453292F - this.randomYawVelocity * 0.01F);
//        this.dragonPartHead.onUpdate();
//        this.dragonPartNeck.onUpdate();
////        float f20 = this.getHeadYOffset(1.0F);
//        this.dragonPartHead.setLocationAndAngles(this.posX + (double)(f19 * 6.5F * 1), this.posY + (double)1 + (double)(1 * 6.5F), this.posZ - (double)(f4 * 6.5F * 1), 0.0F, 0.0F);
//        this.dragonPartNeck.setLocationAndAngles(this.posX + (double)(f19 * 5.5F * 1), this.posY + (double)1 + (double)(1 * 5.5F), this.posZ - (double)(f4 * 5.5F * 1), 0.0F, 0.0F);
//
//        for (int k = 0; k < 3; ++k)
//        {
//            MultiPartEntityPart multipartentitypart = null;
//
//            if (k == 0)
//            {
//                multipartentitypart = this.dragonPartTail1;
//            }
//
//            if (k == 1)
//            {
//                multipartentitypart = this.dragonPartTail2;
//            }
//
//            if (k == 2)
//            {
//                multipartentitypart = this.dragonPartTail3;
//            }
//
////            double[] adouble1 = this.getMovementOffsets(12 + k * 2, 1.0F);
////            float f21 = this.rotationYaw * 0.017453292F + this.simplifyAngle(adouble1[0] - adouble[0]) * 0.017453292F;
////            float f6 = MathHelper.sin(f21);
////            float f22 = MathHelper.cos(f21);
//            float f23 = 1.5F;
//            float f24 = (float)(k + 1) * 2.0F;
//            multipartentitypart.onUpdate();
//            multipartentitypart.setLocationAndAngles(this.posX - (double)((f3 * 1.5F + 1 * f24) * 1), this.posY + (1) - (double)((f24 + 1.5F) * 1) + 1.5D, this.posZ + (double)((f18 * 1.5F + 1 * f24) * 1), 0.0F, 0.0F);
//        }

//        this.isJumping = false;
        super.onLivingUpdate();
    }

    @Override
    public MonsterCapabilityProvider addCapability(Entity entity, Random random) {

        MonsterCapabilityProvider monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);

        return monsterCapabilityProvider;
    }

}
