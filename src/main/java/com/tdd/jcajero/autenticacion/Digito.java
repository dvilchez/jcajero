package com.tdd.jcajero.autenticacion;


public class Digito {

	private static final int MIN_DIGIT = 0;
	private static final int MAX_DIGIT = 9;

	private final int digit;
	
	public Digito(int digit) {
		if (digit < MIN_DIGIT || digit > MAX_DIGIT) {
			throw new IllegalArgumentException();
		}
		
		this.digit = digit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + digit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Digito other = (Digito)obj;
		if (digit != other.digit) return false;
		return true;
	}
}
