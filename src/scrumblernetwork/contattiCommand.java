package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class contattiCommand extends Command {

    public contattiCommand(main m){
        super("Contatti");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§l§m--------------------------------------------");
                p.sendMessage("§a§l                   Contatti");
                p.sendMessage("§8§l- §7Email:");
                p.sendMessage("§8§l- §7Segnalazione Bugs: bug.minecraft@scrumblernetwork.com");
                p.sendMessage("§8§l- §7Ufficiale: official@scrumblernetwork.com");
                p.sendMessage("§8§l- §7Support: support@scrumblernetwork.com");
                p.sendMessage("§7§l§m--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("Contatti");
            System.out.print("Email:");
            System.out.print("Segnalazione Bugs: bug.minecraft@scrumblernetwork.com");
            System.out.print("Ufficiale: official@scrumblernetwork.com");
            System.out.print("Support: support@scrumblernetwork.com");
            System.out.print("--------------------------------------------");
        }
    }

}
