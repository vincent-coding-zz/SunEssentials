package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Suicides implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill "+player.getName());
		}
		
		return false;
	}

}
