package com.example.demo.model;

import java.util.ArrayList;

import com.example.demo.model.enties.output.Semana;

public class Output {

	public ArrayList<Semana> semana;

	public ArrayList<Semana> getSemana() {
		return semana;
	}

	public void setSemana(ArrayList<Semana> semana) {
		this.semana = semana;
	}
	
	public Output() {
	}
	
	public Output(ArrayList<Semana> semana) {
		super();
		this.semana = semana;
	}

	
}
