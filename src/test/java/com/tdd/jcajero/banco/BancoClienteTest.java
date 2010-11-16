package com.tdd.jcajero.banco;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;
import com.tdd.jcajero.banco.Banco;
import com.tdd.jcajero.banco.BancoCliente;
import com.tdd.jcajero.cajero.CajeroTest;
import com.tdd.jcajero.cajero.comunicaciones.CanalDeComunicacionConElBanco;

import static org.mockito.Mockito.*;

public class BancoClienteTest extends CajeroTest {

	@Test
	public void crearBancoCliente() throws Exception {
		assertNotNull(new BancoCliente(null));
	}
	
	@Test
	public void consultarSaldoDeAlicia() throws Exception {
		CanalDeComunicacionConElBanco canalComunicacionMoqueado = mock(CanalDeComunicacionConElBanco.class);
		when(canalComunicacionMoqueado.consultarSaldoPara(any(TokenDeAutenticacion.class))).thenReturn(SALDO_DE_ALICIA);
		
		Banco bancoCliente = new BancoCliente(canalComunicacionMoqueado);
		
		assertEquals(SALDO_DE_ALICIA, bancoCliente.consultarSaldoPara());
	}
}
