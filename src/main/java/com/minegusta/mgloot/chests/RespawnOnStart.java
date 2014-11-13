package com.minegusta.mgloot.chests;

import com.minegusta.mgloot.configfiles.ConfigHandler;
import org.bukkit.Location;
import org.bukkit.Material;

public class RespawnOnStart
{
    public static void respawn()
    {
        for(Location l : ConfigHandler.getChestLocations())
        {
            l.getWorld().getBlockAt(l).setType(Material.CHEST);
        }
    }
}
