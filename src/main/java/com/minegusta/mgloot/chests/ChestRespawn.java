package com.minegusta.mgloot.chests;

import com.minegusta.mgloot.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

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
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.PLUGIN, () -> {
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
        return l.getWorld().getLivingEntities().stream().filter(ent -> ent.getLocation().distance(l) < 12).anyMatch(ent -> ent instanceof Player);
    }
}
