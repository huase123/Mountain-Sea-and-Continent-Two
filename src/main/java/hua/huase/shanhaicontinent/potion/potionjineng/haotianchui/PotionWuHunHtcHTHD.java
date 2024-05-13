package hua.huase.shanhaicontinent.potion.potionjineng.haotianchui;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import hua.huase.shanhaicontinent.ExampleMod;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import hua.huase.shanhaicontinent.potion.PotionSeaMRender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.UUID;

import static hua.huase.shanhaicontinent.client.renderer.jineng.haotianchui.RenderJiNengHtcHTZ.item;
import static hua.huase.shanhaicontinent.potion.PotionRegistryHandler.POTION_LIST;

public class PotionWuHunHtcHTHD extends PotionSeaMRender
{
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(ExampleMod.MODID + ":textures/potion/wuhunhaotianchui/wuhunhtchthd.png");

    public PotionWuHunHtcHTHD()
    {
        super(false, 0x00ff00);
        this.setRegistryName(ExampleMod.MODID + ":potion.wuhunhtchthd");
        this.setPotionName("effect." + ExampleMod.MODID + ".potion.wuhunhtchthd");

        POTION_LIST.add(this);
    }


    @SideOnly(Side.CLIENT)
    public void entityRender(RenderPlayerEvent.Post event){

        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)15728880%65536, (float)15728880/ 65536);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)event.getX(), (float)event.getY()+1.0f, (float)event.getZ());

        GlStateManager.rotate(-90.0F - event.getEntityPlayer().rotationYaw, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
//        GlStateManager.rotate((float)(this.renderManager.options.thirdPersonView == 2 ? -1 : 1) * -this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);

        GlStateManager.scale(2.5F, 1.8F, 2.5F);
        Minecraft.getMinecraft().getRenderItem().renderItem(item, ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.popMatrix();

    }

    public Multimap<String, AttributeModifier> Multimap(){

        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();
        multimap.clear();
        multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(UUID.fromString("7107DE5E-7CE8-4030-940E-514C1F161117"), "Weapon modifier", 0.10, 2));

        return multimap;
    }



    public void applyAttributesModifiersToEntity(EntityLivingBase entityLivingBaseIn, AbstractAttributeMap attributeMapIn, int amplifier)
    {
        PlayerCapability capability = entityLivingBaseIn.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
        capability.addWufang(3000f);

        NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBaseIn);

        attributeMapIn.applyAttributeModifiers(this.Multimap());
        entityLivingBaseIn.setAbsorptionAmount(entityLivingBaseIn.getAbsorptionAmount() + (float)(4 * (amplifier + 1)));
        super.applyAttributesModifiersToEntity(entityLivingBaseIn, attributeMapIn, amplifier);
    }

    public void removeAttributesModifiersFromEntity(EntityLivingBase entityLivingBaseIn, AbstractAttributeMap attributeMapIn, int amplifier)
    {

        PlayerCapability capability = entityLivingBaseIn.getCapability(CapabilityRegistryHandler.PLYAER_CAPABILITY, null);
        capability.addWufang(-3000f);
        NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) entityLivingBaseIn);
        attributeMapIn.removeAttributeModifiers(this.Multimap());
        entityLivingBaseIn.setAbsorptionAmount(entityLivingBaseIn.getAbsorptionAmount() - (float)(4 * (amplifier + 1)));
        super.removeAttributesModifiersFromEntity(entityLivingBaseIn, attributeMapIn, amplifier);
    }


    public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier)
    {

        if (entityLivingBaseIn.getHealth() > 1.0F)
        {
//            entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);
//            entityLivingBaseIn.hurtResistantTime=0;
        }
    }

    public boolean isReady(int duration, int amplifier)
    {
        return true;
    }




    //打开背包时效果
    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect e, Minecraft mc)
    {
        int duration = e.getDuration();
        int fIndex = (duration % 16) / 2;
        mc.getTextureManager().bindTexture(TEXTURE);
        mc.currentScreen.drawTexturedModalRect(x + 6, y + 7, fIndex * 18, 0, 18, 18);
    }


//    HUD界面
    @Override
    public void renderHUDEffect(int x, int y, PotionEffect e, Minecraft mc, float alpha)
    {
        int duration = e.getDuration();
        int fIndex = (duration % 16) / 2;
        mc.getTextureManager().bindTexture(TEXTURE);
        mc.ingameGUI.drawTexturedModalRect(x + 3, y + 3, fIndex * 18, 0, 18, 18);
    }
}
