package fr.vcoding.sunessentials;

import org.bukkit.plugin.java.JavaPlugin;

import fr.vcoding.sunessentials.commands.CommandGM;
import fr.vcoding.sunessentials.commands.SkCommand;
import fr.vcoding.sunessentials.commands.Suicides;
import fr.vcoding.sunessentials.commands.bcCommand;
import fr.vcoding.sunessentials.commands.resetEffect;
import fr.vcoding.sunessentials.commands.vanishCommand;

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
	}

	@Override
	public void onDisable() {
		System.out.println("[SunEssentials] Disabled");
	}
	
}
