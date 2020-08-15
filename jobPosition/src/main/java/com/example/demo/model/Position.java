package com.example.demo.model;

import java.util.ArrayList;

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
		Position.completeMatrix(posiciones, input);
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
	

	public static Node[][][][] completeMatrix(Node [][][][] posiciones, Input input) {		
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
	
}
