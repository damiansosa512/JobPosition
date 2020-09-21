package com.example.demo.model.enties.input;

public class NodeVectorEquipos {
	
	public int idEquipo;
	public int cuil;
	public boolean puestoFijo;
	public double x;
	public double y;

	public NodeVectorEquipos(int idEquipo, int cuil, boolean puestoFijo, double x, double y) {
		super();
		this.idEquipo = idEquipo;
		this.cuil = cuil;
		this.puestoFijo = puestoFijo;
		this.x = x;
		this.y = y;
	}

	public boolean isPuestoFijo() {
		return puestoFijo;
	}

	public void setPuestoFijo(boolean puestoFijo) {
		this.puestoFijo = puestoFijo;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public NodeVectorEquipos(int idEquipo, int cuil) {
		super();
		this.idEquipo = idEquipo;
		this.cuil = cuil;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public NodeVectorEquipos() {}
	
}
