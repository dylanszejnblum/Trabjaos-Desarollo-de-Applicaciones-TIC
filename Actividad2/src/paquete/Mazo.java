//package paquete;

import java.util.ArrayList;
import java.util.Random;
public class Mazo {
	public static ArrayList<Carta> salidas =   new ArrayList<Carta>();
	public static ArrayList<Carta> cartas;
	private int tope;
	public Mazo() {
		tope = 0;
	//	salidas =   new ArrayList<Carta>();
		cartas = new ArrayList<Carta>();
		for(int i = 1 ; i< 13; i++) {
			if(i!= 8 && i!= 9){
				cartas.add(new Carta(i ,"BASTO"));
				cartas.add(new Carta(i ,"ESPADA"));
				cartas.add(new Carta(i ,"COPA"));
				cartas.add(new Carta(i ,"ORO"));
			}
				
			
		}
	}
	public static void swap(ArrayList<Carta> lista , int i , int j) {
		Carta l = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, l);
	}
	void barajar(){
		for(int i = 0 ; i < 40 ; i++){
			int max = 39;
			int min = 0;
			int diff = max - min;
			Random rn = new Random();
			int rando= rn.nextInt(diff + 1);
			int rando2= rn.nextInt(diff + 1);
			Mazo.swap(Mazo.cartas, rando, rando2);
		}
		 tope = 0;
	}
	public Carta proxima() {
		if(cartas.get(0)==null) {
			 throw new IllegalArgumentException("No hay mas cartas");
		}else {
			Carta resultado = cartas.get(tope);
			salidas.add(cartas.get(tope));
			tope++;
			
			return resultado;
		}
		
	}
	
	void verTope() {
		this.proxima();
		}
	ArrayList<Carta> darCartas(int cantidad){
		
		ArrayList<Carta> salidas =   new ArrayList<Carta>();
		if(cantidad>cartas.size() - tope) {
			 throw new IllegalArgumentException("No cartas suficientes");
		}
		for(int i = tope; i<cantidad+tope; i++) {
			salidas.add(cartas.get(i));
		//	cartas.remove(i);
			//Agregar variable publica con tope 
		}
		tope = tope+cantidad;
		return salidas;
	}
	int cartasDisponibles() {
		return cartas.size()-tope;
	}
	ArrayList<Carta> cualesSalieron(){
	  ArrayList<Carta> cartasalid = new ArrayList<Carta>();
		if(tope<=0) {
			return null ;
		}
		for(int i = 0 ; i <tope; i++){
			cartasalid.add(cartas.get(i));
		}
		return cartasalid;
	}
	
	

}
