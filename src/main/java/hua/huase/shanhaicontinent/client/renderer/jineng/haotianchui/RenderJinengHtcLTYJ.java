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
public class RenderJinengHtcLTYJ extends RenderEntity {


    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/jineng/jingubang/bang.png");

public RenderJinengHtcLTYJ(RenderManager renderManager) {
        super(renderManager);
    }


    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {

        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y, (float)z);
        GlStateManager.rotate(90.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);


        GlStateManager.rotate((180f+entity.ticksExisted+partialTicks)*5, 0.0F, 0.0F, 1.0F);
        GlStateManager.translate(-4, -4, 0.0);
//        GlStateManager.rotate((float)(this.renderManager.options.thirdPersonView == 2 ? -1 : 1) * -this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);

        GlStateManager.scale(5.8F, 5.8F, 5.8F);
        Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.popMatrix();


//        图片

        for (int i = 0; i < 2; i++) {

            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y-0.5, (float)z);
            GlStateManager.rotate(90 * (i*2-1), 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate((entity.ticksExisted+partialTicks)*80 * (i*2-1), 0.0F, 0.0F, 1.0F);

            GlStateManager.disableLighting();
            GlStateManager.enablePolygonOffset();
            GlStateManager.enableBlend();
            GlStateManager.depthMask(false);
//        GlStateManager.doPolygonOffset(1, -11);

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





    }




    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return POLAR_BEAR_TEXTURE;
    }



}
