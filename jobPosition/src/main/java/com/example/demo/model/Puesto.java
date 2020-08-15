package com.example.demo.model;

public class Puesto {
	
	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int idPuesto;
	public int x;
	public int y;
	
	public Puesto() {
	}	
	
	public Puesto(int idPuesto, int x, int y) {
		super();
		this.idPuesto = idPuesto;
		this.x = x;
		this.y = y;
	}

}
