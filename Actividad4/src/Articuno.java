
public class Articuno extends Pokemon implements TipoHielo , TipoVolador{

	public Articuno() {
		super(450, 250, 200, 200, 9, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataqueDeAla(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke =  this.getAtaque() * 10 / this.getVelocidad() - poke.defender(this.getAtaque() * 10 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
	}



	@Override
	public void tornado(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke =  this.getAtaque() * 5 / this.getVelocidad() - poke.defender(this.getAtaque() * 5 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
		
	}

	@Override
	public void rayoHielo(Pokemon poke){
		poke.congenum++;
		poke.congeladoBool = true;
		
	}

	@Override
	public void ventisca(Pokemon poke) {
		double AtaquePoke = this.getAtaque() * 50 / this.getVelocidad() - poke.defender(this.getAtaque() * 50 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
		
	}

	@Override
	public void atacar(Pokemon e, int n_ataque) {
		if (e == null) {
			throw new IllegalArgumentException();
		}
		if (n_ataque < 1 || n_ataque > 4) {
			throw new IllegalArgumentException();
			}
		if (this.congelado() == false) {
			switch (n_ataque) {
			case 1:
				rayoHielo(e);
				break;
			case 2:
				ventisca(e);
				break;
			case 3:
				ataqueDeAla(e);
				break;
			case 4: 
				tornado(e);
				break;
			}
		} else {
			this.congenum++;
			throw new PokemonCongeladoException("error");

		}
	}

}
