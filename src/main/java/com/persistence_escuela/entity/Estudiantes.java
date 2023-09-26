package com.persistence_escuela.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ESTUDIANTES")
public class Estudiantes implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="studentAuto")
	@SequenceGenerator(name="studentAuto", sequenceName="SQ_ESTUDIANTE", allocationSize = 1)
	@Column(name = "ID_ESTUDIANTE", columnDefinition = "NUMBER")
	private int idEstudiante;
               
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
          
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;
	
	@Column(name = "EMAIL", columnDefinition = "NVARCHAR2(20)")
	private String email;

	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private LocalDateTime fechaIngreso;

	@ManyToOne
	@JoinColumn(name = "CARRERA", columnDefinition = "NUMBER")
	private Carreras carrera;

	@Column(name = "COLEGIATURA", columnDefinition = "NUMBER(6,2)")
	private double colegiatura;

	@OneToMany(mappedBy="estudiante")
	private List<Pagos> pagos;
	
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

//	public List<Pagos> getPagos() {
//		return pagos;
//	}
//
//	public void setPagos(List<Pagos> pagos) {
//		this.pagos = pagos;
//	}

	public double getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(double colegiatura) {
		this.colegiatura = colegiatura;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Estudiantes [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", email=" + email + ", fechaIngreso=" + fechaIngreso + ", carrera=" + carrera + ", colegiatura="
				+ colegiatura + "]";
	}

	
}
