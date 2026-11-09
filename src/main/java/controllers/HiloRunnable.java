package controllers;

public class HiloRunnable implements Runnable {

	private String name;
	public HiloRunnable (String str) {
		this.name = str;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + this.getName());
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("FIN " + this.getName());
	}
	
	public String getName() {
		return this.name;
	}

}
