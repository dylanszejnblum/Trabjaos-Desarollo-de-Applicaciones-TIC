

public class BatallaSalvaje extends Batalla {

	public BatallaSalvaje(Pokemon jugador1, Pokemon jugador2) {
		super(jugador1, jugador2);
		if (jugador2.salvaje == false) {
			throw new PokemonNoSalvajeException();
		}
	}

	public boolean lanzar_pokeball() {
		if (jugador2.vida > 0) {
			double Probabilidad = jugador2.intentar_capturar();
			double random = Math.random();
			if (random >= Probabilidad) {
				jugador2.capturar();
				return true;
			} else {
				return false;
			}
			
		} else {
			throw new IllegalArgumentException("Uri papa");
		}
	}

}
