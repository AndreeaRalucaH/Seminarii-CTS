package ro.ase.cts.state.clase;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public Stare getStare() {
		return stare;
	}

	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new MasaLibera();
	}
	
	public void ocupaMasa() {
		MasaOcupata ocupata = new MasaOcupata();
		ocupata.modificaStare(this);
	}
	
	public void rezervaMasa() {
		MasaRezervata rezervata = new MasaRezervata();
		rezervata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		MasaLibera libera = new MasaLibera();
		libera.modificaStare(this);
	}
	
	
	

}
