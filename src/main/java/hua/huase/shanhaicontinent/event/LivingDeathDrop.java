package hua.huase.shanhaicontinent.event;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.ItemCapabilityProvider;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.entity.HunhuanEntity;
import hua.huase.shanhaicontinent.entity.seamentitymob.*;
import hua.huase.shanhaicontinent.handers.HanderAny;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.MONSTER_CAPABILITY;
import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.random;

@Mod.EventBusSubscriber
public class LivingDeathDrop {

    @SubscribeEvent
    public static void onEntityStruckByLightning(LivingDeathEvent event){

        EntityLivingBase entityLiving = event.getEntityLiving();
        DamageSource damageSource = event.getSource();
        if(entityLiving instanceof IMob && entityLiving.getCapability(MONSTER_CAPABILITY,null)!=null&&!entityLiving.world.isRemote){
            int nianxian = entityLiving.getCapability(MONSTER_CAPABILITY, null).getNianxian();

            if(nianxian<=1) return;
//            if ("player".equals(damageSource.getDamageType())) {
            if (damageSource.getTrueSource() instanceof EntityPlayer) {

                MonsterCapability monsterCapability = entityLiving.getCapability(MONSTER_CAPABILITY, null);

                HunhuanEntity hunhuanEntity = new HunhuanEntity(entityLiving.world);
                hunhuanEntity.posX = entityLiving.posX;
                hunhuanEntity.posY = entityLiving.posY;
                hunhuanEntity.posZ = entityLiving.posZ;
                MonsterCapability monsterCapability1 = hunhuanEntity.getCapability(MONSTER_CAPABILITY, null);
                monsterCapability1.deserializeNBT(monsterCapability.serializeNBT());
                entityLiving.world.spawnEntity(hunhuanEntity);
                Entity trueSource = damageSource.getTrueSource();
                livingDrop(entityLiving,nianxian,trueSource);
                addJingYan(nianxian,trueSource);

            }

//            PacketHandler.INSTANCE.sendToAllTracking(new PacketMonster(monsterCapability,hunhuanEntity.getEntityId()),hunhuanEntity);

        }



    }



    public static void livingDrop(EntityLivingBase entityLivingBase,int nianxian,Entity entityPlayer) {

        EntityPlayer entityPlayer1 = (EntityPlayer) entityPlayer;
//        ItemStack heldItem0 = entityPlayer1.getHeldItem(MAIN_HAND);
//        ItemStack heldItem1 = entityPlayer1.getHeldItem(OFF_HAND);

        int enchantmentLevel = EnchantmentHelper.getLootingModifier(entityPlayer1);

        if(entityLivingBase instanceof SeaMEntityMobBase){
            if(random.nextInt(10)<=enchantmentLevel+2){
                double v = Math.log10(nianxian)*0.5D+1;
                if(entityLivingBase instanceof SeaMLuoLuoNiao){
                    entityLivingBase.entityDropItem(new ItemStack(HanderAny.legs, 1, random.nextInt((int) v)),0);
                }else if(entityLivingBase instanceof SeaMHuoQiLin){
                    entityLivingBase.entityDropItem(new ItemStack(HanderAny.feet, 1, random.nextInt((int) v)),0);
                }else if(entityLivingBase instanceof SeaMXvanGui){
                    entityLivingBase.entityDropItem(new ItemStack(HanderAny.chest, 1, random.nextInt((int) v)),0);
                }else if(entityLivingBase instanceof SeaMTianHu){
                    entityLivingBase.entityDropItem(new ItemStack(HanderAny.head, 1, random.nextInt((int) v)),0);
                }else {
                    switch (random.nextInt(4)){
                        case 0:
                            entityLivingBase.entityDropItem(new ItemStack(HanderAny.head, 1, random.nextInt((int) v)+1),0);
                            break;
                        case 1:
                            entityLivingBase.entityDropItem(new ItemStack(HanderAny.chest, 1, random.nextInt((int) v)+1),0);
                            break;
                        case 2:
                            entityLivingBase.entityDropItem(new ItemStack(HanderAny.feet, 1, random.nextInt((int) v)+1),0);
                            break;
                        case 3:
                            entityLivingBase.entityDropItem(new ItemStack(HanderAny.legs, 1, random.nextInt((int) v)+1),0);
                            break;
                    }
                }
            }
        }

        switch (random.nextInt(Math.max(10,60-enchantmentLevel*5))){
            case 0:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":exoskeletonbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 1:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":headbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 2:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":lefthandbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 3:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":leftlegbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 4:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":righthandbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 5:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":rightlegbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
            case 6:
                entityLivingBase.entityDropItem(new ItemStack(HanderAny.registry.getValue(new ResourceLocation(ExampleMod.MODID+":trunkbone")), 1, 0, new ItemCapabilityProvider(nianxian).serializeItemNBT()),0);
                break;
        }
    }



    public static void addJingYan(int nianxian,Entity entityPlayer) {

        if(entityPlayer!= null && entityPlayer instanceof EntityPlayer){
            PlayerCapability capability = entityPlayer.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            if(nianxian>=1000000){
                capability.addJingyan(1500+nianxian/1000);
            }else if(nianxian>=100000){
                capability.addJingyan(1000+nianxian/1000);
            }else if(nianxian>=10000){
                capability.addJingyan(500+nianxian/500);
            }else if(nianxian>=1000){
                capability.addJingyan(100+nianxian/250);
            }else if(nianxian>=100){
                capability.addJingyan(20+nianxian/100);
            }else if(nianxian>=1){
                capability.addJingyan(1+nianxian/10);
            }

            NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityPlayer);
        }

    }


}
