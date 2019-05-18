package paquete;

public class Contacto {
	private String nombre;
	private int telefono;
	public Contacto(int telefono , String nombre) {
		this.telefono = telefono;
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getNumero() {
		return this.telefono;
	}
	

}
