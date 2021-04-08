package ro.ase.cts.adapterClase.program;

import ro.ase.cts.adapterClase.clase.AdapterCreditClase;
import ro.ase.cts.adapterClase.clase.CreditAbstract;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.OferaCredit();
	}
	

	public static void main(String[] args) {
	
		AdapterCreditClase adapterCredit = new AdapterCreditClase(500, "Maria");
		afiseazaInfoCredit(adapterCredit);
	}

}
