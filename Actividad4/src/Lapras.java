
public class Lapras extends Pokemon implements TipoAgua , TipoHielo {

	public Lapras() {
		super(450, 150, 300, 50, 4, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rayoHielo(Pokemon poke){
		poke.congenum++;
		
	}

	@Override
	public void ventisca(Pokemon poke) {
		double AtaquePoke = this.getAtaque() * 50 / this.getVelocidad() - poke.defender(this.getAtaque() * 50 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
		
	}

	@Override
	public void surf(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = this.getAtaque() * 15 / this.getVelocidad() - poke.defender(this.getAtaque() * 15 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
	}

	@Override
	public void hidrobomba(Pokemon poke) {
		double AtaquePoke = this.getAtaque() * 30 / this.getVelocidad() - poke.defender(this.getAtaque() * 30 / this.getVelocidad() );
		poke.restarVida(AtaquePoke);
		
	}

	@Override
	
	public void atacar(Pokemon e, int n_ataque) {
		if (e == null) {
			throw new IllegalArgumentException("Pikachu me la chu pa");
		}
		if (n_ataque < 1 || n_ataque > 4) {
			throw new IllegalArgumentException("atacame esta");
			}
		if (this.congelado() == false) {
			switch (n_ataque) {
			case 1:
				surf(e);
				break;
			case 2:
				hidrobomba(e);
				break;
			case 3: 
				rayoHielo(e);
				break;
			case 4: 
				ventisca(e);
				break;
			}
		} else {
			this.congenum++;
			throw new PokemonCongeladoException("error");

		}
	}
		
		
}
