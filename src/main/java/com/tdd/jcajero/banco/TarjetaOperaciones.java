package com.tdd.jcajero.banco;


public class TarjetaOperaciones {

	private final Banco banco;
	
	public TarjetaOperaciones(Banco banco) {
		this.banco = banco;
	}
	
	public Saldo saldo() {
		return banco.consultarSaldoPara();
	}

}
