package fr.devxcrafter.nitrogen.killaura;


import org.bukkit.plugin.java.JavaPlugin;

import fr.devxcrafter.nitrogen.killaura.modules.ModuleManagers;

public class KillAuraMain extends JavaPlugin {
	
	public static KillAuraMain instance;
	private ModuleManagers manager;
	
	@Override
	public void onEnable() {
		instance = this;
		
		manager = new ModuleManagers();
	}
	
	public static KillAuraMain getInstance() {
		return instance;
	}



}
