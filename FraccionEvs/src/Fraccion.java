

public class Fraccion {

	private int numerador;
	private int denominador;
	public Fraccion(int num, int den){
		numerador = num;
		denominador = den;
		if(denominador == 0){
			throw new IllegalArgumentException();
		}
		if(denominador < 0){
			denominador = denominador*-1;
			numerador = numerador*-1;
		}
	}
	public String toString(){
	  return numerador + "/" + denominador;
	}
	 int mcd(int numerador, int denominador){
		   if (denominador==0) return numerador;
		   return mcd(denominador,numerador%denominador);
	  }
	 Fraccion simplificar(){
	     int dividir=mcd( numerador,  denominador);
	     numerador/=dividir;
	     denominador/=dividir;
	     return this;
	 }
		
	 public Fraccion restar (Fraccion fraccioncista){
		 Fraccion pri = new Fraccion(this.numerador,this.denominador);
		 fraccioncista.simplificar();
		 
		 Fraccion resultado = new Fraccion(pri.numerador*fraccioncista.denominador- fraccioncista.numerador*  pri.denominador , fraccioncista.denominador*pri.denominador);
		 resultado.simplificar();
		 return resultado;
	 }
	 public Fraccion sumar (Fraccion fraccioncista){
		 Fraccion resultado = new Fraccion(this.numerador*fraccioncista.denominador + this.denominador * fraccioncista.numerador , fraccioncista.denominador * this.denominador );
		 resultado.simplificar();
		 return resultado;
	 }
	 public Fraccion multiplicar(Fraccion fraccionDaleQueTermino){
		 Fraccion a = new Fraccion(numerador*fraccionDaleQueTermino.numerador, denominador*fraccionDaleQueTermino.denominador);
		a.simplificar();
		return a;
	 }
	 public Fraccion dividir(Fraccion fraccionDaleQueTermino){
		 Fraccion a = new Fraccion(numerador*fraccionDaleQueTermino.denominador, denominador*fraccionDaleQueTermino.numerador);
		 a.simplificar();
		 return a;
	 }

	 public boolean es_igual(Fraccion fraccioncista) {
	  boolean igual = false;
	  fraccioncista.simplificar();
	  this.simplificar();
	  if(numerador == fraccioncista.numerador && fraccioncista.denominador == denominador) {
		  igual = true;
	  }
	  return igual;
	 }
	}

