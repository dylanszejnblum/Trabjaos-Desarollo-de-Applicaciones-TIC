
public class Televisor extends Electrodomestico  {
	protected int pulgadas;
	protected boolean es_smart;
	
	public Televisor() {
		
		super(2000 ,"NEGRO", "D",30 ,220);
		this.pulgadas = 21;
		this.es_smart = false;
	}
	public Televisor(int pre , int pes){
		super(pre ,"NEGRO", "D",pes ,220);
		this.pulgadas = 21;
		this.es_smart = false;
	}
	public Televisor(int pb , String cl , String ce, int pe, int vm , int plg , boolean smarto) {
		super( pb ,  cl ,  ce  ,  pe,  vm);
		this.es_smart = smarto;
		this.pulgadas = plg;
	}
	int precioFinal() {
		if(this.pulgadas >= 29 && es_smart == true) {
			return super.precioFinal()*2;
		}
		return super.precioFinal();
	}
	boolean getSmart() {
		return this.es_smart;
	}
	int getPulgadas() {
		return this.pulgadas;
	}
}
