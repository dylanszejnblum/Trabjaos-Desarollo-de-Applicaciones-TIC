package paquete;

import java.util.ArrayList;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int num , int den) {
		if(den==0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		  numerador = num;
		  denominador = den;
		  //this.DenPos();
	}
	public Fraccion(int num) {
		this.numerador = num;
		this.denominador = 1;
	}
	public String toString(){
		return numerador + "/" + denominador;
	
	}
	//Uso euclid
	public int MCD(int numerador, int denominador) {
		   if (denominador==0) return numerador;
		   return MCD(denominador,numerador%denominador);
		}
	
	 void simplificar(){ 
		if(MCD(this.numerador , this.denominador)>1) {
			int MaxDiv = this.MCD(this.numerador, this.denominador);
			numerador = this.numerador/MaxDiv;
			denominador = this.denominador/MaxDiv;
		}
		
	
	}
	 
	 void DenPos() {
		 if(this.denominador <0|| this.numerador <0) {
			 numerador = this.numerador/-1;
			 denominador = this.denominador/-1; 
		 }
	 }
	 
	 Fraccion sumar(Fraccion fra) {
		 this.DenPos();
		 fra.DenPos();
		 Fraccion resultado = new Fraccion(this.numerador*fra.denominador + this.denominador * fra.numerador , fra.denominador * this.denominador );
		 resultado.simplificar();
		 return resultado;
	 }
	 Fraccion restar(Fraccion fra) {
		 Fraccion origen = new Fraccion(this.numerador,this.denominador);
		 fra.simplificar();
		 
		 Fraccion resultado = new Fraccion(origen.numerador*fra.denominador- fra.numerador*  origen.denominador , fra.denominador*origen.denominador);
		 resultado.simplificar();
		 return resultado;
		
		 
	 }
	 Fraccion multiplicar(Fraccion fra) {
		// this.DenPos();
		// fra.DenPos();
		 Fraccion resultado = new Fraccion(this.numerador*fra.numerador , this.denominador*fra.denominador );
		 resultado.simplificar();
		 return resultado;
	 }
	 Fraccion dividir(Fraccion fra) {
		 //this.DenPos();
		 //fra.DenPos();
		 Fraccion resultado = new Fraccion(this.numerador*fra.denominador , this.denominador*fra.numerador );
		 resultado.simplificar();
		 return resultado;
	 }	 
	 public static Fraccion sumatoriaDeFraccionesCuadradas(ArrayList<Fraccion> f) {
		 Fraccion resu = new Fraccion(0,0);
		 for(int i = 0; i<f.size();i++) {
			 resu.numerador+=f.get(i).numerador*f.get(i).numerador;
			 resu.numerador+=f.get(i).denominador*f.get(i).denominador;
		 }
		 return resu;
	 }
	 public boolean es_igual(Fraccion otra) {
		 Fraccion fra = new Fraccion(this.numerador , this.denominador);
		 otra.DenPos();
		 fra.DenPos();
		 fra.simplificar();
		 
		 otra.simplificar();
		
		 if(Math.abs(fra.numerador) == Math.abs(otra.numerador)&& Math.abs(fra.denominador) == Math.abs(otra.denominador)) {
			 return true;
		 }else {
			 return false;
		 }
	 }

}

