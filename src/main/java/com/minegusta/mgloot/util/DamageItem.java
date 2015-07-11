package com.minegusta.mgloot.util;

public class DamageItem
{
    /**
     * Set the damage of an item.
     * @return A random new damage value for tools and armour.
     */
    public static short damage(short s)
    {
        int start = (int) s;
        int end = (start / 10) * RandomNumber.get(1, 5);
        return (short) end;
    }
}
