package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class practiceCommand extends Command {

    public practiceCommand(main m){
        super("Practice");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§lTi sto inviando al server: §a§lPRACTICE");
                ServerInfo Practice = ProxyServer.getInstance().getServerInfo("Practice");
                p.connect(Practice);
            }
        }else{
            System.out.print("Non sei un Player!");
        }
    }

}
