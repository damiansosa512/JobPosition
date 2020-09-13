package com.example.demo.model;

import com.example.demo.model.enties.input.Institucion;

public class Input {
	public Input(Institucion institucion) {
		super();
		this.institucion = institucion;
	}

	public Input() {
	}	

	public Institucion getInstitucion() {
		return institucion;
	}
	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public Institucion institucion;
}
