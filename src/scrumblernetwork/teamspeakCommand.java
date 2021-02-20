package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class teamspeakCommand extends Command {

    public teamspeakCommand(main m){
        super("TeamSpeak");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§a§lServer TeamSpeak:");
                p.sendMessage("§a§lts3.scrumbler.it");
            }
        }else{
            System.out.print("Server TeamSpeak:");
            System.out.print("ts3.scrumbler.it");
        }
    }

}
