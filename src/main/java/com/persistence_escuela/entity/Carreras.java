package com.persistence_escuela.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CARRERAS")
public class Carreras implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carreraAuto")
	@SequenceGenerator(name = "carreraAuto", sequenceName = "SQ_CARRERA", allocationSize = 1)
	@Column(name = "ID_CARRERA", columnDefinition = "NUMBER")
	private int idCarrera;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(20)")
	private String nombre;

	@Column(name = "DURACION", columnDefinition = "NVARCHAR2(25)")
	private String duracion;

	@OneToMany(mappedBy = "carrera")
	List<Estudiantes> estudiantes;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Carreras [idCarrera=" + idCarrera + ", nombre=" + nombre + ", duracion=" + duracion + "]";
	}
	
	

}
