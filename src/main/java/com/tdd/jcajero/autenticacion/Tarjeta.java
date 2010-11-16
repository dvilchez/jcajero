package com.tdd.jcajero.autenticacion;


public class Tarjeta {

	private final Pin pin;
	
	public Tarjeta(Pin pin) {
		this.pin = pin;
	}
	
	public boolean verifyPin(Pin pin) {
		return this.pin.equals(pin);
	}

}
