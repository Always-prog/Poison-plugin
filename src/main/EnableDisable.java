package main;

import org.bukkit.plugin.java.JavaPlugin;

public class EnableDisable extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("ENABLED NBTEffect plugin, created by AlwaysProg (always.prog@gmail.com)");
        getServer().getPluginManager().registerEvents(new AttackHandler(), this);

    }
}
