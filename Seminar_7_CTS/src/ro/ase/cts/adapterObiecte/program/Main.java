package ro.ase.cts.adapterObiecte.program;


import ro.ase.cts.adapterObiecte.clase.AdaptorCreditObiecte;
import ro.ase.cts.adapterObiecte.clase.CreditAbstract;
import ro.ase.cts.adapterObiecte.clase.Leasing;

public class Main {

	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.OferaCredit(suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing(100, "Iona");
		AdaptorCreditObiecte adapter = new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adapter, leasing.getSuma());
	}

}
