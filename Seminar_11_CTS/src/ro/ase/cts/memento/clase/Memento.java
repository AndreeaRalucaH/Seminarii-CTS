package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String numeGazda;
	private String numeOastpeti;

	public Memento(int nrSpectatori, String numeGazda, String numeOastpeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeGazda = numeGazda;
		this.numeOastpeti = numeOastpeti;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
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

}
