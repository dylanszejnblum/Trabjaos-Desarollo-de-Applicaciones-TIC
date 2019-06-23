
public class Lavarropas extends Electrodomestico {
	protected int carga;
	public Lavarropas() {
		super(5000 ,"BLANCO", "D",20 ,220);
		this.carga = 10;
	}
	public Lavarropas(int pre , int pes) {
	
		super(pre ,"BLANCO", "D",pes ,220);
		this.carga = 10;
		
	};
	public Lavarropas(int pb , String cl , String ce, int pe, int vm , int car) {
		super( pb ,  cl ,  ce ,  pe,  vm);
		this.carga = car;
	}
	
	int getCarga() {
		return this.carga;
	}
	boolean intentar_colocar(int cantidad_ropa) {
		if(cantidad_ropa > this.carga) {
			return false;
		}
		return true;
	}
}
