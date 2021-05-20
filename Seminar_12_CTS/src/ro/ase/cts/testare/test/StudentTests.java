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
}
