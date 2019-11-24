package fr.vcoding.sunessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ExplodeClass implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(args.length == 0 || args.length > 1) {
				player.sendMessage("§cPlease enter one player");
				return true;
			}
			if(args[0].contains("@")) {
				player.sendMessage("§cYou can't use @a or @e or @p or @s");
				return true;
			}
			String argument = args[0];
			Player victim = Bukkit.getPlayer( argument );
			if(victim !=null && victim.isOnline()) {
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "summon tnt " + victim.getLocation().getBlockX() + " " + victim.getLocation().getBlockY() + " " + victim.getLocation().getBlockZ());
				player.sendMessage(ChatColor.GREEN + "The player, " + victim.getDisplayName() + ", was blown up!");
				return true;
			} else {
				player.sendMessage("§cThe selected player does not exist or is not connected!");
				return true;
			}
		}
		return false;
	}

}
