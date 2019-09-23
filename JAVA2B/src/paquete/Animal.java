package paquete;

public abstract class Animal {
	protected String sonido;
	public Animal(String sonido) {
		this.sonido = sonido; 
	}
	
//	String hacerSonido() {
//		return this.sonido;
//	}
	public abstract String hacerSonido();
	
}
