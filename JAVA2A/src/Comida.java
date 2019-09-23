
public class Comida {
	
	private boolean congelada = false;
	
	public void congelar(){
		this.congelada=true;
	}
	
	public boolean estaCongelada() {
		return congelada;
	}

}
