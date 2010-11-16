package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest extends TpvTest {

	private static final Card ALICIA_CARD = new Card(ALICIA_PIN);
	
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
