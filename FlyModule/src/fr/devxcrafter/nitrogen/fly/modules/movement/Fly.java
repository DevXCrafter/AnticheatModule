package fr.devxcrafter.nitrogen.fly.modules.movement;


import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import fr.devxcrafter.nitrogen.fly.modules.ModuleCheck;
import fr.devxcrafter.nitrogen.fly.modules.ModulesType;

public class Fly extends ModuleCheck {

	public Fly() {
		super("Fly", ModulesType.MOVEMENT, true, true, 1);
		
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
         
         if((p.getFallDistance() == 0.0F) && 
        		 (p.getLocation().getBlock().getRelative(BlockFace.UP).getType().equals(Material.AIR))) {
        	 if(i > 0.60D) {
        		 if(p.isOnGround()) {
        			 return;
        		 }
        		 
        		 e.setCancelled(true);
        		 flag(p, "Cheat " + ModulesType.MOVEMENT);
        	 }
        	 
         }
         
         if((i > 0.20D) && (i < 0.29D)) {
        	 if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() == Material.WATER) {
        		 return;
        	 }
        	 
        	 if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).isLiquid()) {
        		 flag(p, "Cheat " + ModulesType.MOVEMENT);
        	 }
         }
		
	}
	
}
	


