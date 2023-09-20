package com.persistence_escuela.request;

import java.time.LocalDateTime;

import com.persistence_escuela.entity.Estudiantes;

public class PagosRequest {
	
	private int idPago;
	private Estudiantes estudiante;
	private LocalDateTime fecha;
	private double monto;
	private String concepto;
	
	public PagosRequest() {}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	
	
	public Estudiantes getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiantes estudiante) {
		this.estudiante = estudiante;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	@Override
	public String toString() {
		return "PagosRequest [idPago=" + idPago + ", estudiante=" + estudiante + ", fecha=" + fecha + ", monto=" + monto
				+ ", concepto=" + concepto + "]";
	}
	
	

}
