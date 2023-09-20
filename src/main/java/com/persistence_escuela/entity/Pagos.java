package com.persistence_escuela.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "PAGOS")
public class Pagos implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagosAuto")
	@SequenceGenerator(name = "pagosAutos", sequenceName = "SQ_PAGOS", allocationSize = 1)
	@Column(name = "ID_PAGO", columnDefinition = "NUMBER")
	private int idPago;
 
	@ManyToOne
	@JoinColumn(name = "ESTUDIANTE", columnDefinition = "NUMBER")
	private Estudiantes estudiante;

	@Column(name = "FECHA", columnDefinition = "DATE")
	private LocalDateTime fecha;
 
	@Column(name = "MONTO", columnDefinition = "NUMBER(6,2)")
	private double monto;
 
	@Column(name = "CONCEPTO", columnDefinition = "NVARCHAR2(60)")
	private String concepto;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pagos [idPago=" + idPago + ", estudiante=" + estudiante + ", fecha=" + fecha + ", monto=" + monto
				+ ", concepto=" + concepto + "]";
	}
	
	

}
