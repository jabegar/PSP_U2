package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Mascota;

public class GestionaMascotas {

	public static void main(String[] args) {
		long t_comienzo = System.currentTimeMillis();
		Mascota mascota = new Mascota("Lulu");
		List<Thread> hilos = new ArrayList<Thread>();
		for (int i = 0; i < 100; i++) {
			
			Thread cuidador = new Thread(mascota, "cuidador" + i);
			
			cuidador.setPriority(Math.round(i%10) + 1);
			cuidador.start();
			
			hilos.add(cuidador);
		}
		
		
		for (Thread thread : hilos) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(mascota.getVecesAlimentadas());
		
		long t_fin = System.currentTimeMillis();
		double tiempoTarda = t_fin - t_comienzo;
		System.out.println(tiempoTarda + " milisegundos");
	}

}
