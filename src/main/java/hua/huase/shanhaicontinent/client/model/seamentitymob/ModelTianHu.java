package hua.huase.shanhaicontinent.client.model.seamentitymob;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelTianHu extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leg;
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leg3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leg4;
	private final ModelRenderer cube_r6;
	private final ModelRenderer tail;
	private final ModelRenderer tail1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer tail2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer tail3;
	private final ModelRenderer cube_r9;
	private final ModelRenderer tail4;
	private final ModelRenderer cube_r10;
	private final ModelRenderer tail6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer tail5;
	private final ModelRenderer cube_r12;
	private final ModelRenderer tail7;
	private final ModelRenderer cube_r13;
	private final ModelRenderer tail8;
	private final ModelRenderer cube_r14;
	private final ModelRenderer tail9;
	private final ModelRenderer cube_r15;

	public ModelTianHu() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.2966F, -1.9286F, -16.9583F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.2966F, -5.5013F, 32.1167F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 82, 50, 24.4738F, -8.5701F, -4.2034F, 5, 1, 9, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 16, 29.4738F, -9.5701F, -5.2034F, 9, 9, 11, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 51, 38.4738F, -8.5701F, -4.2034F, 6, 7, 9, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 87, 44.4738F, -7.5701F, -3.2034F, 3, 5, 7, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, 47.4738F, -6.5701F, -2.2034F, 3, 3, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 2, 50.4738F, -5.5701F, -1.2034F, 2, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 52.4738F, -5.5701F, -0.2034F, 1, 1, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.5466F, 0.1667F, -2.1488F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5466F, -7.5966F, 17.3071F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 75, -7.5262F, 6.4299F, -4.2034F, 4, 3, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -3.5262F, 6.4299F, -7.2034F, 12, 9, 15, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 38, 8.4738F, 5.4299F, -6.2034F, 12, 8, 13, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 20.4738F, 6.4299F, -7.2034F, 12, 11, 16, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 0, 27.4738F, 2.4299F, -4.2034F, 10, 4, 10, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 75, 29.4738F, -0.5701F, -3.2034F, 8, 3, 8, 0.0F, false));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-6.7034F, -13.8F, -11.8155F);
		leg.addChild(leg1);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.7034F, -17.6299F, 26.9738F);
		leg1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 60, 23.4738F, 29.4299F, -10.2034F, 7, 2, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, 25.4738F, 26.4299F, -9.2034F, 3, 3, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 33, 26.4738F, 23.4299F, -9.2034F, 3, 3, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 62, 24.4738F, 19.4299F, -8.2034F, 5, 4, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 51, 23.4738F, 17.4299F, -7.2034F, 5, 2, 5, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-6.7034F, -15.2F, 10.5845F);
		leg.addChild(leg2);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.7034F, -16.2299F, 4.5738F);
		leg2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 60, -0.5262F, 29.4299F, -10.2034F, 7, 2, 5, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, 1.4738F, 24.4299F, -9.2034F, 3, 5, 3, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 33, 3.4738F, 21.4299F, -9.2034F, 3, 3, 3, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 90, 62, 3.4738F, 17.4299F, -8.2034F, 5, 4, 5, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 51, 3.4738F, 15.4299F, -7.2034F, 5, 2, 5, 0.0F, true));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(8.2966F, -13.8F, -11.8155F);
		leg.addChild(leg3);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-8.2966F, -17.6299F, 26.9738F);
		leg3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 60, 23.4738F, 29.4299F, 6.7966F, 7, 2, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, 25.4738F, 26.4299F, 7.7966F, 3, 3, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 33, 26.4738F, 23.4299F, 7.7966F, 3, 3, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 90, 62, 24.4738F, 19.4299F, 4.7966F, 5, 4, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 51, 23.4738F, 17.4299F, 3.7966F, 5, 2, 5, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(6.5131F, -15.2F, 12.368F);
		leg.addChild(leg4);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.5131F, -16.2299F, 2.7903F);
		leg4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 70, 60, -2.3097F, 29.4299F, 5.0131F, 7, 2, 5, 0.0F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, -0.3097F, 24.4299F, 6.0131F, 3, 5, 3, 0.0F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, 1.6903F, 21.4299F, 6.0131F, 3, 3, 3, 0.0F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 62, 1.6903F, 17.4299F, 3.0131F, 5, 4, 5, 0.0F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 51, 1.6903F, 15.4299F, 2.0131F, 5, 2, 5, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(-6.2034F, -42.3571F, 38.1131F);
		tail.addChild(tail1);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(6.2034F, 10.9272F, -22.9548F);
		tail1.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.5708F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 0, -13.5262F, -27.5701F, -7.2034F, 4, 0, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 36, -17.5262F, -28.5701F, -7.2034F, 4, 2, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 70, 0, -23.5262F, -28.5701F, -8.2034F, 6, 2, 4, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 86, -29.5262F, -29.5701F, -9.2034F, 6, 4, 6, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 83, -35.5262F, -28.5701F, -9.2034F, 6, 6, 6, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 28, -41.5262F, -25.5701F, -10.2034F, 6, 6, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 59, -45.5262F, -19.5701F, -10.2034F, 6, 8, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 59, -39.5262F, -12.5701F, -10.2034F, 6, 8, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 67, -33.5262F, -6.5701F, -10.2034F, 6, 8, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 70, 67, -27.5262F, -1.5701F, -10.2034F, 6, 8, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 6, -21.5262F, 1.4299F, -10.2034F, 6, 8, 8, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 83, -15.5262F, 4.4299F, -9.2034F, 6, 6, 6, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -9.5262F, 6.4299F, -8.2034F, 4, 4, 4, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 59, -5.5262F, 7.4299F, -7.2034F, 4, 2, 2, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(7.4676F, -44.26F, 33.9643F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.0F, 0.0F, 0.2182F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.4447F, 14.7716F, -33.8059F);
		tail2.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.525F, 1.3963F, 1.3761F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -26.2308F, -24.5215F, 5.8652F, 4, 0, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 36, -30.2308F, -25.5215F, 5.8652F, 4, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 0, -36.2308F, -25.5215F, 4.8652F, 6, 2, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 86, -42.2308F, -26.5215F, 3.8652F, 6, 4, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 83, -48.2308F, -25.5215F, 3.8652F, 6, 6, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 78, 28, -54.2308F, -22.5215F, 2.8652F, 6, 6, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 59, -58.2308F, -16.5215F, 2.8652F, 6, 8, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 59, -52.2308F, -9.5215F, 2.8652F, 6, 8, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 67, -46.2308F, -3.5215F, 2.8652F, 6, 8, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 67, -40.2308F, 1.4785F, 2.8652F, 6, 8, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 6, -34.2308F, 4.4785F, 2.8652F, 6, 8, 8, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 83, -28.2308F, 7.4785F, 3.8652F, 6, 6, 6, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -22.2308F, 9.4785F, 4.8652F, 4, 4, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 59, -18.2308F, 10.4785F, 5.8652F, 4, 2, 2, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(7.5156F, -34.7238F, 39.8586F);
		tail.addChild(tail3);
		setRotationAngle(tail3, 0.0F, 0.48F, -0.2618F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.8936F, 0.484F, -41.8865F);
		tail3.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.4702F, 1.3088F, -1.424F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 0, -31.0901F, -27.702F, -4.8203F, 4, 0, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 36, -35.0901F, -28.702F, -4.8203F, 4, 2, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 0, -41.0901F, -28.702F, -5.8203F, 6, 2, 4, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 86, -47.0901F, -29.702F, -6.8203F, 6, 4, 6, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 83, -53.0901F, -28.702F, -6.8203F, 6, 6, 6, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 28, -59.0901F, -25.702F, -7.8203F, 6, 6, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 59, -63.0901F, -19.702F, -7.8203F, 6, 8, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 59, -57.0901F, -12.702F, -7.8203F, 6, 8, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 67, -51.0901F, -6.702F, -7.8203F, 6, 8, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 67, -45.0901F, -1.702F, -7.8203F, 6, 8, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 74, 6, -39.0901F, 1.298F, -7.8203F, 6, 8, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 83, -33.0901F, 4.298F, -6.8203F, 6, 6, 6, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -27.0901F, 6.298F, -5.8203F, 4, 4, 4, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 59, -23.0901F, 7.298F, -4.8203F, 4, 2, 2, 0.0F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(1.7692F, -32.3795F, 48.446F);
		tail.addChild(tail4);
		setRotationAngle(tail4, 0.211F, 0.1091F, -0.6014F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.2289F, -8.9733F, -47.4171F);
		tail4.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.3563F, 0.9245F, -1.1705F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 0, -33.9244F, -37.1153F, 4.9386F, 4, 0, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 36, -37.9244F, -38.1153F, 4.9386F, 4, 2, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 0, -43.9244F, -38.1153F, 3.9386F, 6, 2, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 86, -49.9244F, -39.1153F, 2.9386F, 6, 4, 6, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 83, -55.9244F, -38.1153F, 2.9386F, 6, 6, 6, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 28, -61.9244F, -35.1153F, 1.9386F, 6, 6, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 59, -65.9244F, -29.1153F, 1.9386F, 6, 8, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 59, -59.9244F, -22.1153F, 1.9386F, 6, 8, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 67, -53.9244F, -16.1153F, 1.9386F, 6, 8, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 67, -47.9244F, -11.1153F, 1.9386F, 6, 8, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 6, -41.9244F, -8.1153F, 1.9386F, 6, 8, 8, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 83, -35.9244F, -5.1153F, 2.9386F, 6, 6, 6, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -29.9244F, -3.1153F, 3.9386F, 4, 4, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 59, -25.9244F, -2.1153F, 4.9386F, 4, 2, 2, 0.0F, false));

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(-13.9004F, -38.9198F, 47.015F);
		tail.addChild(tail6);
		setRotationAngle(tail6, 0.2395F, -0.9156F, -0.6042F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-19.8912F, 6.4654F, -40.2556F);
		tail6.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.2331F, 1.4225F, -0.7627F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 0, -27.6006F, -36.8375F, 15.7028F, 4, 0, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 36, -31.6006F, -37.8375F, 15.7028F, 4, 2, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 0, -37.6006F, -37.8375F, 14.7028F, 6, 2, 4, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 86, -43.6006F, -38.8375F, 13.7028F, 6, 4, 6, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 83, -49.6006F, -37.8375F, 13.7028F, 6, 6, 6, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 78, 28, -55.6006F, -34.8375F, 12.7028F, 6, 6, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 59, -59.6006F, -28.8375F, 12.7028F, 6, 8, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 59, -53.6006F, -21.8375F, 12.7028F, 6, 8, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 67, -47.6006F, -15.8375F, 12.7028F, 6, 8, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 70, 67, -41.6006F, -10.8375F, 12.7028F, 6, 8, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 6, -35.6006F, -7.8375F, 12.7028F, 6, 8, 8, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 72, 83, -29.6006F, -4.8375F, 13.7028F, 6, 6, 6, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -23.6006F, -2.8375F, 14.7028F, 4, 4, 4, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 59, -19.6006F, -1.8375F, 15.7028F, 4, 2, 2, 0.0F, false));

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(-7.2436F, -33.3558F, 47.51F);
		tail.addChild(tail5);
		setRotationAngle(tail5, 0.2328F, -0.4449F, -0.7264F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-9.4943F, -2.8481F, -45.1622F);
		tail5.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.4332F, 1.1121F, -0.8961F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 0, -29.425F, -38.4797F, 11.3055F, 4, 0, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 36, -33.425F, -39.4797F, 11.3055F, 4, 2, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 0, -39.425F, -39.4797F, 10.3055F, 6, 2, 4, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 86, -45.425F, -40.4797F, 9.3055F, 6, 4, 6, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 83, -51.425F, -39.4797F, 9.3055F, 6, 6, 6, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 78, 28, -57.425F, -36.4797F, 8.3055F, 6, 6, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 59, -61.425F, -30.4797F, 8.3055F, 6, 8, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 59, -55.425F, -23.4797F, 8.3055F, 6, 8, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 67, -49.425F, -17.4797F, 8.3055F, 6, 8, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 67, -43.425F, -12.4797F, 8.3055F, 6, 8, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 74, 6, -37.425F, -9.4797F, 8.3055F, 6, 8, 8, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 83, -31.425F, -6.4797F, 9.3055F, 6, 6, 6, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -25.425F, -4.4797F, 10.3055F, 4, 4, 4, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 59, -21.425F, -3.4797F, 11.3055F, 4, 2, 2, 0.0F, false));

		tail7 = new ModelRenderer(this);
		tail7.setRotationPoint(9.3076F, -42.3571F, 33.7788F);
		tail.addChild(tail7);
		setRotationAngle(tail7, 0.0F, 0.9599F, 0.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(11.6285F, 10.9272F, -35.4395F);
		tail7.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 1.5708F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 0, -26.0109F, -27.5701F, -12.6285F, 4, 0, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 36, -30.0109F, -28.5701F, -12.6285F, 4, 2, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 0, -36.0109F, -28.5701F, -13.6285F, 6, 2, 4, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 86, -42.0109F, -29.5701F, -14.6285F, 6, 4, 6, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 83, -48.0109F, -28.5701F, -14.6285F, 6, 6, 6, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 78, 28, -54.0109F, -25.5701F, -15.6285F, 6, 6, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 59, -58.0109F, -19.5701F, -15.6285F, 6, 8, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 59, -52.0109F, -12.5701F, -15.6285F, 6, 8, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 67, -46.0109F, -6.5701F, -15.6285F, 6, 8, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 67, -40.0109F, -1.5701F, -15.6285F, 6, 8, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 6, -34.0109F, 1.4299F, -15.6285F, 6, 8, 8, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 83, -28.0109F, 4.4299F, -14.6285F, 6, 6, 6, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -22.0109F, 6.4299F, -13.6285F, 4, 4, 4, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 59, -18.0109F, 7.4299F, -12.6285F, 4, 2, 2, 0.0F, false));

		tail8 = new ModelRenderer(this);
		tail8.setRotationPoint(-13.1155F, -42.3571F, 37.1926F);
		tail.addChild(tail8);
		setRotationAngle(tail8, 0.0F, -1.3963F, 0.0F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-17.5896F, 10.9272F, -28.4006F);
		tail8.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 1.5708F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 0, -18.972F, -27.5701F, 16.5896F, 4, 0, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 36, -22.972F, -28.5701F, 16.5896F, 4, 2, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 0, -28.972F, -28.5701F, 15.5896F, 6, 2, 4, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 86, -34.972F, -29.5701F, 14.5896F, 6, 4, 6, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 83, -40.972F, -28.5701F, 14.5896F, 6, 6, 6, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 78, 28, -46.972F, -25.5701F, 13.5896F, 6, 6, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 59, -50.972F, -19.5701F, 13.5896F, 6, 8, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 59, -44.972F, -12.5701F, 13.5896F, 6, 8, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 67, -38.972F, -6.5701F, 13.5896F, 6, 8, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 67, -32.972F, -1.5701F, 13.5896F, 6, 8, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 6, -26.972F, 1.4299F, 13.5896F, 6, 8, 8, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 83, -20.972F, 4.4299F, 14.5896F, 6, 6, 6, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -14.972F, 6.4299F, 15.5896F, 4, 4, 4, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 59, -10.972F, 7.4299F, 16.5896F, 4, 2, 2, 0.0F, false));

		tail9 = new ModelRenderer(this);
		tail9.setRotationPoint(16.8766F, -23.2754F, 41.7957F);
		tail.addChild(tail9);
		setRotationAngle(tail9, -0.8301F, 0.4889F, -1.0483F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(13.2116F, 4.3906F, -47.1805F);
		tail9.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.3969F, 0.9102F, -0.7192F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 0, -32.151F, -41.7511F, -8.7806F, 4, 0, 2, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 36, -36.151F, -42.7511F, -8.7806F, 4, 2, 2, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 70, 0, -42.151F, -42.7511F, -9.7806F, 6, 2, 4, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 86, -48.151F, -43.7511F, -10.7806F, 6, 4, 6, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 83, -54.151F, -42.7511F, -10.7806F, 6, 6, 6, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 28, -60.151F, -39.7511F, -11.7806F, 6, 6, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 59, -64.151F, -33.7511F, -11.7806F, 6, 8, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 59, -58.151F, -26.7511F, -11.7806F, 6, 8, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 67, -52.151F, -20.7511F, -11.7806F, 6, 8, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 70, 67, -46.151F, -15.7511F, -11.7806F, 6, 8, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 74, 6, -40.151F, -12.7511F, -11.7806F, 6, 8, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 83, -34.151F, -9.7511F, -10.7806F, 6, 6, 6, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -28.151F, -7.7511F, -9.7806F, 4, 4, 4, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 59, -24.151F, -6.7511F, -8.7806F, 4, 2, 2, 0.0F, false));
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	/**
	 *  limbSing 系统tick
	 *  limbSwingAmout 运动总tick
	 * pitch = A * limbSwingAmout * cos(X*limbSwing + Y)
	 **/
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
	{
		this.head.rotateAngleX = (float) (Math.PI / 180) * headPitch;
		this.head.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw;

		this.tail.rotateAngleX = (float) (Math.PI / 180) * headPitch * 0.5f;
		this.tail.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw * 0.5f;

		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
		this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;

//        this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 0.5F;
	}
}