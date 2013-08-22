package me.DeGambler.DenyDrops;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;

public final class DropEventDenier extends JavaPlugin implements Listener {
	public void onEnable(){
		getLogger().info("DenyDrops has been enabled! Have fun! :)");
		getServer().getPluginManager().registerEvents(this, this);
	}
	public void onDisable(){
		getLogger().info("DenyDrops has been Disabled! Thanks for using this plugin! :)");
	}
	@EventHandler
	public void onDrop(PlayerDropItemEvent event) {
		Player player = event.getPlayer();
		event.setCancelled(true);
		player.sendMessage(ChatColor.BLUE + "DenyDrops" + ChatColor.GOLD + " Sorry, you're not allowed to drop that!");
		
	}
	
}
