package fr.devxcrafter.nitrogen.antifall;

import org.bukkit.plugin.java.JavaPlugin;

import fr.devxcrafter.nitrogen.antifall.module.ModuleManagers;

public class AntiFallMain extends JavaPlugin {

	public static AntiFallMain instance;
	private ModuleManagers managers;
	
	public void onEnable() {
		
		instance = this;
		
		managers = new ModuleManagers();
	}

	public static AntiFallMain getInstance() {
		return instance;
	}

	
}
