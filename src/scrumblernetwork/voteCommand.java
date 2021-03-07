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
                p.sendMessage("§e§l--------------------------------------------");
                p.sendMessage("§8§l- §a§lSiti per Votare il Server:");
                p.sendMessage("§8§l- §a§l1) §fmcserveritalia.it");
                p.sendMessage("§8§l- §a§l2) §fhttps://minecraft-mp.com/server-s277712");
                p.sendMessage("§e§l--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Siti per Votare il Server:");
            System.out.print("- 1) mcserveritalia.it");
            System.out.print("- 2) https://minecraft-mp.com/server-s277712");
            System.out.print("--------------------------------------------");
        }
    }

}
