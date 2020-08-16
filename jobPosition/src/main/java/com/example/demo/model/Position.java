package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author rsosa
 *
 */
public abstract class Position {

	/**
	 * Metodo que genera la matriz de cuatro dimensiones a partir del JSON entrada parseado como objeto
	 * @param input:Input entrada Json parseada a objetos
	 * @return matriz cuatro dimensiones - Dias, planos, sectores, puestos. 
	 */
	public static Node[][][][] generateMatrix(Input input) {
		int planos = input.getInstitucion().getPlanos().size();
		int[] index = Position.maxIndex(input);
		// to do: sacar el 5 que representa los dias de la semana por un dato configurable
		Node[][][][] posiciones = new Node[5][planos][index[0]][index[1]];
		Position.completarMatrix(posiciones, input);
		return posiciones;
	}


	/**
	 * Metodo encargado de definir la cantidad maxima de puestos y sectores para definir el tamaño de la matriz
	 * @param input:Input entrada Json parseada a objetos
	 * @return int[], array de dos posiciones con el size de puestos y sectores
	 */
	public static int[] maxIndex(Input input) {
		int sectores = 0;
		int puestos = 0;
		for(int i=0; i < input.getInstitucion().getPlanos().size(); i++) {
			ArrayList<Sector> sector = input.getInstitucion().getPlanos().get(i).getSectores();
			for(int j=0; j < sector.size(); j++) {
				ArrayList <Puesto> puesto = sector.get(j).getPuestos();
				for (int k=0; k < puesto.size(); k++) {
					if ( puesto.size() > puestos) {
						puestos = puesto.size();
					}
				}
				if ( sector.size() > sectores) {
					sectores = sector.size();
				}
			}
		}	
		int[] posFilaColumna = {sectores, puestos};
		return posFilaColumna;
	}
	

	/**
	 * Metodo que recibe una matriz vacia y un objeto, encargandose de poblar dicha estructura
	 * @param posiciones matriz de cuatro dimensiones [dias, planos, sectores, puestos] vacia
	 * @param input json parseado a objetos con los datos disponibles para las locaciones
	 * @return matriz completa con los puestos disponibles por dia, plano sector y puesto 
	 */
	public static Node[][][][] completarMatrix(Node [][][][] posiciones, Input input) {		
		int cantdiasLaborables = posiciones[0].length;
		for(int h=0; h <= cantdiasLaborables; h++) {
			for(int i=0; i < input.getInstitucion().getPlanos().size(); i++) {
				ArrayList<Sector> sector = input.getInstitucion().getPlanos().get(i).getSectores();
				for(int j=0; j < sector.size(); j++) {
					ArrayList <Puesto> puesto = sector.get(j).getPuestos();
					for (int k=0; k < puesto.size(); k++) {
						posiciones[h][i][j][k] = new Node(puesto.get(k).getIdPuesto(), puesto.get(k).getX(), puesto.get(k).getY());
						}
					}
				}
			}	
		return posiciones;
		}	
	
	
	public static HashMap<Integer, Persona> generarPuestosFijos(Input input){
		HashMap<Integer, Persona> puestosFijos = new HashMap<Integer, Persona>();
		for(int i=0; i <= input.getEquipos().size(); i++) {
			for(int j=0; j <= input.getEquipos().get(i).getPersonas().size(); j++) {
				if (input.getEquipos().get(i).getPersonas().get(j).isPuestoFijo()) {
					puestosFijos.put(input.getEquipos().get(i).getPersonas().get(j).getCuil(), input.getEquipos().get(i).getPersonas().get(j));
				}
			}
		}
		return puestosFijos;
	}
	
	
}
