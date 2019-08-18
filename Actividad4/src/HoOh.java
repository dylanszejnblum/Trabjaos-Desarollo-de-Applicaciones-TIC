
public class HoOh extends Pokemon implements TipoFuego , TipoVolador{
	
	public HoOh() {
		super(500 , 350 , 150 , 150,10 , true);
		
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
				llamarada(e);
				break;
			case 2:
				sofoco(e);
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



	@Override
	public void llamarada(Pokemon poke) {
		// TODO Auto-generated method stub
		double AtaquePoke = this.getAtaque() * 20 / this.getVelocidad() - poke.defender(this.getAtaque() * 20 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
	}


	@Override
	public void sofoco(Pokemon e) {
	       // TODO Auto-generated method stub
	       if(this.getAtaque() < 50) {
	           throw new AtaqueInsuficienteException();
	       }
	       else {
	           this.ataque = this.getAtaque() - 50;
	       if(this.getAtaque() == 0) {
	           this.ataque = 1;
	       }
	       double movment = 50;
	       e.restarVida(this.getAtaque() * movment / this.getVelocidad() - e.defender(this.ataque * movment / this.velocidad));
	       }
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
		double AtaquePoke = this.getAtaque() * 5 / this.getVelocidad() - poke.defender(this.getAtaque() * 5 / this.getVelocidad());
		poke.restarVida(AtaquePoke);
		
	}
	
}
