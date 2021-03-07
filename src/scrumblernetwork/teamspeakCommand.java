package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import javax.sound.midi.SysexMessage;

public class teamspeakCommand extends Command {

    public teamspeakCommand(main m){
        super("TeamSpeak");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§e§l--------------------------------------------");
                p.sendMessage("§8§l- §a§lServer TeamSpeak:");
                p.sendMessage("§8§l- §a§lts3.scrumbler.it");
                p.sendMessage("§e§l--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Server TeamSpeak:");
            System.out.print("- ts3.scrumbler.it");
            System.out.print("--------------------------------------------");
        }
    }

}
