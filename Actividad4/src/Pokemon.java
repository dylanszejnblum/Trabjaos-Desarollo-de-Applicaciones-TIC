
public abstract class Pokemon {
	protected double vida;
	protected double ataque;
	protected double defensa;
	protected double velocidad;
	protected int resistencia;
	protected boolean salvaje;
	protected int congelado;
	protected double vidaTotal;
	protected int intentos;
	protected boolean congeladoBool;
	public Pokemon(double vida , double ataque , double defensa , double velocidad , int resistencia , boolean salvaje) {
		if(vida<0 || ataque < 0 || defensa <0 || velocidad < 0 || resistencia <0) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.resistencia = resistencia;
		this.salvaje = salvaje;
		this.congelado = 0;
		this.vidaTotal = vida;
		this.congeladoBool = false;
		this.intentos = 0;
	}
	
	public void curar() {
		double constant = 5.0;
		this.vida = this.vida + constant;
	}
	public abstract void atacar(Pokemon e , int n_ataque) throws PokemonCongeladoException;
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
		
		double p_escape = (this.vida/this.vidaTotal * 0.7 + ((this.resistencia-this.intentos) / this.resistencia)* 0.3);
		double p_captura = 1- p_escape;
		intentos++;
		return p_captura;
	
	}
	boolean get_congelado() throws PokemonCongeladoException {
		if(this.congelado <= 3 && this.congelado >= 1) {
			return congeladoBool = true;
		}
		
		return congeladoBool = false;
	}
	
}
