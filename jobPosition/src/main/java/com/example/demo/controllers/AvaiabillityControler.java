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
    	
    	//prueba que se cargo ese nodo bien
    	System.out.println(matrizDisponibilidad [0][0][1][3].getIdPuesto());
    	
    	HashMap <Integer, Persona> puestosDisponiblesFijos = Position.generarPuestosFijos(input); 
    	//System.out.println(puestosDisponiblesFijos.containsKey(123456));
    	//System.out.println(puestosDisponiblesFijos.containsKey(456789));
    	
    	//retorna cualquier cosa por el momento
    	return new Output(123456, 1, 1);
    }
    
}
