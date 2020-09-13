package com.example.demo.model.enties.output;

public class PuestosVisita {
	public int idPlano;
	public int idSector;
	public int idPuesto;
	
	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public PuestosVisita(int idPlano, int idSector, int idPuesto) {
		super();
		this.idPlano = idPlano;
		this.idSector = idSector;
		this.idPuesto = idPuesto;
	}

}
