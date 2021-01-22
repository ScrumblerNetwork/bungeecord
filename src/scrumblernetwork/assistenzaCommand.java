package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class assistenzaCommand extends Command {

    public assistenzaCommand(main m){
        super("Assistenza");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§a§lMail Supporto:");
                p.sendMessage("§asupport@scrumblernetwork.com");
                p.sendMessage("§a§lNumero Di Telefono Supporto:");
                p.sendMessage("§a02 8719 9566");
            }
        }else{
            System.out.print("Mail Supporto:");
            System.out.print("support@scrumblernetwork.com");
            System.out.print("Numero Di Telefono Supporto:");
            System.out.print("02 8719 9566");
        }
    }

}
