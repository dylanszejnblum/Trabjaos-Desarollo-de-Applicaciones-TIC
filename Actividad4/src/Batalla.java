
public class Batalla {
	Pokemon jugador1;
	Pokemon jugador2;

	public Batalla(Pokemon jugador1, Pokemon jugador2) {
		if (jugador1 == null || jugador2 == null)
			throw new IllegalArgumentException("metete el null por el orto");
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;

	}

	public void ataca1(int n) {
		
			jugador1.atacar(jugador2, n);
			if (jugador2.vida <= 0) {
				throw new PartidaFinalizadaException();
			}
		
		
	}

	public void ataca2(int n) {

	
			jugador2.atacar(jugador1, n);
			if (jugador1.vida <= 0) {
				throw new PartidaFinalizadaException();
			}
		
	

	}

	boolean getRangeAttack(int n) {
		if (n <= 4 && n >= 1) {
			return true;
		}
		return false;
	}

	public Pokemon getGanador() {
		if (jugador1.vida == 0 && jugador2.vida >= 1) {
			return jugador2;
		} else if (jugador2.vida == 0 && jugador1.vida >= 1) {
			return jugador1;
		}
		return null;
	}

}
