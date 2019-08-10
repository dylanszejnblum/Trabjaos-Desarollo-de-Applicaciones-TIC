
public class Articuno extends Pokemon implements TipoHielo , TipoVolador{

	public Articuno() {
		super(450, 250, 200, 200, 9, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataqueDeAla(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke =  ataque * pv1 / this.velocidad - poke.defender(pv1);
		poke.vida = poke.vida - AtaquePoke;
	}



	@Override
	public void tornado(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = ataque * pv2 / this.velocidad - poke.defender(pv2);
		poke.vida = poke.vida - AtaquePoke;
		
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
	public void atacar(Pokemon e, int n_ataque) throws PokemonCongeladoException {
		if(this.get_congelado() == false) {
			switch(n_ataque) {
			case 1:
				rayoHielo(e);
			case 2:
				ventisca(e);
			case 3:
				ataqueDeAla(e);
			case 4: 
				tornado(e);
			}
		} else {
			throw new PokemonCongeladoException("error");
		}
		
	}
	

}
