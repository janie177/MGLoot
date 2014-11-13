package com.minegusta.mgloot.chests;

import com.minegusta.mgloot.configfiles.ConfigHandler;
import com.minegusta.mgloot.loottables.Loot;
import com.minegusta.mgloot.loottables.LootItem;
import com.minegusta.mgloot.managers.LootManager;
import com.minegusta.mgloot.util.StringLocConverter;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ChestListener implements Listener
{
    @EventHandler(priority = EventPriority.LOWEST)
    public void onEvent(PlayerInteractEvent e)
    {
        if(!ConfigHandler.isInWorld(e.getPlayer().getWorld().getName()))return;


        Player p = e.getPlayer();

        if(e.hasBlock() && e.getClickedBlock().getType() == Material.CHEST)
        {
            Block b = e.getClickedBlock();
            Material m = b.getRelative(BlockFace.DOWN).getType();
            Location l = e.getClickedBlock().getLocation();

            if(p.isOp() && e.getPlayer().getItemInHand() != null && e.getPlayer().getItemInHand().getType().equals(Material.BLAZE_ROD))
            {
                boolean enabled = ConfigHandler.toggleChest(l);
                if(enabled)
                {
                    p.sendMessage(ChatColor.GREEN + "You have " + ChatColor.DARK_GREEN + "REGISTERED" + ChatColor.GREEN + " this chest.");
                }
                else
                {
                    p.sendMessage(ChatColor.GREEN + "You have " + ChatColor.DARK_RED + "UNREGISTERED" + ChatColor.GREEN + " this chest.");
                }

            } else if(ConfigHandler.getChests().contains(StringLocConverter.locationToString(l))){

                int maxAmount;
                LootItem[] table;
                //In seconds is multiplied later.
                int respawnTime;

                switch (m) {
                    case DIAMOND_BLOCK: {
                        maxAmount = 2;
                        table = Loot.ultraLoot;
                        respawnTime = 600;
                    }
                    break;
                    case EMERALD_BLOCK: {
                        maxAmount = 3;
                        table = Loot.goodLoot;
                        respawnTime = 450;
                    }
                    break;
                    case IRON_BLOCK: {
                        maxAmount = 4;
                        table = Loot.normalLoot;
                        respawnTime = 300;
                    }
                    break;
                    case HAY_BLOCK: {
                        maxAmount = 4;
                        table = Loot.foodLoot;
                        respawnTime = 160;
                    }
                    break;
                    case CLAY: {
                        maxAmount = 2;
                        table = Loot.toolLoot;
                        respawnTime = 180;
                    }
                    break;
                    case REDSTONE_BLOCK: {
                        maxAmount = 3;
                        table = Loot.healingLoot;
                        respawnTime = 250;
                    }
                    break;
                    default: {
                        maxAmount = 3;
                        table = Loot.defaultLoot;
                        respawnTime = 160;
                    }
                    break;
                }
                //Spawn the loot
                LootManager manager = new LootManager(table, maxAmount);
                for (ItemStack is : manager.getLoot()) {
                    l.getWorld().dropItemNaturally(l, is);
                }

                //Make the chest dissapear
                b.setType(Material.AIR);
                b.getWorld().spigot().playEffect(l, Effect.MOBSPAWNER_FLAMES);
                b.getWorld().spigot().playEffect(l, Effect.LARGE_SMOKE);
                b.getWorld().playSound(l, Sound.CHICKEN_EGG_POP, 1, 1);


                //Start a chest respawn timer
                ChestRespawn respawn = new ChestRespawn(l, respawnTime);
                respawn.startRespawn();
                e.setCancelled(true);
            }
        }
    }
}
