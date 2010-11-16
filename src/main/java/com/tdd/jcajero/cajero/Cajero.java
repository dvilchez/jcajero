package com.tdd.jcajero.cajero;



public class Cajero {

	private Efectivo efectivo = new Efectivo(0);
	
	public Efectivo efectivo() {
		return efectivo;
	}

	public void reponerEfectivoConCantidad(int cantidad) {
		efectivo = new Efectivo(cantidad);
	}
	
}
