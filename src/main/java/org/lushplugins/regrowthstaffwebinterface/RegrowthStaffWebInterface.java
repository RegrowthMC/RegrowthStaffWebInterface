package org.lushplugins.regrowthstaffwebinterface;

import org.bukkit.plugin.java.JavaPlugin;

public final class RegrowthStaffWebInterface extends JavaPlugin {
    private static RegrowthStaffWebInterface plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static RegrowthStaffWebInterface getInstance() {
        return plugin;
    }
}
