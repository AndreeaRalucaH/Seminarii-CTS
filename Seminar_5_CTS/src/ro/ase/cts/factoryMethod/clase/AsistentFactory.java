package ro.ase.cts.factoryMethod.clase;

public class AsistentFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		
		return new Asistent(nume);
	}

}
