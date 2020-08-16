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

    	
    	HashMap <Integer, Persona> puestosDisponiblesFijos = Position.generarPuestosFijos(input);
    	//prueba que se cargo bien el hashmap
    	System.out.println(puestosDisponiblesFijos.containsKey(456789));
    	
    	HashMap <Integer, Persona> puestosDisponiblesVariables = Position.generarPuestosVariables(input);
    	//prueba que se cargo bien el hashmap    	
    	System.out.println(puestosDisponiblesVariables.containsKey(123456));    	
    	
    	//retorna cualquier cosa por el momento
    	return new Output(123456, 1, 1);
    }
    
}
