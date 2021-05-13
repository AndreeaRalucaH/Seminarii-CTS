package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci = new MeciJucat("Buzau","Ploiesti", 2000, 1500, 5000, 600);
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(meci.creareMemento());
		
		meci.setNumeGazda("Bucuresti");
		meci.setNrSpectatori(2500);
		meci.setNumeOastpeti("Craiova");
		
		manager.adaugaMemento(meci.creareMemento());
		
		System.out.println(meci.toString());
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());

	}

}
