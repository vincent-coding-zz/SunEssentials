package fr.vcoding.sunessentials;

import org.bukkit.plugin.java.JavaPlugin;

import fr.vcoding.sunessentials.commands.BrodcastClass;
import fr.vcoding.sunessentials.commands.EffectClass;
import fr.vcoding.sunessentials.commands.GamemodeClass;
import fr.vcoding.sunessentials.commands.SkClass;
import fr.vcoding.sunessentials.commands.SuicideClass;
import fr.vcoding.sunessentials.commands.TimeClass;
import fr.vcoding.sunessentials.commands.VanishClass;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("[SunEssentials] Enabled");
		getCommand("gm").setExecutor(new GamemodeClass());
		getCommand("suicide").setExecutor(new SuicideClass());
		getCommand("sk").setExecutor(new SkClass());
		getCommand("bc").setExecutor(new BrodcastClass());
		getCommand("alert").setExecutor(new BrodcastClass());
		getCommand("reffect").setExecutor(new EffectClass());
		getCommand("vanish").setExecutor(new VanishClass());
		getCommand("unvanish").setExecutor(new VanishClass());
		getCommand("day").setExecutor(new TimeClass());
		getCommand("night").setExecutor(new TimeClass());
		getCommand("wclear").setExecutor(new TimeClass());
		getCommand("storm").setExecutor(new TimeClass());
		getCommand("wrain").setExecutor(new TimeClass());
	}
	
	@Override
	public void onDisable() {
		System.out.println("[SunEssentials] Disabled");
	}
}
