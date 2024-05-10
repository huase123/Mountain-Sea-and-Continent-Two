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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

import java.util.Random;
import java.util.UUID;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.NIANLING;
import static net.minecraft.init.Biomes.HELL;

public class SeaMHuoQiLin extends EntityMob implements SeaMEntityMobBase {



    public static final String ID = "SeaM_HuoQiLin";
//    生成的群系，PLAINS平原  SAVANNA 热带草原    SAVANNA_PLATEAU 热带高原  MUTATED_PLAINS向日葵平原
    public static final Biome[] BIOMES = new Biome[] {HELL};

    public boolean getCanSpawnHere()
    {
        return (this.rand.nextInt(2000) == 0 || !this.world.canBlockSeeSky(new BlockPos(this))) ;
    }

    public static final EntityEntry HuoQiLin =
            EntityEntryBuilder.create()
                    .entity(SeaMHuoQiLin.class)
                    .id(SeaMHuoQiLin.ID, EntityRegistryHandler.entityID++)
                    .name(ExampleMod.MODID + "." + SeaMHuoQiLin.ID)
                    .tracker(80, 3, true)
                    .egg(0xe52222, 0xd7ef39)
                    .spawn(EnumCreatureType.MONSTER, 50, 4, 4, SeaMHuoQiLin.BIOMES)
                    .build();

    public SeaMHuoQiLin(World worldIn)
    {
        super(worldIn);
        this.experienceValue = 20;

        this.setSize(1.0f, 1.6f);
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
            new ResourceLocation(ExampleMod.MODID + ":entities/huoqilin"));

    @Override
    protected ResourceLocation getLootTable()
    {
        return LOOT_TABLE;
//        return GUFENGXIAOWU_CHESTS;
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));//游泳
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0, false));//攻击
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.8));//闲逛
//        this.tasks.addTask(3, new AIChangeGrassToDirt(this));//脚下方块替换为草方块
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));//看向玩家
        this.tasks.addTask(5, new EntityAILookIdle(this));//发呆

//        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));

        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));//被攻击时锁定目标

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }

//用于servce与client相互同步参数
    private static final DataParameter<Byte> COLOR =
            EntityDataManager.createKey(SeaMHuoQiLin.class, DataSerializers.BYTE);
    private static final DataParameter<NBTTagCompound> LIVINGENTITYCAPABILITY =
            EntityDataManager.createKey(SeaMHuoQiLin.class, DataSerializers.COMPOUND_TAG);


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
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0);//攻击力
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

//        this.isJumping = false;
        super.onLivingUpdate();
    }

    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);

        if (!this.world.isRemote)
        {
            BlockPos blockPos = new BlockPos(this.posX, this.posY - 0.5, this.posZ);
            if("player".equals(cause.getDamageType()) && this.world.getBlockState(blockPos).getBlock() == Blocks.GRASS){
                this.world.setBlockState(blockPos, Blocks.DIAMOND_ORE.getDefaultState());
            }
        }
    }
    @Override
    public MonsterCapabilityProvider addCapability(Entity entity, Random random) {

        MonsterCapabilityProvider monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);

        return monsterCapabilityProvider;
    }

}
