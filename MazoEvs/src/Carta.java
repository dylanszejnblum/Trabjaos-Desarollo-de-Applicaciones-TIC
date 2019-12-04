
public class Carta {
	private int numero;
	private String palo;
	
	public Carta(int numerito , String palito) {
		if(numerito < 1 ||numerito == 8 || numerito == 9 || numerito > 12) {
			throw new IllegalArgumentException("Aguante el pitty");
		}
		if( palito !="BASTO"&& palito !="COPA"&& palito !="ESPADA"&& palito !="ORO") {
			throw new IllegalArgumentException("Aguante la pritty de limon");
		}
		this.numero = numerito;
		this.palo = palito;
	}
	
	public String toString(){
		return numero + " de " + palo;
	
	}
	public Boolean equals(Carta otra){
		Boolean estado = false;
		if(this.palo == otra.palo && this.numero == otra.numero){
			estado = true;
			return estado;
		}else{
			return estado;
		}
	}
}
