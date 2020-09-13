package com.example.demo.model.enties.input;

import java.util.ArrayList;

public class Plano {

	public int idPlano;
    public int cantVisitas;
    public int cantDias;
    public ArrayList<Sector> Sectores;
	
    public Plano() {
	}	
	
    public Plano(int idPlano, int cantVisitas, int cantDias, ArrayList<Sector> sectores) {
		super();
		this.idPlano = idPlano;
		this.cantVisitas = cantVisitas;
		this.cantDias = cantDias;
		Sectores = sectores;
	}
	public int getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}

	public int getCantVisitas() {
		return cantVisitas;
	}

	public void setCantVisitas(int cantVisitas) {
		this.cantVisitas = cantVisitas;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public ArrayList<Sector> getSectores() {
		return Sectores;
	}

	public void setSectores(ArrayList<Sector> sectores) {
		Sectores = sectores;
	}

}
