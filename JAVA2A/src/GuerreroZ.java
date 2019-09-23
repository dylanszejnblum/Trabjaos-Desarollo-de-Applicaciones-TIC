
public class GuerreroZ {
	int punietazo = 50;
	public GuerreroZ() {
		this.punietazo = 50;
	}
	public GuerreroZ(int punietazo) {
		this.punietazo = punietazo;
	}
	void punietazo(EnemigoDeLaTierra n) {
		if(n.vida == 0) {
			throw new EnemigoDebilitadoException("error"); 
		}
		n.restarVida(50);
	}
	
}
