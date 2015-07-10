package com.minegusta.mgloot.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class StringLocConverter
{

    public static String locationToString(Location l)
    {
        return Integer.toString((int)l.getX()) + "&" + Integer.toString((int)l.getY()) + "&" + Integer.toString((int)l.getZ()) + "&" + l.getWorld().getName();
    }

    public static Location stringToLocation(String s)
    {
        String[] split = s.split("&");
        int x = (int) Double.parseDouble(split[0]);
        int y = (int) Double.parseDouble(split[1]);
        int z = (int) Double.parseDouble(split[2]);
        World w = null;

        try{
            w = Bukkit.getWorld(split[3]);
        }catch (Exception ignored){}

        return new Location(w, x, y, z);
    }

}
