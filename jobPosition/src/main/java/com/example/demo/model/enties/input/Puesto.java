package com.example.demo.model.enties.input;

public class Puesto {
	
	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public int idPuesto;
	public PuntoMedio puntoMedio;
	
	public Puesto() {
	}	
	
	public Puesto(int idPuesto, PuntoMedio puntoMedio) {
		super();
		this.idPuesto = idPuesto;
		this.puntoMedio = puntoMedio;
	}

	public PuntoMedio getPuntoMedio() {
		return puntoMedio;
	}

	public void setPuntoMedio(PuntoMedio puntoMedio) {
		this.puntoMedio = puntoMedio;
	}
	
	public double getPuntoMedioLocal() {
		return Math.sqrt(this.getPuntoMedio().getX() * this.getPuntoMedio().getX() + this.getPuntoMedio().getY() * this.getPuntoMedio().getY());
	}

}
