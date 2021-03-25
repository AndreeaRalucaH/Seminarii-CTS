package ro.ase.cts.factoryMethod.clase;

public class MedicFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		
		return new Medic(nume);
	}

}
