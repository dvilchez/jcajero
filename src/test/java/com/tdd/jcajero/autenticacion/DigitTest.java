package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class DigitTest {

	@Test
	public void createValidDigit() throws Exception {
		assertNotNull(new Digit(4));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createDigitLessThan0() throws Exception {
		new Digit(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createDigitGreaterThan9() throws Exception {
		new Digit(10);
	}
	
	@Test
	public void compareEqualsDigits() throws Exception {
		assertTrue(new Digit(5).equals(new Digit(5)));
	}
	
	@Test
	public void caompareDifferentDigits() throws Exception {
		assertFalse(new Digit(5).equals(new Digit(7)));
	}

}
