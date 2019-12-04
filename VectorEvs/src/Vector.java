
public class Vector {
	private int x;
	private int y;
	
	public Vector(int x , int y) {
		this.y = y;
		this.x = x;
	}
	public String toString(){
		return x + "/" + y;
	
	}
	public Vector sumar(Vector otro) {
		  return new Vector(otro.x+this.x , otro.y + this.y);
	}
	
	public Vector restar(Vector otro){
		 Vector a = new Vector(this.x - otro.x, this.y - otro.y);
		 return a;
	 }
	 public boolean esIgual(Vector otro){
		
		 if(this.x == otro.x && this.y == otro.y){
			 return true;
		 }
		 return false;
	 }
	 
	 public void cambiarSentido(){
		    this.x = this.x*-1;
		    this.y = this.y*-1;
		 }
	 public boolean sonParalelos(Vector otro) {
		 
			  if(otro.x * this.y == this.x * otro.y) {
				  return true;
			  } else {
				  return false;
			  }
		  }
	 public int calcularMagnitud(){
	    
	     return (int)Math.sqrt(x*x + y*y);
		 
	 }

	 public int calcularProductoInterno(Vector otro){
	
		 return this.x*otro.x + this.y*otro.y;
		
	 }
	 

	 public void multiplicarPorEscalar(int factor){
		 x = this.x * factor;
		 y = this.y * factor;
	 } 


}
