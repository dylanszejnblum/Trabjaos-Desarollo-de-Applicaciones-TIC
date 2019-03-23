package paquete;

public class Fraccion {
	private int numerador ;
	private int denominador ;
	public Fraccion(int num , int den) {
	  numerador = num;
	 denominador = den;
	  if( den < 0 || den == 0 ) {
		  throw new IllegalArgumentException("el Denominador no puede ser menor o igual que 0");
	  }
	  
	}
	
	public String toString(){
		return Integer.toString(numerador)+ "/" + Integer.toString(denominador);
	
	}
	
	public int MCD(int numerador, int denominador) {
		   if (denominador==0) return numerador;
		   return MCD(denominador,numerador%denominador);
		}
	public void Simplificar(int numerador ,int denomindaor) {
		numerador =  numerador/this.MCD(numerador, denomindaor);
		denominador = denominador/this.MCD(numerador, denomindaor);
	}
	public void sumarFraccion(int numerador , int denominador) {
		
	}

}
