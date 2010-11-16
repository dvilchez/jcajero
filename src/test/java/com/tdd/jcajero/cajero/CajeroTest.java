package com.tdd.jcajero.cajero;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.tdd.jcajero.autenticacion.Digito;
import com.tdd.jcajero.autenticacion.Pin;
import com.tdd.jcajero.autenticacion.Tarjeta;
import com.tdd.jcajero.autenticacion.Usuario;
import com.tdd.jcajero.banco.Saldo;
import com.tdd.jcajero.cajero.Cajero;
import com.tdd.jcajero.cajero.Efectivo;

public class CajeroTest {

	protected static final int EFECTIVO_INICIAL_DEL_CAJERO = 6000;

	protected static final Pin ALICIA_PIN = new Pin(new Digito(7), new Digito(6), new Digito(4), new Digito(3));

	protected static final Pin ERNESTO_PIN = new Pin(new Digito(5), new Digito(9), new Digito(5), new Digito(4));

	protected static final Saldo SALDO_DE_ALICIA = new Saldo(2000);
	
	protected static final Tarjeta ALICIA_TARJETA = new Tarjeta(ALICIA_PIN, new Usuario("alice"));

	@Ignore
	@Test
	public void aceptarTarjetaCorrecta() throws Exception {
		Tarjeta tarjeta = new Tarjeta(ALICIA_PIN, new Usuario("alice"));

	}
	
	@Test
	public void crearCajeroSinEfetivo() throws Exception {
		assertNotNull(new Cajero());
	}

	@Test
	public void consultarEfectivoEnCajeroConEfectivoCero() throws Exception {
		Cajero cajero = new Cajero();
		assertEquals(new Efectivo(0), cajero.efectivo());
	}
	
	@Test
	public void reponerEfectivo() throws Exception {
		Cajero cajero = new Cajero();
		cajero.reponerEfectivoConCantidad(EFECTIVO_INICIAL_DEL_CAJERO);
		assertEquals(new Efectivo(EFECTIVO_INICIAL_DEL_CAJERO), cajero.efectivo());
	}
	
	@Test
	public void tieneEfectivoParaUnaCantidad() throws Exception {
		Cajero cajero = new Cajero();
		cajero.reponerEfectivoConCantidad(EFECTIVO_INICIAL_DEL_CAJERO);
		assertTrue(cajero.tieneEfectivoParaLaCantidad(80));
	}

	@Test
	public void noTieneEfectivoParaUnaCantidad() throws Exception {
		Cajero cajero = new Cajero();
		assertFalse(cajero.tieneEfectivoParaLaCantidad(80));
	}

}
