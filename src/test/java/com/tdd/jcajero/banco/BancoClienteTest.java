package com.tdd.jcajero.banco;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.tdd.jcajero.autenticacion.Pin;
import com.tdd.jcajero.autenticacion.Tarjeta;
import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;
import com.tdd.jcajero.cajero.CajeroTest;
import com.tdd.jcajero.cajero.comunicaciones.CanalDeComunicacionConElBanco;


public class BancoClienteTest extends CajeroTest {
	
	private static final CanalDeComunicacionConElBanco canalComunicacionMoqueado = mock(CanalDeComunicacionConElBanco.class); 

	@Test
	public void crearBancoCliente() throws Exception {
		assertNotNull(new BancoCliente(null));
	}
	
	@Test
	public void consultarSaldoDeAlicia() throws Exception {
		when(canalComunicacionMoqueado.consultarSaldoPara(any(TokenDeAutenticacion.class))).thenReturn(SALDO_DE_ALICIA);
		Banco bancoCliente = new BancoCliente(canalComunicacionMoqueado);
		assertEquals(SALDO_DE_ALICIA, bancoCliente.consultarSaldoPara());
	}
	
	@Test
	public void autenticarTarjetaPinCorrecto() throws Exception {
		when(canalComunicacionMoqueado.autenticarTarjeta(any(Tarjeta.class), any(Pin.class))).thenReturn(new TokenDeAutenticacion());
		BancoCliente bancoCliente = new BancoCliente(canalComunicacionMoqueado);
		assertTrue(bancoCliente.autenticarTarjeta(ALICIA_TARJETA,ALICIA_PIN));
	}
	
	@Test
	public void autenticarTarjetaPinErroneo() throws Exception {
		when(canalComunicacionMoqueado.autenticarTarjeta(any(Tarjeta.class), any(Pin.class))).thenReturn(null);
		BancoCliente bancoCliente = new BancoCliente(canalComunicacionMoqueado);
		assertFalse(bancoCliente.autenticarTarjeta(ALICIA_TARJETA,ERNESTO_PIN));
	}
}
