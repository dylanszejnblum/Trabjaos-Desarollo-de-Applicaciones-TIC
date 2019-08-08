
public abstract class Pokemon {
	protected double vida;
	protected double ataque;
	protected double defensa;
	protected double velocidad;
	protected int resistencia;
	protected boolean salvaje;
	protected int congelado;
	
	public Pokemon(double vida , double ataque , double defensa , double velocidad , int resistencia , boolean salvaje , int congelado) {
		if(vida<0 || ataque < 0 || defensa <0 || velocidad < 0 || resistencia <0) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.resistencia = resistencia;
		this.salvaje = salvaje;
		this.congelado = congelado;
	}
	
	public void curar() {
		double constant = 5.0;
		this.vida = this.vida + constant;
	}
	public abstract void atacar(Pokemon e , int n_ataque);
	double defender(double potencia) {
		double result = this.defensa - potencia /2 ;
		if(result<0) {
			return 0;
		}
		return (potencia - result);
		
	}
	void restar_vida(double vida) {
		this.vida = this.vida - vida;
	}
	double intentar_capturar() {
		return vida;
	}
	
	
}
