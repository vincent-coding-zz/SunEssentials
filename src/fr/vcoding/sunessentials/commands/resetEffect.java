package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class resetEffect implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + player.getName() + " clear");
				player.sendMessage("All your potions effects have been removed!");
				return true;
			}
			
			if(args.length > 1) {
				player.sendMessage("Please enter only one nickname!");
				return true;
			}
			
			if(args.length == 1) {
				if(args[0].contains("@e")) {
					if(args[0].equalsIgnoreCase("@e")) {
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect @e clear");
						return true;
					}
					else {
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + args[0] + " clear");
						return true;
					}
				}
				else if(!args[0].contains("@e")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect " + args[0] + " clear");
					player.sendMessage("The effects have been removed!");
					return true;
				}
			}
			
			return true;
		}
		
		return false;
	}

}
