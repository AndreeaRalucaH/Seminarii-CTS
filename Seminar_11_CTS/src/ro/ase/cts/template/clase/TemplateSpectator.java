package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLocul();
	
	public final void intrarePeStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlulCorporal();
		ocupaLocul();
	}
	

}
