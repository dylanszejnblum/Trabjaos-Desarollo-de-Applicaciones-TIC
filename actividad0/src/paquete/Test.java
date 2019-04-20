package paquete;

public class Test {
	public static void main (String[] args) {
		Fraccion frac = new Fraccion (1,3);
		Fraccion fra = new Fraccion (1,3);
		frac = frac.restar(fra);
		System.out.print(frac);
	
		//System.out.print(fra.simplificar());
	//	System.out.println(frac.es_igual(fra));
		
		
		for(int i = 10000 ; i> 0 ; i--) {
			frac = frac.restar(fra);
			System.out.println(frac);
		}
	
	}
}
