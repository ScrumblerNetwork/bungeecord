package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class lobbyCommand extends Command {

    public lobbyCommand(main m){
        super("Lobby");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§lTi sto inviando al server: §a§lHUB");
                ServerInfo Lobby = ProxyServer.getInstance().getServerInfo("Hub");
                p.connect(Lobby);
            }
        }else{
            System.out.print("Non sei un Player!");
        }
    }

}
