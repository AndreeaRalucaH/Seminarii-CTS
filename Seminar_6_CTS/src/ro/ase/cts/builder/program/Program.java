package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzica("Pop").build();
		Rezervare rezervare3 = new Rezervare(false, true, false, false, null, 70);
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder().setAreBauturaInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4 = rezervareBuilder.setCodRezervare(80).build();
		Rezervare rezervare5 = rezervareBuilder.setCodRezervare(81).build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		System.out.println(rezervare5);
		
		
		RezervareBuilderV2 builder1 = new RezervareBuilderV2().setAreScaunErgonomic(true).setAreMancareInclusa(true).setAreBauturaInclusa(true);
		Rezervare rezervare6 = builder1.setCodRezervare(80).build();
		Rezervare rezervare7 = builder1.setCodRezervare(81).build();
		
		System.out.println(rezervare6);
		System.out.println(rezervare7);
	}

}
