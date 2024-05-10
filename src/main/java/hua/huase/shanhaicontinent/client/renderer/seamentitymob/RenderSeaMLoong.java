package hua.huase.shanhaicontinent.client.renderer.seamentitymob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;

public class RenderSeaMLoong extends RenderSeaMEntityMob<EntityLiving> {
	public RenderSeaMLoong(RenderManager manager, ModelBase modelBiped, String textureName) {
		super(manager, modelBiped, 1, textureName);
	}

	@Override
	protected void preRenderCallback(EntityLiving living, float partialTicks) {

		float scale = (float) (1.0F+1.0F);
		GlStateManager.scale(scale, scale, scale);
//		if(living.getEntityAttribute(NIANLING) != null ){
//			int nianxian = (int) living.getEntityAttribute(NIANLING).getBaseValue();
//			if(nianxian>0){
//				float scale = (float) (1.0F+Math.log10(nianxian)*0.5);
////				float scale = (float) (1.0F+18.0F);
//				GlStateManager.scale(scale, scale, scale);
//			}
//		}
	}
}
