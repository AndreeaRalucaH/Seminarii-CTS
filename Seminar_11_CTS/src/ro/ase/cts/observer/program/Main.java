package ro.ase.cts.observer.program;



import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager = new ManagerSala("Sala Sporturilor");
		Observer client1 = new Client("Maria");
		Observer client2 = new Client("Ion");
		Observer client3 = new Client("Ana");
		
		manager.adaugareAbonat(client1);
		manager.adaugareAbonat(client2);
		manager.adaugareAbonat(client3);
		
		manager.trimiteAnuntImportanta("Fotbal");
		manager.stergereAbonat(client3);
		manager.trimiteAnuntImportanta("Volei");

	}

}
