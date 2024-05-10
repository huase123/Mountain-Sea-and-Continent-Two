package hua.huase.shanhaicontinent.client.event;

import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketOpenBaublesInventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@Mod.EventBusSubscriber
public class GuiEvents {

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void guiPostInit(GuiScreenEvent.InitGuiEvent.Post event) {

		if (event.getGui() instanceof GuiInventory ) {
			GuiContainer gui = (GuiContainer) event.getGui();
			event.getButtonList().add(new GuiInventoryButton(55, gui, 60+4, 64+2, 10, 10,
					I18n.format("open.display")));
		}
	}


	@SideOnly(Side.CLIENT)
	public static class GuiInventoryButton extends GuiButton {

		private final GuiContainer parentGui;

		public GuiInventoryButton(int buttonId, GuiContainer parentGui, int x, int y, int width, int height, String buttonText) {
			super(buttonId, x, parentGui.getGuiTop() + y, width, height, buttonText);
			this.parentGui = parentGui;
		}


		@Override
		public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
			boolean pressed = super.mousePressed(mc, mouseX - this.parentGui.getGuiLeft(), mouseY);
			if (pressed) {
				if (parentGui instanceof GuiInventory) {
					Minecraft.getMinecraft().player.closeScreen();
					PacketHandler.INSTANCE.sendToServer(new PacketOpenBaublesInventory());
				}
			}
			return pressed;
		}

		@Override
		public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks)
		{
			if (this.visible)
			{
				int x = this.x + this.parentGui.getGuiLeft();

				FontRenderer fontrenderer = mc.fontRenderer;
//				mc.getTextureManager().bindTexture(GuiPlayerExpanded.background);
				mc.getTextureManager().bindTexture(BUTTON_TEXTURES);
				GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
				this.hovered = mouseX >= x && mouseY >= this.y && mouseX < x + this.width && mouseY < this.y + this.height;
				int k = this.getHoverState(this.hovered);
				GlStateManager.enableBlend();
				GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
				GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

				GlStateManager.pushMatrix();
				GlStateManager.translate(0, 0, 200);
				if (k==1) {
					this.drawTexturedModalRect(x, this.y, 0, 66, 10, 10);
//					this.drawTexturedModalRect(x, this.y, 200, 48, 10, 10);
				} else {
//					this.drawTexturedModalRect(x, this.y, 210, 48, 10, 10);
					this.drawTexturedModalRect(x, this.y, 0, 66, 10, 10);
					this.drawCenteredString(fontrenderer, I18n.format(this.displayString), x + 5, this.y + this.height, 0xffffff);
				}
				this.drawCenteredString(fontrenderer, "...", x + 6, this.y, 0xffffff);
				GlStateManager.popMatrix();

				this.mouseDragged(mc, mouseX, mouseY);
			}
		}

	}
}
