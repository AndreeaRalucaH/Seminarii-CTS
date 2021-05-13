package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String numeGazda;
	private String numeOastpeti;
	private int nrSpectatori;
	private int nrBilete;
	private int nrSticle;
	private int nrJandarmi;

	public MeciJucat(String numeGazda, String numeOastpeti, int nrSpectatori, int nrBilete, int nrSticle,
			int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOastpeti = numeOastpeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBilete = nrBilete;
		this.nrSticle = nrSticle;
		this.nrJandarmi = nrJandarmi;
	}

	public String getNumeGazda() {
		return numeGazda;
	}

	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}

	public String getNumeOastpeti() {
		return numeOastpeti;
	}

	public void setNumeOastpeti(String numeOastpeti) {
		this.numeOastpeti = numeOastpeti;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public int getNrBilete() {
		return nrBilete;
	}

	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}

	public int getNrSticle() {
		return nrSticle;
	}

	public void setNrSticle(int nrSticle) {
		this.nrSticle = nrSticle;
	}

	public int getNrJandarmi() {
		return nrJandarmi;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOastpeti=");
		builder.append(numeOastpeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSticle=");
		builder.append(nrSticle);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	public Memento creareMemento() {
		Memento memento = new Memento(nrSpectatori, numeGazda, numeOastpeti);
		return memento;
	}
	
	public void setMemento(Memento memento) {
		nrSpectatori = memento.getNrSpectatori();
		numeGazda = memento.getNumeGazda();
		numeOastpeti = memento.getNumeOastpeti();
	}

}
