package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.operaciones.saldo.Efectivo;


public class EfectivoTest {

	@Test
	public void crearEfectivo() throws Exception {
		assertNotNull(new Efectivo(0));
	}
	
	@Test
	public void consultarCantidad() throws Exception {
		assertTrue(6000 == new Efectivo(6000).cantidad());
	}
	
	@Test
	public void comparaEfectivosIguales() throws Exception {
		assertTrue(new Efectivo(6000).equals(new Efectivo(6000)));
	}
}
