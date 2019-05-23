package paquete;


public class Vector {

    private int X;
    private int Y;
    
    public Vector (int x, int y){
	this.X = x;
	this.Y = y;
}

    public String toString() {
        return "(" + this.X + "," + this.Y + ")";
    }
    
    public Vector sumar (Vector otro){
            Vector sum = new Vector(this.X + otro.X , this.Y + otro.Y);
            return sum;
            
        }
    
    public Vector restar (Vector otro){
        Vector res = new Vector(this.X - otro.X , this.Y - otro.Y);
        return res;
        
    }
    
    int calcularMagnitud(){
        int cat = (X*X) + (Y*Y);
        int hip = (int)Math.sqrt(cat);
        return hip;
}
    
    public int calcularProductoInterno(Vector otro){
        int prodx=this.X*otro.X;
        int prody=this.Y*otro.Y;
        int prod= prodx+prody;
        return prod;
    }

    void multiplicarPorEscalar(int factor){
        X = X * factor;
        Y = Y * factor;
}
    
    public void cambiarSentido() {
    	X = X * -1;
        Y = Y * -1;
    }
    
     boolean sonParalelos(Vector otro){
         if (this.X*otro.Y == this.Y*otro.X){
             return true;
         }else{
             return false;
         }
     }
     
    boolean esIgual(Vector otro){
        boolean res;
        if(this.X == otro.X && this.Y == otro.Y){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }
    
    
    void vectorFactorial() {
    	int xf = this.X;
    	int yf = this.Y;
    	
    	for (int i = 1; i <= xf; i++) {
    		this.X = this.X * i;
    	}
    	for (int i = 1; i <= yf; i++) {
    		this.Y = this.Y * i;
    	}
    }
    
}