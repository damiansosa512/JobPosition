package com.example.demo.model.enties.output;

public class Persona {
	public int cuil;
	public int idPlano;
	public String idSector;
	public int idPuesto;
	
	public Persona() {
	}	
	
	public Persona(int cuil, int idPlano, String idSector, int idPuesto) {
		super();
		this.cuil = cuil;
		this.idPlano = idPlano;
		this.idSector = idSector;
		this.idPuesto = idPuesto;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public String getIdSector() {
		return idSector;
	}

	public void setIdSector(String idSector) {
		this.idSector = idSector;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

}
