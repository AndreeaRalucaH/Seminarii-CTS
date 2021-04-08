package ro.ase.cts.adapterClase.clase;

public class AdapterCreditClase extends Leasing implements CreditAbstract{

	public AdapterCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}

	@Override
	public void OferaCredit() {
		super.imprumuta();
		
	}

}
