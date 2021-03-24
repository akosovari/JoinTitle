package jointitle;

import jointitle.events.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;


import static jointitle.configfiles.ConfigRead.*;

public final class Main extends JavaPlugin {

    private static Main instance;
    public boolean enabled;

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);

        instance = this;
        enabled = true;

        getLogger().info(startup_message);
    }

    @Override
    public void onDisable() {

        getLogger().info(shutdown_message);
        HandlerList.unregisterAll(this);
        enabled = false;
    }
    public static Main getInstance() {
        return instance;
    }
}
