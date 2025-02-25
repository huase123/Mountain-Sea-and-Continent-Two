package hua.huase.shanhaicontinent;

import hua.huase.shanhaicontinent.WorldGen.HanderBiome;
import hua.huase.shanhaicontinent.WorldGen.structureal.TemplateHander;
import hua.huase.shanhaicontinent.WorldGen.worldstructureal.StructurealHander;
import hua.huase.shanhaicontinent.advancements.TFAdvancements;
import hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler;
import hua.huase.shanhaicontinent.capability.MonsterCapability;
import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.client.keybinding.MyKeyBinding;
import hua.huase.shanhaicontinent.client.particles.ParticlesHander;
import hua.huase.shanhaicontinent.client.renderer.RenderRegistryHandler;
import hua.huase.shanhaicontinent.comand.CommandaddAttribute;
import hua.huase.shanhaicontinent.comand.Commandremovehunhuan;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import hua.huase.shanhaicontinent.seedpacket.PacketHandler;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;

import static net.minecraftforge.common.ForgeModContainer.fixVanillaCascading;
@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "shanhaicontinent";
    public static final String NAME = "Mountain, Sea, and Continent Two";
    public static final String VERSION = "2.0.6";
//    public static final HashMap<Integer, MonsterCapabilityProvider> monsterHashMap = new HashMap();
    public static final HashMap<Integer, MonsterCapability> monsterHashMapCapability = new HashMap();
    public static final HashMap<Integer, PlayerCapability> playerHashMap = new HashMap();

    private static Logger logger;

//    public static EnumParticleTypes parTicleCritNum = EnumHelper.addEnum(EnumParticleTypes.class,
//            "HEATHNUM", new Class[]{String.class, int.class, boolean.class, int.class}, "heathnum", EnumParticleTypes.values().length, true, 2);
    public static EnumParticleTypes parTicleCritNum = EnumHelper.addEnum(EnumParticleTypes.class,
            "HEATHNUM", new Class[]{String.class, int.class, boolean.class, int.class}, "heathnum", EnumParticleTypes.values().length, true, 2);


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        fixVanillaCascading=true;

        NetworkRegistryHandler.register();
        CapabilityRegistryHandler.register();

        LootTablesHander.register();

        TemplateHander.register();

        PacketHandler.init();
        changeAttributesIO();
//成就系统
        TFAdvancements.init();
//        维度注册
        HanderBiome.registerDimension();
        StructurealHander.registerStructureal();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {


//        燃烧规则
//        PotionRegistryHandler.register();




    }

    @EventHandler
    public void initPost(FMLPostInitializationEvent event)
    {

    }


//实体模型监听
    @EventHandler
    @SideOnly(Side.CLIENT)
    public void preInitClient(FMLPreInitializationEvent event)
    {
//        模型注册
        RenderRegistryHandler.register();


        //快捷键注册
//        KeyHander.initKey();
        MyKeyBinding.init();
    }
//粒子监听
    @EventHandler
    @SideOnly(Side.CLIENT)
    public void PostInitClient(FMLPostInitializationEvent event)
    {
//        粒子注册
        ParticlesHander.register();

    }


    // 一般的命令需要这样注册。请注意，这个事件是基于逻辑服务器的。
    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
//        event.registerServerCommand(new Commandaddjingshenli());
        event.registerServerCommand(new Commandremovehunhuan());
        event.registerServerCommand(new CommandaddAttribute());
    }






    public static void changeAttributesIO()  {



        try {


            Field privateField = RangedAttribute.class.getDeclaredFields()[1];
            privateField.setAccessible(true);
            privateField.set(SharedMonsterAttributes.MAX_HEALTH, Float.MAX_VALUE);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }




}
