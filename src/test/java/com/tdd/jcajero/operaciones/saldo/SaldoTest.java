package com.tdd.jcajero.operaciones.saldo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.operaciones.saldo.TarjetaOperaciones;
import com.tdd.jcajero.operaciones.saldo.Saldo;


public class SaldoTest {

	@Test
	public void crearSaldo() throws Exception {
		Saldo saldo = new Saldo(666);
		assertNotNull(saldo);
	}
	
}
