package models;

public class Contador {
	private int valor = 0;

	public synchronized void incrementar(String nombreHilo) {
		valor++;
		System.out.println(nombreHilo);
	}

	public int getValor() {
		return valor;
	}
}
