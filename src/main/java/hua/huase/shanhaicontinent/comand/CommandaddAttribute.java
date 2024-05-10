package hua.huase.shanhaicontinent.comand;

import hua.huase.shanhaicontinent.capability.PlayerCapability;
import hua.huase.shanhaicontinent.network.NetworkRegistryHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

import static hua.huase.shanhaicontinent.capability.CapabilityRegistryHandler.PLYAER_CAPABILITY;

public class CommandaddAttribute extends CommandBase {

    String[] attributName = new String[] {"shengming", "maxshengming", "jinshenli", "maxjinsheni", "fangyv", "baojilv", "baojishanghai", "xixue",
            "xixue", "zhenshang", "huifu", "shanbi", "wuchuan", "kangbao", "jingyan", "maxjingyan"};
    @Override
    public String getName() {
        return "addattribute";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "commands.addattribute.usage";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        int i = 0;
        Entity entity;
        if (args.length == 2)
        {
            entity = getCommandSenderAsPlayer(sender);
        }
        else
        {
            entity = getEntity(server, sender, args[0]);
            i = 1;
        }
        PlayerCapability capability = entity.getCapability(PLYAER_CAPABILITY, null);
        if(capability==null)return;
        if(args.length == i + 2){
            int num = Integer.parseInt(args[i+1]);
            if(num>10000||num<-10000) {
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.fail.num", num));
                return;
            }
            String s =args[i+0];

            if(s.equals("shengming")){
                capability.addShengming(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("maxshengming")){
                capability.addMaxshengming(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("jinshenli")){
                capability.addJingshenli(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("maxjinsheni")){
                capability.addMaxjingshenli(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("gongji")){
                capability.addWugong(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("fangyv")){
                capability.addWufang(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("baojilv")){
                capability.addBaojilv(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("baojishanghai")){
                capability.addBaojishanghai(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("xixue")){
                capability.addXixue(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("zhenshang")){
                capability.addZhenshang(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("huifu")){
                capability.addShengminghuifu(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("shanbi")){
                capability.addShanbi(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("wuchuan")){
                capability.addWuchuan(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("kangbao")){
                capability.addKangbao(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("jingyan")){
                capability.addJingyan(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            } else if (s.equals("maxjingyan")){
                capability.addMaxjingyan(num);
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.success"));
            }else {
                sender.getCommandSenderEntity().sendMessage(new TextComponentTranslation("message.addattribute.fail.attribute", s));
            }

            NetworkRegistryHandler.PlayerListen.sendClientCustomPacket((EntityPlayer) sender.getCommandSenderEntity());

        }else {

            throw new WrongUsageException("commands.addattribute.usage", new Object[0]);
        }


    }

    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos)
    {
        return args.length == 1 ? getListOfStringsMatchingLastWord(args, attributName) : Collections.emptyList();
    }

    // 可以不覆写，但默认权限要求是 4（即游戏管理员），所以请按需覆写
    @Override
    public int getRequiredPermissionLevel() {
        return 4; // 0 代表任何人都能用
    }
}
