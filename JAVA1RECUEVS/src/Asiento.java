

public class Asiento {
	private int fila;
	private int columna;
	private double precio;
	private boolean estado = false;
	
	public Asiento(int fil , int Col , double pre) {
		if(Col >7 && Col >=1 && fil <1 && pre <0) {
			throw new IllegalArgumentException("No existe alguno de los parametros");
		}
		fila = fil;
		columna = Col;
		precio = pre;
		
	}
	boolean esta_vacio() {
		if(estado == true) {
			return true;
		}else {
			return false;
		}
	}
	void ocupar() {
		estado = true;
	}
	int get_fila(){
		return fila;
	}
	int get_precio() {
		return (int) precio;
	}
	int get_columna() {
		return columna;
	}
	 public String toString(){
	        return "filas: " + fila +  " columnas: " + columna + " precio: " + precio + " esta ocupado: " + estado;
	    }
}