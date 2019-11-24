package fr.vcoding.sunessentials;

import org.bukkit.plugin.java.JavaPlugin;

import fr.vcoding.sunessentials.commands.*;
public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		System.out.println("[SunEssentials] Enabled");
		getCommand("gm").setExecutor(new CommandGM());
		getCommand("suicide").setExecutor(new Suicides());
		getCommand("sk").setExecutor(new SkCommand());
		getCommand("bc").setExecutor(new bcCommand());
		getCommand("alert").setExecutor(new bcCommand());
		getCommand("reffect").setExecutor(new resetEffect());
		getCommand("vanish").setExecutor(new vanishCommand());
		getCommand("unvanish").setExecutor(new vanishCommand());
		getCommand("day").setExecutor(new TimeClass());
		getCommand("night").setExecutor(new TimeClass());
		getCommand("wclear").setExecutor(new TimeClass());
		getCommand("storm").setExecutor(new TimeClass());
		getCommand("wrain").setExecutor(new TimeClass());
		getCommand("wc").setExecutor(new TimeClass());
		getCommand("wr").setExecutor(new TimeClass());
		getCommand("ws").setExecutor(new TimeClass());
		getCommand("fly").setExecutor(new flyClass());
		getCommand("explode").setExecutor(new Explode());
		getCommand("top").setExecutor(new TopCmd());
	}

	@Override
	public void onDisable() {
		System.out.println("[SunEssentials] Disabled");
	}
	
}
