package com.tdd.jcajero.autenticacion;


public class Tarjeta {

	private final Pin pin;
	
	public Tarjeta(Pin pin, Usuario usuario) {
		this.pin = pin;
	}
	
	public boolean verificarPin(Pin pin) {
		return this.pin.equals(pin);
	}

}
