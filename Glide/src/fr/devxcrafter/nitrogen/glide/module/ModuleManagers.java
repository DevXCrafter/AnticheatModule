package fr.devxcrafter.nitrogen.glide.module;

import java.util.ArrayList;
import java.util.List;

import fr.devxcrafter.nitrogen.glide.module.movement.Glide;



public class ModuleManagers {
	
	public List<ModuleCheck> checks;
	public ModuleManagers() {
		checks = new ArrayList<>();
		init();
	}
	
	private void init() {
		addCheck(new Glide());
	}
	
	public void addCheck(ModuleCheck check) {
		checks.add(check);
	}
	
	public void removeCheck(ModuleCheck check) {
		checks.remove(check);
	}

}
