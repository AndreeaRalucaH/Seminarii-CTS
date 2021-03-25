package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.Medic;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		try {
			FactoryPersonal factory = new FactoryPersonal();
			PersonalSpital medic = factory.getPersonal(TipPersonal.MEDIC, "Popescu");
			PersonalSpital asistent = factory.getPersonal(TipPersonal.ASISTENT, "Ionescu");
			PersonalSpital brancardier = factory.getPersonal(TipPersonal.BRANCARDIER, "Vasilescu");
			System.out.println(medic.toString());
			System.out.println(asistent.toString());
			System.out.println(brancardier.toString());
		}catch (Exception e){
			e.printStackTrace();
		}
		
		

	}

}
