package com.persistence_escuela.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "CLASES")
public class Clases implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "claseAuto")
	@SequenceGenerator(name = "claseAuto", sequenceName = "SQ_CLASES", allocationSize = 1)
	@Column(name = "ID_CLASE", columnDefinition = "NUMBER")
	private int idClase;

	@Column(name = "PROFESOR", columnDefinition = "NUMBER")
	private int profesor;

	@Column(name = "MATERIA", columnDefinition = "NUMBER")
	private int materia;
	
	public int getIdClase() {
		return idClase;
	}
	
	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}
	
	public int getProfesor() {
		return profesor;
	}
	
	public void setProfesor(int profesor) {
		this.profesor = profesor;
	}
	
	public int getMateria() {
		return materia;
	}
	
	public void setMateria(int materia) {
		this.materia = materia;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Clases [idClase=" + idClase + ", profesor=" + profesor + ", materia=" + materia + "]";
	}

	
	
}
