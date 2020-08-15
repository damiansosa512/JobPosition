package com.example.demo.model;

public class Node {
	
	public Node() {}
			
	public Node(int idPuesto, int x, int y) {
		super();
		this.idPuesto = idPuesto;
		this.x = x;
		this.y = y;
		// to do: calculo de la tangente
		this.tan = Math.tan(x);;
	}
	
	public int idPuesto;
	public int x;
	public int y;
	public Double tan;
	public int ocupado;
	public int cuil;
	
	
	
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
	public void setY(int y) {
		this.y = y;
	}	
	public int getY() {
		return y;
	}
	public Double getTan() {
		return tan;
	}
	public void setTan(Double tan) {
		this.tan = tan;
	}
	public int getOcupado() {
		return ocupado;
	}
	public void setOcupado(int ocupado) {
		this.ocupado = ocupado;
	}
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

}
