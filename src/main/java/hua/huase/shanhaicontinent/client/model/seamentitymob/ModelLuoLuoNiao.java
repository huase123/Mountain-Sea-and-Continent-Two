package hua.huase.shanhaicontinent.client.model.seamentitymob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;


public class ModelLuoLuoNiao extends ModelBase {
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;
    private final ModelRenderer tail;
    private final ModelRenderer leftWing;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer rightWing;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;

    public ModelLuoLuoNiao() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 9.0F, -7.0F);
        head.cubeList.add(new ModelBox(head, 20, 47, -1.0F, 1.0F, -8.0F, 2, 2, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 30, 52, -1.0F, 3.0F, -7.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 51, 27, -1.0F, 2.0F, -6.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 32, 48, -1.0F, 1.0F, -6.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 7, -1.0F, 0.0F, -9.0F, 2, 1, 5, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 8, 47, -1.0F, 1.0F, -5.0F, 2, 2, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 48, 44, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 20, 42, -1.0F, -2.0F, -7.0F, 2, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 22, 26, -2.0F, -3.0F, -4.0F, 4, 6, 5, 0.0F, false));

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 3.6F, -4.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, 0.4F, -3.0F, 10, 12, 14, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 34, 10, -4.0F, -0.6F, -3.0F, 8, 1, 1, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 34, 12, -3.0F, -1.6F, -2.0F, 6, 1, 1, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 46, 6, -2.0F, -2.6F, -1.0F, 4, 1, 1, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 8, 44, -1.0F, -3.6F, 0.0F, 2, 1, 1, 0.0F, false));

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(-3.0F, 16.0F, 0.0F);
        leftLeg.cubeList.add(new ModelBox(leftLeg, 36, 49, 5.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, false));
        leftLeg.cubeList.add(new ModelBox(leftLeg, 34, 5, 4.0F, 7.0F, -2.0F, 4, 1, 4, 0.0F, false));

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(3.0F, 16.0F, 0.0F);
        rightLeg.cubeList.add(new ModelBox(rightLeg, 48, 13, -7.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, false));
        rightLeg.cubeList.add(new ModelBox(rightLeg, 34, 0, -8.0F, 7.0F, -2.0F, 4, 1, 4, 0.0F, false));

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 7.25F, 7.875F);
        tail.cubeList.add(new ModelBox(tail, 0, 26, -3.0F, -3.25F, -0.875F, 6, 6, 5, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 0, 0, -2.0F, -4.25F, 4.125F, 4, 4, 3, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 48, 37, -1.0F, -5.25F, 7.125F, 2, 2, 3, 0.0F, false));
        tail.cubeList.add(new ModelBox(tail, 8, 38, 0.0F, -6.25F, 10.125F, 0, 2, 4, 0.0F, false));

        leftWing = new ModelRenderer(this);
        leftWing.setRotationPoint(6.0F, 5.0F, -4.0F);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(-6.0F, 19.0F, 4.0F);
        leftWing.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 54, 20, 5.0F, -21.0F, -5.0F, 2, 3, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 54, 0, 7.0F, -22.0F, -4.0F, 2, 3, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 50, 53, 9.0F, -23.0F, -3.0F, 2, 3, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 53, 30, 11.0F, -24.0F, -2.0F, 2, 3, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 52, 48, 12.0F, -25.0F, -1.0F, 2, 3, 2, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-6.0F, 19.0F, 1.0F);
        leftWing.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 48, 8, 5.0F, -20.0F, 0.0F, 2, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 24, 47, 7.0F, -21.0F, 1.0F, 2, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 12, 47, 9.0F, -22.0F, 2.0F, 2, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 47, 11.0F, -23.0F, 3.0F, 2, 1, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 46, 1, 12.0F, -24.0F, 4.0F, 2, 1, 4, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-6.0F, 20.0F, -3.0F);
        leftWing.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 40, 44, 5.0F, -20.0F, 8.0F, 2, 1, 4, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 44, 32, 7.0F, -21.0F, 9.0F, 2, 1, 4, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 44, 22, 9.0F, -22.0F, 10.0F, 2, 1, 4, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 32, 43, 11.0F, -23.0F, 11.0F, 2, 1, 4, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 43, 27, 12.0F, -24.0F, 12.0F, 2, 1, 4, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-6.0F, 20.0F, -7.0F);
        leftWing.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 20, 37, 5.0F, -19.5F, 16.0F, 2, 0, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 16, 37, 7.0F, -20.5F, 17.0F, 2, 0, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 8, 37, 9.0F, -21.5F, 18.0F, 2, 0, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 4, 37, 11.0F, -22.5F, 19.0F, 2, 0, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 31, 26, 12.0F, -23.5F, 20.0F, 2, 0, 4, 0.0F, false));

        rightWing = new ModelRenderer(this);
        rightWing.setRotationPoint(-6.0F, 5.0F, -4.0F);


        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(6.0F, 19.0F, 4.0F);
        rightWing.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 24, 52, -7.0F, -21.0F, -5.0F, 2, 3, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 16, 52, -9.0F, -22.0F, -4.0F, 2, 3, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 8, 52, -11.0F, -23.0F, -3.0F, 2, 3, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 52, -13.0F, -24.0F, -2.0F, 2, 3, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 44, 49, -14.0F, -25.0F, -1.0F, 2, 3, 2, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(6.0F, 19.0F, 1.0F);
        rightWing.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 24, 42, -7.0F, -20.0F, 0.0F, 2, 1, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 12, 42, -9.0F, -21.0F, 1.0F, 2, 1, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 42, -11.0F, -22.0F, 2.0F, 2, 1, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 40, 39, -13.0F, -23.0F, 3.0F, 2, 1, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 32, 38, -14.0F, -24.0F, 4.0F, 2, 1, 4, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(6.0F, 20.0F, -3.0F);
        rightWing.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 24, 37, -7.0F, -20.0F, 8.0F, 2, 1, 4, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 12, 37, -9.0F, -21.0F, 9.0F, 2, 1, 4, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 37, -11.0F, -22.0F, 10.0F, 2, 1, 4, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 36, 33, -13.0F, -23.0F, 11.0F, 2, 1, 4, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 35, 26, -14.0F, -24.0F, 12.0F, 2, 1, 4, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(6.0F, 20.0F, -7.0F);
        rightWing.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 30, 5, -7.0F, -19.5F, 16.0F, 2, 0, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 30, 0, -9.0F, -20.5F, 17.0F, 2, 0, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 17, 26, -11.0F, -21.5F, 18.0F, 2, 0, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 13, 26, -13.0F, -22.5F, 19.0F, 2, 0, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 5, 7, -14.0F, -23.5F, 20.0F, 2, 0, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        head.render(f5);
        body.render(f5);
        leftLeg.render(f5);
        rightLeg.render(f5);
        tail.render(f5);
        leftWing.render(f5);
        rightWing.render(f5);
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

        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;

//        this.leftWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
//        this.rightWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
        this.leftWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F+0) * limbSwingAmount * 1.25F;
        this.rightWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 1.25F;
        this.leftWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F+ (float) Math.PI) * limbSwingAmount * 0.5F;
        this.rightWing.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 0.5F;

//        this.tail.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount * 0.5F;
    }
}
