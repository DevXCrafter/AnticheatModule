package fr.devxcrafter.nitrogen.speed.module;

import java.util.Map;
import java.util.WeakHashMap;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


import fr.devxcrafter.nitrogen.speed.SpeedMain;

public abstract class ModuleCheck implements Listener {
	
	protected String name;
	protected CheckType type;
	protected boolean enabled;
	protected boolean punishable;
	protected int max;
	
	
	public Map<Player, Integer> violations = new WeakHashMap<>();
	
	public ModuleCheck(String name, CheckType type, boolean enabled, boolean punishable, int max) {
		super();
		this.name = name;
		this.type = type;
		this.enabled = enabled;
		this.punishable = punishable;
		this.max = max;
		
		Bukkit.getPluginManager().registerEvents(this, SpeedMain.getInstance());
	}

	
	@SuppressWarnings("deprecation")
	public void flag(Player player, @Nullable String... information) {
		int violations = this.violations.getOrDefault(player, 0) + 1;
		if(information != null) {
			StringBuilder formattedInfos = new StringBuilder();
			for(String string : information) {
				formattedInfos.append(string);
			}
			for(Player staff : Bukkit.getOnlinePlayers()) {
				staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b[&c&lNTG&b] &a " + player.getName() + " &7has been detected for " + name + " &7 " + "[" + formattedInfos.toString() + "]" + " &8(&c&l" + violations + "&8)"));
			}
		} else {
			for(Player staff : Bukkit.getOnlinePlayers()) {
				staff.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b[&c&lNTG&b] &a " + player.getName() + " &7has been detected for " + name + " &8(&c&l" + violations + "&8)"));
			}

		}
		if(violations > max) {
			player.setBanned(true);
			
			 player.kickPlayer(ChatColor.GOLD + "[NTG] " + ChatColor.DARK_RED + " » " + ChatColor.RED + "You have been banned because you use " + name + "!");
			
			
			
		}
		
		this.violations.put(player, violations);
		
	}

}
