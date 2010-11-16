package com.tdd.jcajero.operaciones.saldo;

import static org.junit.Assert.*;

import org.junit.Test;


public class CanalDeComunicacionConElBancoTest {

	@Test
	public void crearCanalDeComunicacion() throws Exception {
		CanalDeComunicacionConElBanco canalComunicacion = new CanalDeComunicacionConElBanco();
		assertNotNull(canalComunicacion);
	}
	
	@Test
	public void consultasSaldo() throws Exception {
		
	}
}
