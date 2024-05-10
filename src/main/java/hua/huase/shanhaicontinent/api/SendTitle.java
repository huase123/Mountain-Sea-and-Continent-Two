package hua.huase.shanhaicontinent.api;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketTitle;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

public interface SendTitle {

     static void sendTitle(EntityPlayerMP player , SPacketTitle.Type type, String s, TextFormatting color){
          if(player==null)return;
          TextComponentString iTextComponents = new TextComponentString(I18n.translateToLocalFormatted(s));
          iTextComponents.getStyle().setColor(color);
          SPacketTitle spackettitle1 = new SPacketTitle(type, iTextComponents);
          player.connection.sendPacket(spackettitle1);
     }
     static void sendTitle(EntityPlayerMP player , SPacketTitle.Type type, TextFormatting color, String s,float f){
          if(player==null)return;
          TextComponentString iTextComponents = new TextComponentString(I18n.translateToLocalFormatted(s,f));
          iTextComponents.getStyle().setColor(color);
          SPacketTitle spackettitle1 = new SPacketTitle(type, iTextComponents);
          player.connection.sendPacket(spackettitle1);
     }

     static void sendTitle(EntityPlayerMP player ,TextComponentTranslation textComponents, SPacketTitle.Type type, TextFormatting color){

          if(player==null)return;
          textComponents.getStyle().setColor(color);
          SPacketTitle spackettitle1 = new SPacketTitle(type, textComponents);
          player.connection.sendPacket(spackettitle1);

     }

     static void sendTitle(EntityPlayer player , TextComponentTranslation textComponents, SPacketTitle.Type type, TextFormatting color){

          if(player==null)return;
          textComponents.getStyle().setColor(color);
          SPacketTitle spackettitle1 = new SPacketTitle(type, textComponents);
          Minecraft.getMinecraft().player.connection.handleTitle(spackettitle1);
     }
}
