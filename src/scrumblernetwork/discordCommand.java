package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class discordCommand extends Command {

    public discordCommand(main m){
        super("Discord");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§l§m--------------------------------------------");
                p.sendMessage("§8§l- §7Server Discord:");
                p.sendMessage("§8§l- §7discord.scrumbler.it");
                p.sendMessage("§7§l§m--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Server Discord:");
            System.out.print("- discord.scrumbler.it");
            System.out.print("--------------------------------------------");
        }
    }
}
