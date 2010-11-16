package com.tdd.jcajero.operaciones.saldo;

import static org.junit.Assert.*;

import org.junit.Test;


public class CanalDeComunicacionConElBancoTest {

	@Test
	public void crearCanalDeComunicacion() throws Exception {
		assertNotNull(new CanalDeComunicacionConElBanco());
	}
	
	@Test
	public void consultasSaldo() throws Exception {
		
	}
	
}
