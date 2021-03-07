package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class bedwarsCommand extends Command {

    public bedwarsCommand(main m){
        super("BedWars");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§lSi sto inviando al server: §a§lBEDWARS");
                ServerInfo BedWars = ProxyServer.getInstance().getServerInfo("BedWars");
                p.connect(BedWars);
                System.out.print("BungeeCord | ScrumblerNetwork" + p + "Si è stato inviato al server BedWars");
            }
        }else{
            System.out.print("Non sei un Player!");
        }
    }

}
