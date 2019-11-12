package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishClass implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(cmd.getName().equalsIgnoreCase("vanish")){
				for(Player pl : Bukkit.getOnlinePlayers()){
                    pl.hidePlayer(player);
                }
				player.sendMessage(ChatColor.GREEN + "Vanish enabled");
                return true;
			}
            
			if(cmd.getName().equalsIgnoreCase("unvanish")) {
				for(Player pl : Bukkit.getOnlinePlayers()){
                    pl.showPlayer(player);
                }
				player.sendMessage(ChatColor.RED + "Vanish disabled");
	            return true;
			}
            
		}
		
		return false;
	}

}
