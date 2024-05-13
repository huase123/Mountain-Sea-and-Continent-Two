package hua.huase.shanhaicontinent.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PotionSeaMRender extends Potion {
    protected PotionSeaMRender(boolean isBadEffectIn, int liquidColorIn) {
        super(isBadEffectIn, liquidColorIn);
    }

    @SideOnly(Side.CLIENT)
    public void entityRender(RenderPlayerEvent.Post event){

    }

}
