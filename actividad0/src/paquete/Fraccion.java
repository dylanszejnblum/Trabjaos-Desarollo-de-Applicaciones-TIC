package paquete;

public class Fraccion {
	private int numerador ;
	private int denominador ;
	private int numerador2 ;
	private int denominador2;
	public Fraccion(int num , int den , int den2 , int num2) {
	  numerador = num;
	 denominador = den;
	 numerador2 = num2;
	 denominador2 = den2;
	  if( den < 0 || den == 0 ||den2 < 0 || den2 == 0) {
		  throw new IllegalArgumentException("el Denominador no puede ser menor o igual que 0");
	  }
	  
	}
	
	public String toString(){
		return Integer.toString(numerador)+ "/" + Integer.toString(denominador);
	
	}
	//Busco el minimo comun multiplo
	public int MCD(int numerador, int denominador) {
		   if (denominador==0) return numerador;
		   return MCD(denominador,numerador%denominador);
		}
	public void Simplificar(int numerador ,int denomindaor) {
		numerador =  numerador/this.MCD(numerador, denomindaor);
		denominador = denominador/this.MCD(numerador, denomindaor);
		return  numerador + denominador;
	}
	public void sumarFraccion(int numerador , int denominador ,int numerador2 , int denominador2 ) {
		int numResult = numerador * denominador2 + numerador2 * denominador;
		
	}

}
