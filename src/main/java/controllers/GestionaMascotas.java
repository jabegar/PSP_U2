package controllers;

import models.Mascota;

public class GestionaMascotas {

	public static void main(String[] args) {
		Mascota cuidador1 = new Mascota("Lulu");
		Mascota cuidador2 = new Mascota("Lulu");
		Mascota cuidador3 = new Mascota("Lulu");
		Mascota cuidador4 = new Mascota("Lulu");
		Mascota cuidador5 = new Mascota("Lulu");
		
		Thread hilo1 = new Thread(cuidador1);
		Thread hilo2 = new Thread(cuidador2);
		Thread hilo3 = new Thread(cuidador3);
		Thread hilo4 = new Thread(cuidador4);
		Thread hilo5 = new Thread(cuidador5);
		
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		
		System.out.println();
	}

}
