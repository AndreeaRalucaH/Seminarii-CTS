package ro.ase.cts.testare.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.testare.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
//		if(nume != student.getNume()) {
//			fail("Numele nu este acelasi");
//		}
		
		assertEquals("Numele nu a fost initializat",nume, student.getNume()); //in loc de if
//		assertNotEquals(null, student.getNote());
		assertNotNull("Lista de note nu a fost initializata",student.getNote()); //la fel ca cea de sus
	}

	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student = new Student();
		
		student.setNume(nume);
		
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata", student.getNote());
	}
	
	@Test
	public void testAdaugaNotaInLista() {
		Student student = new Student();
		int nota = 9;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 9;
		student.adaugaNota(nota);
		
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int nota1 = 9;
		int nota2 = 8;
		int nota3 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie = (nota1 + nota2 + nota3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(),0.01); // punem o marja de eroare atunci cand lucram cu valori reale
		
	}
	
	@Test
	public void testCalculeazaMediaPentruONota() {
		Student student = new Student();
		int nota1 = 9;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(), 0.01); // punem o marja de eroare atunci cand lucram cu valori reale
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMediaPentruZeroNote() {
		Student student = new Student();
		student.calculeazaMedie();
		
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 3;
		int nota3 = 2;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
		
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 10;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante());
		
	}
	
	@Test
	public void testGetNotaPozitieIncorecta() {
		Student student = new Student();
		int nota1 = 8;
		int nota2 = 10;
		int nota3 = 5;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		//Pas 1
		try {
			//Pas 2
			student.getNota(3);
			//Pas 3
			fail("Metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException e) {
			//Pas 4
		}
		//Pas 5
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota = 11;
		student.adaugaNota(nota);
	}
}
