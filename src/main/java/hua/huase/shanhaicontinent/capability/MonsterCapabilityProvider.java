package hua.huase.shanhaicontinent.capability;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import java.util.Random;

public class MonsterCapabilityProvider implements ICapabilitySerializable<NBTTagCompound>
{
    private final MonsterCapability instance;
    private final Capability<MonsterCapability> capability;

    public MonsterCapabilityProvider(int provider,Random random)
    {
//
//        int v =0 ;
//        switch (provider) {
//            case -1:
////                v=random.nextInt(110);
//                v=random.nextInt(110);
//                break;
//            case 0:
//                v=random.nextInt(100);
//                break;
//            case 1:
//                v=random.nextInt(120);
////                v=random.nextInt(120);
//                break;
//            default:
//                v=random.nextInt(130)+2;
//                break;
//        }
//        int v;
//        if(v>=118){
//            v=1000000-1;
//        } else if (v>=110) {
//            v=random.nextInt(1000000);
//        } else if (v>=100) {
//            v=random.nextInt(100000);
//        } else if (v>=80) {
//            v=random.nextInt(10000);
//        } else if (v>=50) {
//            v=random.nextInt(1000);
//        } else if (v>=20) {
//            v=random.nextInt(100);
//        } else {
//            v=random.nextInt(10);
//        }


        int v =0 ;
        switch (provider) {
            case -1:
                v =random.nextInt(1000);
                break;
            case 0:
                v =random.nextInt(100);
                break;
            case 1:
                v =random.nextInt(10000);
                break;
            case 1212:
                v =random.nextInt(20000);
                break;
            case 1213:
                v =random.nextInt(60000);
                break;
            case 1214:
                v =random.nextInt(180000);
                break;
            case 1215:
                v =random.nextInt(540000);
                break;
            case 1216:
                v =random.nextInt(1620000);
                break;
            case 1217:
                v =random.nextInt(5460000);
                break;
            case 1218:
                v =random.nextInt(16480000);
                break;
            default:
                v =random.nextInt(20000);
                break;
        }

        this.instance = new MonsterCapability(v+1,0);
        this.capability = CapabilityRegistryHandler.MONSTER_CAPABILITY;

    }
    public MonsterCapabilityProvider(Boolean b)
    {

        this.instance = new MonsterCapability();
        this.capability = CapabilityRegistryHandler.MONSTER_CAPABILITY;

    }
    public MonsterCapabilityProvider(int nianXian)
    {

        this.instance = new MonsterCapability(nianXian,0);
        this.capability = CapabilityRegistryHandler.MONSTER_CAPABILITY;

    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return this.capability.equals(capability);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return this.capability.equals(capability) ? this.capability.cast(this.instance) : null;
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        return this.instance.serializeNBT();
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
        this.instance.deserializeNBT(nbt);
    }
}
