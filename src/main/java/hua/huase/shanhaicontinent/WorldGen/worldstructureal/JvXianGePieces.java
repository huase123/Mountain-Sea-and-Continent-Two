package hua.huase.shanhaicontinent.WorldGen.worldstructureal;


import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.List;
import java.util.Random;

import static hua.huase.shanhaicontinent.LootTablesHander.GUFENGXIAOWU_CHESTS_MODI;
import static hua.huase.shanhaicontinent.LootTablesHander.GUFENGXIAOWU_CHESTS_MODI_ZUIHOU;

public class JvXianGePieces
{
    private static final PlacementSettings OVERWRITE = (new PlacementSettings()).setIgnoreEntities(true);
    private static final PlacementSettings INSERT = (new PlacementSettings()).setIgnoreEntities(true).setReplacedBlock(Blocks.AIR);

    public static void registerPieces()
    {
        MapGenStructureIO.registerStructureComponent(JvXianGeTemplateMy.class, "JvXianGe");
    }

    public static void startHouseTower(TemplateManager templateManager, BlockPos blockPos, Rotation rotationr, List<StructureComponent> list, Random random)
    {
        int i = random.nextInt(5);
        for (Rotation rotation : Rotation.values()) {
           addHelper(list, new JvXianGeTemplateMy(templateManager, "jvxiange00", blockPos.add(0,0,0), rotation, true));
            for (int j = 0; j <= i; j++) {

                addHelper(list, new JvXianGeTemplateMy(templateManager, "jvxiange01", blockPos.add(0,15+16*j,0), rotation, true));
            }
           addHelper(list, new JvXianGeTemplateMy(templateManager, "jvxiange02", blockPos.add(0,15+16+16*i,0), rotation, true));

        }

   }

    private static JvXianGeTemplateMy addHelper(List<StructureComponent> p_189935_0_, JvXianGeTemplateMy p_189935_1_)
    {
        p_189935_0_.add(p_189935_1_);
        return p_189935_1_;
    }


    public static class JvXianGeTemplateMy extends StructureComponent
    {
        private String pieceName;
        private Rotation rotation;
        private boolean overwrite;
        protected PlacementSettings placeSettings;

        protected int componentType;
        protected BlockPos templatePosition;
        protected Template template;
//        ResourceLocation resourceLocation = new ResourceLocation("shanhaicontinent", "huasstr/" + this.pieceName);

        public JvXianGeTemplateMy()
        {
            this.placeSettings = DEFAULT_PLACE_SETTINGS.setIgnoreEntities(true).setReplacedBlock(Blocks.AIR);
        }

        public JvXianGeTemplateMy(TemplateManager p_i47214_1_, String p_i47214_2_, BlockPos p_i47214_3_, Rotation p_i47214_4_, boolean overwriteIn)
        {
            super(0);
            this.pieceName = p_i47214_2_;
            this.templatePosition = p_i47214_3_;
            this.rotation = p_i47214_4_;
            this.overwrite = overwriteIn;
            this.loadTemplate(p_i47214_1_);
//            this.placeSettings = DEFAULT_PLACE_SETTINGS.setIgnoreEntities(true).setReplacedBlock(Blocks.AIR);
        }

        private void loadTemplate(TemplateManager p_191085_1_)
        {
            Template template = p_191085_1_.getTemplate((MinecraftServer)null, new ResourceLocation("shanhaicontinent", "huasstr/" + this.pieceName));
            PlacementSettings placementsettings = (this.overwrite ? OVERWRITE : INSERT).copy().setRotation(this.rotation);
            this.placeSettings = placementsettings;
            this.setup(template, this.templatePosition, placementsettings);
        }


        protected void setup(Template p_186173_1_, BlockPos p_186173_2_, PlacementSettings p_186173_3_) {
            this.template = p_186173_1_;
            this.setCoordBaseMode(EnumFacing.NORTH);
            this.templatePosition = p_186173_2_;
            this.placeSettings = p_186173_3_;
            this.setBoundingBoxFromTemplate();
        }

        private void setBoundingBoxFromTemplate() {
            Rotation lvt_1_1_ = this.placeSettings.getRotation();
            BlockPos lvt_2_1_ = this.template.transformedSize(lvt_1_1_);
            Mirror lvt_3_1_ = this.placeSettings.getMirror();
            this.boundingBox = new StructureBoundingBox(0, 0, 0, lvt_2_1_.getX(), lvt_2_1_.getY() - 1, lvt_2_1_.getZ());
            switch (lvt_1_1_) {
                case NONE:
                default:
                    break;
                case CLOCKWISE_90:
                    this.boundingBox.offset(-lvt_2_1_.getX(), 0, 0);
                    break;
                case COUNTERCLOCKWISE_90:
                    this.boundingBox.offset(0, 0, -lvt_2_1_.getZ());
                    break;
                case CLOCKWISE_180:
                    this.boundingBox.offset(-lvt_2_1_.getX(), 0, -lvt_2_1_.getZ());
            }

            BlockPos lvt_4_2_;
            switch (lvt_3_1_) {
                case NONE:
                default:
                    break;
                case FRONT_BACK:
                    lvt_4_2_ = BlockPos.ORIGIN;
                    if (lvt_1_1_ != Rotation.CLOCKWISE_90 && lvt_1_1_ != Rotation.COUNTERCLOCKWISE_90) {
                        if (lvt_1_1_ == Rotation.CLOCKWISE_180) {
                            lvt_4_2_ = lvt_4_2_.offset(EnumFacing.EAST, lvt_2_1_.getX());
                        } else {
                            lvt_4_2_ = lvt_4_2_.offset(EnumFacing.WEST, lvt_2_1_.getX());
                        }
                    } else {
                        lvt_4_2_ = lvt_4_2_.offset(lvt_1_1_.rotate(EnumFacing.WEST), lvt_2_1_.getZ());
                    }

                    this.boundingBox.offset(lvt_4_2_.getX(), 0, lvt_4_2_.getZ());
                    break;
                case LEFT_RIGHT:
                    lvt_4_2_ = BlockPos.ORIGIN;
                    if (lvt_1_1_ != Rotation.CLOCKWISE_90 && lvt_1_1_ != Rotation.COUNTERCLOCKWISE_90) {
                        if (lvt_1_1_ == Rotation.CLOCKWISE_180) {
                            lvt_4_2_ = lvt_4_2_.offset(EnumFacing.SOUTH, lvt_2_1_.getZ());
                        } else {
                            lvt_4_2_ = lvt_4_2_.offset(EnumFacing.NORTH, lvt_2_1_.getZ());
                        }
                    } else {
                        lvt_4_2_ = lvt_4_2_.offset(lvt_1_1_.rotate(EnumFacing.NORTH), lvt_2_1_.getX());
                    }

                    this.boundingBox.offset(lvt_4_2_.getX(), 0, lvt_4_2_.getZ());
            }

            this.boundingBox.offset(this.templatePosition.getX(), this.templatePosition.getY(), this.templatePosition.getZ());
        }

