package scrumblernetwork;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

import java.lang.reflect.Proxy;

public class main extends Plugin {

    @Override
    public void onEnable(){
        System.out.print("[ScrumblerNetwork] Plugin Abilitato Correttamente!");
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new contattiCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new hubCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new lobbyCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new vanillaCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new bedwarsCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new kitpvpCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new assistenzaCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new voteCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new teamspeakCommand(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new discordCommand(this));
    }

    public void onDisable(){
        System.out.print("[ScrumblerNetwork] Plugin Disabilitato Correttamente!");
    }

}
