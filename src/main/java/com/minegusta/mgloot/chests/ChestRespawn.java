package com.minegusta.mgloot.chests;

import com.minegusta.mgloot.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class ChestRespawn
{

    private int respawnTime;
    private Location l;

    public ChestRespawn(Location l, int respawnTime)
    {
        this.l = l;
        this.respawnTime = respawnTime * 20;
    }

    public void startRespawn()
    {
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.PLUGIN, new Runnable() {
            @Override
            public void run()
            {
                if(!hasPlayersNear())
                {
                    l.getBlock().setType(Material.CHEST);
                }
                else startRespawn();
            }
        }, respawnTime);
    }

    private boolean hasPlayersNear()
    {
        Entity temp = l.getWorld().spawnEntity(l, EntityType.EXPERIENCE_ORB);
        boolean players = false;
        for(Entity ent : temp.getNearbyEntities(12,12,12))
        {
            if(ent instanceof Player)
            {
                ((Player) ent).sendMessage(ChatColor.RED + "A chest spawn was blocked because you were too near.");
                players = true;
            }
        }
        return players;
    }
}
