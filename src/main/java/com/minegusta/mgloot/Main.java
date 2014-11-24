package com.minegusta.mgloot;

import com.minegusta.mgloot.chests.ChestListener;
import com.minegusta.mgloot.chests.RespawnOnStart;
import com.minegusta.mgloot.configfiles.DefaultConfig;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Plugin PLUGIN;
    @Override
    public void onEnable()
    {
        //Define the plugin.
        PLUGIN = this;

        //Load config files.
        DefaultConfig.loadConfig();

        //Register listeners.
        Bukkit.getPluginManager().registerEvents(new ChestListener(), this);

        //Respawn all chests.
        RespawnOnStart.respawn();

        //Start tasks.

    }

    @Override
    public void onDisable()
    {
        //Stop tasks.

    }
}
