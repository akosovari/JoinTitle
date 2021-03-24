package jointitle.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static jointitle.configfiles.ConfigRead.*;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

            e.getPlayer().sendTitle(ChatColor.translateAlternateColorCodes('&', title_text), ChatColor.translateAlternateColorCodes('&',subtitle_text), fade_in, show, fade_out);

    }

}
