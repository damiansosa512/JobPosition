package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Input;
import com.example.demo.model.Node;
import com.example.demo.model.Output;
import com.example.demo.model.Position;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AvaiabillityControler {
	

    @RequestMapping(value = "/avaiable", method = RequestMethod.POST)
    public Output create (@RequestBody Input input) {
    	Node [][][][] result = Position.generateMatrix(input);
    	Position.completeMatrix(result, input);
    	
    	//prueba que se cargo ese nodo bien
    	System.out.println(result [0][0][1][3].getIdPuesto());
    	
    	//retorna cualquier cosa por el momento
    	return new Output(123456, 1, 1);
    }
    
}
