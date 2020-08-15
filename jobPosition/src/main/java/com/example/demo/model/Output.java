package com.example.demo.model;

public class Output {

	public Output() {
	}

	public Output(int cuil, int idDia, int idPuesto) {
		super();
		this.cuil = cuil;
		this.idDia = idDia;
		this.idPuesto = idPuesto;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public int getIdDia() {
		return idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public int cuil;
	public int idDia;
	public int idPuesto;

}
