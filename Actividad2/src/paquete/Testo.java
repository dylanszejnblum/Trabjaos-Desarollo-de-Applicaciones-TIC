package paquete;

import java.util.ArrayList;

public class Testo {
	public static void main (String[] args) {
		//Carta car = new Carta(1,"COPA");
		Carta cara = new Carta(12,"BASTO");
		Mazo m = new Mazo();
		m.darCartas(3);
		m.barajar();
	//	m.cualesSalieron();
		
		System.out.print(m.cualesSalieron());
	
		
		
		//	System.out.print(cara.ShowCarta());
		
		
}
}
