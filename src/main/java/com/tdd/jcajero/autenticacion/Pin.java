package com.tdd.jcajero.autenticacion;

import java.util.Arrays;


public class Pin {

	private final Digito[] digitos = new Digito[4];
	
	public Pin(Digito digit0, Digito digit1, Digito digit2, Digito digit3) {
		digitos[0] = digit0;
		digitos[1] = digit1;
		digitos[2] = digit2;
		digitos[3] = digit3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(digitos);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Pin other = (Pin)obj;
		if (!Arrays.equals(digitos, other.digitos)) return false;
		return true;
	}

}
