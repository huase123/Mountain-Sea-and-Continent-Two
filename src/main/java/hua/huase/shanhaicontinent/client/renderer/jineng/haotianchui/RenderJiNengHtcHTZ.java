package hua.huase.shanhaicontinent.client.renderer.jineng.haotianchui;

import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class RenderJiNengHtcHTZ extends RenderEntity {


    private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("shanhaicontinent:textures/jineng/jingubang/bang.png");
    public static Map<Integer, Integer> timemap=new HashMap();
    public static ItemStack item = new ItemStack(JinengMethond.monsterCapabilityLists.get("haotianchui").get(0),1,0);
public RenderJiNengHtcHTZ(RenderManager renderManager) {
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


    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return POLAR_BEAR_TEXTURE;
    }



}
