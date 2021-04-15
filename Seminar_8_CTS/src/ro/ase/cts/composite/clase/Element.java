package ro.ase.cts.composite.clase;

public class Element implements ComponentaMenu {

	private String numeElement;

	public Element(String numeElement) {
		super();
		this.numeElement = numeElement;
	}

	@Override
	public void adaugaNod(ComponentaMenu componentaMenu) throws Exception {
		throw new Exception("Nu este implemntata");
	}

	@Override
	public void stergeNod(ComponentaMenu componentaMeniu) {
		throw new IllegalArgumentException("Nu este implementata");
	}

	@Override
	public ComponentaMenu getNod(int index) {
		throw new IllegalArgumentException("Nu este implementata");
		
	}

	@Override
	public void printeaza() {
		System.out.println("Elementul: " + numeElement);
	}

}
