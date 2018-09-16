package fr.devxcrafter.nitrogen.speed.module.movement;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import fr.devxcrafter.nitrogen.speed.module.CheckType;
import fr.devxcrafter.nitrogen.speed.module.ModuleCheck;

public class Speed extends ModuleCheck {

	public Speed() {
		super("SpeedHack", CheckType.MOVEMENT, true, true, 1);
		
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onmove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		Location to = e.getTo();
		Location from = e.getFrom();
		
		 Vector vec = to.toVector();
         
         double i = vec.distance(from.toVector());
         
         if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.SPONGE)) {
        	 return;
         }
         
         if(p.getGameMode().equals(GameMode.CREATIVE)) {
        	 return;
         }
         
         if(p.getVehicle() != null) {
        	 
         }
         
         if(p.getAllowFlight()) {
        	 return;
         }
         
         if(p.isOp()) {
        	 return;
         }
         
         if(i >= 0.42D) {
        	 e.setCancelled(true);
        	 flag(p, "Cheat " + CheckType.MOVEMENT);
         }
         
	}

}
