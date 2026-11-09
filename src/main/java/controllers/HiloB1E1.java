package controllers;

public class HiloB1E1 implements Runnable {
	private String name;
	public HiloB1E1 (String str) {
		this.name = str;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(this.getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public String getName() {
		return this.name;
	}
}
