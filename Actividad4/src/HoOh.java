
public class HoOh extends Pokemon implements TipoFuego , TipoVolador{
	
	public HoOh() {
		super(500 , 350 , 150 , 150,10 , true);
		
	}



	@Override
	public void atacar(Pokemon e, int n_ataque)throws PokemonCongeladoException {
		if(this.get_congelado() == false) {
		switch(n_ataque) {
		case 1:
			this.llamarada(e);
		case 2:
			try {
				this.sofoco(e);
			} catch (AtaqueInsuficienteException e1) {
				// TODO Auto-generated catch block
				
			}
		case 3:
			this.ataqueDeAla(e);
		case 4:
			this.tornado(e);
		}
	}else {
		throw new PokemonCongeladoException("error");
		}
	}



	@Override
	public void llamarada(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = ataque * p1 / this.velocidad - poke.defender(p1);
		poke.vida = poke.vida - AtaquePoke;
	}



	@Override
	public void sofoco(Pokemon poke) throws AtaqueInsuficienteException {
		double AtaquePoke = ataque * p2 / this.velocidad - poke.defender(p2);
		poke.vida = poke.vida - AtaquePoke;
		this.ataque = this.ataque-50;
		if(this.ataque == 1) {
			throw new AtaqueInsuficienteException("Error");
		}
		
		
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
	
}
