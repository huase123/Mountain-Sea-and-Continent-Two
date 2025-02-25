package hua.huase.shanhaicontinent.client.renderer.jineng;

import hua.huase.shanhaicontinent.entity.jinengitem.EntityJinengItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

import static hua.huase.shanhaicontinent.client.event.RenderWorldHunhuan.EXPLOSION_TEXTURE;

@SideOnly(Side.CLIENT)
public class RenderJiNengItme extends RenderEntity {

    private  ItemStack item ;
    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/picture/particletext.png");
    public static Map<Integer, Integer> timemap=new HashMap();
    public RenderJiNengItme(RenderManager renderManagerIn,Item item)
    {
        super(renderManagerIn);
        this.shadowSize = 0.15F;
        this.shadowOpaque = 0.75F;
        this.item=new ItemStack(item,1);
    }
    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {

        if(timemap.get(entity.getEntityId()) == null) timemap.put(entity.getEntityId(),0);
        int time = timemap.get(entity.getEntityId()).intValue();
        int limitFramerate = Minecraft.getMinecraft().gameSettings.limitFramerate;
        float ticks = (float) ((float)time/(float)limitFramerate);

        if(((EntityJinengItem)entity).getItemStack()!=null)this.item=((EntityJinengItem)entity).getItemStack();

        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
if(item==null)return;
//        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        EntityPlayerSP entityplayersp = Minecraft.getMinecraft().player;
        float f3 = entityplayersp == null ? 0.0F : entityplayersp.getCooldownTracker().getCooldown(item.getItem(), Minecraft.getMinecraft().getRenderPartialTicks());

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y+0.35+0.1f* MathHelper.sin(ticks/4.5f*3.14159265359f), (float)z);
        GlStateManager.rotate(ticks*40, 0.0F, 1.0F, 0.0F);
        GlStateManager.scale(0.8F, 0.8F, 0.8F);
        Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.popMatrix();

        if(item.getTagCompound()==null)return;
        int nianxian = item.getTagCompound().getInteger("nianxian");

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y+0.2f, (float)z);
        GlStateManager.rotate(90, 1, 0, 0);
        GlStateManager.rotate(ticks*20f, 0, 0, 1);
        GlStateManager.scale(1.5f, 1.5f, 0);

        if(f3>0){
            GlStateManager.color(0.5f, 0.5f, 0.5f, 1.0f);
        } else if (nianxian >= 1000000) {
            GlStateManager.color(ticks <= 1 ? 1 : ticks <= 2 ? 2 - ticks : ticks <= 4 ? 0 : ticks <= 5 ? ticks - 4 : 1, ticks <= 1 ? ticks : ticks <= 3 ? 1 : ticks <= 4 ? 4 - ticks : 0, ticks <= 2 ? 0 : ticks <= 3 ? ticks - 2 : ticks <= 5 ? 1 : ticks <= 5 ? 1 : 6 - ticks, 1.0f);
        } else if (nianxian >= 100000) {
            GlStateManager.color(1.5f, 0, 0, 1.5f);
        } else if (nianxian >= 10000) {
            GlStateManager.color(0, 0f, 0, 1.5f);
        } else if (nianxian >= 1000) {
            GlStateManager.color(1.5f, 0f, 1f, 1.5f);
        } else if (nianxian >= 100) {
            GlStateManager.color(1.5f, 1f, 0, 1.5f);
        } else if (nianxian >= 1) {
            GlStateManager.color(1.5f, 1.5f, 1.5f, 1.5f);
        }

        GlStateManager.disableLighting();
        GlStateManager.disableColorMaterial();
        GlStateManager.enablePolygonOffset();
        GlStateManager.enableBlend(); //开启混合器(使GL支持Alpha透明通道)
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        Minecraft.getMinecraft().getTextureManager().bindTexture(EXPLOSION_TEXTURE);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();
        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        buffer.pos(  -0.5,   -0.5, 0).tex(0, 0).endVertex();
        buffer.pos(  -0.5, 0.5, 0).tex(0, 1).endVertex();
        buffer.pos(0.5, 0.5, 0).tex(1, 1).endVertex();
        buffer.pos(0.5,   -0.5, 0).tex(1, 0).endVertex();
        tessellator.draw();
        GlStateManager.disableBlend();
        GlStateManager.disablePolygonOffset();
        GlStateManager.enableLighting();
        GlStateManager.enableColorMaterial();
        GlStateManager.popMatrix();


        GlStateManager.disableLighting();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x, (float)y+0.2f, (float)z);
        GlStateManager.rotate(-90, 1, 0, 0);
        GlStateManager.rotate(ticks*20f, 0, 0, 1);
        GlStateManager.scale(1.5f, 1.5f, 0);

        if(f3>0){
            GlStateManager.color(0.5f, 0.5f, 0.5f, 1.0f);
        } else if (nianxian >= 1000000) {
            GlStateManager.color(ticks <= 1 ? 1 : ticks <= 2 ? 2 - ticks : ticks <= 4 ? 0 : ticks <= 5 ? ticks - 4 : 1, ticks <= 1 ? ticks : ticks <= 3 ? 1 : ticks <= 4 ? 4 - ticks : 0, ticks <= 2 ? 0 : ticks <= 3 ? ticks - 2 : ticks <= 5 ? 1 : ticks <= 5 ? 1 : 6 - ticks, 1.0f);
        } else if (nianxian >= 100000) {
            GlStateManager.color(1.5f, 0, 0, 1.5f);
        } else if (nianxian >= 10000) {
            GlStateManager.color(0, 0f, 0, 1.5f);
        } else if (nianxian >= 1000) {
            GlStateManager.color(1.5f, 0f, 1f, 1.5f);
        } else if (nianxian >= 100) {
            GlStateManager.color(1.5f, 1f, 0, 1.5f);
        } else if (nianxian >= 1) {
            GlStateManager.color(1.5f, 1.5f, 1.5f, 1.5f);
        }
        GlStateManager.disableLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.enableBlend(); //开启混合器(使GL支持Alpha透明通道)
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        Minecraft.getMinecraft().getTextureManager().bindTexture(EXPLOSION_TEXTURE);
        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        buffer.pos(  -0.5,   -0.5, 0).tex(0, 0).endVertex();
        buffer.pos(  -0.5, 0.5, 0).tex(0, 1).endVertex();
        buffer.pos(0.5, 0.5, 0).tex(1, 1).endVertex();
        buffer.pos(0.5,   -0.5, 0).tex(1, 0).endVertex();
        tessellator.draw();
        GlStateManager.disableBlend();
        GlStateManager.disablePolygonOffset();
        GlStateManager.enableLighting();
        GlStateManager.enableColorMaterial();
        GlStateManager.popMatrix();
        timemap.put(entity.getEntityId(),time>= 9*limitFramerate ? 0:++time);






    }


    private void draw(BufferBuilder renderer, double x, double y, double width, double height, int red, int green, int blue, int alpha)
    {
        renderer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        renderer.pos((double)(x + 0), (double)(y + 0), 0.0D).color(red, green, blue, alpha).endVertex();
        renderer.pos((double)(x + 0), (double)(y + height), 0.0D).color(red, green, blue, alpha).endVertex();
        renderer.pos((double)(x + width), (double)(y + height), 0.0D).color(red, green, blue, alpha).endVertex();
        renderer.pos((double)(x + width), (double)(y + 0), 0.0D).color(red, green, blue, alpha).endVertex();
        Tessellator.getInstance().draw();
    }


    protected ResourceLocation getEntityTexture(EntityItem entity)
    {
//        return POLAR_ITEM_TEXTURE;
        return null;
    }
}
