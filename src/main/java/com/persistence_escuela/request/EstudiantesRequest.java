package com.persistence_escuela.request;

import java.time.LocalDateTime;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import com.persistence_escuela.entity.Carreras;

public class EstudiantesRequest {
	
	private int idEstudiante;
	@NotBlank(message = "es obligatorio escribir el nombre del estudiante")
	private String nombre;
	@NotBlank(message = "se necesita un numero de telefono para registrarse")
	private String telefono;
	@NotBlank(message = "se necesita un email para poder registrar un nuevo alumno")
	private String email;
	//@NotBlank(message = "no puedes regstrar al alumno si dejas vacia la fecha de ingreso")
	private LocalDateTime fechaIngreso;
	private Carreras carrera;
	@Digits(integer = 4 /*precision*/, fraction = 2 /*scale*/)
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

	public Carreras getCarrera() {
		return carrera;
	}

	public void setCarrera(Carreras carrera) {
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
