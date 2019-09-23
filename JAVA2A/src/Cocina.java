import java.util.ArrayList;

public class Cocina {
	Heladera h;
	public  ArrayList<Comida> comidas;

	public Cocina() {
		h = new Heladera();
	}
	public boolean guardarLargoPlazo(Comida c) {
			if(c.estaCongelada()) {
				return false;
			}else {
				this.h.f.congelar(c);
				return true;
			}
			
	}
	public boolean guardarLargoPlazo(ArrayList <Comida> comidas) {
		for(int i = 0; i < comidas.size() ; i++) {
			if(comidas.get(i).estaCongelada()) {
				return false;
			}
			
		}
		return true;
		
		
}
}
