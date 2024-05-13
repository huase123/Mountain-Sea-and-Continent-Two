package hua.huase.shanhaicontinent.client.renderer.jineng.haotianchui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

import static hua.huase.shanhaicontinent.client.renderer.jineng.haotianchui.RenderJiNengHtcHTZ.item;

@SideOnly(Side.CLIENT)
public class RenderJinengHtcHTJJ extends RenderEntity {


    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/jineng/haotianchui/lingyv.png");

public RenderJinengHtcHTJJ(RenderManager renderManager) {
        super(renderManager);
    }


    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {

        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//物品模型
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y, (float)z);
        GlStateManager.rotate((entity.ticksExisted+partialTicks)*20, 0.0F, -1.0F, 0.0F);
        GlStateManager.rotate(-180, 1.0F, 0.0F, 0.0F);
        GlStateManager.translate(0, -6, 0.0);
        GlStateManager.scale(4.8F, 4.8F, 4.8F);
        Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.popMatrix();

//        GlStateManager.pushMatrix();
//        GlStateManager.translate((float)x, (float)y, (float)z);
//        GlStateManager.rotate((entity.ticksExisted+partialTicks)*40, 0.0F, -1.0F, 0.0F);
////        GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, -1.0F, 0.0F);
//        GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
//        GlStateManager.translate(0, -8, 0.0);
//        GlStateManager.scale(4.8F, 4.8F, 4.8F);
//        Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
//        GlStateManager.popMatrix();



//        图片

        for (int i = 0; i < 12; i++) {

            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y+0.5, (float)z);
        GlStateManager.rotate(30*i + (entity.ticksExisted+partialTicks)*4, 0.0F, 1.0F, 0.0F);

//            GlStateManager.rotate(10, 0.0F, 0.0F, 1.0F);
            GlStateManager.color(1.0F, 0.8F, 0.0F, 0.5F);

            GlStateManager.disableLighting();
            GlStateManager.enablePolygonOffset();
            GlStateManager.enableBlend();
            GlStateManager.depthMask(false);

            Minecraft.getMinecraft().getTextureManager().bindTexture(POLAR_BEAR_TEXTURE);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder buffer = tessellator.getBuffer();

            buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

            buffer.pos(  -10,   -10, 0).tex(0, 0).endVertex();
            buffer.pos(  -10, 10, 0).tex(0, 1).endVertex();
            buffer.pos(10, 10, 0).tex(1, 1).endVertex();
            buffer.pos(10,   -10, 0).tex(1, 0).endVertex();


            tessellator.draw();

            GlStateManager.disableBlend();
            GlStateManager.depthMask(true);
            GlStateManager.disablePolygonOffset();
            GlStateManager.enableLighting();
            GlStateManager.popMatrix();


        }









//
//        GlStateManager.pushMatrix();
//        GlStateManager.translate((float)x, (float)y+0.5, (float)z);
//        GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
//        GlStateManager.rotate((entity.ticksExisted+partialTicks)*10, 0.0F, 0.0F, 1.0F);
//
//        GlStateManager.disableLighting();
//        GlStateManager.enablePolygonOffset();
//        GlStateManager.enableBlend();
//        GlStateManager.depthMask(false);
//
//        Minecraft.getMinecraft().getTextureManager().bindTexture(POLAR_BEAR_TEXTURE);
//        Tessellator tessellator = Tessellator.getInstance();
//        BufferBuilder buffer = tessellator.getBuffer();
//
//        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
//
//        buffer.pos(  -10,   -10, 0).tex(0, 0).endVertex();
//        buffer.pos(  -10, 10, 0).tex(0, 1).endVertex();
//        buffer.pos(10, 10, 0).tex(1, 1).endVertex();
//        buffer.pos(10,   -10, 0).tex(1, 0).endVertex();
//
//
//        tessellator.draw();
//
//        GlStateManager.disableBlend();
//        GlStateManager.depthMask(true);
//        GlStateManager.disablePolygonOffset();
//        GlStateManager.enableLighting();
//        GlStateManager.popMatrix();
//
//
//        GlStateManager.pushMatrix();
//        GlStateManager.translate((float)x, (float)y+0.5, (float)z);
//        GlStateManager.rotate(-90, 1.0F, 0.0F, 0.0F);
//        GlStateManager.rotate(-(entity.ticksExisted+partialTicks)*10, 0.0F, 0.0F, 1.0F);
//
//        GlStateManager.disableLighting();
//        GlStateManager.enablePolygonOffset();
//        GlStateManager.enableBlend();
//        GlStateManager.depthMask(false);
//        Minecraft.getMinecraft().getTextureManager().bindTexture(POLAR_BEAR_TEXTURE);
//        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
//
//        buffer.pos(  -10,   -10, 0).tex(0, 0).endVertex();
//        buffer.pos(  -10, 10, 0).tex(0, 1).endVertex();
//        buffer.pos(10, 10, 0).tex(1, 1).endVertex();
//        buffer.pos(10,   -10, 0).tex(1, 0).endVertex();
//
//
//        tessellator.draw();
//
//        GlStateManager.disableBlend();
//        GlStateManager.depthMask(true);
//        GlStateManager.disablePolygonOffset();
//        GlStateManager.enableLighting();
//        GlStateManager.popMatrix();



    }




    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return POLAR_BEAR_TEXTURE;
    }



}
