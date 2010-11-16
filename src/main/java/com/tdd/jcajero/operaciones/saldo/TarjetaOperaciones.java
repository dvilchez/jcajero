package com.tdd.jcajero.operaciones.saldo;


public class TarjetaOperaciones {

	private final Banco banco;
	
	public TarjetaOperaciones(Banco banco) {
		this.banco = banco;
	}
	
	public Saldo saldo() {
		return banco.consultarSaldoPara();
	}

}
