package paquete;
import java.lang.Math; 
public class Test {
	public static void main (String[] args) {
		Vector frac = new Vector (6,3);
		Vector vec = new Vector (12,6);
		
		System.out.print(frac.calcularMagnitud());
		
		System.out.print(frac.sonParalelos(vec));
		
		
	
	}
}
