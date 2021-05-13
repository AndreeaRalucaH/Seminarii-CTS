package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlyweightFactory {
	private Map<String,Flyweight> clienti;
	
	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<>();
	}

	public Flyweight getClient(String nrTelefon) {
		Flyweight client = clienti.get(nrTelefon);
		if(client == null) {
			Scanner scanner = new Scanner(System.in); //cu citire de la tastatura
			String nume = scanner.next();
			String email = scanner.next();
			client = new Client(nume, nrTelefon, email);
			clienti.put(nrTelefon, client);
		}
		return clienti.get(nrTelefon);
		
		
	}

}
