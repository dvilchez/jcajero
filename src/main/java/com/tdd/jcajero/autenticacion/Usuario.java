package com.tdd.jcajero.autenticacion;

public class Usuario {
	
	private String nombre;
	
	public Usuario(String nombre){
		if(nombreNulo(nombre) || nombreEnBlanco(nombre) ){
			throw new IllegalArgumentException();
		}
		this.nombre = nombre;
	}
	
	private boolean nombreNulo(String nombre){
		if(nombre == null){
			return true;
		}
		return false;
	}
	
	private boolean nombreEnBlanco(String nombre){
		if(nombre.length() == 0){
			return true;
		}
		return false;
	}
}
