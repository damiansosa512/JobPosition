package com.example.demo.model;

public class Persona {
	
    public Persona() {
	}	
	
    public Persona(int cuil, boolean puestoFijo, int x, int y) {
		super();
		this.cuil = cuil;
		this.puestoFijo = puestoFijo;
		this.x = x;
		this.y = y;
	}
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}
	public boolean isPuestoFijo() {
		return puestoFijo;
	}
	public void setPuestoFijo(boolean puestoFijo) {
		this.puestoFijo = puestoFijo;
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
	public int cuil;
    public boolean puestoFijo;
    public int x;
    public int y;	

}
