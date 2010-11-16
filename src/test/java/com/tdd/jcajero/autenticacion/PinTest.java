package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class PinTest extends TpvTest {

	@Test
	public void createPin() throws Exception {
		assertNotNull(ALICIA_PIN);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createInvalidPin() throws Exception {
		new Pin(new Digito(7), new Digito(-6), new Digito(4), new Digito(3));
	}

	
	@Test
	public void compareEqualsPins() throws Exception {
		assertTrue(ALICIA_PIN.equals(ALICIA_PIN));
	}

	@Test
	public void compareDifferentsPins() throws Exception {
		assertFalse(ALICIA_PIN.equals(ERNESTO_PIN));
	}

}
