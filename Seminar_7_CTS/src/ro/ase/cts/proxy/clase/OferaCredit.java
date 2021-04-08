package ro.ase.cts.proxy.clase;

public class OferaCredit implements CreditAbstract {

	@Override
	public void oferaCredit(TipMoneda tip, float suma) {
		System.out.println("S-a achizitionat un credit de "+suma + " " +tip);
		
	}

}
