package com.tdd.jcajero.cajero;


public class Efectivo {

	private int cantidad;
	
	public Efectivo(int cantidad) {
		this.cantidad = cantidad;
	}

	public int cantidad() {
		return cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Efectivo other = (Efectivo)obj;
		if (cantidad != other.cantidad) return false;
		return true;
	}

	public boolean mayorOIgualQue(Efectivo otroEfectivo) {
		return cantidad >= otroEfectivo.cantidad;
	}

}
