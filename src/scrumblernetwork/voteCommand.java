package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class voteCommand extends Command {

    public voteCommand(main m){
        super("Vote");
    }

    @Override
    public void execute (CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§l§m--------------------------------------------");
                p.sendMessage("§8§l- §7Siti per Votare il Server:");
                p.sendMessage("§8§l- §71) §fhttps://minecraft-italia.it/server/scrumblernetwork");
                p.sendMessage("§8§l- §72) §fmcserveritalia.it");
                p.sendMessage("§8§l- §73) §fhttps://minecraft-mp.com/server-s277712");
                p.sendMessage("§7§l§m--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Siti per Votare il Server:");
            System.out.print("- 1) https://minecraft-italia.it/server/scrumblernetwork");
            System.out.print("- 2) mcserveritalia.it");
            System.out.print("- 3) https://minecraft-mp.com/server-s277712");
            System.out.print("--------------------------------------------");
        }
    }

}
