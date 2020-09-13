package com.example.demo.model.enties.input;

import java.util.ArrayList;

public class Equipo {
	public Equipo() {
	}	
	public Equipo(int idEquipo, ArrayList<Persona> personas) {
		super();
		this.idEquipo = idEquipo;
		Personas = personas;
	}
	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	public ArrayList<Persona> getPersonas() {
		return Personas;
	}
	public void setPersonas(ArrayList<Persona> personas) {
		Personas = personas;
	}
	public int idEquipo;
	public ArrayList<Persona> Personas;
}
