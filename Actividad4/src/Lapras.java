
public class Lapras extends Pokemon implements TipoAgua , TipoHielo {

	public Lapras() {
		super(450, 150, 300, 50, 4, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rayoHielo(Pokemon poke) throws PokemonCongeladoException {
		poke.congelado++;
		
	}

	@Override
	public void ventisca(Pokemon poke) {
		double AtaquePoke = ataque * ph2 / this.velocidad - poke.defender(ph2);
		poke.vida = poke.vida - AtaquePoke;
		
	}

	@Override
	public void surf(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = ataque * pa1 / this.velocidad - poke.defender(pa1);
		poke.vida = poke.vida - AtaquePoke;
	}

	@Override
	public void hidrobomba(Pokemon poke) {
		double AtaquePoke = ataque * pa2 / this.velocidad - poke.defender(pa2);
		poke.vida = poke.vida - AtaquePoke;
		
	}

	@Override
	public void atacar(Pokemon e, int n_ataque) throws PokemonCongeladoException {
		if(this.get_congelado() == false) {
			switch(n_ataque) {
			case 1:
				rayoHielo(e);
			case 2:
				ventisca(e);
			case 3:
				surf(e);
			case 4: 
				hidrobomba(e);
			}
		} else {
			throw new PokemonCongeladoException("error");
		}
		
	}

}
