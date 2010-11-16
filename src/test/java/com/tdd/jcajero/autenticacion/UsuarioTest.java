package com.tdd.jcajero.autenticacion;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.tdd.jcajero.cajero.CajeroTest;

public class UsuarioTest extends CajeroTest{

	@Test
	public void crearUsuarioCorrecto() throws Exception{
		assertNotNull(new Usuario("alice"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void crearUsuarioIncorrectoNombreNulo() throws Exception{
		new Usuario(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void crearUsuarioIncorrectoNombreVacio() throws Exception{
		new Usuario("");
	}
}
