package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeClass implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0 ){
				player.sendMessage("§cPlease insert the desired gamemode!");
			}
			
			if(args.length > 1) {
				player.sendMessage("§cPlease insert only one gamemode!");
			}
			
			int result = Integer.parseInt(args[0]);
			
			if(result == 0) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode survival "+player.getName());
			}
			
			if(result == 1) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode creative "+player.getName());
			}
			
			if(result == 2) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode adventure "+player.getName());
			}
			
			if(result == 3) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode spectator "+player.getName());
			}
			
			return true;
		}
		
		return false;
	}

}
