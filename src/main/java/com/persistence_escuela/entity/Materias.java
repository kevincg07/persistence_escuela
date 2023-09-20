package com.persistence_escuela.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIAS")
public class Materias implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="materiaAuto")
	@SequenceGenerator(name = "materiaAuto", sequenceName = "SQ_MATERIA", allocationSize = 1)
	@Column(name = "ID_MATERIA", columnDefinition = "NUMBER")
	private int idMateria;

	@Column(name = "MATERIA", columnDefinition = "NVARCHAR2(15)")
	private String materia;
	
	public int getIdMateria() {
		return idMateria;
	}
	
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Materias [idMateria=" + idMateria + ", materia=" + materia + "]";
	}
	
	
	
}
