package hua.huase.shanhaicontinent.client.model.seamentitymob;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelXvanGui extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer leg;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public ModelXvanGui() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0714F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 50, -8.0F, 4.9286F, -10.0F, 16, 3, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, 2.9286F, -12.0F, 20, 2, 24, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 26, -9.0F, 0.9286F, -11.0F, 18, 2, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 52, 53, -8.0F, -1.0714F, -10.0F, 16, 2, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 58, 26, -7.0F, -3.0714F, -9.0F, 14, 2, 18, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 64, 0, -5.0F, -5.0714F, -7.0F, 10, 2, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 73, -3.0F, -7.0714F, -5.0F, 6, 2, 10, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -10.0F);
		head.cubeList.add(new ModelBox(head, 0, 26, -3.0F, -2.0F, -5.0F, 6, 4, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 85, -4.0F, -3.0F, -10.0F, 8, 6, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 64, 16, -2.0F, -2.0F, -13.0F, 4, 4, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 13.0F, 9.5F);


		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail1);
		tail1.cubeList.add(new ModelBox(tail1, 0, 12, -3.0F, -2.0F, 0.0F, 6, 4, 6, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 0, 35, -2.0F, -2.0F, 6.0F, 4, 4, 6, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail3);
		tail3.cubeList.add(new ModelBox(tail3, 58, 26, -1.0F, -2.0F, 12.0F, 2, 4, 6, 0.0F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail4);
		tail4.cubeList.add(new ModelBox(tail4, 58, 36, -1.0F, -1.0F, 18.0F, 2, 2, 6, 0.0F, false));

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail5);
		tail5.cubeList.add(new ModelBox(tail5, 0, 18, 0.0F, -1.0F, 24.0F, 0, 2, 4, 0.0F, false));

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(0.0F, 0.0F, 0.5F);
		tail.addChild(tail6);
		tail6.cubeList.add(new ModelBox(tail6, 0, 0, -3.0F, -3.0F, 28.0F, 6, 6, 6, 0.0F, false));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);


		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-7.4F, -7.9F, -7.0F);
		leg.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 48, 94, -3.6F, -2.1F, -2.0F, 6, 3, 6, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 52, 57, -4.6F, -0.1F, -1.0F, 6, 3, 4, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 92, 46, -5.6F, 0.9F, -2.0F, 4, 3, 4, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 82, 94, -6.6F, 3.9F, -3.0F, 4, 2, 4, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 0, 85, -7.6F, 5.9F, -5.0F, 6, 2, 8, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(7.4F, -7.9F, -7.0F);
		leg.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 88, 16, -2.4F, -2.1F, -2.0F, 6, 3, 6, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 0, 57, -1.4F, -0.1F, -1.0F, 6, 3, 4, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 90, 75, 1.6F, 0.9F, -2.0F, 4, 3, 4, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 66, 94, 2.6F, 3.9F, -3.0F, 4, 2, 4, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 70, 75, 1.6F, 5.9F, -5.0F, 6, 2, 8, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-7.4F, -7.9F, 4.0F);
		leg.addChild(leg3);
		leg3.cubeList.add(new ModelBox(leg3, 78, 85, -3.6F, -2.1F, -2.0F, 6, 3, 6, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 52, 50, -4.6F, -0.1F, -1.0F, 6, 3, 4, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 76, 46, -5.6F, 0.9F, -2.0F, 4, 3, 4, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 52, 64, -6.6F, 3.9F, -3.0F, 4, 2, 4, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 42, 75, -7.6F, 5.9F, -5.0F, 6, 2, 8, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(7.4F, -7.9F, 5.0F);
		leg.addChild(leg4);
		leg4.cubeList.add(new ModelBox(leg4, 54, 85, -2.4F, -2.1F, -3.0F, 6, 3, 6, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 50, -1.4F, -0.1F, -2.0F, 6, 3, 4, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 62, 75, 1.6F, 0.9F, -3.0F, 4, 3, 4, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 64, 2.6F, 3.9F, -4.0F, 4, 2, 4, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 22, 73, 1.6F, 5.9F, -6.0F, 6, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		body.render(scale);
		head.render(scale);
		tail.render(scale);
		leg.render(scale);
	}

	/**
	 *  limbSing 系统tick
	 *  limbSwingAmout 运动总tick
	 * pitch = A * limbSwingAmout * cos(X*limbSwing + Y)
	 **/
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.head.rotateAngleX = (float) (Math.PI / 180) * headPitch;
		this.head.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw;

//		this.tail.rotateAngleX = (float) (Math.PI / 180) * headPitch * 0.5f;
//		this.tail.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw * 0.5f;

		this.tail1.rotateAngleY = MathHelper.cos((limbSwing + 0 )* 0.6662F+0) * limbSwingAmount * 0.75F;
		this.tail2.rotateAngleY = MathHelper.cos((limbSwing + 1 )* 0.6662F+0) * limbSwingAmount * 0.75F;
		this.tail3.rotateAngleY = MathHelper.cos((limbSwing + 2 )* 0.6662F+0) * limbSwingAmount * 0.75F;
		this.tail4.rotateAngleY = MathHelper.cos((limbSwing + 3 )* 0.6662F+0) * limbSwingAmount * 0.75F;
		this.tail5.rotateAngleY = MathHelper.cos((limbSwing + 4 )* 0.6662F+0) * limbSwingAmount * 0.75F;
		this.tail6.rotateAngleY = MathHelper.cos((limbSwing + 5 )* 0.6662F+0) * limbSwingAmount * 0.75F;


		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
		this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;

//        this.leftWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
//        this.rightWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
//		this.leftWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
//		this.rightWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
//		this.leftWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+ (float) Math.PI) * limbSwingAmount * 0.5F;
//		this.rightWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 0.5F;

//        this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 0.5F;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}