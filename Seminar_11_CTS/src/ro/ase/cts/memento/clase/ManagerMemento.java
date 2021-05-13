package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> stari = new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		stari.add(memento);
	}
	
	public Memento getMemento(int poz) {
		if(poz >= 0 && poz < stari.size()) {
			return stari.get(poz);
		}else {
			throw new IllegalArgumentException("Pozitia nu e valida");
		}
		
	}
	
	
}
