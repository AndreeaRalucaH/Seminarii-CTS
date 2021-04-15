package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMenu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		ComponentaMenu menu = new Sectiune("menu");
		ComponentaMenu sectiuneBauturi = new Sectiune("bauturi");
		ComponentaMenu sectiuneDesert = new Sectiune("desert");
		
		ComponentaMenu elementCafea = new Element("cafea");
		ComponentaMenu elementFrappe = new Element("frappe");
		ComponentaMenu elementTiramisu = new Element("tirasmisu");
		
		try {
			sectiuneBauturi.adaugaNod(elementCafea);
			sectiuneBauturi.adaugaNod(elementFrappe);
			sectiuneDesert.adaugaNod(elementTiramisu);
			menu.adaugaNod(sectiuneBauturi);
			menu.adaugaNod(sectiuneDesert);
			menu.printeaza();
			sectiuneBauturi.stergeNod(elementFrappe);
			sectiuneDesert.adaugaNod(elementFrappe);
			menu.printeaza();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
