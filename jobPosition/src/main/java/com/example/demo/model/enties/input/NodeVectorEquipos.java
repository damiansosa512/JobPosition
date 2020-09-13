package com.example.demo.model.enties.input;

public class NodeVectorEquipos {
	
	public int idEquipo;
	public int cuil;

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
