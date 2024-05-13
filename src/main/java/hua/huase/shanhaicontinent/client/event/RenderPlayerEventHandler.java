package hua.huase.shanhaicontinent.client.event;

import hua.huase.shanhaicontinent.item.jineng.JinengMethond;
import hua.huase.shanhaicontinent.potion.PotionSeaMRender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Map;

@Mod.EventBusSubscriber
public class RenderPlayerEventHandler {

	public static ItemStack item = new ItemStack(JinengMethond.monsterCapabilityLists.get("haotianchui").get(0),1,0);

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void guiPostInit(RenderPlayerEvent.Post event) {
		EntityPlayer entityPlayer = event.getEntityPlayer();
		if(entityPlayer==null)return;




		Map<Potion, PotionEffect> activePotionMap = entityPlayer.getActivePotionMap();
		for (Potion potion : activePotionMap.keySet()) {
			if(potion instanceof PotionSeaMRender){
				((PotionSeaMRender)potion).entityRender(event);
			}
		}


	}


}
