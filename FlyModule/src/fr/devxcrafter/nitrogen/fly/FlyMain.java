package fr.devxcrafter.nitrogen.fly;

import org.bukkit.plugin.java.JavaPlugin;

import fr.devxcrafter.nitrogen.fly.modules.ModuleManagers;

public class FlyMain extends JavaPlugin {
	
	public static FlyMain instance;
	private ModuleManagers managers;
	
	@Override
	public void onEnable() {
		instance = this;
		
		managers = new ModuleManagers();
	}
	

	public static FlyMain getInstance() {
		return instance;
	}

}
