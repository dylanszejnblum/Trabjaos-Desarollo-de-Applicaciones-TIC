package paquete;

public class Fraccion {
	private int numerador ;
	private int denominador ;
	public Fraccion(int num , int den) {
	  numerador = num;
	 denominador = den;
	
	  if( den == 0) {
		  throw new IllegalArgumentException("el Denominador no puede ser menor o igual que 0");
	  }
	  
	}
	
	public String toString(){
		return numerador + "/" + denominador;
	
	}
	//Busco el MAXIMO comun DIVISOR
	public int MCD(int numerador, int denominador) {
		   if (denominador==0) return numerador;
		   return MCD(denominador,numerador%denominador);
		}
	 void simplificar(){
		numerador = this.numerador/this.MCD(numerador, denominador);
		denominador = this.denominador/this.MCD(numerador, denominador);
	
	}
	/*
	public Fraccion Simplificar(Fraccion fra) {
		int numSim = fra.numerador/ this.MCD(fra.numerador, fra.denominador);
		int denSin = fra.denominador/ this.MCD(fra.numerador, fra.denominador);
		Fraccion fraccionSim = new Fraccion(numSim , denSin);
		return fraccionSim;
	}
	
	*/
	
	public Fraccion sumar(Fraccion pr, Fraccion se) {
	int newNum = pr.numerador * se.denominador +  pr.denominador*se.numerador;
	int newDen = pr.denominador * se.denominador;
	
	
	Fraccion result = new Fraccion(newNum , newDen);
	result.simplificar();
	return result;
	}
	
	public Fraccion restar(Fraccion pr, Fraccion se) {
		int newNum = pr.numerador * se.denominador - pr.denominador*se.numerador;
		int newDen = pr.denominador * se.denominador;
		
		Fraccion result = new Fraccion(newNum , newDen);
		result.simplificar();
		return result;
		}
	public Fraccion multiplicar(Fraccion pr, Fraccion se) {
		int newNum = pr.numerador * se.numerador;
		int newDen = pr.denominador * se.denominador;
		
		Fraccion result = new Fraccion(newNum , newDen);
		result.simplificar();
		return result;
		}
	public Fraccion dividir(Fraccion pr, Fraccion se) {
		int newNum = pr.numerador * se.denominador; 
		int newDen = pr.denominador * se.numerador;
		
		Fraccion result = new Fraccion(newNum , newDen);
		result.simplificar();
		return result;
		}
		public boolean es_igual(Fraccion otra , Fraccion otra1){
			if(otra.denominador == otra1.denominador  && otra.numerador == otra1.numerador) {
				return true;
			}else {
				return false;
			}
		}
	

}

