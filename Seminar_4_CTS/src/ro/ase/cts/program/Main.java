package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

public class Main {

	public static void main(String[] args) {
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("Ioana");
		broker1.setNrTranzactiiEfectuate(9);
		
		broker2.setNume("Ana");
		broker2.setNrTranzactiiEfectuate(26);
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy brokerLazy1 = BrokerTranzactieLazy.getInstance("Popescu", 16, 190);
		BrokerTranzactieLazy brokerLazy2 = BrokerTranzactieLazy.getInstance("Vasile", 20, 350);
		System.out.println(brokerLazy1);
		System.out.println(brokerLazy2);
		

	}

}
