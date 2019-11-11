package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill "+player.getName());
			}
			
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("@a")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @a");
					player.sendMessage("All players as been killed");
					return true;
				}
				
				if(args[0].equalsIgnoreCase("@p")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @p");
					return true;
				}
				
				if(args[0].equalsIgnoreCase("@r")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @r");
					return true;
				}
				
				if(args[0].equalsIgnoreCase("@s")) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @s");
					return true;
				}				
				
				if(args[0].contains("@e")) {
					if(args[0].equalsIgnoreCase("@e")) {
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill @e");
						return true;
					}
					else {
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill "+args[0]);
						return true;
					}
				}
				
				else {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill "+args[0]);
					player.sendMessage(args[0] + " as been killed!");
				}
			}
			
			if(args.length > 1) {
				player.sendMessage("§cPlease mentionne only one nickname at a time!");
			}
			
			return true;
		}
		
		return false;
	}

}
