package paquete;

import java.util.ArrayList;

public class Test {
	public static void foo(ArrayList<Integer> lista, int numeroSuelto){
		numeroSuelto = 2;
		for(int i=0; i< lista.size();i++){
			lista.set(i, lista.get(i)*numeroSuelto);
		}
			
	}
	public static void main (String[] args) {
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
		//System.out.print(fra.simplificar());
	//	System.out.println(frac.es_igual(fra));
		
		
	
	}
}
