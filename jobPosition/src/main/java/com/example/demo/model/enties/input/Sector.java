package com.example.demo.model.enties.input;

import java.util.ArrayList;

public class Sector {
	
	public Sector() {
	}		
	
	public Sector(String idSector, ArrayList<Puesto> puestos) {
		super();
		this.idSector = idSector;
		Puestos = puestos;
	}
	
	public String getIdSector() {
		return idSector;
	}

	public void setIdSector(String idSector) {
		this.idSector = idSector;
	}

	public ArrayList<Puesto> getPuestos() {
		return Puestos;
	}

	public void setPuestos(ArrayList<Puesto> puestos) {
		Puestos = puestos;
	}

	public String idSector;
	public ArrayList<Puesto> Puestos;
}
