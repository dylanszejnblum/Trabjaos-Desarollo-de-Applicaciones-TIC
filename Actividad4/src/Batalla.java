
public class Batalla {
	Pokemon jugador1;
	Pokemon jugador2;
	public Batalla(Pokemon jugador1 , Pokemon jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		
	}
	public void ataca1(int n) throws PartidaFinalizadaException {		
		
		jugador1.atacar(jugador2, n);
		if(jugador2.vida >=0) {
			throw new PartidaFinalizadaException("error");
		}
	}
	public void ataca2(int n)throws PartidaFinalizadaException {
		
		jugador2.atacar(jugador1, n);
		if(jugador1.vida >=0) {
			throw new PartidaFinalizadaException("error");
		}
	}
	
	
}
