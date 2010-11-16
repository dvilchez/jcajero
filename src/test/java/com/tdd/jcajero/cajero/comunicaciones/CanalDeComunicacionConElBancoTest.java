package com.tdd.jcajero.cajero.comunicaciones;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.cajero.comunicaciones.CanalDeComunicacionConElBanco;


public class CanalDeComunicacionConElBancoTest {

	@Test
	public void crearCanalDeComunicacion() throws Exception {
		assertNotNull(new CanalDeComunicacionConElBanco());
	}
}
