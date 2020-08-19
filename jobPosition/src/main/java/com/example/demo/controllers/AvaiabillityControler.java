package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Input;
import com.example.demo.model.Node;
import com.example.demo.model.Output;
import com.example.demo.model.Position;
import com.example.demo.model.Persona;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AvaiabillityControler {
	

    @RequestMapping(value = "/avaiable", method = RequestMethod.POST)
    public Output create (@RequestBody Input input) {
    	Node [][][][] matrizDisponibilidad = Position.generateMatrix(input);
    	
    	//prueba que se cargo esos nodos
    	System.out.println(matrizDisponibilidad [0][0][0][0].getIdPuesto());
    	System.out.println(matrizDisponibilidad [0][0][1][2].getIdPuesto());
    	System.out.println(matrizDisponibilidad [0][0][2][0].getIdPuesto());

    	
    	HashMap <String, Persona> puestosDisponiblesFijos = Position.generarPuestosFijos(input);
    	//prueba que se cargo bien el hashmap con el puesto fijo
    	System.out.println("Puesto fijo:" + puestosDisponiblesFijos.containsKey("3030"));
    	
    	
    	Position.completarMatrixConFijos(matrizDisponibilidad, puestosDisponiblesFijos);
    	//prueba que se marco en la matriz el puesto como ocupado con el cuil
    	System.out.println(matrizDisponibilidad[0][0][1][1].getOcupado());
    	System.out.println(matrizDisponibilidad[0][0][1][1].getCuil());
    	System.out.println(matrizDisponibilidad[1][0][1][1].getOcupado());
    	System.out.println(matrizDisponibilidad[1][0][1][1].getCuil());
    	System.out.println(matrizDisponibilidad[2][0][1][1].getOcupado());
    	System.out.println(matrizDisponibilidad[2][0][1][1].getCuil());    	
    	
    	//retorna cualquier cosa por el momento
    	return new Output(123456, 1, 1);
    }
    
}
