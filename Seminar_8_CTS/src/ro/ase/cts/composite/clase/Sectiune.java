package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMenu{
	private List<ComponentaMenu> listaComponente;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		super();
		this.listaComponente = new ArrayList<ComponentaMenu>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(ComponentaMenu componentaMenu) throws Exception {
		listaComponente.add(componentaMenu);
		
	}

	@Override
	public void stergeNod(ComponentaMenu componentaMeniu) {
		listaComponente.remove(componentaMeniu);
	}

	@Override
	public ComponentaMenu getNod(int index) {
		if(index < listaComponente.size() && index >= 0) {
			return listaComponente.get(index);
		}
		return null;
		
	}

	@Override
	public void printeaza() {
		System.out.println("Sectiunea: "+ numeSectiune);
		for(ComponentaMenu comp : listaComponente) {
			comp.printeaza();
		}
		
	}
	
	
	
}
