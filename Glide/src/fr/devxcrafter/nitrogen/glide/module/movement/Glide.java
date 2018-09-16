package fr.devxcrafter.nitrogen.glide.module.movement;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.devxcrafter.nitrogen.glide.module.ModuleCheck;
import fr.devxcrafter.nitrogen.glide.module.ModulesType;

public class Glide extends ModuleCheck {

	public Glide() {
		super("Glide", ModulesType.MOVEMENT, true, true, 1);
		
	}
	
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if((e.getTo().getY() - e.getFrom().getY() == -0.125D) && 
				(e.getTo().clone().subtract(0.0D, 1.0D, 0.0D).getBlock().getType().equals(Material.AIR))) {
			e.setCancelled(true);
			flag(p, "Cheat " + ModulesType.MOVEMENT);
		}
		
	}
	

}
