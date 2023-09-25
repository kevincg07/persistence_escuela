package com.persistence_escuela.request;

public class ClasesRequest {


	private int idClase;
	private int profesor;
	private int materia;
	
	public ClasesRequest() {}

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

	@Override
	public String toString() {
		return "ClasesRequest [idClase=" + idClase + ", profesor=" + profesor + ", materia=" + materia + "]";
	}
	
	
	
}
