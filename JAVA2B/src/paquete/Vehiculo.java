package paquete;

import java.util.ArrayList;

public class Vehiculo {
	protected  ArrayList<Ventana> Ventanas =   new ArrayList<Ventana>();
	protected  ArrayList<Rueda> Ruedas =  new ArrayList<Rueda>();
	protected Motor Motor;
	public Vehiculo() {
		for(int i = 1; i < 4; i++) {
			Ventanas.add(new Ventana());
			Ruedas.add(new Rueda());
			
		}
		Motor = new Motor();
	}
	public ArrayList<Rueda> getRuedas() {
		return this.Ruedas;
	}
	
	public ArrayList<Ventana> getVentanas(){
		return this.Ventanas;
	}
	public Motor getMotor(){
		return this.Motor;
	}
	void avanzar() {
		
	}
	void frenar() {
		
	}
}
