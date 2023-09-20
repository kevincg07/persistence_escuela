package com.persistence_escuela.request;

public class CarrerasRequest {
	
	private int idCarrera;
	private String nombre;
	private String duracion;
	
	public CarrerasRequest() {}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "CarrerasRequest [idCarrera=" + idCarrera + ", nombre=" + nombre + ", duracion=" + duracion + "]";
	}
	
	

}
