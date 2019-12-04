

public class Vector {
    
    private double x;
    private double y;
    
    
    public Vector(double a, double b){
        
    this.x = a;
    this.y = b;
    }
    public String toString(){
        return "(" +this.x + ", " + this.y + ")";
    }
    
    public Vector sumar(Vector otro){
        Vector resultado = new Vector (this.x+otro.x,this.y +otro.y );
     return resultado;       
    }
    
    public Vector restar(Vector otro){
        Vector resultado= new Vector (this.x-otro.x,this.y -otro.y );
     
     
     
        
        return resultado; 
            
    }
    
    public double calcularProductoInterno(Vector otro){
        
        return (this.x*otro.x) +(this.y*otro.y);
    }
    public int calcularMagnitud(){
        return (int)Math.sqrt(x*x + y*y);
       
    }  
    public void cambiarSentido(){
        x -= x*2;
        y -= y*2;
    }
    public void multiplicarPorEscalar(int factor){
        x = x*factor;
        y= y*factor;
    }
    public boolean sonParalelos(Vector otro){
       
        return x*otro.y == y*otro.x;
        
    }
    boolean esIgual(Vector otro){
        return x == otro.x && y == otro.y;
    }
    
    public Vector normalizarVector(){ 
        Vector normalizado = new Vector(x/calcularMagnitud(), y/calcularMagnitud());
        return normalizado;
    }
}








/*
Importante 
Teorico
 	A que denominamos "Identidad" de un objeto
 	RTA
 	A la posición de memoria donde esta almacenado el objeto
 	¿Por qué decimos que el encapsulamiento ayuda a la "seguridad" del estado de un objeto?
 		RTA Protege a los atributos asociados de un objeto contra su modificación por quien no tenga derecho a acceder a ellos
 		
 	Dado el siguiente código. ¿Cómo serán los print del final de main?
public void foo(ArrayList<Integer> lista, int numeroSuelto){
		numeroSuelto = 2;
		for(int i=0; i< lista.size();i++){
			lista.set(i, lista.get(i)*numeroSuelto);
		}
			
	}
	public static void main(String[] args){
		ArrayList<Integer> lstNumeros = new ArrayList<Integer>();
		ArrayList<Integer> lstCopiaNumeros;
		lstNumeros.add(2);
		lstNumeros.add(4);
		lstNumeros.add(6);
		lstNumeros.add(22);
		lstCopiaNumeros = lstNumeros;
		int numeroSuelto = 4;
		foo(lstCopiaNumeros,numeroSuelto);
		lstCopiaNumeros.remove(lstCopiaNumeros.indexOf(44));
		
		System.out.println(lstCopiaNumeros);
		System.out.println(lstNumeros);
		System.out.println(numeroSuelto);
	}
	RTA 
	lstCopiaNumeros=lstNumeros=[4,8,12], numeroSuelto=4
	Usualmente mencionamos que existen 3 maneras de generar dependencia de un objeto a otro. ¿Cual es el objetivo de esto?
		RTA
		
	
	Las post-condiciones dentro del diseño por contrato..
	RTA
		Si una post-condición no se cumple, probablemente algo hicimos mal, contrariamente a las pre-condiciones, que si no se cumplen, quien hizo algo mal es quien envió el mensaje
		
		
	CODIGO CELDA JUEGO
	RTA 
	RESPONDE B: Alan debería crear un método llamado celda.esta_vacia() para consultar las celdas vacías independientemente de su representación interna
*/





