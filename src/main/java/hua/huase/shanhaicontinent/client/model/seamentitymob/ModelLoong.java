package hua.huase.shanhaicontinent.client.model.seamentitymob;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;


public class ModelLoong extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer leg;
	private final ModelRenderer rearLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer frontLeg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer body8;
	private final ModelRenderer body9;
	private final ModelRenderer body10;
	private final ModelRenderer body11;
	private final ModelRenderer body12;
	private final ModelRenderer body13;
	private final ModelRenderer body14;
	private final ModelRenderer body15;
	private final ModelRenderer body16;
	private final ModelRenderer body17;
	private final ModelRenderer body18;
	private final ModelRenderer body19;
	private final ModelRenderer body20;
	private final ModelRenderer body21;
	private final ModelRenderer body22;
	private final ModelRenderer body23;
	private final ModelRenderer body24;
	private final ModelRenderer body25;
	private final ModelRenderer body26;
	private final ModelRenderer body27;
	private final ModelRenderer body28;
	private final ModelRenderer tail;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public ModelLoong() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 4.0F, -147.0F);
		head.cubeList.add(new ModelBox(head, 73, 74, -5.5F, -5.0F, 88.0F, 11, 11, 9, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 21.0F, 147.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 46, -6.0F, -25.0F, -64.0F, 11, 3, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 143, 87, -5.0F, -24.0F, -68.0F, 9, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 37, 83, -5.0F, -23.0F, -72.0F, 9, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 135, -2.0F, -21.0F, -70.0F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 103, 128, 0.0F, -21.0F, -70.0F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 185, 1.0F, -26.0F, -64.0F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 182, 184, -4.0F, -26.0F, -64.0F, 2, 1, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 139, 185, 2.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 134, 185, 2.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 185, 115, 1.0F, -22.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 113, 185, 1.0F, -22.5F, -65.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 108, 185, 1.0F, -22.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 103, 185, 1.0F, -22.5F, -65.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 98, 185, 2.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 93, 185, 2.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 88, 185, -3.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 59, -3.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 56, -2.0F, -22.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 43, -2.0F, -22.5F, -65.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 28, -3.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 7, 185, -3.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 3, -2.0F, -22.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 185, 0, -2.0F, -22.5F, -65.0F, 1, 1, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 3.0F, 0.0F);
		bone.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 184, 160, 1.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 157, 184, 1.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 183, 172, 0.0F, -20.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 183, 112, 0.0F, -20.5F, -65.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 183, 105, 1.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 183, 83, 1.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 177, 103, 0.0F, -20.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 175, 123, 0.0F, -20.5F, -65.0F, 1, 1, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-1.0F, 3.0F, 0.0F);
		bone.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 173, 145, -2.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 173, 90, -2.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 150, 172, -1.0F, -20.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 12, 171, -1.0F, -20.5F, -65.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 116, 170, -2.0F, -22.5F, -61.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 107, 170, -2.0F, -22.5F, -63.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 98, 170, -1.0F, -20.5F, -67.0F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 89, 170, -1.0F, -20.5F, -65.0F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, 26.0F, 147.0F);
		head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 119, 19, -5.0F, -24.0F, -64.0F, 9, 3, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 148, 94, -4.0F, -22.0F, -68.0F, 7, 2, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 143, 121, -4.0F, -21.0F, -72.0F, 7, 2, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 66, 170, 0.0F, -21.5F, -70.0F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 57, 170, -2.0F, -21.5F, -70.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.5F, 20.0F, 147.0F);
		head.addChild(bone6);


		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 110, 175, 1.0F, -27.0F, -58.0F, 1, 3, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 29, 175, 1.0F, -29.0F, -57.0F, 1, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 22, 175, 2.0F, -31.0F, -56.0F, 1, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 169, 174, 2.0F, -33.0F, -55.0F, 1, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 162, 174, 3.0F, -35.0F, -54.0F, 1, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 103, 175, 3.0F, -36.0F, -53.0F, 1, 3, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone6.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 178, 0, 1.0F, -26.0F, -58.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 176, 177, 1.0F, -28.0F, -57.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 177, 158, 2.0F, -30.0F, -56.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 149, 177, 2.0F, -32.0F, -55.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 142, 177, 3.0F, -34.0F, -54.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 184, 140, 3.0F, -35.0F, -53.0F, 1, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone6.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 177, 126, 1.0F, -26.0F, -58.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 177, 98, 1.0F, -28.0F, -57.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 14, 177, 2.0F, -30.0F, -56.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 172, 2.0F, -32.0F, -55.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 176, 153, 3.0F, -34.0F, -54.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 184, 129, 3.0F, -35.0F, -53.0F, 1, 1, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.5F, 20.0F, 147.0F);
		head.addChild(bone7);


		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 96, 175, -2.0F, -27.0F, -58.0F, 1, 3, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 135, 174, -2.0F, -29.0F, -57.0F, 1, 4, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 174, -3.0F, -31.0F, -56.0F, 1, 4, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 128, 173, -3.0F, -33.0F, -55.0F, 1, 4, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 17, 150, -4.0F, -35.0F, -54.0F, 1, 4, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 89, 175, -4.0F, -36.0F, -53.0F, 1, 3, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone7.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 117, 176, -2.0F, -26.0F, -58.0F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 176, 37, -2.0F, -28.0F, -57.0F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 7, 176, -3.0F, -30.0F, -56.0F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 175, 165, -3.0F, -32.0F, -55.0F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 175, 72, -4.0F, -34.0F, -54.0F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 127, 184, -4.0F, -35.0F, -53.0F, 1, 1, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone7.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 175, 32, -2.0F, -26.0F, -58.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 175, 8, -2.0F, -28.0F, -57.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 174, 148, -3.0F, -30.0F, -56.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 174, 133, -3.0F, -32.0F, -55.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 29, 140, -4.0F, -34.0F, -54.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 184, 125, -4.0F, -35.0F, -53.0F, 1, 1, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.5F, 9.0F, 147.0F);
		head.addChild(bone15);


		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 173, 93, 5.0F, -9.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 75, 173, 6.0F, -9.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 173, 21, 7.0F, -9.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 184, 90, 8.0F, -9.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 184, 86, 9.0F, -9.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 74, 184, 10.0F, -9.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 48, 170, 11.0F, -9.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 39, 170, 12.0F, -9.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 30, 170, 13.0F, -9.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 63, 184, 14.0F, -9.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 184, 20, 15.0F, -9.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 153, 172, 16.0F, -9.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 165, 18, 17.0F, -9.0F, -37.0F, 1, 1, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 144, 172, 5.0F, -11.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 140, 6.0F, -11.0F, -54.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 114, 7.0F, -11.0F, -52.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 184, 15, 8.0F, -11.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 135, 9.0F, -12.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 120, 183, 10.0F, -12.0F, -48.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 166, 169, 11.0F, -12.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 168, 140, 12.0F, -12.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 135, 168, 13.0F, -13.0F, -44.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 108, 14.0F, -13.0F, -43.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 81, 183, 15.0F, -13.0F, -41.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 108, 16.0F, -13.0F, -39.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 7, 165, 17.0F, -14.0F, -36.0F, 1, 1, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 85, 5.0F, -13.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 79, 6.0F, -13.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 58, 7.0F, -14.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 79, 8.0F, -14.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 56, 183, 9.0F, -15.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 52, 10.0F, -15.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 151, 167, 11.0F, -16.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 166, 88, 12.0F, -16.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 165, 135, 13.0F, -17.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 49, 183, 14.0F, -17.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 42, 183, 15.0F, -18.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 51, 16.0F, -18.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 164, 111, 17.0F, -19.0F, -37.0F, 1, 1, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 45, 5.0F, -7.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 172, 15, 6.0F, -7.0F, -54.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 15, 172, 7.0F, -7.0F, -52.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 39, 8.0F, -7.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 35, 183, 9.0F, -6.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 183, 10, 10.0F, -6.0F, -48.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 111, 165, 11.0F, -6.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 102, 165, 12.0F, -6.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 92, 165, 13.0F, -5.0F, -44.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 175, 182, 14.0F, -5.0F, -43.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 182, 156, 15.0F, -5.0F, -41.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 171, 128, 16.0F, -5.0F, -39.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 164, 105, 17.0F, -4.0F, -36.0F, 1, 1, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 119, 171, 5.0F, -5.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 171, 103, 6.0F, -5.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 6, 171, 7.0F, -4.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 150, 182, 8.0F, -4.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 143, 182, 9.0F, -3.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 182, 101, 10.0F, -3.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 165, 0, 11.0F, -2.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 68, 162, 12.0F, -2.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 59, 162, 13.0F, -1.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 182, 96, 14.0F, -1.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 182, 73, 15.0F, 0.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 170, 160, 16.0F, 0.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 85, 164, 17.0F, 1.0F, -37.0F, 1, 1, 4, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 170, 155, -6.0F, -9.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 110, 170, -7.0F, -9.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 101, 170, -8.0F, -9.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 69, 182, -9.0F, -9.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 28, 182, -10.0F, -9.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 21, 182, -11.0F, -9.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 50, 162, -12.0F, -9.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 41, 162, -13.0F, -9.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 32, 162, -14.0F, -9.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 14, 182, -15.0F, -9.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 180, -16.0F, -9.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 92, 170, -17.0F, -9.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 163, 163, -18.0F, -9.0F, -37.0F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 83, 170, -6.0F, -11.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 69, 170, -7.0F, -11.0F, -54.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 60, 170, -8.0F, -11.0F, -52.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 175, -9.0F, -11.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 168, 181, -10.0F, -12.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 161, 181, -11.0F, -12.0F, -48.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 161, 145, -12.0F, -12.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 136, 160, -13.0F, -12.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 160, 130, -14.0F, -13.0F, -44.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 151, -15.0F, -13.0F, -43.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 147, -16.0F, -13.0F, -41.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 51, 170, -17.0F, -13.0F, -39.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 163, -18.0F, -14.0F, -36.0F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 42, 170, -6.0F, -13.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 33, 170, -7.0F, -13.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 24, 170, -8.0F, -14.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 136, 181, -9.0F, -14.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 115, 181, -10.0F, -15.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 108, 181, -11.0F, -15.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 86, 160, -12.0F, -16.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 155, 159, -13.0F, -16.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 118, 158, -14.0F, -17.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 101, 181, -15.0F, -17.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 94, 181, -16.0F, -18.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 169, 169, -17.0F, -18.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 162, 124, -18.0F, -19.0F, -37.0F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 160, 169, -6.0F, -7.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 138, 169, -7.0F, -7.0F, -54.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 169, 123, -8.0F, -7.0F, -52.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 87, 181, -9.0F, -7.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 46, -10.0F, -6.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 35, -11.0F, -6.0F, -48.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 105, 158, -12.0F, -6.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 156, 12, -13.0F, -6.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 152, 154, -14.0F, -5.0F, -44.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 181, 24, -15.0F, -5.0F, -43.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 7, 181, -16.0F, -5.0F, -41.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 169, 40, -17.0F, -5.0F, -39.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 162, 117, -18.0F, -4.0F, -36.0F, 1, 1, 4, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 169, 34, -6.0F, -5.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 169, -7.0F, -5.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 168, 150, -8.0F, -4.0F, -53.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 181, -9.0F, -4.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 180, 168, -10.0F, -3.0F, -50.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 180, 163, -11.0F, -3.0F, -49.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 153, 143, -12.0F, -2.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 153, 101, -13.0F, -2.0F, -46.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 152, 151, -14.0F, -1.0F, -45.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 129, 180, -15.0F, -1.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 180, 121, -16.0F, 0.0F, -42.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 168, 135, -17.0F, 0.0F, -40.0F, 1, 1, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 161, 151, -18.0F, 1.0F, -37.0F, 1, 1, 4, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(1.0F, 3.0F, 0.0F);
		bone15.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 129, 168, -2.0F, -17.0F, -60.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 98, -2.0F, -18.0F, -58.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 77, 168, -2.0F, -19.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 117, -2.0F, -20.0F, -54.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 76, 180, -2.0F, -21.0F, -53.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 69, -2.0F, -22.0F, -52.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 151, 80, -2.0F, -23.0F, -50.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 151, 77, -2.0F, -24.0F, -49.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 151, 51, -2.0F, -25.0F, -48.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 65, -2.0F, -26.0F, -47.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 61, -2.0F, -27.0F, -45.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 69, -2.0F, -28.0F, -43.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 161, 139, -2.0F, -29.0F, -40.0F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 29, 0.0F, -17.0F, -59.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 10, 0.0F, -18.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 5, 0.0F, -19.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 30, 0.0F, -20.0F, -53.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 180, 6, 1.0F, -21.0F, -52.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 156, 179, 1.0F, -22.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 151, 12, 1.0F, -23.0F, -49.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 150, 31, 1.0F, -24.0F, -48.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 150, 28, 2.0F, -25.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 179, 143, 2.0F, -26.0F, -46.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 179, 131, 2.0F, -27.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 168, 0, 2.0F, -28.0F, -42.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 161, 12, 3.0F, -29.0F, -39.0F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 154, 167, 2.0F, -17.0F, -60.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 167, 145, 2.0F, -18.0F, -58.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 145, 167, 3.0F, -19.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 122, 179, 3.0F, -20.0F, -54.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 179, 92, 4.0F, -21.0F, -53.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 179, 88, 4.0F, -22.0F, -52.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 148, 101, 5.0F, -23.0F, -50.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 146, 68, 5.0F, -24.0F, -49.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 146, 0, 6.0F, -25.0F, -48.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 179, 18, 6.0F, -26.0F, -47.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 138, 7.0F, -27.0F, -45.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 167, 91, 7.0F, -28.0F, -43.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 160, 77, 8.0F, -29.0F, -40.0F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 167, 74, -4.0F, -17.0F, -59.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 18, 167, -4.0F, -18.0F, -57.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 123, 166, -4.0F, -19.0F, -55.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 113, -4.0F, -20.0F, -53.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 106, -5.0F, -21.0F, -52.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 84, -5.0F, -22.0F, -51.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 130, 145, -5.0F, -23.0F, -49.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 125, 145, -5.0F, -24.0F, -48.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 143, 19, -6.0F, -25.0F, -47.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 77, -6.0F, -26.0F, -46.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 71, 178, -6.0F, -27.0F, -44.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 166, 83, -6.0F, -28.0F, -42.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 160, 43, -7.0F, -29.0F, -39.0F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 166, 64, -6.0F, -17.0F, -60.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 166, 56, -6.0F, -18.0F, -58.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 166, 49, -7.0F, -19.0F, -56.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 56, -7.0F, -20.0F, -54.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 50, -8.0F, -21.0F, -53.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 42, -8.0F, -22.0F, -52.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 139, 87, -9.0F, -23.0F, -50.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 70, 139, -9.0F, -24.0F, -49.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 138, 109, -10.0F, -25.0F, -48.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 178, 13, -10.0F, -26.0F, -47.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 108, 145, -11.0F, -27.0F, -45.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 165, 130, -11.0F, -28.0F, -43.0F, 1, 1, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 29, 51, -12.0F, -29.0F, -40.0F, 1, 1, 4, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-37.0F, 6.0F, 0.0F);
		bone15.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 70, 136, 29.0F, -13.0F, -57.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 134, 87, 28.0F, -12.0F, -57.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 37, 128, 27.0F, -11.0F, -57.0F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 119, 19, 26.0F, -9.0F, -57.0F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 129, 87, 30.0F, -13.0F, -55.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 124, 87, 29.0F, -12.0F, -55.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 79, 122, 28.0F, -11.0F, -54.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 118, 49, 27.0F, -10.0F, -54.0F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 32, 116, 26.0F, -8.0F, -54.0F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 86, 13, 29.0F, -12.0F, -52.0F, 2, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 74, 122, 28.0F, -11.0F, -52.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 119, 87, 27.0F, -10.0F, -51.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 0, 116, 26.0F, -9.0F, -51.0F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 114, 54, 25.0F, -7.0F, -50.0F, 1, 2, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(37.0F, 6.0F, 0.0F);
		bone15.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 114, 87, -31.0F, -14.0F, -57.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 80, 114, -30.0F, -13.0F, -57.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 108, 13, -29.0F, -12.0F, -57.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 113, 35, -28.0F, -11.0F, -57.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 69, 109, -27.0F, -9.0F, -57.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 103, 13, -31.0F, -13.0F, -55.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 98, 13, -30.0F, -12.0F, -55.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 93, 13, -29.0F, -11.0F, -54.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 37, 109, -28.0F, -10.0F, -54.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 106, 95, -27.0F, -8.0F, -54.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 60, 83, -31.0F, -12.0F, -52.0F, 2, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 0, 59, -29.0F, -11.0F, -52.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 34, 46, -28.0F, -10.0F, -51.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 32, 97, -27.0F, -9.0F, -51.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 0, 97, -26.0F, -7.0F, -50.0F, 1, 2, 1, 0.0F, false));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 6.0F, 0.0F);


		rearLeg = new ModelRenderer(this);
		rearLeg.setRotationPoint(-0.5F, -2.0F, -32.5F);
		leg.addChild(rearLeg);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 2.9942F, 48.0F);
		rearLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, -0.0873F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 145, 5.1392F, 1.882F, 19.6531F, 5, 11, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 2.9942F, 48.0F);
		rearLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, -0.1745F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 150, 6.2196F, 6.8033F, 18.2624F, 4, 8, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 95, 6.2196F, 14.8033F, 17.2624F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 90, 10.2196F, 14.8033F, 19.2624F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 81, 54, 7.2196F, 14.8033F, 22.2624F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, 2.9942F, 48.0F);
		rearLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0873F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 145, -10.1392F, 1.882F, 19.6531F, 5, 11, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 2.9942F, 48.0F);
		rearLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.1745F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 148, 15, -10.2196F, 6.8033F, 18.2624F, 4, 8, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 78, -7.2196F, 14.8033F, 17.2624F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 62, -11.2196F, 14.8033F, 19.2624F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 21, -8.2196F, 14.8033F, 22.2624F, 1, 2, 1, 0.0F, false));

		frontLeg = new ModelRenderer(this);
		frontLeg.setRotationPoint(-0.5F, -1.3333F, -117.5F);
		leg.addChild(frontLeg);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 2.3275F, 133.0F);
		frontLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1309F, 0.0F, -0.0873F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 131, 143, 5.4878F, 5.1103F, -35.3965F, 5, 11, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 2.3275F, 133.0F);
		frontLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, -0.1745F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 112, 145, 6.9142F, 17.2333F, -35.8831F, 4, 8, 4, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 40, 6.9142F, 25.2333F, -36.8831F, 1, 2, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 62, 10.9142F, 25.2333F, -34.8831F, 1, 2, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 55, 7.9142F, 25.2333F, -31.8831F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 2.3275F, 133.0F);
		frontLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0873F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 143, 104, -10.4878F, 5.1103F, -35.3965F, 5, 11, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 2.3275F, 133.0F);
		frontLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2618F, 0.0F, 0.1745F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 95, 145, -10.9142F, 17.2333F, -35.8831F, 4, 8, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -7.9142F, 25.2333F, -36.8831F, 1, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, -11.9142F, 25.2333F, -34.8831F, 1, 2, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -8.9142F, 25.2333F, -31.8831F, 1, 2, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);


		body1 = new ModelRenderer(this);
		body1.setRotationPoint(-0.5F, -20.0F, -147.5F);
		body.addChild(body1);
		body1.cubeList.add(new ModelBox(body1, 119, 49, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 71, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 114, 165, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-0.5F, -20.0F, -142.5F);
		body.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 118, 30, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 62, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 105, 165, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(-0.5F, -20.0F, -137.5F);
		body.addChild(body3);
		body3.cubeList.add(new ModelBox(body3, 0, 116, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 53, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 96, 165, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(-0.5F, -20.0F, -132.5F);
		body.addChild(body4);
		body4.cubeList.add(new ModelBox(body4, 114, 68, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 44, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 165, 24, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body5 = new ModelRenderer(this);
		body5.setRotationPoint(-0.5F, -20.0F, -127.5F);
		body.addChild(body5);
		body5.cubeList.add(new ModelBox(body5, 114, 0, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 35, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body5.cubeList.add(new ModelBox(body5, 164, 157, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body6 = new ModelRenderer(this);
		body6.setRotationPoint(-0.5F, -20.0F, -122.5F);
		body.addChild(body6);
		body6.cubeList.add(new ModelBox(body6, 41, 62, -7.5F, -7.0F, 97.5F, 15, 15, 5, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 156, 59, -1.5F, -11.0F, 98.5F, 3, 4, 3, 0.0F, false));
		body6.cubeList.add(new ModelBox(body6, 24, 135, -1.5F, 8.0F, 98.5F, 3, 1, 3, 0.0F, false));

		body7 = new ModelRenderer(this);
		body7.setRotationPoint(-0.5F, -19.3333F, -117.5F);
		body.addChild(body7);
		body7.cubeList.add(new ModelBox(body7, 0, 23, -8.5F, -8.6667F, 97.5F, 17, 17, 5, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 151, 0, -2.5F, -12.6667F, 98.5F, 5, 8, 3, 0.0F, false));
		body7.cubeList.add(new ModelBox(body7, 155, 38, -2.5F, 8.3333F, 98.5F, 5, 1, 3, 0.0F, false));

		body8 = new ModelRenderer(this);
		body8.setRotationPoint(-0.5F, -20.0F, -112.5F);
		body.addChild(body8);
		body8.cubeList.add(new ModelBox(body8, 0, 57, -7.5F, -7.0F, 97.5F, 15, 15, 5, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 156, 51, -1.5F, -11.0F, 98.5F, 3, 4, 3, 0.0F, false));
		body8.cubeList.add(new ModelBox(body8, 106, 0, -1.5F, 8.0F, 98.5F, 3, 1, 3, 0.0F, false));

		body9 = new ModelRenderer(this);
		body9.setRotationPoint(-0.5F, -20.0F, -107.5F);
		body.addChild(body9);
		body9.cubeList.add(new ModelBox(body9, 111, 90, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 26, 162, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body9.cubeList.add(new ModelBox(body9, 147, 143, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body10 = new ModelRenderer(this);
		body10.setRotationPoint(-0.5F, -20.0F, -102.5F);
		body.addChild(body10);
		body10.cubeList.add(new ModelBox(body10, 106, 109, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 139, 160, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body10.cubeList.add(new ModelBox(body10, 61, 145, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body11 = new ModelRenderer(this);
		body11.setRotationPoint(-0.5F, -20.0F, -97.5F);
		body.addChild(body11);
		body11.cubeList.add(new ModelBox(body11, 37, 109, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body11.cubeList.add(new ModelBox(body11, 130, 160, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body11.cubeList.add(new ModelBox(body11, 40, 145, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body12 = new ModelRenderer(this);
		body12.setRotationPoint(-0.5F, -20.0F, -92.5F);
		body.addChild(body12);
		body12.cubeList.add(new ModelBox(body12, 0, 97, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body12.cubeList.add(new ModelBox(body12, 80, 160, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body12.cubeList.add(new ModelBox(body12, 90, 137, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body13 = new ModelRenderer(this);
		body13.setRotationPoint(-0.5F, -20.0F, -87.5F);
		body.addChild(body13);
		body13.cubeList.add(new ModelBox(body13, 74, 95, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body13.cubeList.add(new ModelBox(body13, 158, 159, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body13.cubeList.add(new ModelBox(body13, 131, 128, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body14 = new ModelRenderer(this);
		body14.setRotationPoint(-0.5F, -20.0F, -82.5F);
		body.addChild(body14);
		body14.cubeList.add(new ModelBox(body14, 37, 90, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body14.cubeList.add(new ModelBox(body14, 149, 159, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body14.cubeList.add(new ModelBox(body14, 65, 128, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body15 = new ModelRenderer(this);
		body15.setRotationPoint(-0.5F, -20.0F, -77.5F);
		body.addChild(body15);
		body15.cubeList.add(new ModelBox(body15, 82, 54, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body15.cubeList.add(new ModelBox(body15, 159, 101, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body15.cubeList.add(new ModelBox(body15, 64, 83, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body16 = new ModelRenderer(this);
		body16.setRotationPoint(-0.5F, -20.0F, -72.5F);
		body.addChild(body16);
		body16.cubeList.add(new ModelBox(body16, 82, 16, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body16.cubeList.add(new ModelBox(body16, 17, 159, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body16.cubeList.add(new ModelBox(body16, 81, 0, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body17 = new ModelRenderer(this);
		body17.setRotationPoint(-0.5F, -20.0F, -67.5F);
		body.addChild(body17);
		body17.cubeList.add(new ModelBox(body17, 45, 0, -7.5F, -7.0F, 97.5F, 15, 15, 5, 0.0F, false));
		body17.cubeList.add(new ModelBox(body17, 155, 28, -1.5F, -11.0F, 98.5F, 3, 6, 3, 0.0F, false));
		body17.cubeList.add(new ModelBox(body17, 108, 158, -1.5F, 6.0F, 98.5F, 3, 3, 3, 0.0F, false));

		body18 = new ModelRenderer(this);
		body18.setRotationPoint(-0.5F, -20.0F, -32.5F);
		body.addChild(body18);
		body18.cubeList.add(new ModelBox(body18, 0, 0, -8.5F, -8.0F, 67.5F, 17, 17, 5, 0.0F, false));
		body18.cubeList.add(new ModelBox(body18, 66, 150, -2.5F, -12.0F, 68.5F, 5, 8, 3, 0.0F, false));
		body18.cubeList.add(new ModelBox(body18, 151, 68, -2.5F, 5.0F, 68.5F, 5, 5, 3, 0.0F, false));

		body19 = new ModelRenderer(this);
		body19.setRotationPoint(-0.5F, -20.0F, -57.5F);
		body.addChild(body19);
		body19.cubeList.add(new ModelBox(body19, 40, 41, -7.5F, -7.0F, 97.5F, 15, 15, 5, 0.0F, false));
		body19.cubeList.add(new ModelBox(body19, 92, 114, -1.5F, -11.0F, 98.5F, 3, 6, 3, 0.0F, false));
		body19.cubeList.add(new ModelBox(body19, 95, 158, -1.5F, 6.0F, 98.5F, 3, 3, 3, 0.0F, false));

		body20 = new ModelRenderer(this);
		body20.setRotationPoint(-0.5F, -20.0F, -52.5F);
		body.addChild(body20);
		body20.cubeList.add(new ModelBox(body20, 81, 35, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body20.cubeList.add(new ModelBox(body20, 121, 158, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body20.cubeList.add(new ModelBox(body20, 32, 78, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body21 = new ModelRenderer(this);
		body21.setRotationPoint(-0.5F, -20.0F, -47.5F);
		body.addChild(body21);
		body21.cubeList.add(new ModelBox(body21, 0, 78, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body21.cubeList.add(new ModelBox(body21, 74, 114, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body21.cubeList.add(new ModelBox(body21, 28, 46, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body22 = new ModelRenderer(this);
		body22.setRotationPoint(-0.5F, -20.0F, -42.5F);
		body.addChild(body22);
		body22.cubeList.add(new ModelBox(body22, 45, 21, -6.5F, -6.0F, 97.5F, 13, 13, 5, 0.0F, false));
		body22.cubeList.add(new ModelBox(body22, 105, 73, -0.5F, -10.0F, 98.5F, 1, 4, 3, 0.0F, false));
		body22.cubeList.add(new ModelBox(body22, 40, 0, -0.5F, 7.0F, 98.5F, 1, 1, 3, 0.0F, false));

		body23 = new ModelRenderer(this);
		body23.setRotationPoint(-0.5F, -19.8333F, -37.5F);
		body.addChild(body23);
		body23.cubeList.add(new ModelBox(body23, 103, 128, -5.5F, -5.1667F, 97.5F, 11, 11, 5, 0.0F, false));
		body23.cubeList.add(new ModelBox(body23, 174, 2, 0.0F, -7.1667F, 98.5F, 0, 2, 3, 0.0F, false));
		body23.cubeList.add(new ModelBox(body23, 42, 21, 0.0F, 5.3333F, 98.5F, 0, 1, 3, 0.0F, false));

		body24 = new ModelRenderer(this);
		body24.setRotationPoint(-0.5F, -22.75F, -32.5F);
		body.addChild(body24);
		body24.cubeList.add(new ModelBox(body24, 37, 128, -5.5F, -2.25F, 97.5F, 11, 11, 5, 0.0F, false));
		body24.cubeList.add(new ModelBox(body24, 96, 139, 0.0F, -4.25F, 98.5F, 0, 2, 3, 0.0F, false));

		body25 = new ModelRenderer(this);
		body25.setRotationPoint(-0.5F, -22.0F, -27.5F);
		body.addChild(body25);
		body25.cubeList.add(new ModelBox(body25, 136, 128, -4.5F, -2.0F, 97.5F, 9, 9, 5, 0.0F, false));
		body25.cubeList.add(new ModelBox(body25, 174, 26, -1.0F, -3.0F, 98.5F, 2, 1, 2, 0.0F, false));

		body26 = new ModelRenderer(this);
		body26.setRotationPoint(-0.5F, -22.0F, -22.5F);
		body.addChild(body26);
		body26.cubeList.add(new ModelBox(body26, 0, 135, -4.5F, -2.0F, 97.5F, 9, 9, 5, 0.0F, false));
		body26.cubeList.add(new ModelBox(body26, 173, 119, -1.0F, -3.0F, 98.5F, 2, 1, 2, 0.0F, false));

		body27 = new ModelRenderer(this);
		body27.setRotationPoint(-0.5F, -19.5F, -17.5F);
		body.addChild(body27);
		body27.cubeList.add(new ModelBox(body27, 70, 137, -3.5F, -3.5F, 97.5F, 7, 7, 5, 0.0F, false));

		body28 = new ModelRenderer(this);
		body28.setRotationPoint(-0.5F, -19.5F, -12.5F);
		body.addChild(body28);
		body28.cubeList.add(new ModelBox(body28, 86, 0, -3.5F, -3.5F, 97.5F, 7, 7, 5, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-0.5F, 4.5F, -12.5F);
		tail.cubeList.add(new ModelBox(tail, 74, 114, -1.5F, -5.5F, 99.5F, 3, 11, 11, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -5.0F, 49.2806F);
		tail.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 152, 151, -0.5F, 4.5F, 61.2194F, 1, 1, 6, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.5F, 7.4942F, -21.2806F);
		bone25.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 152, 143, -1.0F, 5.8126F, 82.3808F, 1, 1, 6, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.5F, 7.4942F, -21.2806F);
		bone25.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 152, -1.0F, -26.3017F, 78.0397F, 1, 1, 6, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.5F, 7.4942F, -21.2806F);
		bone25.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 151, 77, -1.0F, -11.7584F, 81.7297F, 1, 1, 6, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5F, 7.4942F, -21.2806F);
		bone25.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 151, 43, -1.0F, 20.6141F, 79.7458F, 1, 1, 6, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 3.0F, 41.2806F);
		tail.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 84, 175, -0.5F, 2.2194F, 63.5F, 1, 6, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.5F, -0.5058F, -13.2806F);
		bone26.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 175, -1.0F, 13.0501F, 77.7466F, 1, 6, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.5F, -0.5058F, -13.2806F);
		bone26.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 175, 63, -1.0F, -22.5025F, 68.2933F, 1, 6, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.5F, -0.5058F, -13.2806F);
		bone26.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 175, -1.0F, -7.1242F, 74.4922F, 1, 6, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.5F, -0.5058F, -13.2806F);
		bone26.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 175, -1.0F, 30.3605F, 75.9467F, 1, 6, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -13.0F, 41.2806F);
		tail.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 51, 175, -0.5F, 1.7806F, 63.5F, 1, 6, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.5F, 15.4942F, -13.2806F);
		bone27.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 175, -1.0F, -23.9959F, 77.0955F, 1, 6, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.5F, 15.4942F, -13.2806F);
		bone27.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 175, -1.0F, 11.815F, 69.9994F, 1, 6, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.5F, 15.4942F, -13.2806F);
		bone27.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 175, -1.0F, -3.8216F, 75.1434F, 1, 6, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.5F, 15.4942F, -13.2806F);
		bone27.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 83, 150, -1.0F, -41.0481F, 74.2405F, 1, 6, 1, 0.0F, false));
		
		
		
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
//		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		head.render(scale);
		leg.render(scale);
		body.render(scale);
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
//		this.head.rotateAngleX = (float) (Math.PI / 180) * headPitch;
//		this.head.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw;
//
////		this.tail.rotateAngleX = (float) (Math.PI / 180) * headPitch * 0.5f;
////		this.tail.rotateAngleY = (float) (Math.PI / 180) * netHeadYaw * 0.5f;
//
//		this.leg.rotateAngleX = MathHelper.sin(limbSwing * 0.3F+0) * limbSwingAmount * 1.25F;
//		this.leg.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI) * limbSwingAmount * 1.25F;

		
		
		
		

		this.head.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.0F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body1.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.1F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body2.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.2F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body3.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.3F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body4.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.4F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body5.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.5F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body6.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.6F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body7.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.7F) * (limbSwingAmount+0.2F) * 0.15F;
		this.frontLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.7F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body8.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.8F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body9.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 0.9F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body10.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.0F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body11.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.1F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body12.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.2F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body13.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.3F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body14.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.4F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body15.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.5F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body16.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.6F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body17.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.7F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body18.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.8F) * (limbSwingAmount+0.2F) * 0.15F;
		this.rearLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.8F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body19.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 1.9F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body20.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.0F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body21.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.1F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body22.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.2F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body23.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.3F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body24.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.4F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body25.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.5F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body26.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.6F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body27.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.7F) * (limbSwingAmount+0.2F) * 0.15F;
		this.body28.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.8F) * (limbSwingAmount+0.2F) * 0.15F;
		this.tail.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI * 2.8F) * (limbSwingAmount+0.2F) * 0.15F;

//        this.leftWing.rotateAngleX = MathHelper.sin(limbSwing * 0.3F+0) * limbSwingAmount * 1.25F;
//        this.rightWing.rotateAngleX = MathHelper.sin(limbSwing * 0.3F+0) * limbSwingAmount * 1.25F;
//		this.leftWing.rotateAngleZ = MathHelper.sin(limbSwing * 0.3F+0) * limbSwingAmount * 1.25F;
//		this.rightWing.rotateAngleZ = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI) * limbSwingAmount * 1.25F;
//		this.leftWing.rotateAngleX = MathHelper.sin(limbSwing * 0.3F+ (float) Math.PI) * limbSwingAmount * 0.5F;
//		this.rightWing.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI) * limbSwingAmount * 0.5F;

//        this.tail.rotateAngleX = MathHelper.sin(limbSwing * 0.3F + (float) Math.PI) * limbSwingAmount * 0.5F;
	}
}