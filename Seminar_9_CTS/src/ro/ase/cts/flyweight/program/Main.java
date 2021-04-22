package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 =  new Rezervare(5,17,3);
		Rezervare rezervare2 =  new Rezervare(8,6,10);
		Rezervare rezervare3 =  new Rezervare(9,11,8);
		
		
		FlyweightFactory fabrica = new FlyweightFactory();
		fabrica.getClient("071111111").printeazaRezervare(rezervare1);
		fabrica.getClient("072222222").printeazaRezervare(rezervare2);
		fabrica.getClient("071111111").printeazaRezervare(rezervare3);
		

	}

}
