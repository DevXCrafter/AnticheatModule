package fr.devxcrafter.nitrogen.glide;

import org.bukkit.plugin.java.JavaPlugin;

import fr.devxcrafter.nitrogen.glide.module.ModuleManagers;




public class GlideMain extends JavaPlugin {
	
	public static GlideMain instance;
	private ModuleManagers managers;
	
	@Override
	public void onEnable() {
		instance = this;
		
		managers = new ModuleManagers();
	}

	public static GlideMain getInstance() {
		return instance;
	}

}
