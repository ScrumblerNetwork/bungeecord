package scrumblernetwork;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class main extends Plugin {

    @Override
    public void onEnable(){
        System.out.print("§a[ScrumblerNetwork] Plugin Abilitato Correttamente!");
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new contattiCommand(this));
    }

}
