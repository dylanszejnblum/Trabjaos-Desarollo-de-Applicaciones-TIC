
public class Treecko extends Pokemon implements TipoPlanta {
	protected int agujaCount;

	public Treecko() {
		super(90, 90, 120, 150, 2, true);
		this.agujaCount = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void latigoCepa(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = this.getAtaque() * 20 / this.getVelocidad()- poke.defender(this.getAtaque() * 20 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
	}

	@Override
	public void hojaAguda(Pokemon poke) {
		if (this.agujaCount > 4)
			throw new AtaqueInsuficienteException("Cristina se gasto todos los ataques");
		double AtaquePoke = this.getAtaque() * 35 / this.getVelocidad()- poke.defender(this.getAtaque() * 35 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
		this.agujaCount++;
	}

	@Override
	public void atacar(Pokemon e, int n_ataque) {
		if (e == null) {
			throw new IllegalArgumentException("Pikachu me la chu pa");
		}
		if (n_ataque < 1 || n_ataque > 2) {
			throw new IllegalArgumentException("atacame esta");
			}
		if (this.congelado() == false) {
			switch (n_ataque) {
			case 1:
				latigoCepa(e);
				break;
			case 2:
				hojaAguda(e);
				break;
			}
		} else {
			this.congenum++;
			throw new PokemonCongeladoException("error");

		}
	}
}
