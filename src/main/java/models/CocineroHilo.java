package models;

public class CocineroHilo implements Runnable {
	private Bandeja bandeja;
	private String nombreHilo;
	
	public CocineroHilo(Bandeja bandeja, String nombreHilo) {
		this.bandeja = bandeja;
		this.nombreHilo = nombreHilo;
	}
	@Override
	public void run() {
		System.out.println("Empieza hilo " + this.nombreHilo);
		
		try {
			Thread.currentThread().sleep(5000);
			System.out.println("Empiezo a cocinar " + this.nombreHilo);
			bandeja.pongoPlato(nombreHilo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
