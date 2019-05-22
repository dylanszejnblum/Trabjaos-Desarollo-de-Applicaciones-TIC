package paquete;

import java.util.ArrayList;

public class Agenda {
	public static ArrayList<Contacto> contactos;
	private int maxContactos = 150;
	public Agenda() {
		contactos = new ArrayList<Contacto>();
		if(contactos.size() >maxContactos) {
			 throw new IllegalArgumentException("No hay mas espacio");
		}
	}
	void agregarContacto(Contacto c) {
		if(this.existeContacto(c.getNombre()) == true) {
			throw new IllegalArgumentException("Contacto ya existe");
		}
		contactos.add(c);
	}
	void eliminarContacto(String n) {
		for(int i = 0 ; i<contactos.size();i++) {
			if(contactos.get(i).getNombre().contentEquals(n)) {
				contactos.remove(i);
			}
		}
	}
	boolean existeContacto(String n) {
		for(int i = 0 ; i<contactos.size();i++) {
			if(contactos.get(i).getNombre().contentEquals(n)) {
				return true;
			}
		}
		return false;
	}
	boolean estaCompleta() {
		if(contactos.size() == maxContactos) {
			return true;
		}else {
			return false;
		}
	}
}
