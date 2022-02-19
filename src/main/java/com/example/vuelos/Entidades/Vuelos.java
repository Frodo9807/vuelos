package com.example.vuelos.Entidades;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "huevos")
public class Vuelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="ORIGEN")
    private String origen;
    @Column(name="DESTINO")
    private String destino;
    @Column(name="FECHA")
    private Date fecha;
    @Column(name="HORA")
    private int hora;
    @Column(name="ASIENTOS_DISPONIBLES")
    private int asintos_disponibles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getAsintos_disponibles() {
		return asintos_disponibles;
	}
	public void setAsintos_disponibles(int asintos_disponibles) {
		this.asintos_disponibles = asintos_disponibles;
	}
	public Vuelos() {
		super();
	}

	
}
