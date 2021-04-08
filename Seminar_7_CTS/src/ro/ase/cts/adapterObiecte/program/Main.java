package ro.ase.cts.adapter.program;


import ro.ase.cts.adapter.clase.AdaptorCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

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
