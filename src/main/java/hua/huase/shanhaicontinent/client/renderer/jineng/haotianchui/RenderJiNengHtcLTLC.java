package hua.huase.shanhaicontinent.client.renderer.jineng.haotianchui;

import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@SideOnly(Side.CLIENT)
public class RenderJiNengHtcLTLC extends RenderEntity {


    private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/jineng/jingubang/bang.png");
    public static Map<Integer, Integer> timemap=new HashMap();
    public static ItemStack item = new ItemStack(JinengMethond.monsterCapabilityLists.get("haotianchui").get(0),1,0);
public RenderJiNengHtcLTLC(RenderManager renderManager) {
        super(renderManager);

    item.addEnchantment(Enchantment.getEnchantmentByID(1),1);
    }


    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)x, (float)y, (float)z);

            GlStateManager.rotate(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
//        GlStateManager.rotate((float)(this.renderManager.options.thirdPersonView == 2 ? -1 : 1) * -this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);

            GlStateManager.scale(4.8F, 4.8F, 4.8F);
            Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
            GlStateManager.popMatrix();

        if(entity.ticksExisted>=20){
            long randNumLong = entity.world.rand.nextLong();
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
            double[] adouble = new double[8];
            double[] adouble1 = new double[8];
            double d0 = 0.0D;
            double d1 = 0.0D;
            Random random = new Random(randNumLong);

            for (int i = 7; i >= 0; --i)
            {
                adouble[i] = d0;
                adouble1[i] = d1;
                d0 += (double)(random.nextInt(11) - 5);
                d1 += (double)(random.nextInt(11) - 5);
            }

            for (int k1 = 0; k1 < 4; ++k1)
            {
                Random random1 = new Random(randNumLong);

                for (int j = 0; j < 3; ++j)
                {
                    int k = 7;
                    int l = 0;

                    if (j > 0)
                    {
                        k = 7 - j;
                    }

                    if (j > 0)
                    {
                        l = k - 2;
                    }

                    double d2 = adouble[k] - d0;
                    double d3 = adouble1[k] - d1;

                    for (int i1 = k; i1 >= l; --i1)
                    {
                        double d4 = d2;
                        double d5 = d3;

                        if (j == 0)
                        {
                            d2 += (double)(random1.nextInt(11) - 5);
                            d3 += (double)(random1.nextInt(11) - 5);
                        }
                        else
                        {
                            d2 += (double)(random1.nextInt(31) - 15);
                            d3 += (double)(random1.nextInt(31) - 15);
                        }

                        bufferbuilder.begin(5, DefaultVertexFormats.POSITION_COLOR);
                        float f = 0.5F;
                        float f1 = 0.45F;
                        float f2 = 0.45F;
                        float f3 = 0.5F;
                        double d6 = 0.1D + (double)k1 * 0.2D;

                        if (j == 0)
                        {
                            d6 *= (double)i1 * 0.1D + 1.0D;
                        }

                        double d7 = 0.1D + (double)k1 * 0.2D;

                        if (j == 0)
                        {
                            d7 *= (double)(i1 - 1) * 0.1D + 1.0D;
                        }

                        for (int j1 = 0; j1 < 5; ++j1)
                        {
                            double d8 = x + 0.5D - d6;
                            double d9 = z + 0.5D - d6;

                            if (j1 == 1 || j1 == 2)
                            {
                                d8 += d6 * 2.0D;
                            }

                            if (j1 == 2 || j1 == 3)
                            {
                                d9 += d6 * 2.0D;
                            }

                            double d10 = x + 0.5D - d7;
                            double d11 = z + 0.5D - d7;

                            if (j1 == 1 || j1 == 2)
                            {
                                d10 += d7 * 2.0D;
                            }

                            if (j1 == 2 || j1 == 3)
                            {
                                d11 += d7 * 2.0D;
                            }

                            bufferbuilder.pos(d10 + d2, y + (double)(i1 * 16), d11 + d3).color(0.45F, 0.45F, 0.5F, 0.3F).endVertex();
                            bufferbuilder.pos(d8 + d4, y + (double)((i1 + 1) * 16), d9 + d5).color(0.45F, 0.45F, 0.5F, 0.3F).endVertex();
                        }

                        tessellator.draw();
                    }
                }
            }

            GlStateManager.disableBlend();
            GlStateManager.enableLighting();
            GlStateManager.enableTexture2D();

        }




    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return POLAR_BEAR_TEXTURE;
    }



}
