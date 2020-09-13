package com.example.demo.model.enties.input;

public class NodeMatriz {
	
	public NodeMatriz(String key, int idPlano, String idSector, int idPuesto, int x, int y) {
		super();
		this.key = key;
		this.idPlano = idPlano;
		this.idSector = idSector;
		this.idPuesto = idPuesto;
		this.x = x;
		this.y = y;
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
	public int x;
	public int y;
	
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

}
