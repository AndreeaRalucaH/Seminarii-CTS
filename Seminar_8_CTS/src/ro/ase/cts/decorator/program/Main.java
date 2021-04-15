package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaAbstracta nota = new NotaDePlata(100);
		nota.printeaza();
		
		DecoratorAbstract decorator = new DecoratorNotaLaMultiAni(nota);
		decorator.printeazaFelicitare();
		decorator.printeaza();
		
		
		System.out.println();
		
		DecoratorAbstract decorator1 = new DecoratorNotaPasteFericit(nota);
		decorator1.printeaza();
		decorator1.printeazaFelicitare();
		
		System.out.println();

		NotaAbstracta notaNew = new NotaDePlata(36);
		DecoratorAbstract decoratorLMA = new DecoratorNotaLaMultiAni(notaNew);
		DecoratorAbstract decoratorPaste = new DecoratorNotaPasteFericit(decoratorLMA);
		decoratorPaste.printeaza();
		
	}

}
