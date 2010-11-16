package com.tdd.jcajero.operaciones.saldo;

import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;

public class BancoCliente implements Banco {

	private final CanalDeComunicacionConElBanco canalComunicacion;
	
	private TokenDeAutenticacion tokenDeAutenticacion;
	
	public BancoCliente(CanalDeComunicacionConElBanco canalComunicacion) {
		this.canalComunicacion = canalComunicacion;
	}
	
	@Override
	public Saldo consultarSaldoPara() {
		return canalComunicacion.consultarSaldoPara(tokenDeAutenticacion);
	}

}
