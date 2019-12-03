import java.util.ArrayList;

public class Kiosco {
	public static ArrayList<Caramelo> estanteríaCaramelo ;
	public static ArrayList<Helado> estanteríaHelado ;
	public static ArrayList<Colacion> estanteriaColacion ;
	public static ArrayList<Bebida> estanteríaBebida ;
	
	public Kiosco() {
		estanteríaCaramelo = new ArrayList<Caramelo>();
		estanteríaHelado = new ArrayList<Helado>();
		estanteriaColacion = new ArrayList<Colacion>();
		estanteríaBebida = new ArrayList<Bebida>();
	}


public void agregarCaramelo(Caramelo c) {
	for(int i = 0 ; i < estanteríaCaramelo.size(); i++) {
		if(c.getNombreProducto() == estanteríaCaramelo.get(i).getNombreProducto()) {
			throw new IllegalArgumentException("Producto ya existe");
		}
	}
	estanteríaCaramelo.add(c);
}
public void agregarBebida(Bebida c) {
	for(int i = 0 ; i < estanteríaBebida.size(); i++) {
		if(c.getNombreProducto() == estanteríaBebida.get(i).getNombreProducto()) {
			throw new IllegalArgumentException("Producto ya existe");
		}
	}
	estanteríaBebida.add(c);
}
public void agregarColacion(Colacion c) {
	for(int i = 0 ; i < estanteriaColacion.size(); i++) {
		if(c.getNombreProducto() == estanteriaColacion.get(i).getNombreProducto()) {
			throw new IllegalArgumentException("Producto ya existe");
		}
	}
	estanteriaColacion.add(c);
}
public void agregarHelado(Helado c) {
	for(int i = 0 ; i < estanteríaHelado.size(); i++) {
		if(c.getNombreProducto() == estanteríaHelado.get(i).getNombreProducto()) {
			throw new IllegalArgumentException("Producto ya existe");
		}
	}
	estanteríaHelado.add(c);
}
 void setDescuentoBebidasAzucaradas(int porcentaje) {
	 for(int i = 0 ; i < estanteríaBebida.size(); i++) {
		 if(estanteríaBebida.get(i).getAzucarada() == true) {
			
			 estanteríaBebida.get(i).setDescuento(porcentaje);
		 }
	 }
}
 void setDescuentoBebidasNoAzucaradas(double porcentaje) {
	 for(int i = 0 ; i < estanteríaBebida.size(); i++) {
		 if(estanteríaBebida.get(i).getAzucarada() == true) {
			
			 estanteríaBebida.get(i).setDescuento2(porcentaje);
		 }
	 }
 }

 double calcularPrecioCaramelos() {
	double pF = 0;
	for(int i = 0; i < estanteríaCaramelo.size() ; i++) {
		 pF += estanteríaCaramelo.get(i).getPrecio();
	}
	return  pF;
 }
 double calcularPrecioColacion() {
	double pF = 0;
	for(int i = 0; i < estanteriaColacion.size() ; i++) {
		 pF += estanteriaColacion.get(i).getPrecio();
	}
	return  pF;
 }
 double calcularPrecioHelado() {
	double pF = 0;
	for(int i = 0; i < estanteríaHelado.size() ; i++) {
		 pF += estanteríaHelado.get(i).getPrecio();
	}
	return  pF;
 }
 double calcularPrecioBebida() {
		double pF = 0;
		for(int i = 0; i < estanteríaBebida.size() ; i++) {
			 pF += estanteríaBebida.get(i).getPrecio();
		}
		return  pF;
	 }
 double calcularPreciosHeladosDe(String marca) {
	double pF = 0;
	for(int i = 0; i < estanteríaHelado.size() ; i++) {
		if(marca == estanteríaHelado.get(i).getMarca()) {
		 pF += estanteríaHelado.get(i).getPrecio();
	}
		
 }
	return pF;
}
}