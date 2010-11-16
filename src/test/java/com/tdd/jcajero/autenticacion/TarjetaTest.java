package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;


public class TarjetaTest extends CajeroTest {

	private static final Tarjeta ALICIA_CARD = new Tarjeta(ALICIA_PIN, new Usuario("alice"));
	
	@Test
	public void crearTarjetaCorrecta() throws Exception {
		assertNotNull(ALICIA_CARD);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void crearTarjetaIncorrectaUsuarioVacio() throws Exception {
		new Tarjeta(ALICIA_PIN, new Usuario(""));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void crearTarjetaIncorrectaUsuarioNulo() throws Exception {
		new Tarjeta(ALICIA_PIN, new Usuario(null));
	}
	
	@Test
	public void verificarPinValido() throws Exception {
		assertTrue(ALICIA_CARD.verificarPin(ALICIA_PIN));
	}
	
	@Test
	public void verificarPinIncorrecto() throws Exception {
		assertFalse(ALICIA_CARD.verificarPin(ERNESTO_PIN));
	}
}
