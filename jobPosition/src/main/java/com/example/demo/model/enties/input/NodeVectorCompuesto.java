package com.example.demo.model.enties.input;

public class NodeVectorCompuesto {
	public int idEquipo;
	public int cuil;
	public boolean ocupado;
	public double x;
	public double y;
	public NodeVectorCompuesto(int idEquipo, int cuil, boolean ocupado, double x, double y) {
		super();
		this.idEquipo = idEquipo;
		this.cuil = cuil;
		this.ocupado = ocupado;
		this.x = x;
		this.y = y;
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
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
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
}
