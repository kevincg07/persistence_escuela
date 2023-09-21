package com.persistence_escuela.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "SUELDOS")
public class Sueldos  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
//	ID_PAGO  NOT NULL NUMBER  
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sueldosAuto")
	@SequenceGenerator(name = "sueldosAuto", sequenceName = "SQ_SUELDOS", allocationSize = 1)
	@Column(name = "ID_PAGO", columnDefinition = "NUMBER")
	private int idPago;
//	PROFESOR          NUMBER   
	@Column(name = "PROFESOR", columnDefinition = "NUMBER")
	private int profesor;
//	FECHA             DATE   
	@Column(name = "FECHA", columnDefinition = "DATE")
	private LocalDateTime fecha;
//	MONTO             NUMBER(6,2)
	@Column(name = "MONTO", columnDefinition = "NUMBER(6,2)")
	private double monto;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Sueldos [idPago=" + idPago + ", profesor=" + profesor + ", fecha=" + fecha + ", monto=" + monto + "]";
	}
	
	

}
