package hua.huase.shanhaicontinent.client.renderer.jineng.jingubang;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class RenderJiNengDZSY extends RenderEntity {

    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/jineng/jingubang/jingubangdzsy.png");
    private ItemStack item ;
    public static Map<Integer, Integer> timemap=new HashMap();
    public RenderJiNengDZSY(RenderManager renderManager, Item item) {
        super(renderManager);
        this.item=new ItemStack(item,1);
    }


    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {


        for (int i = 0; i < 2; i++) {

            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y+0.1* (i*2-1), (float)z);
            GlStateManager.rotate( -(entity.ticksExisted+partialTicks)*4 * (i*2-1), 0.0F, 1.0F, 0.0F);

            GlStateManager.rotate(90 * (i*2-1), 1.0F, 0.0F, 0.0F);
//            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

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







        for (int i = 0; i < 12; i++) {

            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y+0.5, (float)z);
            GlStateManager.rotate(30*i + (entity.ticksExisted+partialTicks)*4, 0.0F, 1.0F, 0.0F);

//            GlStateManager.rotate(10, 0.0F, 0.0F, 1.0F);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.5F);

            GlStateManager.disableLighting();
            GlStateManager.enablePolygonOffset();
            GlStateManager.enableBlend();
            GlStateManager.depthMask(false);
            GlStateManager.doPolygonOffset(-3, -30);

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


}
