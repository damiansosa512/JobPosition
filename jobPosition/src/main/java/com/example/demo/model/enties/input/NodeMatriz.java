package com.example.demo.model.enties.input;

public class NodeMatriz {
	
	public NodeMatriz(String key, int idPlano, String idSector, int idPuesto, double x, double y) {
		super();
		this.key = key;
		this.idPlano = idPlano;
		this.idSector = idSector;
		this.idPuesto = idPuesto;
		this.x = x;
		this.y = y;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public String key;
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int idPlano;
	public String idSector;
	public int idPuesto;
	public double x;
	public double y;
	
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

	public boolean ocupado;
	public int cuil;
	
	
	
	public int getIdPuesto() {
		return idPuesto;
	}
	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}	
	public double getY() {
		return y;
	}
	public double getPuntoMedioLocal() {
		return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
	}
}
