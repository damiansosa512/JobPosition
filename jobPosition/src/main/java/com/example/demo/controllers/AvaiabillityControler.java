package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Input;
import com.example.demo.model.Output;
import com.example.demo.model.enties.input.NodeMatriz;
import com.example.demo.model.enties.input.NodeVectorEquipos;
import com.example.demo.model.enties.input.Position;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AvaiabillityControler {
	

    @RequestMapping(value = "/avaiable", method = RequestMethod.POST)
    public Output create (@RequestBody Input input) {
    	   	
    	NodeMatriz[][] matrizCompletaPosiciones = Position.generateMatrixPosiciones(input);
    	ArrayList<NodeVectorEquipos> vectorEquipos = Position.generateVectorEquipos(input);

    	Output out = new Output();
    	return out;
    }
    
}
 