package paquete;

import java.util.Random;
import java.lang.Math; 
import java.util.ArrayList;

public class SeleccionArgentina {
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public SeleccionArgentina(int defensores, int mediocampistas, int delanteros) {
		if (defensores+ mediocampistas + delanteros == 10) {
			
			for (int i = 0; i < defensores; i++) {
				Random rand = new Random();
				int v = rand.nextInt(99);
				int f = rand.nextInt(60) + v;
				int d = rand.nextInt(40);
				jugadores.add(new Jugador(f, v, d, "DEF"));
			}
			
			for (int i = 0; i < mediocampistas; i++) {
				Random rand = new Random();
				int d = rand.nextInt(50);
				int v = d * 2;
				int f = rand.nextInt(99);
				
				jugadores.add(new Jugador(f, v, d, "MED"));
			}
			
			for (int i = 0; i < delanteros; i++) {
				Random rand = new Random();
				int f = rand.nextInt(99);
				int d = (f/100) * 20;
				int v = rand.nextInt(79) + 20;
				
				jugadores.add(new Jugador(f, v, d, "DEL"));
			}
			
			
		}
		else {
			throw new IllegalArgumentException("no papu");
		}
	}
	
	public Jugador getParecidoAMessi() {
		for (int i = 0; i < 10; i++) {
			if(jugadores.get(i).getVelocidad() > 95 && jugadores.get(i).getDefinicion() > 89) {
				return jugadores.get(i);
			}
		}
		return null;
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max debe ser mayor que min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}


}