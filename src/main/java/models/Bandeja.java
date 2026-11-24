package models;

import java.util.ArrayList;
import java.util.List;

public class Bandeja {
	private int capacidad;
	private List<String> platos;
	
	public Bandeja() {
		platos = new ArrayList<String>();
		capacidad = 3;
	}
	
	public synchronized void pongoPlato(String plato) throws InterruptedException {
		while(this.platos.size() == capacidad) {
			wait();
		}
		System.out.println("Cocinando " + plato);
		this.platos.add(plato);
		notifyAll();
	}
	
	public synchronized void quitoPlato() throws InterruptedException {
		while(this.platos.size() == 0) {
			wait();
		}
		String plato = this.platos.remove(0);
		System.out.println("Se ha comido el plato " + plato);
		notifyAll();
	}
}
