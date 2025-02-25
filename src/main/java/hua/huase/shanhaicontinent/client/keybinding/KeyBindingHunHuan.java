package hua.huase.shanhaicontinent.client.keybinding;

import hua.huase.shanhaicontinent.api.SendTitle;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketOpenHunhuan;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraft.network.play.server.SPacketTitle.Type.ACTIONBAR;
import static net.minecraft.util.text.TextFormatting.YELLOW;

@Mod.EventBusSubscriber
public class KeyBindingHunHuan {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onKeyPressed(InputUpdateEvent event) {
        if (MyKeyBinding.MYKEY_K.isPressed()) {

            EntityLivingBase entity = event.getEntityLiving();
            if (entity instanceof EntityPlayer) {

                PlayerCapability capability = entity.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
                short hunhuankaiguan = capability.getHunhuankaiguan();
                hunhuankaiguan = (short) (hunhuankaiguan>=capability.getWuhunListsname().size()? 0:hunhuankaiguan+1);

                if(hunhuankaiguan==0){
                    SendTitle.sendTitle((EntityPlayer)entity,new TextComponentTranslation("message.close.hunhuan:"),ACTIONBAR,YELLOW);

                }else {
                    SendTitle.sendTitle((EntityPlayer)entity,new TextComponentTranslation("message.open.hunhuan:" + capability.getWuhunListsname().get(hunhuankaiguan - 1)),ACTIONBAR,YELLOW);
                }

                capability.setHunhuankaiguan(hunhuankaiguan);
                PacketHandler.INSTANCE.sendToServer(new PacketOpenHunhuan(hunhuankaiguan));


            }



        }


    }
}