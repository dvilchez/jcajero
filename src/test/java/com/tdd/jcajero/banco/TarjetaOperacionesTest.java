package com.tdd.jcajero.banco;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.tdd.jcajero.banco.Banco;
import com.tdd.jcajero.banco.Saldo;
import com.tdd.jcajero.banco.TarjetaOperaciones;
import com.tdd.jcajero.cajero.CajeroTest;


public class TarjetaOperacionesTest extends CajeroTest {

	private final Banco bancoDeAliciaMoqueado;
	
	public TarjetaOperacionesTest() {
		bancoDeAliciaMoqueado = mock(Banco.class);
		when(bancoDeAliciaMoqueado.consultarSaldoPara()).thenReturn(SALDO_DE_ALICIA);
	}
	
	@Test
	public void crearTarjetaOperaciones() throws Exception {
		assertNotNull(new TarjetaOperaciones(null));
	}
	
	@Test
	public void consultarSaldo() throws Exception {
		TarjetaOperaciones tarjetaOperaciones = new TarjetaOperaciones(bancoDeAliciaMoqueado);
		assertNotNull(tarjetaOperaciones.saldo());
	}

	@Test
	public void consultarSaldoAlicia() throws Exception {
		TarjetaOperaciones tarjetaOperaciones = new TarjetaOperaciones(bancoDeAliciaMoqueado);
		assertEquals(SALDO_DE_ALICIA, tarjetaOperaciones.saldo());
	}
	
}
