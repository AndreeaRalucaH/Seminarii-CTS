package ro.ase.cts.observer.clase;

public class Client implements Observer {
	private String nume;
	

	public Client(String nume) {
		super();
		this.nume = nume;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(nume + " ai primit mesajul: " + mesaj);
		
	}

}
