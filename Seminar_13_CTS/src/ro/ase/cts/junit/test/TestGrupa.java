package ro.ase.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.Student;

public class TestGrupa {
	
	@Test
	public void testConstructorCorect() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	@Test
	public void TestConstructorLimitaInferioara()
	{
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void TestConstructorLimitaSuperioara()
	{
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptie() {
		Grupa grupa = new Grupa(988);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorTrebuieSaArunceExceptieInAfara() {
		Grupa grupa = new Grupa(1200);
		
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformanta()
	{
		Grupa grupa = new Grupa(1082);
	}
	
	@Test
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa = new Grupa (1077);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testPromovabilitate() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<3; i++) {
			Student student = new Student("Andreea");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i =0; i<7; i++) {
			Student student = new Student("Ioana");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test
	public void testPromovabilitateLowerBoundary() {
		Grupa grupa = new Grupa(1083);
		for(int i=0; i<3; i++) {
			Student student = new Student("Andreea");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test
	public void testPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1083);
		for(int i =0; i<7; i++) {
			Student student = new Student("Ioana");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1083);
		grupa.getPromovabilitate();
	}
	
	
}
