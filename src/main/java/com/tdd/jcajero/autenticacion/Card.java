package com.tdd.jcajero.autenticacion;


public class Card {

	private final Pin pin;
	
	public Card(Pin pin) {
		this.pin = pin;
	}
	
	public boolean verifyPin(Pin pin) {
		return this.pin.equals(pin);
	}

}
