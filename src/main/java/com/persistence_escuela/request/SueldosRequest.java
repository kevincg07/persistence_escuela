package com.persistence_escuela.request;

import java.time.LocalDateTime;

public class SueldosRequest {

  
	private int idPago;  
	private int profesor; 
	private LocalDateTime fecha;
	private double monto;
	
	public SueldosRequest() {}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public int getProfesor() {
		return profesor;
	}

	public void setProfesor(int profesor) {
		this.profesor = profesor;
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

	@Override
	public String toString() {
		return "SueldosRequest [idPago=" + idPago + ", profesor=" + profesor + ", fecha=" + fecha + ", monto=" + monto
				+ "]";
	}
	
	
	
}
