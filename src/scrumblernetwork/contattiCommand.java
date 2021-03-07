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
                p.sendMessage("§e§l------------------------------------------------");
                p.sendMessage("§a§l         ------- Contatti -------");
                p.sendMessage("§8§l- §aEmail:");
                p.sendMessage("§8§l- §aSegnalazione Bugs: bug.minecraft@scrumblernetwork.com");
                p.sendMessage("§8§l- §aUfficiale: official@scrumblernetwork.com");
                p.sendMessage("§8§l- §aSupport: support@scrumblernetwork.com");
                p.sendMessage("§e§l------------------------------------------------");
            }
        }else{
            System.out.print("------------------------------------------------");
            System.out.print("Contatti");
            System.out.print("Email:");
            System.out.print("Segnalazione Bugs: bug.minecraft@scrumblernetwork.com");
            System.out.print("Ufficiale: official@scrumblernetwork.com");
            System.out.print("Support: support@scrumblernetwork.com");
            System.out.print("------------------------------------------------");
        }
    }

}
