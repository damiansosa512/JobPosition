package com.example.demo.model.enties.input;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.javatuples.Pair;

import com.example.demo.model.Input;
import com.example.demo.model.Output;
import com.example.demo.model.enties.output.PuestosVisita;
import com.example.demo.model.enties.output.Semana;

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
	public static NodeMatriz[][] generateMatrixPosiciones(Input input) {
		int[] index = Position.maxIndex(input);
		NodeMatriz[][] posiciones = new NodeMatriz[index[0]][index[1]];
		Position.generateMatrix(posiciones, input);
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
		for(int i=0; i < input.getPlanos().size(); i++) {
			ArrayList<Sector> sector = input.getPlanos().get(i).getSectores();
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
	public static NodeMatriz[][] generateMatrix(NodeMatriz [][] posiciones, Input input) {		
			
			for(int i = 0; i < input.getPlanos().size(); i++) {
				Plano plano = input.getPlanos().get(i);
				for(int j=0; j < plano.getSectores().size(); j++) {
					Sector sector = plano.getSectores().get(j);
					for (int k=0; k < sector.getPuestos().size(); k++) {
						Puesto puesto = sector.getPuestos().get(k);
						String key = sector.idSector + "-" + puesto.idPuesto; 
						posiciones[j][k] = new NodeMatriz(key, plano.getIdPlano(), sector.getIdSector(), puesto.getIdPuesto(), puesto.getPuntoMedio().getX(), puesto.getPuntoMedio().getY());
						}
					}
			}
		return posiciones;
		}
	

	public static ArrayList<NodeVectorEquipos> generateVectorEquipos(Input input) {	
		
		ArrayList<NodeVectorEquipos> personas = new ArrayList<NodeVectorEquipos>();
				for(int j=0; j < input.getEquipos().size(); j++) {
					Equipo equipo = input.getEquipos().get(j);
					for (int k=0; k < equipo.getPersonas().size(); k++) {
						Persona persona = equipo.getPersonas().get(k);																	
						NodeVectorEquipos nodeVectorEquipos = new NodeVectorEquipos(equipo.idEquipo, persona.getCuil(), persona.isPuestoFijo(), persona.getX(), persona.getY());
						personas.add(nodeVectorEquipos);
					}
				}
		return personas;
		}
	
	
	public static void sentarFijos(ArrayList<NodeVectorEquipos> vectorEquipos, ArrayList<NodeVectorCompuesto> vectorCompuestoOrdenado) {
		for(int i = 0; i < vectorEquipos.size(); i++) {
			if(vectorEquipos.get(i).isPuestoFijo()) {
				vectorCompuestoOrdenado.get(i).setCuil(vectorEquipos.get(i).getCuil());
				vectorCompuestoOrdenado.get(i).setIdEquipo(vectorEquipos.get(i).getIdEquipo());
				vectorCompuestoOrdenado.get(i).setX(vectorEquipos.get(i).getX());
				vectorCompuestoOrdenado.get(i).setY(vectorEquipos.get(i).getY());
				vectorCompuestoOrdenado.get(i).setOcupado(true);
			}
		}
	}
	
	public static void cargarLosDemas(ArrayList<NodeVectorEquipos> vectorEquipos, ArrayList<NodeVectorCompuesto> vectorCompuestoOrdenado) {
		for(int i = 0; i < vectorCompuestoOrdenado.size(); i++) {
			if(vectorCompuestoOrdenado.get(i).isOcupado()) {
				
			}
		}
	}		
	
	public static int lugaresPreviosLibres(ArrayList<NodeVectorCompuesto> vectorCompuestoOrdenado, int posicion) {
		int i = 0;
		while(vectorCompuestoOrdenado.get(i).isOcupado()) {
			i += 1;
		}
		return i;
	}
	
	public static ArrayList<NodeVectorCompuesto> equipoConPuestosVariables(ArrayList<NodeVectorCompuesto> vectorCompuestoOrdenado) {
		int idEquipo = vectorCompuestoOrdenado.get(0).getIdEquipo();
		ArrayList <NodeVectorCompuesto> vectorSalida = new ArrayList<>();
		ArrayList <NodeVectorCompuesto> vectorAux = new ArrayList<>();
		for(int i = 0; i < vectorCompuestoOrdenado.size(); i++) {			
			 if (vectorCompuestoOrdenado.get(i).idEquipo == idEquipo){
				 vectorAux.add(vectorCompuestoOrdenado.get(i));
			 }else {
				 if (Position.verificaSiTienePuestosFijos(vectorAux)) {
					 vectorSalida.addAll(vectorAux);
					 vectorAux.clear();
					 idEquipo = vectorCompuestoOrdenado.get(i).idEquipo;
				 }else {
					 vectorAux.clear();
					 idEquipo = vectorCompuestoOrdenado.get(i).idEquipo;
				 }
			 }
		}
		return vectorSalida;
	}
		

	public static boolean verificaSiTienePuestosFijos(ArrayList<NodeVectorCompuesto> vectorCompuestoOrdenado) {
		ArrayList<NodeVectorCompuesto> nuevo =  (ArrayList<NodeVectorCompuesto>) vectorCompuestoOrdenado.stream().filter(puesto -> puesto.isOcupado()).collect(Collectors.toList());
				if(nuevo.size() > 0 ) {
					return true;
				}else {
					return false;
				}
	}
	
	
	public static Output buildMessage(ArrayList<NodeMatriz> ordenado, ArrayList<NodeVectorEquipos> equipos, int dias) {	
		
		Output salida = new Output();	
		ArrayList<Semana> semanas = new ArrayList<>();		
		for(int h=1 ; h <= dias; h++) {		
			ArrayList<com.example.demo.model.enties.output.Persona> personas = new ArrayList<com.example.demo.model.enties.output.Persona>();
			ArrayList<PuestosVisita> puestosVisita = new ArrayList<PuestosVisita>();						
			for(int i=0; i < equipos.size(); i++) {	
				if(ordenado.get(i)!=null) {					
					com.example.demo.model.enties.output.Persona persona = new com.example.demo.model.enties.output.Persona();
					persona.setCuil(equipos.get(i).getCuil());
					persona.setIdPlano(ordenado.get(i).getIdPlano());
					persona.setIdPuesto(ordenado.get(i).getIdPuesto());
					persona.setIdSector(ordenado.get(i).getIdSector());
					personas.add(persona);
				}else {
					
				}				
			}
			Semana semana = new Semana(h, personas, puestosVisita);	
			semanas.add(semana);
			salida.setSemana(semanas);			
		}		
		return salida;
	}	
	
	
		
	
}
