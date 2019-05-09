package paquete;

import java.lang.Math; 
public class Vector {
private int x; 
private int y;
	public Vector(int x1 , int y1) {
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
	 public int calcularProductoInterno(Vector otro){
		  int result = this.x * otro.x + this.y * otro.y;
		  return result;
		  
	  }
	 public int calcularMagnitud() {
		 int produ = this.x * this.x + this.y * this.y;
		return (int) Math.floor(Math.sqrt(produ));
	 }
	  
	  void multiplicarPorEscalar(int factor){
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
	  public boolean esIgual(Vector otro) {
		  if(otro.x == this.x && this.y == otro.y) {
			  return true;
		  }else {
			  return false;
		  }
	  }
}
