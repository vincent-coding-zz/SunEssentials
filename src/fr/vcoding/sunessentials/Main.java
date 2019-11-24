package fr.vcoding.sunessentials;

import org.bukkit.plugin.java.JavaPlugin;

import fr.vcoding.sunessentials.commands.*;
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
		getCommand("wc").setExecutor(new TimeClass());
		getCommand("ws").setExecutor(new TimeClass());
		getCommand("wr").setExecutor(new TimeClass());
		getCommand("fly").setExecutor(new FlyClass());
		getCommand("explode").setExecutor(new ExplodeClass());
		getCommand("top").setExecutor(new TopClass());
	}
	
	@Override
	public void onDisable() {
		System.out.println("[SunEssentials] Disabled");
	}
}
