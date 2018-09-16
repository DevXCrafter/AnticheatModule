package fr.devxcrafter.nitrogen.fly.modules;

import java.util.ArrayList;
import java.util.List;

import fr.devxcrafter.nitrogen.fly.modules.movement.Fly;



public class ModuleManagers {
	
	public List<ModuleCheck> checks;
	public ModuleManagers() {
		checks = new ArrayList<>();
		init();
	}
	
	private void init() {
		addCheck(new Fly());
	}
	
	public void addCheck(ModuleCheck check) {
		checks.add(check);
	}
	
	public void removeCheck(ModuleCheck check) {
		checks.remove(check);
	}


}
