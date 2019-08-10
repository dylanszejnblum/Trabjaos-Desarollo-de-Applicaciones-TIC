
public interface TipoFuego {
	
	double p1 = 20;
	double p2 = 50;
	public abstract void llamarada(Pokemon poke);
	public abstract  void sofoco(Pokemon poke) throws AtaqueInsuficienteException;
}
