package com.persistence_escuela.request;

import java.time.LocalDateTime;

public class EstudiantesRequest {
	
	private int idEstudiante;
	private String nombre;
	private String telefono;
	private String email;
	private LocalDateTime fechaIngreso;
	private int carrera;
	private double colegiatura;
	
	public EstudiantesRequest() {}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getCarrera() {
		return carrera;
	}

	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}

	public double getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(double colegiatura) {
		this.colegiatura = colegiatura;
	}

	@Override
	public String toString() {
		return "EstudiantesRequest [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", email=" + email + ", fechaIngreso=" + fechaIngreso + ", carrera=" + carrera + ", colegiatura="
				+ colegiatura + "]";
	}
	
	
	
}
