package ro.ase.cts.adapterObiecte.clase;

public class AdaptorCreditObiecte implements CreditAbstract {

	private Leasing leasing;
	
	
	public AdaptorCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}
	
	@Override
	public void OferaCredit(float suma) {
		
		leasing.imprumuta();
	}


}
