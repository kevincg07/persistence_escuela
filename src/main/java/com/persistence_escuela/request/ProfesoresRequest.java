package com.persistence_escuela.request;

import java.time.LocalDateTime;

public class ProfesoresRequest {

	private int idProfesor;
	private String nombre;          
	private String cedula;
	private String telefono;  
	private LocalDateTime fechaIngreso;
	private String area;
	private double sueldo;
	
	public ProfesoresRequest() {}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "ProfesoresRequest [idProfesor=" + idProfesor + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", telefono=" + telefono + ", fechaIngreso=" + fechaIngreso + ", area=" + area + ", sueldo=" + sueldo
				+ "]";
	}
	
}
