package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGM implements CommandExecutor {

	@Override
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
			
			if(args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative") || result == 1) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode 1 "+player.getName());
			}
			
			if(args[0].equalsIgnoreCase("sp") || args[0].equalsIgnoreCase("spectator") || result == 3) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode 3 "+player.getName());
			}
			
			if(args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival") || result == 0) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode 0 "+player.getName());
			}
			
			if(args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure") || result == 2) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode 2 "+player.getName());
			}
			
			return true;
		}

		return false;
	}

}
