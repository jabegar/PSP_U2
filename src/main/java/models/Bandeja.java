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
		this.platos.add(plato);
		notifyAll();
	}
	
	public synchronized void quitoPlato(String plato) throws InterruptedException {
		while(this.platos.size() == 0) {
			wait();
		}
		this.platos.remove(plato);
		notifyAll();
	}
}
