package com.tdd.jcajero.autenticacion;

import java.util.Arrays;


public class Pin {

	private final Digit[] digits = new Digit[4];
	
	public Pin(Digit digit0, Digit digit1, Digit digit2, Digit digit3) {
		digits[0] = digit0;
		digits[1] = digit1;
		digits[2] = digit2;
		digits[3] = digit3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(digits);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Pin other = (Pin)obj;
		if (!Arrays.equals(digits, other.digits)) return false;
		return true;
	}

}
