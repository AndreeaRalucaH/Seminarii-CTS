package ro.ase.cts.clase;

public class Inghetata {
	private int nrCalorii;
	private String denumire;
	private double pret;
	private static Inghetata inghetata = null;

	private Inghetata(int nrCalorii, String denumire, double pret) {
		super();
		this.nrCalorii = nrCalorii;
		this.denumire = denumire;
		this.pret = pret;
	}

	public void setNrCalorii(int nrCalorii) {
		this.nrCalorii = nrCalorii;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Inghetata [nrCalorii=");
		builder.append(nrCalorii);
		builder.append(", denumire=");
		builder.append(denumire);
		builder.append(", pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}

	public static synchronized Inghetata getInstance(int nrCalorii, String denumire, double pret) {
		if (inghetata == null) {
			inghetata = new Inghetata(nrCalorii, denumire, pret);
		}
		return inghetata;
	}

}
