
public class Goku extends GuerreroZ{
	public Goku() {
		super(55);
	}
	void kamehameha(EnemigoDeLaTierra n) {
		if(n.vida == 0) {
			throw new EnemigoDebilitadoException("error"); 
		}
		n.restarVida(150);
	}
}
