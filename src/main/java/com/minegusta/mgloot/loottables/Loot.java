package com.minegusta.mgloot.loottables;

import com.minegusta.mgloot.util.DamageItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Loot
{
    public static ItemStack[] defaultLoot =
            {

                    new ItemStack(Material.WOOD_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Weapon");
                            lore.add(ChatColor.GREEN + "Good for poking zombies.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.WOOD_AXE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Axe");
                            lore.add(ChatColor.GREEN + "What genius ever came up with");
                            lore.add(ChatColor.GREEN + "the idea to chop wood with wood..");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.STONE_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Stone Weapon");
                            lore.add(ChatColor.GREEN + "It's better than wood I guess..");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.STONE_AXE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Stone Woodcutting Axe");
                            lore.add(ChatColor.GREEN + "May I axe you a question?");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.LEATHER_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Man Boots");
                            lore.add(ChatColor.GREEN + "Expensive tacky Italian leather shoes.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.LEATHER_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Leather Jacket");
                            lore.add(ChatColor.GREEN + "Better not show this to any vegans.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.LEATHER_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Leather Cap");
                            lore.add(ChatColor.GREEN + "Good for hiding your tacky hair.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.LEATHER_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Man Pants");
                            lore.add(ChatColor.GREEN + "False! Real men wear no pants.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.SNOW_BALL, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Ball Of Rubbish");
                            lore.add(ChatColor.GREEN + "A dirty throwable ball.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.SLIME_BALL, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Weird Goo");
                            lore.add(ChatColor.GREEN + "You don't want to know where this came from.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.PAPER, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Bandage");
                            lore.add(ChatColor.GREEN + "Right click to heal yourself or others.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GLASS_BOTTLE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Empty Bottle");
                            lore.add(ChatColor.GREEN + "Maybe you should fill this. You know, just in case.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.ARROW, 2)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Pointy Arrows");
                            lore.add(ChatColor.GREEN + "Pointy Shooty! To be used with a bow.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Bow");
                            lore.add(ChatColor.GREEN + "An archer's first choice.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOWL, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Empty Bowl");
                            lore.add(ChatColor.GREEN + "Even emptier than your food bar.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Boots");
                            lore.add(ChatColor.GREEN + "I wonder how they made shoes out of this stuff.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Helmet");
                            lore.add(ChatColor.GREEN + "Your hair is still tacky.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    }
            };

    public static ItemStack[] foodLoot =
            {

                    new ItemStack(Material.MELON, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Slice of Water Melon");
                            lore.add(ChatColor.GREEN + "I could have put a racist pun here but I did not.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTATO_ITEM, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Nommable Potato");
                            lore.add(ChatColor.GREEN + "Mash 'em Boil 'em Stick 'em in a stew.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CARROT_ITEM, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Tasty Carrot");
                            lore.add(ChatColor.GREEN + "Cawwots awe fow wabbits.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Bottled Water");
                            lore.add(ChatColor.GREEN + "Clean water for drinking purposes.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.RAW_FISH, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Raw Fish");
                            lore.add(ChatColor.GREEN + "Juicy fish, fresh and raw.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.RAW_CHICKEN, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Raw Chicken Meat");
                            lore.add(ChatColor.GREEN + "I love the smell of salmonella in the morning.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.COCOA, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Cocoa Beans");
                            lore.add(ChatColor.GREEN + "An ingredient for cookies.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.WHEAT, 2)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Grain");
                            lore.add(ChatColor.GREEN + "Used to make edible food.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.COOKIE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chocolate Chip Cookie");
                            lore.add(ChatColor.GREEN + "Because an apocalypse without cookies would suck.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BROWN_MUSHROOM, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Brown Mushroom");
                            lore.add(ChatColor.GREEN + "It smells and looks like dirt.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.RED_MUSHROOM, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Red Mushroom");
                            lore.add(ChatColor.GREEN + "Maybe you will grow if you eat it.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.ROTTEN_FLESH, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Rotting Flesh");
                            lore.add(ChatColor.GREEN + "Tasty rotting human meat.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    }
            };

    public static ItemStack[] toolLoot =
            {

                    new ItemStack(Material.STONE_BUTTON, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Stone Button");
                            lore.add(ChatColor.GREEN + "I can place this to open doors.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.WOOD_HOE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Scythe");
                            lore.add(ChatColor.GREEN + "Scythe sounds cooler than hoe right?");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.WOOD_SPADE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Spade");
                            lore.add(ChatColor.GREEN + "Makes digging your own grave easier.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.STICK, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Stick");
                            lore.add(ChatColor.GREEN + "This will STICK with you :DD");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.FLINT, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Flint");
                            lore.add(ChatColor.GREEN + "Glorious flint.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.FEATHER, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Feather");
                            lore.add(ChatColor.GREEN + "Can be used to create arrows.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.WOOD_PICKAXE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Pickaxe");
                            lore.add(ChatColor.GREEN + "Screw logic, wood breaks stone. Sure.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static ItemStack[] normalLoot =
            {

                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Sword");
                            lore.add(ChatColor.GREEN + "A sharp Blade.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Chest");
                            lore.add(ChatColor.GREEN + "Lots of small rings to protect you.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Pants");
                            lore.add(ChatColor.GREEN + "Don't pee your pants or it will rust.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Shoes");
                            lore.add(ChatColor.GREEN + "At least those are not tacky.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Chest Plate");
                            lore.add(ChatColor.GREEN + "Must weigh a lot.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Helmet");
                            lore.add(ChatColor.GREEN + "This will reflect your tacky hair better.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Pants");
                            lore.add(ChatColor.GREEN + "Hammertime.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Bow");
                            lore.add(ChatColor.GREEN + "Pew Pew Pew.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Helmet");
                            lore.add(ChatColor.GREEN + "Decently protecting iron head wear.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Boots");
                            lore.add(ChatColor.GREEN + "Crush your enemies with these stylish boots.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.ARROW, 4)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Pointy Arrows");
                            lore.add(ChatColor.GREEN + "Pointy Shooty! To be used with a bow.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Boots");
                            lore.add(ChatColor.GREEN + "I wonder how they made shoes out of this stuff.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Helmet");
                            lore.add(ChatColor.GREEN + "Your hair is still tacky.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    }
            };
    public static ItemStack[] goodLoot =
            {

                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Sword");
                            lore.add(ChatColor.GREEN + "A sharp Blade.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Chest");
                            lore.add(ChatColor.GREEN + "Lots of small rings to protect you.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Pants");
                            lore.add(ChatColor.GREEN + "Don't pee your pants or it will rust.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Shoes");
                            lore.add(ChatColor.GREEN + "At least those are not tacky.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Chest Plate");
                            lore.add(ChatColor.GREEN + "Must weigh a lot.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Helmet");
                            lore.add(ChatColor.GREEN + "This will reflect your tacky hair better.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.GOLD_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Golden Pants");
                            lore.add(ChatColor.GREEN + "Hammertime.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Wooden Bow");
                            lore.add(ChatColor.GREEN + "Pew Pew Pew.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Helmet");
                            lore.add(ChatColor.GREEN + "Decently protecting iron head wear.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Boots");
                            lore.add(ChatColor.GREEN + "Crush your enemies with these stylish boots.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.ARROW, 4)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Pointy Arrows");
                            lore.add(ChatColor.GREEN + "Pointy Shooty! To be used with a bow.");
                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Boots");
                            lore.add(ChatColor.GREEN + "I wonder how they made shoes out of this stuff.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Chest");
                            lore.add(ChatColor.GREEN + "Mighty protection.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Leggings");
                            lore.add(ChatColor.GREEN + "These will keep you safe.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.FIRE_ASPECT, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.KNOCKBACK, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.DURABILITY, 2);
                            addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
                            addEnchantment(Enchantment.KNOCKBACK, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.ENDER_PEARL, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Grenade");
                            lore.add(ChatColor.GREEN + "Throw this to get rid of your problems.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.ARROW_FIRE, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Powerful Bow");
                            lore.add(ChatColor.GREEN + "This bow will help you stay alive.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                            meta.setDisplayName(ChatColor.YELLOW + "Powerful Bow");
                            lore.add(ChatColor.GREEN + "This bow will help you stay alive.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_INGOT, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Ingot");
                            lore.add(ChatColor.GREEN + "This can be used to craft or repair.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.CHAINMAIL_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Chain Helmet");
                            lore.add(ChatColor.GREEN + "Your hair is still tacky.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    }
            };
    public static ItemStack[] ultraLoot =
            {
                    new ItemStack(Material.ENDER_PEARL, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Grenade");
                            lore.add(ChatColor.GREEN + "Throw this to get rid of your problems.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.ARROW_FIRE, 1);
                            addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Powerful Bow");
                            lore.add(ChatColor.GREEN + "This bow will help you stay alive.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.BOW, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.ARROW_KNOCKBACK, 3);
                            addEnchantment(Enchantment.DURABILITY, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Powerful Bow");
                            lore.add(ChatColor.GREEN + "This bow will help you stay alive.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.DURABILITY, 2);
                            addEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
                            addEnchantment(Enchantment.KNOCKBACK, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "A mighty blade.");
                            lore.add(ChatColor.GREEN + "Sharp and deadly.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_CHESTPLATE, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Chest");
                            lore.add(ChatColor.GREEN + "Mighty protection.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_LEGGINGS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Leggings");
                            lore.add(ChatColor.GREEN + "These will keep you safe.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_HELMET, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Helmet");
                            lore.add(ChatColor.GREEN + "Decently protecting iron head wear.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.IRON_BOOTS, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            addEnchantment(Enchantment.PROTECTION_FALL, 1);
                            meta.setDisplayName(ChatColor.YELLOW + "Iron Boots");
                            lore.add(ChatColor.GREEN + "Crush your enemies with these stylish boots.");
                            //Only for items that can be damaged
                            setDurability(DamageItem.damage(getDurability()));

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.DIAMOND, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Shiny Diamond");
                            lore.add(ChatColor.GREEN + "A very valuable resource!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.DIAMOND_SWORD, 1)
                    {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName(ChatColor.YELLOW + "Diamond Sword");
                            lore.add(ChatColor.GREEN + "The strongest sword available.");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
            };
    public static ItemStack[] healingLoot =
            {

                    new ItemStack(Material.POTION, 1, (short) 8197) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 8229) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 16389) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 16421) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 8193) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 16385) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    },
                    new ItemStack(Material.POTION, 1, (short) 8225) {
                        {
                            //The meta and lore
                            ItemMeta meta = getItemMeta();
                            List<String> lore = meta.getLore();

                            // -------- Put specifications here
                            meta.setDisplayName("Potion of Healing");
                            lore.add("Totally not a placebo I swear!");

                            //Set the meta
                            meta.setLore(lore);
                            setItemMeta(meta);
                        }
                    }
            };
}
