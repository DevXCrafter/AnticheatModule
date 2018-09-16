package fr.devxcrafter.nitrogen.speed;

import org.bukkit.plugin.java.JavaPlugin;

import fr.devxcrafter.nitrogen.speed.module.ModuleManagers;

public class SpeedMain extends JavaPlugin {
	
	public static SpeedMain instance;
	private ModuleManagers managers;
	
	@Override
	public void onEnable() {
		instance = this;
		
		managers = new ModuleManagers();
	}

	public static SpeedMain getInstance() {
		return instance;
	}
	

}
