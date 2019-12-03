
public class Helado {
	private String marca;
	private String nombreProducto;
	private double precio;
	public Helado(String marca , String nombreProducto, double precio ) {
		if(precio < 0) {
			throw new IllegalArgumentException("Non negativo");
		}
		if(marca != "kibon") {
			
			this.precio = precio + precio * 0.5;
			this.marca = marca;
			this.nombreProducto = nombreProducto;
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
