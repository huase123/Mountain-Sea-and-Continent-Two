package hua.huase.shanhaicontinent.entity;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.advancements.TFAdvancements;
import hua.huase.shanhaicontinent.api.PlayerCapabilityApi;
import hua.huase.shanhaicontinent.api.SendTitle;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.capability.api.ChangeCapability;
import hua.huase.shanhaicontinent.handers.HanderAny;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketHunhuanKaiguan;
import hua.huase.shanhaicontinent.seedpacket.PacketPlayerCapability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.MONSTER_CAPABILITY;
import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.random;
import static net.minecraft.network.play.server.SPacketTitle.Type.ACTIONBAR;
import static net.minecraft.network.play.server.SPacketTitle.Type.TITLE;
import static net.minecraft.util.text.TextFormatting.YELLOW;

public class HunhuanEntity extends Entity {
    public static final String ID = "Hunhuan";
    public static final String NAME = ExampleMod.MODID + ".HunHuan";
    private  long exiistTime;

    private static final DataParameter<Integer> STAGELIFE =
            EntityDataManager.createKey(HunhuanEntity.class, DataSerializers.VARINT);
    public HunhuanEntity(World worldIn) {
        super(worldIn);
        this.exiistTime = worldIn.getWorldTime();
        this.setSize(2.0F, 1.0F);
    }




