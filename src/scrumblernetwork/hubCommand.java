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
        if(args.length == 0){
            ProxiedPlayer p = (ProxiedPlayer) cs;
            ServerInfo Hub = ProxyServer.getInstance().getServerInfo("Hub");
            p.connect(Hub);
        }
    }
}
