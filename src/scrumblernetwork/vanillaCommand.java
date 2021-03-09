package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class vanillaCommand extends Command {

    public vanillaCommand(main m){
        super("Vanilla");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§a§lLa modalità Vanilla ha cambiato nome!");
                p.sendMessage("§a§lOra si chiama survival.");
                p.sendMessage("§a§lPer entrare fai il comando /survival");
            }
        }else{
            System.out.print("Non sei un Player!");
        }
    }

}
