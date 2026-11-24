package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Bandeja;
import models.CocineroHilo;
import models.Comensal;

public class BandejaController {

	public static void main(String[] args) {
		Bandeja bandeja = new Bandeja();
		List<Thread> hilos = new ArrayList<Thread>();
		
		CocineroHilo cocinerobase = new CocineroHilo(bandeja, "Cocinero");
		
		Thread cocinero1 = new Thread(cocinerobase);
		hilos.add(cocinero1);
		Thread cocinero2 = new Thread(cocinerobase);
		hilos.add(cocinero2);
		Thread cocinero3 = new Thread(cocinerobase);
		hilos.add(cocinero3);
		Thread cocinero4 = new Thread(cocinerobase);
		hilos.add(cocinero4);

		
		Thread comensal1 = new Thread(new Comensal(bandeja, "Jesus"));
		hilos.add(comensal1);
		Thread comensal2 = new Thread(new Comensal(bandeja, "Juan"));
		hilos.add(comensal2);
		Thread comensal3 = new Thread(new Comensal(bandeja, "Javier"));
		hilos.add(comensal3);
		
		for (Thread h : hilos) {
			h.start();
		}

	}

}
