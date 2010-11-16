package com.tdd.jcajero.banco;

import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;
import com.tdd.jcajero.cajero.comunicaciones.CanalDeComunicacionConElBanco;

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
