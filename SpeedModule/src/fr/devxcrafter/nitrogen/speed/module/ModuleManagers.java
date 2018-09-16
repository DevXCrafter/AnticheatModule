package fr.devxcrafter.nitrogen.speed.module;

import java.util.ArrayList;
import java.util.List;

import fr.devxcrafter.nitrogen.speed.module.movement.Speed;



public class ModuleManagers {

	public List<ModuleCheck> checks;
	public ModuleManagers() {
		checks = new ArrayList<>();
		init();
	}
	
	private void init() {
		addCheck(new Speed());
	}
	
	public void addCheck(ModuleCheck check) {
		checks.add(check);
	}
	
	public void removeCheck(ModuleCheck check) {
		checks.remove(check);
	}
	
}
