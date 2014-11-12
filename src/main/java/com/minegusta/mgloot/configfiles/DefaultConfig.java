package com.minegusta.mgloot.configfiles;

import com.minegusta.mgloot.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class DefaultConfig
{
    public static void loadConfig()
    {
        Main.PLUGIN.saveDefaultConfig();
    }

    public static FileConfiguration getConfig()
    {
        return Main.PLUGIN.getConfig();
    }

    public static void saveConfig()
    {
        Main.PLUGIN.saveConfig();
    }
}
