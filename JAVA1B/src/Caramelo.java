
public class Caramelo {
	private String marca;
	private String nombreProducto;
	private double precio;
	public Caramelo(String marca , String nombreProducto, double precio ) {
		if(precio < 0) {
			throw new IllegalArgumentException("Non negativo");
		}
		this.precio = precio;
		this.marca = marca;
		this.nombreProducto = nombreProducto;
		
	}
	double getPrecio() {
		return this.precio;
	}
	String getNombreProducto() {
		return this.nombreProducto;
	}
	String getMarca() {
		return this.marca;
	}
}
