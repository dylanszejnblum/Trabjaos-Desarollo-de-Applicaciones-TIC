
public abstract class Pokemon {
	protected double vida;
	protected double ataque;
	protected double defensa;
	protected double velocidad;
	protected int resistencia;
	protected boolean salvaje;
	protected int congenum;
	protected double vidaTotal;
	protected int intentos;
	protected boolean congeladoBool;

	public Pokemon(double vida, double ataque, double defensa, double velocidad, int resistencia, boolean salvaje) {
		if (vida < 0 || ataque < 0 || defensa < 0 || velocidad < 0 || resistencia < 0) {
			throw new IllegalArgumentException("Parametro no valido");
		}
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.resistencia = resistencia;
		this.salvaje = salvaje;
		this.congenum = 0;
		this.vidaTotal = vida;
		this.congeladoBool = false;
		this.intentos = 0;
	}

	public void curar() {
		double constant = this.vidaTotal - this.getVida();
		this.vida = this.getVida() + constant;
	}

	public abstract void atacar(Pokemon e, int n_ataque);

	double defender(double potencia) {
		double result = this.getDefensa() - potencia / 2;
		if (result < 0) {
			return 0;
		}
		potencia = potencia - result;
		return result;

	}

	void restarVida(double vida) {
		this.vida = this.getVida() - vida;
	}

	double intentar_capturar() {
		double res = (this.getResistencia() - this.intentos);
		if (res < 0) {
			res = 0;
		}
		
			double p_escape = (this.getVida() / this.vidaTotal * 0.7 + (res / this.getResistencia()) * 0.3);
			double p_captura = 1 - p_escape;
			this.intentos++;
			if (p_captura > 1) {
				return 1;
			}
			if (p_captura < 0) {
				return 0;
			}
			return p_captura;

	}

	boolean congelado() {
		if (this.congenum <= 3 && this.congenum >= 1) {
			return congeladoBool = true;
		}

		return congeladoBool = false;
	}

	double getVida() {
		return this.vida;
	}

	double getVelocidad() {
		return this.velocidad;
	}

	double getDefensa() {
		return this.defensa;
	}

	double getAtaque() {
		return this.ataque;
	}

	boolean getSalvaje() {
		return this.salvaje;
	}

	boolean getRangeAttack(int n) {
		if (n <= 4 && n >= 1) {
			return true;
		}
		return false;
	}

	int getResistencia() {
		return this.resistencia;
	}

	void capturar() {
		this.salvaje = false;
	}
}
