package jointitle.configfiles;

import jointitle.events.JoinEvent;
import jointitle.Main;

public class ConfigRead extends JoinEvent {

    public static String title_text = Main.getInstance().getConfig().getString("display-title");
    public static String subtitle_text = Main.getInstance().getConfig().getString("display-subtitle");

    public static int fade_in = Main.getInstance().getConfig().getInt("fade-in");
    public static int show = Main.getInstance().getConfig().getInt("show");
    public static int fade_out = Main.getInstance().getConfig().getInt("fade-out");

    public static String startup_message = Main.getInstance().getConfig().getString("startup-message");
    public static String shutdown_message = Main.getInstance().getConfig().getString("shutdown-message");

}
