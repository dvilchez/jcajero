package com.tdd.jcajero.banco;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.jcajero.banco.Saldo;
import com.tdd.jcajero.banco.TarjetaOperaciones;


public class SaldoTest {

	@Test
	public void crearSaldo() throws Exception {
		assertNotNull(new Saldo(666));
	}
	
}
