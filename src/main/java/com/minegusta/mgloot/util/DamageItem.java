package com.minegusta.mgloot.util;

public class DamageItem
{
    /**
     * Set the damage of an item.
     * @return A random new damage value for tools and armour.
     */
    public static short damage(short s)
    {
        return (short) (s - (s / RandomNumber.get(2, 6)));
    }
}
