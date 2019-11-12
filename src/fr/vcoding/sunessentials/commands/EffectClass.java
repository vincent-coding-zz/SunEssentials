package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EffectClass implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(cmd.getName().equalsIgnoreCase("reffect")) {
				
				if(args.length == 0) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect clear " + player.getName());
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
							Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect clear @e");
							return true;
						}
						else {
							Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect clear " + args[0]);
							return true;
						}
					}
					else if(!args[0].contains("@e")) {
						Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect clear " + args[0]);
						player.sendMessage("The effects have been removed!");
						return true;
					}
				}
				return true;
			}
			
			
			
		}
		
		return false;
	}

}
