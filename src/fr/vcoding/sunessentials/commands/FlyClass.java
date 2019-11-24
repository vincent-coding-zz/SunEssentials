package fr.vcoding.sunessentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyClass implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0 ){
				player.sendMessage("§cPlease insert an argument\n"
						+ "§cON §4-> §cActivate the flight\n"
						+ "§cOFF §4-> §cDeactivate the flight");
				return true;
			}
			
			if(args.length >= 2 ){
				player.sendMessage("§cPlease insert an argument\n"
						+ "§cON §4-> §cActivate the flight\n"
						+ "§cOFF §4-> §cDeactivate the flight");
				return true;
			}
			
			if(args.length == 1) {
				
				// TODO: Enable Fly
				if(cmd.getName().equalsIgnoreCase("fly")) {
					if(args[0].equalsIgnoreCase("on")) {
						player.setAllowFlight(true);
						player.setFlying(true);
						player.sendMessage(ChatColor.GREEN + "Flying enabled");
						return true;
					}
					
					if(args[0].equalsIgnoreCase("off")) {
						player.setAllowFlight(false);
						player.setFlying(false);
						player.sendMessage(ChatColor.RED + "Flying disabled");
						return true;
					}
					
				}
			}
		}
		
		return false;
	}

}
