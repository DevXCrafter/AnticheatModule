package fr.devxcrafter.nitrogen.antifall.module.movement;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import fr.devxcrafter.nitrogen.antifall.module.ModuleCheck;
import fr.devxcrafter.nitrogen.antifall.module.ModuleType;

public class AntiFall extends ModuleCheck {

	public AntiFall() {
		super("AntiFall", ModuleType.MOVEMENT, true, true, 1);
		
	}
	
	@SuppressWarnings("deprecation")
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		Location to = e.getTo().clone();
		Location from = e.getFrom().clone();
		
		Vector vec = to.toVector();
         
        double i = vec.distance(from.toVector());
        
        if(i == 0.0D) {
        	return;
        }
        
        if(p.getGameMode().equals(GameMode.CREATIVE)) {
        	return;
        }
        
        if(p.getVehicle() != null) {
        	
        }
        
        if(p.isOp()) {
        	return;
        }
        
        if((p.getFallDistance() == 0.0F) &&
        		(i > 0.79D) && (p.isOnGround())) {
        	e.setCancelled(true);
        	
        	flag(p, "Cheat " + ModuleType.MOVEMENT);
        }
	}

}
