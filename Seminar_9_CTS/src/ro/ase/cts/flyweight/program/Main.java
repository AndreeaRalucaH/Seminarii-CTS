package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;

import java.util.Scanner;

import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 =  new Rezervare(5,17,3);
		Rezervare rezervare2 =  new Rezervare(8,6,10);
		Rezervare rezervare3 =  new Rezervare(9,11,8);
		
		System.out.println("Introdu datele");
		FlyweightFactory fabrica = new FlyweightFactory();
		Scanner scanner = new Scanner(System.in); //cu citire de la tastatura
		String nrTelefon = scanner.next();
	
		fabrica.getClient(nrTelefon).printeazaRezervare(rezervare1);
		
		nrTelefon = scanner.next();
		fabrica.getClient(nrTelefon).printeazaRezervare(rezervare2);
		
		nrTelefon = scanner.next();
		fabrica.getClient(nrTelefon).printeazaRezervare(rezervare3);
		

	}

}
