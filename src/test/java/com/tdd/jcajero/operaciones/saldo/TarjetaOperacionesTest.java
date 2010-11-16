package com.tdd.jcajero.operaciones.saldo;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.tdd.jcajero.operaciones.saldo.TarjetaOperaciones;
import com.tdd.jcajero.operaciones.saldo.Saldo;


public class TarjetaOperacionesTest {

	private static final Saldo SALDO_DE_ALICIA = new Saldo(2000);

	private final Banco bancoDeAliciaMoqueado;
	
	public TarjetaOperacionesTest() {
		bancoDeAliciaMoqueado = mock(Banco.class);
		when(bancoDeAliciaMoqueado.consultarSaldoPara(any(TarjetaOperaciones.class))).thenReturn(SALDO_DE_ALICIA);
	}
	
	@Test
	public void crearTarjetaOperaciones() throws Exception {
		TarjetaOperaciones tarjetaOperaciones = new TarjetaOperaciones(null);
		assertNotNull(tarjetaOperaciones);
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
