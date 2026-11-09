package controllers;

import java.util.ArrayList;
import java.util.List;

public class HiloPadreB1 {

	public static void main(String[] args) {
		HiloB1E1 h1 = new HiloB1E1("SERVICIO");
		HiloB1E1 h2 = new HiloB1E1("PROCESO");
		
		Thread th1 = new Thread(h1);
		Thread th2 = new Thread(h2);
		
		List<Thread.State> estadoH1 = new ArrayList<Thread.State>();
		List<Thread.State> estadoH2 = new ArrayList<Thread.State>();
		
		th1.start();
		th2.start();
		
		estadoH1.add(th1.getState());
		estadoH2.add(th2.getState());

		System.out.println(estadoH1);
		System.out.println(estadoH2);
		
		estadoH1.add(th1.getState());
		estadoH2.add(th2.getState());
		
		estadoH1.add(th1.getState());
		estadoH2.add(th2.getState());
		
		System.out.println(estadoH1);
		System.out.println(estadoH2);
		
		try {
			Thread.currentThread().sleep(2000);
			
			estadoH1.add(th1.getState());
			estadoH2.add(th2.getState());
			
			System.out.println(estadoH1);
			System.out.println(estadoH2);			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
