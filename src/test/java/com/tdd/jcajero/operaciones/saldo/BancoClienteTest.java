package com.tdd.jcajero.operaciones.saldo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.autenticacion.CajeroTest;
import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;
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
