package ro.ase.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.mock.StudentStub;
import ro.ase.cts.junit.clase.Grupa;
import ro.ase.cts.junit.clase.IStudent;

public class TestPromovabilitateaWithStub {

	@Test
	public void testPromovabilitateBoundaryLimitaSuperioara() {
		Grupa grupa = new Grupa(1083);
		IStudent student = new StudentStub();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
