package fr.devxcrafter.nitrogen.killaura.modules.combat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import fr.devxcrafter.nitrogen.killaura.modules.ModuleCheck;
import fr.devxcrafter.nitrogen.killaura.modules.ModulesType;

public class KillAura extends ModuleCheck {

	
	public KillAura() {
		super("KillAura", ModulesType.COMBAT, true, true, 1);
	}
	
	@EventHandler
	public void onCombat(EntityDamageByEntityEvent e) {
		if(e.getCause() == DamageCause.ENTITY_ATTACK 
				&& e.getDamager() instanceof Player) {
			Player player = (Player) e.getDamager();
			flag(player ,"Cheat " + ModulesType.COMBAT);
			
			
			
		}
	}
	
}
