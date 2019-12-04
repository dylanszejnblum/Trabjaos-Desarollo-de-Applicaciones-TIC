import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	public static ArrayList<Carta> cartas;
	public static ArrayList<Carta> salidas =   new ArrayList<Carta>();


	private int maxiCartas;
	
	public Mazo() {
		maxiCartas = 0;
		cartas = new ArrayList<Carta>();
		for(int i = 1 ; i < 13 ; i++) {
			if(i!= 9 && i!=8) {
				cartas.add(new Carta(i ,"BASTO"));
				cartas.add(new Carta(i ,"ESPADA"));
				cartas.add(new Carta(i ,"COPA"));
				cartas.add(new Carta(i ,"ORO"));
			}
	}
	}
	public static int conseguirNumerosRandom(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("el maximo tiene que mayor que el minimo");
		}

		Random rando = new Random();
		return rando.nextInt((max - min) + 1) + min;
	}
	public void barajar() {
        Random random = new Random();
        for (int i = 1; i < 39; i++) {
          int rando1 = random.nextInt(cartas.size());
          int rando2 = random.nextInt(cartas.size());
          Mazo.swap(cartas, rando1, rando2);
        }
      }
	public Carta proxima() {
		if(cartas.get(0)!=null) {
			Carta resultado = cartas.get(maxiCartas);
			salidas.add(cartas.get(maxiCartas));
			maxiCartas++;
			
			return resultado;
		}
		 throw new IllegalArgumentException("No hay mas cartas");
	}
	public static void swap(ArrayList<Carta> lista , int i , int j) {
		Carta l = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, l);
	}
	void verTope() {
		this.proxima();
		}
	int cartasDisponibles() {
		return cartas.size()-maxiCartas;
	}
	
	ArrayList<Carta> darCartas(int cantidad){
			
			ArrayList<Carta> salidas =   new ArrayList<Carta>();
			if(cantidad>cartas.size() - maxiCartas) {
				 throw new IllegalArgumentException("ERROORORO");
			}
			for(int i = maxiCartas; i<cantidad+maxiCartas; i++) {
				salidas.add(cartas.get(i));
			
			}
			maxiCartas = maxiCartas+cantidad;
			return salidas;
		}
	ArrayList<Carta> cualesSalieron(){
		  ArrayList<Carta> saldias = new ArrayList<Carta>();
			if(maxiCartas>=0) {
				for(int i = 0 ; i <maxiCartas; i++){
					saldias.add(cartas.get(i));
				}
				return saldias;
			}
			return null ;
			
		}
}
