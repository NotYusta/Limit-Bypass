package id.raznar.limitbypass;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling Plugin!");
        Bukkit.getLogger().info("----------------------------------");
        Bukkit.getLogger().info("Limit Bypass V1.0 Snapshot");
        Bukkit.getLogger().info(" ");
        Bukkit.getLogger().info(" Try our hosting! https://hosting.raznar.id/");
        Bukkit.getLogger().info("----------------------------------");
        Bukkit.getServer().getPluginManager().registerEvents(new Listeners(), this);
        Bukkit.getLogger().info("Limit-Bypass Successfully loaded");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Limit-Bypass has been disabled");
    }
}
