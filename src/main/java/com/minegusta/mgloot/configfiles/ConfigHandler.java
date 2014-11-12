package com.minegusta.mgloot.configfiles;

import com.google.common.collect.Lists;
import com.minegusta.mgloot.util.StringLocConverter;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigHandler
{
    private static final List<String> worlds = config().getStringList("enabled_worlds");

    /**
     * The path to save the chests in.
     */
    private static String path = "chests";

    /**
     * Getting the config
     * @return Returns the default fileocnfiguration;
     */
    private static FileConfiguration config()
    {
        return DefaultConfig.getConfig();
    }

    /**
     * Get all chests as a String list. Convert it using StringLocConverter.
     * @return Stringlist of chests.
     */
    public static List<String> getChests()
    {
        return config().getStringList(path);
    }

    /**
     * Return all chests as locations.
     * @return A list of locations that contain a chest.
     */
    public static List<Location> getChestLocations()
    {
        if(config().isSet(path))
        {
            List<Location> locations = Lists.newArrayList();

            List<String> chests = config().getStringList(path);
            for(String chest : chests)
            {
                locations.add(StringLocConverter.stringToLocation(chest));
            }

            //Return the list
            return locations;
        }
        else return null;
    }

    /**
     * Toggle a location to be a chest spawn spot. On/Off toggle.
     * @param l The location of the chest.
     * @Return if the chest was enabled or not.
     */
    public static boolean toggleChest(Location l)
    {
        boolean added = true;
        List<String> chests = getChests();
        String chest = StringLocConverter.locationToString(l);

        if(chests.contains(chest))
        {
            chests.remove(chest);
            added = false;
        }
        else
        {
            chests.add(chest);
        }
        config().set(path, chests);
        DefaultConfig.saveConfig();
        return added;
    }

    /**
     * Is the world enabled?
     * @param worldName The name of the world that is checked.
     * @return if the world is in the list of enabled worlds.
     */
    public static boolean isInWorld(String worldName)
    {
        return worlds.contains(worldName);
    }

}
