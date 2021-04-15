package ro.ase.cts.composite.clase;

public interface ComponentaMenu {
	
	public void adaugaNod(ComponentaMenu componentaMenu) throws Exception;
	public void stergeNod(ComponentaMenu componentaMeniu);
	ComponentaMenu getNod(int index);
	public void printeaza();

}
