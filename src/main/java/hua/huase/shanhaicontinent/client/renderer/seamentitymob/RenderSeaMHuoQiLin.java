package hua.huase.shanhaicontinent.client.renderer.seamentitymob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.NIANLING;

public class RenderSeaMHuoQiLin extends RenderSeaMEntityMob<EntityLiving> {
	public RenderSeaMHuoQiLin(RenderManager manager, ModelBase modelBiped, String textureName) {
		super(manager, modelBiped, 1, textureName);
	}

	@Override
	protected void preRenderCallback(EntityLiving living, float partialTicks) {
		if(living.getEntityAttribute(NIANLING) != null ){
			int nianxian = (int) living.getEntityAttribute(NIANLING).getBaseValue();
			if(nianxian>0){
				float scale = (float) (1.0F+Math.log10(nianxian)*0.5);
				GlStateManager.scale(scale, scale, scale);
			}
		}
	}
}
