package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class TopCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0) { 
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "tp " +  player.getDisplayName() + " " + player.getLocation().getBlockX() + " 255 " + player.getLocation().getBlockZ());
				return true;
			}
			
			if(args[0].contains("@")) {
				player.sendMessage("§cYou can't use @a or @e or @p or @s");
				return true;
			}
			
			if(args.length == 1) {
				String argument = args[0];
				Player target = Bukkit.getPlayer( argument );
				if(target !=null && target.isOnline()) {
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "tp " +  target.getDisplayName() + " " + target.getLocation().getBlockX() + " 255 " + target.getLocation().getBlockZ());
					player.sendMessage(ChatColor.GREEN + "The player, " + target.getDisplayName() + ", has been teleported to layer 255!");
				} else {
					player.sendMessage("§cThe selected player does not exist or is not connected!");
					return true;
				}
				return true;
			}
			
			if(args.length > 1) {
				player.sendMessage("§cYou can only select one player at a time!");
			}
		}
		
		return false;
	}

}
