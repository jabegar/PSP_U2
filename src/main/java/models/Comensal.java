package models;

public class Comensal implements Runnable {
	private Bandeja bandeja;
	private String nombreHilo;

	public Comensal(Bandeja bandeja, String nombreHilo) {
		this.bandeja = bandeja;
		this.nombreHilo = nombreHilo;
	}

	@Override
	public void run() {
		System.out.println("Empieza hilo " + this.nombreHilo);

		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Empiezo a comer " + this.nombreHilo + ", plato " + i);
				Thread.currentThread().sleep(3000);
				bandeja.quitoPlato();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
