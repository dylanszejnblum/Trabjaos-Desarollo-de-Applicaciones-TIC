
public class Gohan extends GuerreroZ{
	public Gohan() {
		super();
	}
	void masenko(EnemigoDeLaTierra n) {
		if(n.vida == 0) {
			throw new EnemigoDebilitadoException("error"); 
		}
		n.restarVida(110);
	}
}
