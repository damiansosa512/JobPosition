package com.example.demo.model.enties.output;

import java.util.ArrayList;

public class Semana {

	public int dia;
	public ArrayList<Persona> personas;
	public ArrayList<PuestosVisita> puestosVisita;
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<PuestosVisita> getPuestosVisita() {
		return puestosVisita;
	}

	public void setPuestosVisita(ArrayList<PuestosVisita> puestosVisita) {
		this.puestosVisita = puestosVisita;
	}
	
	public Semana(int dia, ArrayList<Persona> personas, ArrayList<PuestosVisita> puestosVisita) {
		super();
		this.dia = dia;
		this.personas = personas;
		this.puestosVisita = puestosVisita;
	}
	
	
}