    @Override
    protected void entityInit() {
        this.getDataManager().register(STAGELIFE, 0);
    }
    public Integer getStage()
    {
        return this.getDataManager().get(STAGELIFE);
    }
    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {

        this.getDataManager().set(STAGELIFE, compound.getInteger("Stage"));
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {

        compound.setInteger("Stage", this.getDataManager().get(STAGELIFE));
    }


    public void onCollideWithPlayer(EntityPlayer entityIn)
    {

    }

    public void setDead()
    {

        for (EntityPlayer entityPlayer : Collections.singletonList(playerTite)) {
            if(entityPlayer!=null)
                PacketHandler.INSTANCE.sendTo(new PacketHunhuanKaiguan(false), (EntityPlayerMP) entityPlayer);
        }

        this.isDead = true;
    }


    public  int viewPlayer=0;
    public  int sneakingTime=0;
    public  Boolean kaiguan=false;
    public   EntityPlayer playerTite = null;
    public void onUpdate()
    {
        super.onUpdate();

        if(exiistTime+2000<=this.world.getWorldTime()||(exiistTime>this.world.getWorldTime()&&this.world.getWorldTime()>1000)){

            this.setDead();
            return;
        }
        if (!this.world.isRemote)
        {

            int nianxian = this.getCapability(MONSTER_CAPABILITY, null).getNianxian();

            int STAGE = viewPlayer;





            if(STAGE%20==0){
                this.getDataManager().set(STAGELIFE, this.getCapability(MONSTER_CAPABILITY, null).getNianxian());
                double k = this.posX;
                double l = this.posY;
                double i1 = this.posZ;
//                AxisAlignedBB axisalignedbb = (new AxisAlignedBB((double)k, (double)l, (double)i1, (double)(k + 1), (double)(l + 1), (double)(i1 + 1))).grow(1).expand(0.0D, 0.0D, 0.0D);
                AxisAlignedBB axisalignedbb = (new AxisAlignedBB(this.getPosition())).grow(1.5D, 0.5D, 1.5D);
                List<EntityPlayer> list = this.world.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
                if(list.size()>1)return;
                EntityPlayer player = null;
                for (EntityPlayer entityplayer : list)
                {
                    player = entityplayer;
                }

                if (player==null){
                    if(STAGE!=0&&STAGE<340){
                        SendTitle.sendTitle((EntityPlayerMP)playerTite,ACTIONBAR,"message.hunhuan.list-1",YELLOW);
                    }
                    kaiguan=false;
                    for (EntityPlayer entityPlayer : Collections.singletonList(playerTite)) {
                        if(entityPlayer!=null)
                        PacketHandler.INSTANCE.sendTo(new PacketHunhuanKaiguan(kaiguan), (EntityPlayerMP) entityPlayer);
                    }
                    viewPlayer=0;
                    return;

                }else{


                    if(player.isSneaking()){
                        this.sneakingTime++;
                        if(Math.pow(sneakingTime,4)>=nianxian){

                            this.entityDropItem(nianxian);
                            this.setDead();

                            SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,"message.hunhuan.fenjie",YELLOW);
                        }

                        viewPlayer= 0;
                        return;
                    }else {
                        this.sneakingTime=0;
                    }





                    if(player.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY,null).getHunhuankaiguan()==0){
                        viewPlayer= 0;
                        viewPlayer= ++STAGE;
                        SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,"message.hunhuan.opentishi",YELLOW);
                        if(STAGE>=20)viewPlayer=0;
                        return;
                    }


                    playerTite = player;


                    PlayerCapability playerCapability = player.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);



                    if(STAGE==0){
                        SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list0",nianxian);
                        viewPlayer= ++STAGE;
                        return;
                    }

                    if(PlayerCapabilityApi.isXishouHunhuan((EntityPlayer) player)){


                        if(STAGE>80){
                            if(!kaiguan){
                                kaiguan=true;
                                for (EntityPlayer entityPlayer : Collections.singletonList(playerTite)) {
                                    if(entityPlayer!=null)
                                        PacketHandler.INSTANCE.sendTo(new PacketHunhuanKaiguan(true), (EntityPlayerMP) entityPlayer);
                                }
                                viewPlayer= ++STAGE;
                                return;
                            }
                        }

                        float jingshenli = playerCapability.getJingshenli();
                        float v = jingshenli - nianxian / 100f;
                        if(v >=0){

                            if(STAGE==100){
                                playerCapability.setJingshenli(v);
                                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);
                                SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list1", nianxian / 100f);
                                viewPlayer= ++STAGE;
                                return;
                            }
                            if(STAGE==160){

                                playerCapability.setJingshenli(v);
                                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);
                                SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list2", nianxian / 100f);
                                viewPlayer= ++STAGE;
                                return;
                            }
                            if(STAGE==220){

                                playerCapability.setJingshenli(v);
                                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);

                                SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list3", nianxian / 100f);
                                viewPlayer= ++STAGE;
                                return;
                            }
                            if(STAGE==280){

                                playerCapability.setJingshenli(v);
                                NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);
                                SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list4", nianxian / 100f);
                                viewPlayer= ++STAGE;
                                return;
                            }
                            if(STAGE==340){

                                playerCapability.setJingshenli(v);
                                if(new Random().nextInt(2)!=0||jingshenli>nianxian/20){
                                    PlayerCapabilityApi.tuPo(player);
    //								playerCapability.getMonsterCapabilityList().add(entity.getCapability(MONSTER_CAPABILITY, null));
                                    List<MonsterCapability> monsterCapabilityList = playerCapability.getMonsterCapabilityList();
//                                    if(monsterCapabilityList==null)monsterCapabilityList=new ArrayList<>();
                                    monsterCapabilityList.add(this.getCapability(MONSTER_CAPABILITY, null));
//                                    playerCapability.setMonsterCapabilityList(monsterCapabilityList);
                                    ChangeCapability.addHunhuan(playerCapability,this.getCapability(MONSTER_CAPABILITY, null),  player);
//                                    playerCapability.addDengji(1);

                                    TFAdvancements.PLAYER_XISHOUHUNHUAN.trigger((EntityPlayerMP) player,nianxian);
                                    NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);

                                    SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.sccuess", nianxian);
                                    SendTitle.sendTitle((EntityPlayerMP)player,TITLE,YELLOW,"message.hunhuan.sccuess", nianxian);
                                    viewPlayer= 0;
                                    kaiguan=false;
                                    for (EntityPlayer entityPlayer : Collections.singletonList(playerTite)) {
                                        if(entityPlayer!=null)
                                            PacketHandler.INSTANCE.sendTo(new PacketHunhuanKaiguan(kaiguan), (EntityPlayerMP) entityPlayer);
                                    }

                                    PacketHandler.INSTANCE.sendToAllTracking(new PacketPlayerCapability(playerCapability,player),new NetworkRegistry.TargetPoint(player.dimension,player.posX,player.posY,player.posZ,60));

                                    this.setDead();
                                    return;
                                }

                                ((EntityLivingBase)player).addPotionEffect(new PotionEffect(MobEffects.NAUSEA,200,0,true,true));
                                SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.fail", nianxian);
                            }

                        }else {

                                if(STAGE==300) {
                                    playerCapability.setJingshenli(0);
                                    NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) player);
                                    SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,YELLOW,"message.hunhuan.list.false", jingshenli);
                                    ((EntityLivingBase)player).addPotionEffect(new PotionEffect(MobEffects.NAUSEA,200,0,true,true));
                                }
                            }

                    }else {

                        if(STAGE%100==0) {
                            SendTitle.sendTitle((EntityPlayerMP)player,ACTIONBAR,"message.hunhuan.list.no",YELLOW);
                            viewPlayer= ++STAGE;
                            return;
                        }
                    }



                }

            }

            viewPlayer= ++STAGE;
        }
    }



    public void entityDropItem(int nianxian){
        int i = random.nextInt(3)+1;
        if(nianxian>=1000000){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i+3, 5),0);
        }else if(nianxian>=100000){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i*nianxian/100000, 4),0);
        }else if(nianxian>=10000){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i*nianxian/10000, 3),0);
        }else if(nianxian>=1000){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i*nianxian/1000, 2),0);
        }else if(nianxian>=100){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i*nianxian/100, 1),0);
        }else if(nianxian>=1){
            this.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":hunye")), i*nianxian/10+1, 0),0);
        }


    }

}
