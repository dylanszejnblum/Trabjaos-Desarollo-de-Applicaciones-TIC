package paquete;

public class Carta {
	private int  numero;
	private String palo;
	public Carta(int numero1 , String palo1){
		if(numero1 ==8 || numero1 ==9 && numero1 > 12 || palo1 != "ESPADA" ||  palo1 != "BASTO" || palo1 != "COPA" || palo1 != "ORO"){
			 throw new IllegalArgumentException("El numero no puede ser 8,9 o mayor 12");
		}
		numero = numero1;
		palo = palo1;
		this.ShowCarta();
	}
	public String ShowCarta(){
		return numero + " de " + palo;
	}
	public Boolean equals(Carta otra){
		if(this.palo == otra.palo && this.numero == otra.numero){
			return true;
		}else{
			return false;
		}
	}
}
