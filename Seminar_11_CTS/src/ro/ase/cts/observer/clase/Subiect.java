package ro.ase.cts.observer.clase;

public interface Subiect {
	 void adaugareAbonat(Observer observer);
	void stergereAbonat(Observer observer);
	void trimitereMesaj(String mesaj);
	
}
