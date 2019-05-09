package paquete;

import java.util.ArrayList;

public class Mazo {
	private int mazoquantas = 40;
	private int mazoLength = 0;
	public ArrayList<Carta> cartas;
	public Mazo(int mLeng ,ArrayList<Carta> cartis ) {
		cartas = new ArrayList<Carta>();
		for(int i = 0 ; i< 12; i++) {
			if(i!= 8 || i!= 9) {
				cartas.add(new Carta(i ,"BASTO"));
				cartas.add(new Carta(i ,"ESPADA"));
				cartas.add(new Carta(i ,"COPA"));
				cartas.add(new Carta(i ,"ORO"));
			}
		}
	}
	public static void swap(ArrayList<Carta> lista , int i , int j) {
		
	}
	void barajar() {
		
	}
	ArrayList<Carta> darCartas(int cantidad){
		ArrayList<Carta>vuelto = new ArrayList<Carta>();
		for(int i = 0; i<cantidad; i++) {
			if(cantidad>mazoquantas) {
				 throw new IllegalArgumentException("Cantidad de cartas superiror a las disponibles ");
			}
			vuelto.add(i, cartas.get(i));
			mazoquantas--;
			mazoLength++;
			
		}
		return vuelto;
	}
	public int cartasDisponibles() {
		return mazoLength;
	}
}
