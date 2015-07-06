package com.minegusta.mgloot.chests;

import com.minegusta.mgloot.Main;
import com.minegusta.mgloot.configfiles.ConfigHandler;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;

public class RespawnOnStart
{
    public static void respawn()
    {
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.PLUGIN, ()-> {
            if(ConfigHandler.getChestLocations() == null) return;
            for(Location l : ConfigHandler.getChestLocations())
            {
                l.getBlock().setType(Material.CHEST);
            }
        }, 20 * 30);
    }
}
