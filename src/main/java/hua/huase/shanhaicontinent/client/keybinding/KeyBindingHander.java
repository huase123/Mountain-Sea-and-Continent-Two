package hua.huase.shanhaicontinent.client.keybinding;

import hua.huase.shanhaicontinent.api.SendTitle;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketTuPo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Map;

import static hua.huase.shanhaicontinent.client.event.ClientEventHandler.jingtoukaiguan;
import static net.minecraft.network.play.server.SPacketTitle.Type.ACTIONBAR;
import static net.minecraft.util.text.TextFormatting.YELLOW;

@Mod.EventBusSubscriber
public class KeyBindingHander {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onKeyPressed(InputUpdateEvent event) {

        if(Minecraft.getMinecraft().gameSettings.keyBindSneak.isKeyDown()){
            jingtoukaiguan = false;
        }



        if (MyKeyBinding.MYKEY_P.isPressed()) {

            EntityLivingBase entity = event.getEntityLiving();
            if (entity instanceof EntityPlayer) {

                PlayerCapability capability = entity.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
                int maxjingyan = capability.getMaxjingyan();
                int jingyan = capability.getJingyan();
                int dengji = capability.getDengji();

                Map<String, List<MonsterCapability>> monsterCapabilityLists = capability.getMonsterCapabilityLists();
                int sizeMax = 0;
                for (Map.Entry<String, List<MonsterCapability>> stringListEntry : monsterCapabilityLists.entrySet()) {
                    if(sizeMax < stringListEntry.getValue().size()) sizeMax = stringListEntry.getValue().size();

                }

//                if(jingyan>=maxjingyan&&(dengji+1)%10!=0) {
                if(jingyan>=maxjingyan && dengji<(sizeMax+1)*10-1) {


                    PacketHandler.INSTANCE.sendToServer(new PacketTuPo());
                }else {
                    if(jingyan<maxjingyan){
                        SendTitle.sendTitle((EntityPlayer)entity,new TextComponentTranslation("message.tupo.fail.client.jingyan"),ACTIONBAR,YELLOW);

                    }else {
                        SendTitle.sendTitle((EntityPlayer)entity,new TextComponentTranslation("message.tupo.fail.client.hunhuan"),ACTIONBAR,YELLOW);
                    }
                }


            }



        }


    }
}