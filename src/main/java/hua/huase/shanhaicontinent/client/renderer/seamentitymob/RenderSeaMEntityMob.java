package hua.huase.shanhaicontinent.client.renderer.seamentitymob;

import hua.huase.shanhaicontinent.ExampleMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderSeaMEntityMob<T extends EntityLiving> extends RenderLiving<T> {

	private final ResourceLocation textureLoc;

	public RenderSeaMEntityMob(RenderManager manager, ModelBase modelBiped, float shadowSize, String textureName) {
		super(manager, modelBiped, shadowSize);
		this.addLayer(new LayerBipedArmor(this));

		if (textureName.startsWith("textures")) {
			textureLoc = new ResourceLocation(textureName);
		} else {
			textureLoc = new ResourceLocation(ExampleMod.MODID, "textures/models/seamentity/" + textureName + ".png");
		}
	}

	@Override
	protected ResourceLocation getEntityTexture(T entity) {
		return textureLoc;
	}
}
