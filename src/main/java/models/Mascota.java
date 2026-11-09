package models;

public class Mascota implements Runnable {
	
	private String nombre;
	private int vecesAlimentada;
	
	public Mascota(String nombre) {
		this.nombre = nombre;
		this.vecesAlimentada = 0;	
	}
	
	public void comer() {
		this.vecesAlimentada++;
		System.out.println("La macota con nombre " + this.nombre + " ha comenzado a comer");
		
		try {
			Thread.sleep(1000 * this.vecesAlimentada);
			System.out.println("La macota con nombre " + this.nombre + " ha terminado de comer");
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void run() {
		this.comer();
	}
	
	public int getVecesAlimentadas() {
		return this.vecesAlimentada;
	}

}
