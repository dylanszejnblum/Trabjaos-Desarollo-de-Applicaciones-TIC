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