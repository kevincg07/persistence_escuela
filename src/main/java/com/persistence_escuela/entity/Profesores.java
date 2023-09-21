package com.persistence_escuela.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "PROFESORES")
public class Profesores implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profAuto")
	@SequenceGenerator(sequenceName = "profAuto", name = "SQ_PROFESOR", allocationSize = 1)
	@Column(name = "ID_PROFESOR", columnDefinition = "NUMBER")
	private int idProfesor;
 
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;

	@Column(name = "CEDULA", columnDefinition = "NVARCHAR(10)")
	private String cedula;
 
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;

	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private LocalDateTime fechaIngreso;
 
	@Column(name = "AREA", columnDefinition = "NVARCHAR2(20)")
	private String area;

	@Column(name = "SUELDO", columnDefinition = "NUMBER(6,2)")
	private double sueldo;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Profesores [idProfesor=" + idProfesor + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono="
				+ telefono + ", fechaIngreso=" + fechaIngreso + ", area=" + area + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
