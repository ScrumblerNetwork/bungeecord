package scrumblernetwork;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import javax.sound.midi.SysexMessage;

public class teamspeakCommand extends Command {

    public teamspeakCommand(main m){
        super("TeamSpeak");
    }

    @Override
    public void execute(CommandSender cs, String[] args){
        if(cs instanceof ProxiedPlayer){
            if(args.length == 0){
                ProxiedPlayer p = (ProxiedPlayer) cs;
                p.sendMessage("§7§l§m--------------------------------------------");
                p.sendMessage("§8§l- §7Server TeamSpeak:");
                p.sendMessage("§8§l- §7ts3.scrumbler.it");
                p.sendMessage("§8§L- §7ATTUALMENTE IN MANUTENZIONE");
                p.sendMessage("§7§l§m--------------------------------------------");
            }
        }else{
            System.out.print("--------------------------------------------");
            System.out.print("- Server TeamSpeak:");
            System.out.print("- ts3.scrumbler.it");
            System.out.print("- ATTUALMENTE IN MANUTENZIONE");
            System.out.print("--------------------------------------------");
        }
    }

}
