package controllers;

public class HiloInterrumpido implements Runnable {

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) 
		{
			System.out.println("SERVICIOS");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

	}

}
