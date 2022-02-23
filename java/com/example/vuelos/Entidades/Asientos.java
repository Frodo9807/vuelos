package com.example.vuelos.Entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asiento")
public class Asientos {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @Column(name="TIPO_ASIENTO")
	    private String tipo_asienot;
	    @Column(name="NUMERO_ASIENTO")
	    private String numero_asiento;
	    @Column(name="ESTADO")
	    private String estado;
	    @OneToMany(mappedBy="vuelo")
	    @Column(name="ID_VUELO")
	    Vuelos vuelo;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTipo_asienot() {
			return tipo_asienot;
		}
		public void setTipo_asienot(String tipo_asienot) {
			this.tipo_asienot = tipo_asienot;
		}
		public String getNumero_asiento() {
			return numero_asiento;
		}
		public void setNumero_asiento(String numero_asiento) {
			this.numero_asiento = numero_asiento;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public Vuelos getVuelo() {
			return vuelo;
		}
		public void setVuelo(Vuelos vuelo) {
			this.vuelo = vuelo;
		}
		public Asientos() {
			super();
		}
		
}
