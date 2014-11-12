package com.minegusta.mgloot.managers;

import com.minegusta.mgloot.util.RandomNumber;
import org.bukkit.inventory.ItemStack;

public class LootManager
{
    private int maxAmount;
    private ItemStack[] loot;
    private ItemStack[] table;

    public LootManager(ItemStack[] table, int maxAmount)
    {
        this.table = table;
        this.maxAmount = maxAmount;
        apply();
    }

    private void apply()
    {
        //Get the random amount of loot
        int amount = RandomNumber.get(1, maxAmount);

        //Set the loot amount
        loot = new ItemStack[amount];

        //Get the loot
        for(int i = 0; i < amount; i++)
        {
            loot[i] = table[RandomNumber.get(table.length) - 1];
        }
    }

    public ItemStack[] getLoot()
    {
        return loot;
    }
}
