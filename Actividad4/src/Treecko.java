
public class Treecko  extends Pokemon implements TipoPlanta{

	public Treecko() {
		super(90, 90, 120, 150, 2, true);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void latigoCepa(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = ataque * pp1 / this.velocidad - poke.defender(pp1);
		poke.vida = poke.vida - AtaquePoke;
	}

	@Override
	public void hojaAguda(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke =  ataque * pp2 / this.velocidad - poke.defender(pp2);
		poke.vida = poke.vida - AtaquePoke;
	}

	@Override
	public void atacar(Pokemon e, int n_ataque) throws PokemonCongeladoException {
		if(this.get_congelado() == false) {
		switch(n_ataque) {
		case 1:
			latigoCepa(e);
		case 2:
			hojaAguda(e);
			
		}
		}else {
			throw new PokemonCongeladoException("error");
		}
		
	}

}
