package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.AsistentFactory;
import ro.ase.cts.factoryMethod.clase.FactoryPersonal;
import ro.ase.cts.factoryMethod.clase.Infirmier;
import ro.ase.cts.factoryMethod.clase.InfirmierFactory;
import ro.ase.cts.factoryMethod.clase.MedicFactory;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class Main {

	public static void printeazaPersonalSpital(FactoryPersonal fabrica, String nume) {
		PersonalSpital personal = fabrica.getPersonal(nume);
		System.out.println(personal.toString());
	}
	
	public static void main(String[] args) {
		printeazaPersonalSpital(new MedicFactory(), "Ion");
		printeazaPersonalSpital(new AsistentFactory(), "Maria");
		printeazaPersonalSpital(new InfirmierFactory(), "Ioana" );

	}

}
