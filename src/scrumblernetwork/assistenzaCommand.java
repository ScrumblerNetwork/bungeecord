package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class assistenzaCommand extends Command {

    public assistenzaCommand(main m){
        super("Assistenza");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§l§m--------------------------------------------");
                p.sendMessage("§8§l- §7Mail Supporto:");
                p.sendMessage("§8§l- §7support@scrumblernetwork.com");
                p.sendMessage("§7§l§m--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Mail Supporto:");
            System.out.print("- support@scrumblernetwork.com");
            System.out.print("--------------------------------------------");
        }
    }

}
