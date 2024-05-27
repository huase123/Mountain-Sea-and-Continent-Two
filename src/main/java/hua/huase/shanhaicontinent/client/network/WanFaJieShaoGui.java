package hua.huase.shanhaicontinent.client.network;

import hua.huase.shanhaicontinent.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class WanFaJieShaoGui extends GuiContainer
{
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(ExampleMod.MODID + ":textures/gui/wanfajieshao.png");
    private static final ResourceLocation TEXTUREEN =
            new ResourceLocation(ExampleMod.MODID + ":textures/gui/wanfajieshaoenglish.png");

    public WanFaJieShaoGui()
    {
        super(new Container() {
            @Override
            public boolean canInteractWith(EntityPlayer playerIn) {
                return false;
            }
        });
        this.xSize = (int) (480*0.8);
        this.ySize = (int) (270*0.8);
    }

//    绘制画板
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    //    绘制GUI
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        int left = (this.width - this.xSize) / 2;
        int top = (this.height - this.ySize) / 2;
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        if("en_us".equals(Minecraft.getMinecraft().gameSettings.language)){

            this.mc.getTextureManager().bindTexture(TEXTUREEN);//获取背景图片
        }else {
            this.mc.getTextureManager().bindTexture(TEXTURE);//获取背景图片
        }

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos((left+0), (top+this.ySize), this.zLevel).tex(0.0D, 1D).endVertex();
        bufferbuilder.pos((left+this.xSize), (top+this.ySize), this.zLevel).tex(1D, 1D).endVertex();
        bufferbuilder.pos((left+this.xSize), (top+0), this.zLevel).tex(1D, 0.0D).endVertex();
        bufferbuilder.pos((left+0), (top+0), this.zLevel).tex(0.0D, 0.0D).endVertex();
        tessellator.draw();


    }






}
