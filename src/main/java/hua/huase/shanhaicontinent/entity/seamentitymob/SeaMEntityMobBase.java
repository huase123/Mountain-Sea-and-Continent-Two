package hua.huase.shanhaicontinent.entity.seamentitymob;

import hua.huase.shanhaicontinent.capability.MonsterCapabilityProvider;
import net.minecraft.entity.Entity;

import java.util.Random;

public interface SeaMEntityMobBase {
     MonsterCapabilityProvider addCapability(Entity entity, Random random);

     public static MonsterCapabilityProvider createCapability (Entity entity,Random random){

          MonsterCapabilityProvider monsterCapabilityProvider = new MonsterCapabilityProvider(10);

          switch (entity.world.provider.getDimension()) {
               case -1:
                    monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);
                    break;
               case 0:
                    monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);
                    break;
               case 1:
                    monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);
                    break;

               default:
                    monsterCapabilityProvider = new MonsterCapabilityProvider(entity.world.provider.getDimension(),random);
                    break;

          }
          int pow = (int) Math.pow(10, random.nextInt(3)+1);
//        return new MonsterCapabilityProvider(random.nextInt(pow +1)+1);
          return monsterCapabilityProvider;
     }

}
