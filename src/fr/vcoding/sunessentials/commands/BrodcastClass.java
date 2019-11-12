package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BrodcastClass implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0) {
				player.sendMessage("§cPlease insert a message!");
				return true;
			}
			
			if(args.length >= 1) {
				
				StringBuilder bc = new StringBuilder();
				for(String part : args) {
					bc.append(part + " ");
				}
				Bukkit.broadcastMessage("§4[§cBRODCAST§4] §f"+bc.toString().replace("&", "§"));
			}
			
			return true;
		}
		
		return false;
	}

}
