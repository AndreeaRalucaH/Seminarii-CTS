package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OferaCredit;
import ro.ase.cts.proxy.clase.Proxy;
import ro.ase.cts.proxy.clase.TipMoneda;

public class Main {

	public static void main(String[] args) {
		OferaCredit credit = new OferaCredit();
		credit.oferaCredit(TipMoneda.EUR, 1600);
		
		Proxy proxy = new Proxy(credit);
		proxy.oferaCredit(TipMoneda.EUR, 5000);
		proxy.oferaCredit(TipMoneda.RON, 10000);

	}

}
