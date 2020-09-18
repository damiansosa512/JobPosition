package com.example.demo.model;

import com.example.demo.model.enties.input.Plano;
import com.example.demo.model.enties.input.Equipo;
import java.util.ArrayList;

public class Input {
	
	public int idInstitucion;
	public ArrayList<Plano> planos;
	public ArrayList<Equipo> equipos;
	
	public Input(int idInstitucion, ArrayList<Plano> planos, ArrayList<Equipo> equipos) {
		super();
		this.idInstitucion = idInstitucion;
		this.planos = planos;
		this.equipos = equipos;
	}
	public int getIdInstitucion() {
		return idInstitucion;
	}
	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	public ArrayList<Plano> getPlanos() {
		return planos;
	}
	public void setPlanos(ArrayList<Plano> planos) {
		this.planos = planos;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	


}
