package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public abstract class CajeroTest {

	protected static final Pin ALICIA_PIN = new Pin(new Digito(7), new Digito(6), new Digito(4), new Digito(3));
	protected static final Pin ERNESTO_PIN = new Pin(new Digito(5), new Digito(9), new Digito(5), new Digito(4));
	
	

	@Test
	public void aceptarTarjetaCorrecta() throws Exception {
		Tarjeta tarjeta = new Tarjeta(ALICIA_PIN, new Usuario("alice"));

	}
}
