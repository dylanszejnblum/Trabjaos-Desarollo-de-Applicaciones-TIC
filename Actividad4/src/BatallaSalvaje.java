import java.util.Random;

public class BatallaSalvaje extends Batalla{

	public BatallaSalvaje(Pokemon jugador1, Pokemon jugador2) throws PokemonNoSalvajeException  {
		super(jugador1, jugador2);
		if(jugador2.salvaje != true) {
			throw new PokemonNoSalvajeException("error");
		}
		
		// TODO Auto-generated constructor stub
	}
	public boolean lanzar_pokeball() {
		if(jugador2.vida>0) {
			
			int Probabilidad = (int) (jugador2.intentar_capturar() * 100);
			int Total = 100;
			int diff = Total - Probabilidad;
			Random rn = new Random();
			int rando= rn.nextInt(diff);
			if(rando <= Probabilidad ) {
				return true;
			} else {
				return false;
			}
			
		}
		return false;
	}

}
