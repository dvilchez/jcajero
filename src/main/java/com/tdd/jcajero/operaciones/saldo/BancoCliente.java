package com.tdd.jcajero.operaciones.saldo;

import com.tdd.jcajero.autenticacion.Pin;
import com.tdd.jcajero.autenticacion.Tarjeta;
import com.tdd.jcajero.autenticacion.TokenDeAutenticacion;

public class BancoCliente implements Banco {

	private final CanalDeComunicacionConElBanco canalComunicacion;
	
	private TokenDeAutenticacion tokenDeAutenticacion;
	
	public BancoCliente(CanalDeComunicacionConElBanco canalComunicacion) {
		this.canalComunicacion = canalComunicacion;
	}
	
	public Saldo consultarSaldoPara() {
		return canalComunicacion.consultarSaldoPara(tokenDeAutenticacion);
	}

	public boolean autenticarTarjeta(Tarjeta tarjeta, Pin pin){
		tokenDeAutenticacion = canalComunicacion.autenticarTarjeta(tarjeta, pin);
		if(tokenDeAutenticacion == null){
			return false;
		}
		return true;
	}

}
