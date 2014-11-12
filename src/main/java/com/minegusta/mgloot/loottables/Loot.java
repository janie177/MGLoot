package com.minegusta.mgloot.loottables;

import com.minegusta.mgloot.util.DamageItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Loot
{

    public static final ItemStack[] defaultLoot =
        {

        new ItemStack(Material., 1)
        {
            {
                //The meta and lore
                ItemMeta meta = getItemMeta();
                List<String> lore = meta.getLore();

                // -------- Put specifications here
                meta.setDisplayName("");
                lore.add("");
                //Only for items that can be damaged
                setDurability(DamageItem.damage(getDurability()));

                //Set the meta
                meta.setLore(lore);
                setItemMeta(meta);
            }
        },
    };

    public static final ItemStack[] foodLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };

    public static final ItemStack[] toolLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static final ItemStack[] normalLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static final ItemStack[] goodLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static final ItemStack[] ultraLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static final ItemStack[] healingLoot =
            {

                    new ItemStack(Material., 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("");
                            lore.add("");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
}
