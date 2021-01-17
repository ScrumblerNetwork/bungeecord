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
        if(args.length == 0){
            ProxiedPlayer p = (ProxiedPlayer) cs;
            p.sendMessage("§a§lContatti");
            p.sendMessage("§aEmail:");
            p.sendMessage("§aSegnalazione Bugs: bug.minecraft@scrumblernetwork.com");
            p.sendMessage("§aUfficiale: official@scrumblernetwork.com");
            p.sendMessage("§aSupport: support@scrumblernetwork.com");
        }
    }

}
