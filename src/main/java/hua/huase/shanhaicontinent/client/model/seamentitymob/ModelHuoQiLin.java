package hua.huase.shanhaicontinent.client.model.seamentitymob;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelHuoQiLin extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer bone5;
	private final ModelRenderer body;
	private final ModelRenderer leg;
	private final ModelRenderer leg1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer leg2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer leg3;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer leg4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer tail;
	private final ModelRenderer bone4;

	public ModelHuoQiLin() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.1667F, -10.75F);
		head.cubeList.add(new ModelBox(head, 40, 53, -2.0F, -3.1667F, -9.25F, 4, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 75, 0, -2.0F, -5.1667F, -9.25F, 4, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 71, 73, -1.0F, -6.1667F, -8.25F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 63, -3.0F, -7.1667F, -5.25F, 6, 6, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 48, -4.0F, -6.1667F, -4.25F, 8, 7, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 34, 0, -3.0F, 0.8333F, -3.25F, 6, 2, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.2778F, -7.1667F, 5.0833F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 58, 64, -1.2778F, -1.0F, -6.3333F, 2, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 5, 36, -1.2778F, -2.0F, -4.3333F, 2, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 58, 20, -1.2778F, -4.0F, -2.3333F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 35, -1.2778F, -5.0F, -0.3333F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 3, -1.2778F, -7.0F, 0.6667F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 32, -1.2778F, -8.0F, 1.6667F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 53, -1.2778F, -9.0F, 3.6667F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 53, -0.2778F, -7.0F, -0.3333F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 0, 0.7222F, -8.0F, -1.3333F, 1, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.2778F, -7.1667F, 5.0833F);
		head.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 58, 64, -0.7222F, -1.0F, -6.3333F, 2, 1, 3, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 5, 36, -0.7222F, -2.0F, -4.3333F, 2, 1, 3, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 58, 20, -0.7222F, -4.0F, -2.3333F, 2, 2, 2, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 60, 35, -0.7222F, -5.0F, -0.3333F, 2, 2, 1, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 52, 3, -0.7222F, -7.0F, 0.6667F, 2, 2, 1, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 60, 32, -0.7222F, -8.0F, 1.6667F, 2, 1, 2, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 24, 53, -0.7222F, -9.0F, 3.6667F, 2, 1, 2, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 0, 53, -1.7222F, -7.0F, -0.3333F, 2, 1, 2, 0.0F, true));
		bone5.cubeList.add(new ModelBox(bone5, 52, 0, -1.7222F, -8.0F, -1.3333F, 1, 1, 2, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 3.0F);
		body.cubeList.add(new ModelBox(body, 0, 24, -4.0F, -1.0F, -16.0F, 8, 8, 16, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -2.0F, 0.0F, 10, 10, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 53, -2.0F, -4.0F, -10.0F, 4, 3, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 36, 38, -3.0F, -5.0F, 0.0F, 6, 3, 12, 0.0F, false));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(5.0F, -17.0F, -7.0F);
		leg.addChild(leg1);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-5.0F, 12.0F, 7.0F);
		leg1.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 60, 32, 4.0F, -17.0F, -11.0F, 2, 8, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 16, 75, 4.0F, -19.0F, -8.0F, 2, 2, 6, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 4.0F, -21.0F, -5.0F, 2, 2, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 34, 8, 4.0F, -23.0F, -2.0F, 2, 2, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 48, 4.0F, -26.0F, 1.0F, 2, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 75, 3.0F, -9.0F, -10.0F, 4, 4, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 32, 3.0F, -5.0F, -9.0F, 4, 4, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 53, 2.0F, -1.0F, -11.0F, 6, 4, 7, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-5.0F, 12.0F, 16.0F);
		leg1.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 42, 65, 5.0F, -17.0F, -12.0F, 0, 7, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 3, 5.0F, -19.0F, -11.0F, 0, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 0, 5.0F, -21.0F, -9.0F, 0, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 5.0F, -23.0F, -7.0F, 0, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 5, 5.0F, -26.0F, -6.0F, 0, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 42, 8, 4.0F, -9.0F, -15.0F, 2, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 34, 0, 4.0F, -5.0F, -14.0F, 2, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 48, 20, 3.0F, -1.0F, -13.0F, 4, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 8, 5.0F, -9.0F, -14.0F, 0, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 8, 5.0F, -5.0F, -13.0F, 0, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 9, 0, 5.0F, -1.0F, -12.0F, 0, 3, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, -17.0F, -7.0F);
		leg.addChild(leg2);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.0F, 12.0F, 7.0F);
		leg2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 60, 32, -6.0F, -17.0F, -11.0F, 2, 8, 8, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 16, 75, -6.0F, -19.0F, -8.0F, 2, 2, 6, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -6.0F, -21.0F, -5.0F, 2, 2, 5, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 34, 8, -6.0F, -23.0F, -2.0F, 2, 2, 4, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 0, 48, -6.0F, -26.0F, 1.0F, 2, 3, 2, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 0, 75, -7.0F, -9.0F, -10.0F, 4, 4, 4, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 72, 32, -7.0F, -5.0F, -9.0F, 4, 4, 4, 0.0F, true));
		bone6.cubeList.add(new ModelBox(bone6, 50, 53, -8.0F, -1.0F, -11.0F, 6, 4, 7, 0.0F, true));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.0F, 12.0F, 16.0F);
		leg2.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 42, 65, -5.0F, -17.0F, -12.0F, 0, 7, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 0, 3, -5.0F, -19.0F, -11.0F, 0, 1, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 2, 0, -5.0F, -21.0F, -9.0F, 0, 1, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -5.0F, -23.0F, -7.0F, 0, 1, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 0, 5, -5.0F, -26.0F, -6.0F, 0, 2, 2, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 42, 8, -6.0F, -9.0F, -15.0F, 2, 3, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 34, 0, -6.0F, -5.0F, -14.0F, 2, 3, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 48, 20, -7.0F, -1.0F, -13.0F, 4, 3, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 2, 8, -5.0F, -9.0F, -14.0F, 0, 2, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 0, 8, -5.0F, -5.0F, -13.0F, 0, 2, 1, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 9, 0, -5.0F, -1.0F, -12.0F, 0, 3, 1, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(5.0F, -18.0F, 10.0F);
		leg.addChild(leg3);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-4.0F, 13.0F, -10.0F);
		leg3.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 60, 32, 4.0F, -17.0F, 5.0F, 2, 8, 8, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 75, 4.0F, -19.0F, 8.0F, 2, 2, 6, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 4.0F, -21.0F, 11.0F, 2, 2, 5, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 34, 8, 4.0F, -23.0F, 14.0F, 2, 2, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 48, 4.0F, -26.0F, 17.0F, 2, 3, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 75, 3.0F, -9.0F, 6.0F, 4, 4, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 72, 32, 3.0F, -5.0F, 7.0F, 4, 4, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 50, 53, 2.0F, -1.0F, 5.0F, 6, 4, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-4.0F, 13.0F, -1.0F);
		leg3.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 42, 65, 5.0F, -17.0F, 4.0F, 0, 7, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 3, 5.0F, -19.0F, 5.0F, 0, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 0, 5.0F, -21.0F, 7.0F, 0, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, 5.0F, -23.0F, 9.0F, 0, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 5, 5.0F, -26.0F, 10.0F, 0, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 42, 8, 4.0F, -9.0F, 1.0F, 2, 3, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 34, 0, 4.0F, -5.0F, 2.0F, 2, 3, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 48, 20, 3.0F, -1.0F, 3.0F, 4, 3, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 8, 5.0F, -9.0F, 2.0F, 0, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 8, 5.0F, -5.0F, 3.0F, 0, 2, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 9, 0, 5.0F, -1.0F, 4.0F, 0, 3, 1, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-5.0F, -17.0F, 9.0F);
		leg.addChild(leg4);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(4.0F, 12.0F, -9.0F);
		leg4.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 60, 32, -6.0F, -17.0F, 5.0F, 2, 8, 8, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 16, 75, -6.0F, -19.0F, 8.0F, 2, 2, 6, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -6.0F, -21.0F, 11.0F, 2, 2, 5, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 34, 8, -6.0F, -23.0F, 14.0F, 2, 2, 4, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 0, 48, -6.0F, -26.0F, 17.0F, 2, 3, 2, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 0, 75, -7.0F, -9.0F, 6.0F, 4, 4, 4, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 72, 32, -7.0F, -5.0F, 7.0F, 4, 4, 4, 0.0F, true));
		bone10.cubeList.add(new ModelBox(bone10, 50, 53, -8.0F, -1.0F, 5.0F, 6, 4, 7, 0.0F, true));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(4.0F, 12.0F, 0.0F);
		leg4.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 42, 65, -5.0F, -17.0F, 4.0F, 0, 7, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 0, 3, -5.0F, -19.0F, 5.0F, 0, 1, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 2, 0, -5.0F, -21.0F, 7.0F, 0, 1, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, -5.0F, -23.0F, 9.0F, 0, 1, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 0, 5, -5.0F, -26.0F, 10.0F, 0, 2, 2, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 42, 8, -6.0F, -9.0F, 1.0F, 2, 3, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 34, 0, -6.0F, -5.0F, 2.0F, 2, 3, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 48, 20, -7.0F, -1.0F, 3.0F, 4, 3, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 2, 8, -5.0F, -9.0F, 2.0F, 0, 2, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 0, 8, -5.0F, -5.0F, 3.0F, 0, 2, 1, 0.0F, true));
		bone11.cubeList.add(new ModelBox(bone11, 9, 0, -5.0F, -1.0F, 4.0F, 0, 3, 1, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 5.3F, 16.7F);
		tail.cubeList.add(new ModelBox(tail, 60, 20, -3.0F, -2.3F, 0.3F, 6, 6, 6, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 45, 64, -2.0F, 0.7F, 6.3F, 4, 6, 5, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 24, 66, -2.0F, 4.7F, 11.3F, 4, 4, 5, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 63, 64, -2.0F, 8.7F, 16.3F, 4, 4, 5, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 62, 0, -2.0F, 10.7F, 21.3F, 4, 5, 5, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 69, 49, -2.0F, 6.7F, 26.3F, 4, 6, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 59, 73, -2.0F, 3.7F, 30.3F, 4, 5, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 24, -2.0F, -2.3F, 34.3F, 4, 8, 4, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 48, 0, -1.0F, -6.3F, 32.3F, 2, 10, 10, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 32, 10, 0.0F, -8.3F, 30.3F, 0, 14, 14, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 13.7F, -16.7F);
		tail.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 72, 10, -2.0F, -18.0F, 17.0F, 4, 2, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 7, -1.0F, -15.0F, 23.0F, 2, 2, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 38, 75, -1.0F, -10.0F, 28.0F, 2, 1, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 26, 75, -1.0F, -6.0F, 33.0F, 2, 1, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 24, 48, -1.0F, -4.0F, 38.0F, 2, 1, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 40, 58, -1.0F, -9.0F, 44.0F, 2, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 32, 0.0F, -20.0F, 17.0F, 0, 2, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 8, 4, 0.0F, -17.0F, 23.0F, 0, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 10, 0.0F, -11.0F, 28.0F, 0, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 8, 7, 0.0F, -7.0F, 33.0F, 0, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 8, 6, 0.0F, -5.0F, 38.0F, 0, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -11.0F, 45.0F, 0, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		head.render(scale);
		body.render(scale);
		leg.render(scale);
		tail.render(scale);
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

		this.tail.rotateAngleY = MathHelper.cos((limbSwing + 0 )* 0.6662F+0) * limbSwingAmount * 0.75F;


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