package com.persistence_escuela.request;

import javax.validation.constraints.NotBlank;

public class MateriasRequest {

	private int idMateria;
	@NotBlank(message = "El atributo de materia debe tener un nombre y no debe estar vacio")
	private String materia;
	
	public MateriasRequest() {}
	
	public MateriasRequest(int idMateria, String materia) {
		this.idMateria = idMateria;
		this.materia = materia;
	}

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

	@Override
	public String toString() {
		return "MateriasRequest [idMateria=" + idMateria + ", materia=" + materia + "]";
	}
	
	
}
