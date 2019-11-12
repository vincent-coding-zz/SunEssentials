package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TimeClass implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("day")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "time set day");
			sender.sendMessage("The day has been set right!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("night")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "time set night");
			sender.sendMessage("The night has been set right!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("wclear")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "weather clear");
			sender.sendMessage("The rain has been removed!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("storm")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "weather thunder");
			sender.sendMessage("The thunderstorm has been put on well!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("wrain")) {
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "weather rain");
			sender.sendMessage("The rain has been put on well!");
			return true;
		}
		
		return false;
	}

}
