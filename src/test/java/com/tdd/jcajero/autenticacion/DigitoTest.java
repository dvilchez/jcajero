package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class DigitoTest {

	@Test
	public void createValidDigit() throws Exception {
		assertNotNull(new Digito(4));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createDigitLessThan0() throws Exception {
		new Digito(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createDigitGreaterThan9() throws Exception {
		new Digito(10);
	}
	
	@Test
	public void compareEqualsDigits() throws Exception {
		assertTrue(new Digito(5).equals(new Digito(5)));
	}
	
	@Test
	public void caompareDifferentDigits() throws Exception {
		assertFalse(new Digito(5).equals(new Digito(7)));
	}

}
