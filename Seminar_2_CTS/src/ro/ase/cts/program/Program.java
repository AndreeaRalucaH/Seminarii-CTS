package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReader;

public class Program {

	public static List<Aplicant> citesteaAplicanti(AplicantReader reader) throws FileNotFoundException
	{
		return reader.readAplicanti();
	}
	public static void main(String[] args) {
		System.out.println("Suma finantata pentru un angajat este de " + Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru un student este de " + Student.getSumaFinantare());
		System.out.println("\n");
		
		Proiect proiectInitial = new Proiect(80);

		List<Aplicant> listaAngajati;
		try {
			listaAngajati = citesteaAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAngajati)
			{ 
				System.out.println(angajat.toString());
				System.out.println("Angajatul "+ angajat.getNume() + " are o finantare de " + angajat.getFinantare());
				angajat.afisareStatutPeProiect(proiectInitial);
				System.out.println("\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
