package com.example.demo.model;

import java.util.ArrayList;

public class Institucion {
	public Institucion(int idInstitucion, int diasOficina, ArrayList<Plano> planos) {
		super();
		this.idInstitucion = idInstitucion;
		this.diasOficina = diasOficina;
		Planos = planos;
	}
	public Institucion() {
	}	
	public int getIdInstitucion() {
		return idInstitucion;
	}
	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	public ArrayList<Plano> getPlanos() {
		return Planos;
	}
	public void setPlanos(ArrayList<Plano> planos) {
		Planos = planos;
	}
	public int idInstitucion;
	public int diasOficina;
	public int getDiasOficina() {
		return diasOficina;
	}
	public void setDiasOficina(int diasOficina) {
		this.diasOficina = diasOficina;
	}
	public ArrayList<Plano> Planos;
}
