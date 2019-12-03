
public class Vector {
private double x; 
private double y;
	public Vector(double x1 , double y1) {
		x = x1;
		y = y1;
	}
	public String toString(){
		return x + "/" + y;
	
	}
	public Vector sumar(Vector otro) {
		  return new Vector(otro.x+this.x , otro.y + this.y);
	}
	public Vector restar(Vector otro) {
		  return new Vector(this.x - otro.x , this.y - otro.y);
	}
	 public double calcularProductoInterno(Vector otro){
		 double result = this.x * otro.x + this.y * otro.y;
		  return result;
		  
	  }
	 public int calcularMagnitud(){
	        return (int)Math.sqrt(this.x*this.x + this.y*this.y);
	       
	    }  
	  
	  void multiplicarPorEscalar(double factor){
		  this.x = this.x * factor;
		  this.y = this.y * factor; 
	  }
	  void cambiarSentido(){
		  this.x = this.x*-1;
		  this.y = this.y*-1;
	  }
	  
	  public boolean sonParalelos(Vector otro) {
		//Multiplico Cruzado
		  if(otro.x * this.y == this.x * otro.y) {
			  return true;
		  } else {
			  return false;
		  }
	  }
	  public Vector normalizarVector(){ 
	      
	        return new Vector(x/calcularMagnitud(), y/calcularMagnitud());
	    }
	  public boolean esIgual(Vector otro) {
		  if(otro.x == this.x && this.y == otro.y) {
			  return true;
		  }else {
			  return false;
		  }
	  }
}