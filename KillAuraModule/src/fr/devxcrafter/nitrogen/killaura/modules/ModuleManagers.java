package fr.devxcrafter.nitrogen.killaura.modules;

import java.util.ArrayList;
import java.util.List;

import fr.devxcrafter.nitrogen.killaura.modules.combat.KillAura;

public class ModuleManagers {
	public List<ModuleCheck> checks;
	public ModuleManagers() {
		checks = new ArrayList<>();
		init();
	}
	
	private void init() {
		addCheck(new KillAura());
	}
	
	public void addCheck(ModuleCheck check) {
		checks.add(check);
	}
	
	public void removeCheck(ModuleCheck check) {
		checks.remove(check);
	}

}
