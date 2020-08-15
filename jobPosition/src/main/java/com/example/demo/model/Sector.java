package com.example.demo.model;

import java.util.ArrayList;

public class Sector {
	
	public Sector() {
	}		
	
	public Sector(int idSector, ArrayList<Puesto> puestos) {
		super();
		this.idSector = idSector;
		Puestos = puestos;
	}
	
	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public ArrayList<Puesto> getPuestos() {
		return Puestos;
	}

	public void setPuestos(ArrayList<Puesto> puestos) {
		Puestos = puestos;
	}

	public int idSector;
	public ArrayList<Puesto> Puestos;
}
