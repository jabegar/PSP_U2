package controllers;

public class HiloPadre {

	public static void main(String[] args) {
		Hilo hilo = new Hilo("Primer hilo");
		Hilo hilo2 = new Hilo("Segundo hilo");
		
		hilo.start();
		hilo2.start();
		
		HiloRunnable hr1 = new HiloRunnable("Runnable 1");
		HiloRunnable hr2 = new HiloRunnable("Runnable 2");
		
		Thread th1 = new Thread(hr1);
		Thread th2 = new Thread(hr2);
		
		th1.start();
		th2.start();
	}

}
