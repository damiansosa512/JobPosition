package com.example.demo.model;

import java.util.ArrayList;

public class Input {
	public Input(Institucion institucion, ArrayList<Equipo> equipos) {
		super();
		this.institucion = institucion;
		this.equipos = equipos;
	}

	public Input() {
	}	

	public Institucion getInstitucion() {
		return institucion;
	}
	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public Institucion institucion;
	public ArrayList<Equipo> equipos;
}
