package ro.ase.cts.factoryMethod.clase;

public class InfirmierFactory implements FactoryPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		
		return new Infirmier(nume);
	}

}
