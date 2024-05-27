package hua.huase.shanhaicontinent.api;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class WorldApi {


            public static Item randGetItem(Random random){

                int i1 = random.nextInt(Item.REGISTRY.getKeys().size());
                int x = 0;
                for (Item key : Item.REGISTRY) {
                    if(x==i1){
                        return key;
                    }
                    x++;
                }

                return Items.AIR;
            }
}
