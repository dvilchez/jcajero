package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class TarjetaTest extends TpvTest {

	private static final Tarjeta ALICIA_CARD = new Tarjeta(ALICIA_PIN);
	
	@Test
	public void createCard() throws Exception {
		assertNotNull(ALICIA_CARD);
	}
	
	@Test
	public void verifyValidPin() throws Exception {
		assertTrue(ALICIA_CARD.verifyPin(ALICIA_PIN));
	}
	
	@Test
	public void verifyIncorrectPin() throws Exception {
		assertFalse(ALICIA_CARD.verifyPin(ERNESTO_PIN));
	}

}
