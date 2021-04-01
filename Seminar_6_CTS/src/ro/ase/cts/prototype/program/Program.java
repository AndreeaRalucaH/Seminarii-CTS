package ro.ase.cts.prototype.program;


import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Program {

	public static void main(String[] args) {
		
		ContClient contClinet1 = new ContClient("Maria", 20, 2);
		ContClient contClient2 = (ContClient)contClinet1.copiaza();
		
		System.out.println(contClinet1);
		System.out.println(contClient2);
		
		
		Bilet biletPrototype = new Bilet(1, "Echipa1", "Echipa2", "01.04.2021");
		Bilet bilet1 = (Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(100);
		Bilet bilet2 = (Bilet) biletPrototype.copiaza();
		
		
		System.out.println(bilet1);
		System.out.println(bilet2);

	}

}
