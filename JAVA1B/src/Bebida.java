
public class Bebida {
	private String marca;
	private String nombreProducto;
	private double precio;
	private Boolean azucarada;
	public Bebida(String marca , String nombreProducto, double precio , Boolean azucarada ) {
		if(precio < 0) {
			throw new IllegalArgumentException("Non negativo");
		}
		if(nombreProducto != "agua") {
			this.setAzucarada(false);
			this.precio = precio;
			this.marca = marca;
			this.nombreProducto = nombreProducto;
		}
		this.setAzucarada(azucarada);
		this.precio = precio;
		this.marca = marca;
		this.nombreProducto = nombreProducto;
		
	}
	
	void setDescuento(int numero) {
		this.precio = this.precio * (numero/100);
	}
	void setDescuento2(double numero) {
		this.precio = this.precio * (numero/100);
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
	public boolean azucarada() {
		return this.azucarada();
	}
	public Boolean getAzucarada() {
		return azucarada;
	}
	public void setAzucarada(Boolean azucarada) {
		this.azucarada = azucarada;
	}

}
