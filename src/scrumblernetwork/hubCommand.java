package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class hubCommand extends Command {

    public hubCommand(main m){
        super("Hub");
    }

    @Override
    public void execute(CommandSender cs, String[] args) {
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§lSi sto inviando al server: §a§lHUB");
                ServerInfo Hub = ProxyServer.getInstance().getServerInfo("Hub");
                p.connect(Hub);
                System.out.print("BungeeCord | ScrumblerNetwork" + p + "Ti è stato inviato al server Hub");
            }
        }else{
            System.out.print("Non sei un Player!");
        }
    }
}
