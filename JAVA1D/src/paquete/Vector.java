package paquete;

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

A que se denomina identidad de un objeto 
	RTA ----Not Sure------
 	A atributos como String Id ; que dan distincion al objeto 
 	A la posicion en la memoria 
 	Ejemplo 
 	A = 1;
 	B = A;
 PorQue decimos que el encapsulamiento ayuda a la seguridad del estado de un objeto?
 // Es la que mejor suena
  * Protege a los atributos asociados de un objeto contra su modificacion por quien no tenga derecho a acceder a ellos
  * Dado el siguiente codigo funcion foo que multiplica *2 y arrayList
  * En teoria falla a menos que le agregemos un static a la funcion foo , si le agregamos un static devuelve:
   [4, 8, 12]
   [4, 8, 12]
	4
Usualmente mencionamos que existen 3 maneras de generar dependencia de un objeto a otro cual es el objetivo?
	Not clear
	
** Las post condiciones por contrato son 

*
*
*Considere el codigo 
*La funcion colocar en juego no tiene tipo de dato es una funcion y no tiene return , 
*Igual parece que es pseudocodigo
*Mas correcta Puede ser Que deberia crear un metodo de celda.esta vacia o no presenta un problema de encapsulamiento at at
  */





