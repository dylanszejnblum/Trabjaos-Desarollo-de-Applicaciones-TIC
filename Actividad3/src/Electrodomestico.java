
public class Electrodomestico {
	protected int precioBase;
	protected String color;
	protected String cElectrico;
	protected int peso;
	protected int vMax;
	public Electrodomestico() {
		this.precioBase = 500 ; 
		this.color = "BLANCO";
		this.cElectrico = "A";
		this.peso = 5;
		this.vMax = 220; 
	}
	public Electrodomestico(int pb , int pe) {
		if(pb <=0 || pe<=0) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		this.precioBase = pb ; 
		this.peso = pe;
		this.color = "BLANCO";
		this.cElectrico = "A";
		this.vMax = 220; 
	}
	public Electrodomestico(int pb , String cl , String ce, int pe, int vm) {
//		if(vm != 110 &&  vm != 220 &&  vm != 240 &&  cl != "NEGRO" && cl != "BLANCO" && cl != "AZUL"&& cl != "GRIS" && cl != "BORDO" && cl != "VERDE" && pb <0 && pe <=0 && ce!="A" && ce!="B"&&ce!="C" && ce!="D" && ce!="E"&& ce!="F") {
//			
//			throw new IllegalArgumentException("Parametro no valido");
//		}
//		if(pb <= 0 || cl != "NEGRO" || cl != "BLANCO" || cl != "AZUL"|| cl != "GRIS" || cl != "BORDO" || cl != "VERDE" || ce != "A" || ce != "B" && ce != "C" || ce != "D" || ce != "E" && ce != "F" || pe <=0 || vm != 110 && vm!= 220 && vm!= 240) {
//			throw new IllegalArgumentException("Parametro no valido");
//		}
		if(vm != 220 && vm != 240 && vm != 110 ||pb <= 0 || cl != "NEGRO" && cl != "BLANCO" && cl != "AZUL"&& cl != "GRIS" && cl != "BORDO" && cl != "VERDE" || ce != "A" && ce != "B" && ce != "C" && ce != "D" && ce != "E" && ce != "F" || pb <=0 || pe <=0) {
			throw new IllegalArgumentException("Parametro no valido");
			
		}
		if(ce == "A" && vm != 110 && vm != 220 && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		if(ce == "B" && vm != 110 && vm != 220 && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		if(ce == "C" && vm != 110 && vm != 220 && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		if(ce == "D" && vm != 220 && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		if(ce == "E" && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		if(ce == "F" && vm != 240) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		
		this.precioBase = pb ; 
		this.color = cl;
		this.cElectrico = ce;
		this.peso = pe;
		this.vMax = vm; 
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public String getConsumoElectrico() {
		return cElectrico;
	}
	public int getPeso() {
		return peso;
	}
	public int getVoltaje() {
		return vMax;
	}
	void pintar(String color) {
		if( color != "NEGRO" && color != "BLANCO" && color != "AZUL"&& color != "GRIS" && color != "BORDO" && color != "VERDE" ) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		this.color = color;
	}
	boolean comprobarConsumoElectrico(String c) {
		switch(c) {
		case "A":
			return true;
		
		case "B":
			return true;
			
		case "C":
			return true;
		case "D":
			if(this.vMax != 220 && this.vMax !=240) {
				return false;
			}
			return true;
		case "E":
			if( this.vMax !=240) {
				return false;
			}
			return true;
		case "F":
			if( this.vMax !=240) {
				return false;
			}
			return true;
		
		}
		return false;
	}
	int PrecioConsumo(String c) {
		int result = 0;
		switch(c) {
		case "A":
			return result = 20;
		case "B":
			return result = 30;
		case "C":
			return result = 50;
		case "D":
			return result = 80;
		case "E":
			return result =100;
		case "F":
			return result = 150;
		}
		return result;
	}
	public static boolean EntreNum(int x , int men , int sup) {
		return men <= x && x <= sup;
	}
	
	int factorPeso(int peso) {
		int result = 0;
		if(EntreNum(peso, 1 , 20)) {
			result = 50;
			return result;
		}else if(EntreNum(peso, 21 , 30)) {
			result = 100;
			return result;
		}else if(EntreNum(peso, 31 , 50)) {
			result = 200;
			return result;
		}else if(EntreNum(peso, 51 , 80)) {
			result = 400;
			return result;
		}else {
			result = 800;
			return result;
		}
	}
	int precioFinal() {
		int preciofinal = this.PrecioConsumo(cElectrico) * this.precioBase + peso * this.factorPeso(peso);
		return preciofinal;
	}

	
}
