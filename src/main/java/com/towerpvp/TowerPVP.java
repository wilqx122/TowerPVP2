package com.towerpvp;

import org.bukkit.plugin.java.JavaPlugin;

public class TowerPVP extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("TowerPVP aktywowany!");
        // Inicjalizacja tutaj
    }

    @Override
    public void onDisable() {
        getLogger().info("TowerPVP dezaktywowany.");
    }
}
