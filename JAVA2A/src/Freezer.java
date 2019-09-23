
public class Freezer {
	
	void congelar(Comida c) {
		if(c.estaCongelada()) {
			throw new ComidaYaCongeladaException("error"); 
		}
		c.congelar();
	}
}
