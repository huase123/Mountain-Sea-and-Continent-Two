package hua.huase.shanhaicontinent.client.event;

import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.client.keybinding.MyKeyBinding;
import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketOpenBaublesInventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static hua.huase.shanhaicontinent.client.event.RenderWorldHunhuan.EXPLOSION_TEXTURE;
import static net.minecraft.entity.SharedMonsterAttributes.MAX_HEALTH;


@Mod.EventBusSubscriber
public class ClientEventHandler
{


    @SideOnly(Side.CLIENT)
    public static int tickplayer=0;
    @SideOnly(Side.CLIENT)
    public static float donghua=0;
    @SideOnly(Side.CLIENT)
    public static float hunhuankaiguan=0;
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void renderHandEvent(RenderWorldLastEvent event) {



        EntityPlayerSP player = Minecraft.getMinecraft().player;
        short hunhuankaiguan1 = player.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null).getHunhuankaiguan();
//        if(hunhuankaiguan1 ==0&&donghua!=0f){
//            donghua=0f;
//        }

        if(hunhuankaiguan1 !=hunhuankaiguan){
            hunhuankaiguan= hunhuankaiguan1;
            donghua=0f;
        }


        if(hunhuankaiguan1 !=0) {


            int limitFramerate = Minecraft.getMinecraft().gameSettings.limitFramerate;
            float i = (float)tickplayer / limitFramerate ;
            PlayerCapability capability1 = player.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            if (capability1 == null) return;

            double x = 0;
            double y = 0;
            double z = 0;


            int i1 = 1;
            if(capability1.getMonsterCapabilityList()==null)return;
            for (MonsterCapability monsterCapability1 : capability1.getMonsterCapabilityList()) {
                if(donghua>=i1){
                    {
                    int nianxian = monsterCapability1.getNianxian();
                    GlStateManager.pushMatrix();
//                    GlStateManager.translate((float) x, (float) y + 0.05f+(1f-donghua/10f)*(i1+1), (float) z);
                    GlStateManager.translate((float) x, (float) y + 0.05f+(1f-(donghua-i1)/(10f-i1))*2, (float) z);
                    GlStateManager.rotate(90, 1, 0, 0);
                    GlStateManager.rotate(i1 % 2 == 0 ? i * 15f : -i * 15f, 0, 0, 1);


    //                    GlStateManager.rotate(renderArmYaw, 0.0F, 1.0F, 0.0F);
    //                    GlStateManager.rotate(renderArmPitch, 1.0F, 0.0F, 0.0F);

                    float v = i;
                        float v1 = 1f-capability1.getMonsterCapabilityList().size() / 10f;
                        GlStateManager.scale(v1+i1 / 5f, v1+i1 / 5f, 0);

                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                    if (nianxian >= 1000000) {
                        GlStateManager.color(v <= 1 ? 1 : v <= 2 ? 2 - v : v <= 4 ? 0 : v <= 5 ? v - 4 : 1, v <= 1 ? v : v <= 3 ? 1 : v <= 4 ? 4 - v : 0, v <= 2 ? 0 : v <= 3 ? v - 2 : v <= 5 ? 1 : v <= 5 ? 1 : 6 - v, 1.0f);
                    } else if (nianxian >= 100000) {
                        GlStateManager.color(1.5f, 0, 0, 0.8f);

                    } else if (nianxian >= 10000) {
                        GlStateManager.color(0, 0f, 0, 0.8f);
                    } else if (nianxian >= 1000) {
                        GlStateManager.color(1.5f, 0f, 1f, 0.8f);
                    } else if (nianxian >= 100) {
                        GlStateManager.color(1.5f, 1f, 0, 0.8f);
                    } else if (nianxian >= 1) {
                        GlStateManager.color(1.5f, 1.5f, 1.5f, 0.8f);
                    }


                    GlStateManager.disableLighting();
                    GlStateManager.enablePolygonOffset();
                    GlStateManager.depthMask(false);
                    GlStateManager.enableBlend(); //开启混合器(使GL支持Alpha透明通道)
                    GlStateManager.doPolygonOffset(-3, -10);

                    GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);


                    Minecraft.getMinecraft().getTextureManager().bindTexture(EXPLOSION_TEXTURE);
                    Tessellator tessellator = Tessellator.getInstance(); //获取Tessellator的一般方式
                    BufferBuilder buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"

                    buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX); //指定数组的组织方式(位置 + UV方式), 以及要画的图像的顶点数(矩形四个顶点)

                    buffer.pos(-6, -6, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(-6, 6, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(6, 6, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(6, -6, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV


                    tessellator.draw(); //将数组和渲染方式提交到GPU

                    GlStateManager.disableBlend();
                    GlStateManager.depthMask(true);
                    GlStateManager.disablePolygonOffset();
                    GlStateManager.enableLighting();
                    GlStateManager.popMatrix();
    //=====================

                    GlStateManager.pushMatrix();
//                  GlStateManager.translate((float) x, (float) y + 0.05f+(1f-donghua/10f)*(i1+1), (float) z);
                    GlStateManager.translate((float) x, (float) y + 0.05f+(1f-(donghua-i1)/(10f-i1))*2, (float) z);
//                  GlStateManager.rotate(-90, 1, 0, 0);
                    GlStateManager.rotate(-90, 1, 0, 0);
                    GlStateManager.rotate(i1 % 2 == 0 ? i * 15f : -i * 15f, 0, 0, 1);

//                    GlStateManager.scale(0.1f + i1 / 10f, 0.1f + i1 / 10f, 0);
                    GlStateManager.scale(v1+i1 / 10f, v1+i1 / 10f, 0);

                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);


                    if (nianxian >= 1000000) {
                        GlStateManager.color(v <= 1 ? 1 : v <= 2 ? 2 - v : v <= 4 ? 0 : v <= 5 ? v - 4 : 1, v <= 1 ? v : v <= 3 ? 1 : v <= 4 ? 4 - v : 0, v <= 2 ? 0 : v <= 3 ? v - 2 : v <= 5 ? 1 : v <= 5 ? 1 : 6 - v, 1.0f);
                    } else if (nianxian >= 100000) {
                        GlStateManager.color(1.5f, 0, 0, 0.8f);

                    } else if (nianxian >= 10000) {
                        GlStateManager.color(0, 0f, 0, 0.8f);
                    } else if (nianxian >= 1000) {
                        GlStateManager.color(1.5f, 0f, 1f, 0.8f);
                    } else if (nianxian >= 100) {
                        GlStateManager.color(1.5f, 1f, 0, 0.8f);
                    } else if (nianxian >= 1) {
                        GlStateManager.color(1.5f, 1.5f, 1.5f, 0.8f);
                    }


                    GlStateManager.disableLighting();
                    GlStateManager.enablePolygonOffset();
                    GlStateManager.depthMask(false);
                    GlStateManager.enableBlend(); //开启混合器(使GL支持Alpha透明通道)
                    GlStateManager.doPolygonOffset(-3, -10);

                    GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);


                    Minecraft.getMinecraft().getTextureManager().bindTexture(EXPLOSION_TEXTURE);
                    buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"
                    buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX); //指定数组的组织方式(位置 + UV方式), 以及要画的图像的顶点数(矩形四个顶点)

                    buffer.pos(-6, -6, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(-6, 6, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(6, 6, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                    buffer.pos(6, -6, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV


                    tessellator.draw(); //将数组和渲染方式提交到GPU

                    GlStateManager.disableBlend();
                    GlStateManager.depthMask(true);
                    GlStateManager.disablePolygonOffset();
                    GlStateManager.enableLighting();

                    GlStateManager.popMatrix();
                    i1++;
                }

                }
            }
            tickplayer = tickplayer<=limitFramerate*24?tickplayer+1:0;
            donghua = donghua<=10f?donghua+0.01f:donghua;
        }
    }


    @SideOnly(Side.CLIENT)
    public static boolean b = false;
    //键盘检测事件
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onKeyPressed(InputUpdateEvent event) {

        if (MyKeyBinding.MYKEY_O.isPressed()) {

            if (FMLClientHandler.instance().getClient().inGameHasFocus) {
                PacketHandler.INSTANCE.sendToServer(new PacketOpenBaublesInventory());
            }
        }

    }



    @SideOnly(Side.CLIENT)
    public static boolean jingtoukaiguan = false;
    @SideOnly(Side.CLIENT)
    public static int jingtou = 0;
    @SideOnly(Side.CLIENT)
    public static int tick=0;
    //    镜头事件
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void renderentityEventText(EntityViewRenderEvent.CameraSetup event){



        if(jingtoukaiguan){
            EntityPlayerSP player = Minecraft.getMinecraft().player;
            Minecraft.getMinecraft().renderGlobal.notifyBlockUpdate(Minecraft.getMinecraft().world,new BlockPos(player.posX, player.posY, player.posZ),null,null,1);

//            Minecraft.getMinecraft().gameSettings.thirdPersonView = 1;
            int limitFramerate = Minecraft.getMinecraft().gameSettings.limitFramerate;
            float i = (float)tick / limitFramerate * 24;
            double x = MathHelper.sin((float) (i * Math.PI / 180f)) * 10f;
            double y = MathHelper.cos((float) (i * Math.PI / 180f)) * 10f;

            event.setYaw(0);
            event.setPitch(0);
            //        event.setRoll(0);
            GlStateManager.rotate(30,1 ,0,0);
            GlStateManager.rotate(i+90,0 ,1,0);
            GlStateManager.translate(y,-3 ,x);
//
//            GL11.glPushMatrix();
//            GL11.glPopMatrix();
//            GlStateManager.rotate(30,0 ,0,1);

            tick = tick<=limitFramerate*15?tick+1:0;
        }


    }







    @SideOnly(Side.CLIENT)
    public static final ResourceLocation HEATDOWN = new ResourceLocation(ExampleMod.MODID,"textures/gui/shuchai/heatdown.png");

    @SideOnly(Side.CLIENT)
    public static final ResourceLocation MINECRAFT = new ResourceLocation("minecraft:textures/gui/icons.png");

    @SideOnly(Side.CLIENT)
    public static final ResourceLocation HEATUP = new ResourceLocation(ExampleMod.MODID,"textures/gui/shuchai/heatup.png");
    public static final ResourceLocation xishou = new ResourceLocation(ExampleMod.MODID,"textures/gui/shuchai/xishou.png");
    public static final ResourceLocation JINGSHENLI = new ResourceLocation(ExampleMod.MODID,"textures/gui/shuchai/jingshenliup.png");
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void renderHealthbar(RenderGameOverlayEvent.Pre event) {
        ScaledResolution resolution = event.getResolution();

        Entity renderViewEnity = Minecraft.getMinecraft().getRenderViewEntity();
        if(event.getType() == RenderGameOverlayEvent.ElementType.HEALTH && !event.isCanceled() && (renderViewEnity instanceof EntityPlayer)) {
            float health = ((EntityPlayer) renderViewEnity).getHealth();
            float maxhealth = (float) ((EntityPlayer) renderViewEnity).getEntityAttribute(MAX_HEALTH).getBaseValue();


            int x = resolution.getScaledWidth()/2-91;
            int y = resolution.getScaledHeight()-38;

            double z = 0;

            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().getTextureManager().bindTexture(HEATDOWN);
            Tessellator tessellator = Tessellator.getInstance(); //获取Tessellator的一般方式
            BufferBuilder buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"
            buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
            buffer.pos(x, y, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x, y+8, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x+85, y+8, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x+85, y, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            tessellator.draw();
            GlStateManager.popMatrix();


            GlStateManager.pushMatrix();
            if(health/maxhealth<=0.10){
                GlStateManager.color(0.5f,0.0f,0.0f,1f);
            }
            Minecraft.getMinecraft().getTextureManager().bindTexture(HEATUP);
            buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"
            buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
            buffer.pos(x+1, y+1, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x+1, y+1+6, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            float v = 83 * Math.min(health, maxhealth) / maxhealth;
            buffer.pos(x+1+ v, y+1+6, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x+1+ v, y+1, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            tessellator.draw();
            GlStateManager.color(1f,1f,1f,1);
            GlStateManager.popMatrix();

            if(health>maxhealth){

                GlStateManager.pushMatrix();

                Minecraft.getMinecraft().getTextureManager().bindTexture(xishou);
                buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"
                buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
                buffer.pos(x+1, y+1, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
                buffer.pos(x+1, y+1+6, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                float v1 = 83 * Math.min(health-maxhealth, maxhealth*0.7f) / maxhealth;
                buffer.pos(x+1+ v1, y+1+6, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
                buffer.pos(x+1+ v1, y+1, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
                tessellator.draw();
                GlStateManager.color(1f,1f,1f,1);
                GlStateManager.popMatrix();


            }

            String s = I18n.translateToLocalFormatted("player.shanhaicontinent.hp.name", Math.round(health) + "/" + maxhealth);

            GlStateManager.pushMatrix();
            GlStateManager.translate(x,y-0.5,0);
            GlStateManager.scale(0.7,0.7,0);
            Minecraft.getMinecraft().fontRenderer.drawString(s,5, 2, 0xffffffff,true);
            GlStateManager.popMatrix();


//            渲染魂力
            PlayerCapability capability = ((EntityPlayer) renderViewEnity).getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
            float jingshenli = capability.getJingshenli();
            float maxjingshenli = capability.getMaxjingshenli();


            int x1 = resolution.getScaledWidth()/2+6;
            int y1 = resolution.getScaledHeight()-38;

            double z1 = 0;

            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().getTextureManager().bindTexture(HEATDOWN);
            buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
            buffer.pos(x1, y1, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x1, y1 +8, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x1+85, y1 +8, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x1+85, y1, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            tessellator.draw();
            GlStateManager.popMatrix();


            GlStateManager.pushMatrix();
            Minecraft.getMinecraft().getTextureManager().bindTexture(JINGSHENLI);
            buffer = tessellator.getBuffer();//获取记录顶点信息的"数组"
            buffer.begin(7, DefaultVertexFormats.POSITION_TEX);
            buffer.pos(x1+1, y1 +1, 0).tex(0, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x1+1, y1 +1+6, 0).tex(0, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            float v1 = 83 * Math.min(jingshenli, maxjingshenli) / maxjingshenli;
            buffer.pos(x1+1+ v1, y1 +1+6, 0).tex(1, 1).endVertex(); //提供矩形的四个顶点, 并绑定UV
            buffer.pos(x1+1+ v1, y1 +1, 0).tex(1, 0).endVertex(); //提供矩形的四个顶点, 并绑定UV
            tessellator.draw();
            GlStateManager.color(1f,1f,1f,1);
            GlStateManager.popMatrix();

            String s1 = I18n.translateToLocalFormatted("player.shanhaicontinent.jsp.name", Math.round(jingshenli) + "/" + maxjingshenli);

            GlStateManager.pushMatrix();
            GlStateManager.translate(x1, y1 -0.5,0);
            GlStateManager.scale(0.7,0.7,0);
            Minecraft.getMinecraft().fontRenderer.drawString(s1,5, 2, 0xffffffff,true);

            GlStateManager.color(1f,1f,1f,1);
            GlStateManager.popMatrix();





            Minecraft.getMinecraft().getTextureManager().bindTexture(MINECRAFT);
            event.setCanceled(true);//取消原版渲染

        }

        if(event.getType() == RenderGameOverlayEvent.ElementType.ARMOR && !event.isCanceled() && (renderViewEnity instanceof EntityPlayer)) {
            GlStateManager.translate((float) 0, (float) -9, (float) 0);
        }

    }


    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void renderHealthbar(RenderGameOverlayEvent.Post event) {
        Entity renderViewEnity = Minecraft.getMinecraft().getRenderViewEntity();
        if(event.getType() == RenderGameOverlayEvent.ElementType.FOOD && !event.isCanceled() && (renderViewEnity instanceof EntityPlayer)) {
            GlStateManager.translate((float) 0, (float) 9, (float) 0);
        }
    }






}
