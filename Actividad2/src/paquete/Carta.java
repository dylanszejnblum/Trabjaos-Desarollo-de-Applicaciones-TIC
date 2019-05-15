//package paquete;

public class Carta {
	private int  numero;
	private String palo;
	public Carta(int numero , String palo) {
		if(numero < 1 ||numero == 8 || numero == 9 || numero > 12 ||  palo !="BASTO"&& palo !="COPA"&& palo !="ESPADA"&& palo !="ORO") {
			throw new IllegalArgumentException("ERORO");
		}
		this.numero = numero;
		this.palo = palo;
	//	this.ShowCarta();
		}
	public String toString(){
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
