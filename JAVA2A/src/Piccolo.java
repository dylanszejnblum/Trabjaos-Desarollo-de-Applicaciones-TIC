
public class Piccolo extends GuerreroZ {
	public Piccolo() {
		super();
	}
	void makankosappo(EnemigoDeLaTierra n) {
		if(n.vida == 0) {
			throw new EnemigoDebilitadoException("error"); 
		}
		n.restarVida(90);
	}
}
