package com.persistence_escuela.request;

public class MateriasRequest {

	private int idMateria;
	private String materia;
	
	public MateriasRequest() {}

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