        public void offset(int p_181138_1_, int p_181138_2_, int p_181138_3_) {
            super.offset(p_181138_1_, p_181138_2_, p_181138_3_);
            this.templatePosition = this.templatePosition.add(p_181138_1_, p_181138_2_, p_181138_3_);
        }



        private static final PlacementSettings DEFAULT_PLACE_SETTINGS = new PlacementSettings();

        public boolean addComponentParts(World world, Random p_74875_2_, StructureBoundingBox structureBoundingBox) {
            this.placeSettings.setBoundingBox(structureBoundingBox);
            this.template.addBlocksToWorld(world, this.templatePosition, this.placeSettings, 18);
            if(this.placeSettings.getRotation() !=Rotation.COUNTERCLOCKWISE_90 || !structureBoundingBox.isVecInside(this.templatePosition)){
                return true;
            }


            if(this.pieceName.equals("jvxiange00")){
//                return true;

                world.setBlockState(this.templatePosition, Blocks.CHEST.getStateFromMeta(0),3);
                TileEntity tileentity = world.getTileEntity(this.templatePosition);

                if (tileentity instanceof TileEntityChest)
                {
                    ((TileEntityChest)tileentity).setLootTable(GUFENGXIAOWU_CHESTS_MODI_ZUIHOU, world.rand.nextLong());
                }
                final BlockPos posfinal1 = this.templatePosition.add(0,4,0);
                world.setBlockState(posfinal1, Blocks.CHEST.getStateFromMeta(0), 3);
                TileEntity tileentity1 = world.getTileEntity(posfinal1);

                if (tileentity1 instanceof TileEntityChest)
                {
                    ((TileEntityChest)tileentity1).setLootTable(GUFENGXIAOWU_CHESTS_MODI, world.rand.nextLong());
                }
            }else {

                final BlockPos posfinal1 = this.templatePosition.add(0,4,0);
                world.setBlockState(posfinal1, Blocks.CHEST.getStateFromMeta(0), 3);
                TileEntity tileentity1 = world.getTileEntity(posfinal1);

                if (tileentity1 instanceof TileEntityChest)
                {
                    ((TileEntityChest)tileentity1).setLootTable(GUFENGXIAOWU_CHESTS_MODI, world.rand.nextLong());
                }
            }
/*




            Map<BlockPos, String> lvt_4_1_ = this.template.getDataBlocks(this.templatePosition, this.placeSettings);
            Iterator var5 = lvt_4_1_.entrySet().iterator();

            while(var5.hasNext()) {
                Map.Entry<BlockPos, String> lvt_6_1_ = (Map.Entry)var5.next();
                String lvt_7_1_ = (String)lvt_6_1_.getValue();
                this.handleDataMarker(lvt_7_1_, (BlockPos)lvt_6_1_.getKey(), world, p_74875_2_, p_74875_3_);
            }
*/

            return true;
        }


        protected void writeStructureToNBT(NBTTagCompound tagCompound)
        {
            tagCompound.setInteger("TPX", this.templatePosition.getX());
            tagCompound.setInteger("TPY", this.templatePosition.getY());
            tagCompound.setInteger("TPZ", this.templatePosition.getZ());

            tagCompound.setString("Template", this.pieceName);
            tagCompound.setString("Rot", this.rotation.name());
            tagCompound.setBoolean("OW", this.overwrite);
        }

        protected void readStructureFromNBT(NBTTagCompound tagCompound, TemplateManager p_143011_2_)
        {
            this.templatePosition = new BlockPos(tagCompound.getInteger("TPX"), tagCompound.getInteger("TPY"), tagCompound.getInteger("TPZ"));


            this.pieceName = tagCompound.getString("Template");
            this.rotation = Rotation.valueOf(tagCompound.getString("Rot"));
            this.overwrite = tagCompound.getBoolean("OW");
            this.loadTemplate(p_143011_2_);
        }

    }

    interface IGenerator
    {
        void init();

        boolean generate(TemplateManager p_191086_1_, int p_191086_2_, JvXianGeTemplateMy p_191086_3_, BlockPos p_191086_4_, List<StructureComponent> p_191086_5_, Random p_191086_6_);
    }
}
