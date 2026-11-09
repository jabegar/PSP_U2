package controllers;

public class Hilo extends Thread{
	public Hilo (String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + this.getName());
			try {
				sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("FIN " + this.getName());
	}
}
