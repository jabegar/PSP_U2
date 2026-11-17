package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import models.LectorResources;

public class GestionaResources {
	public static void main(String[] args) {
		File f = new File("src/main/resources");
		int totalCaracteres = 0;
		File[] hijos = f.listFiles();
		
		List<Thread> hilos = new ArrayList<Thread>();
		List<LectorResources> lectores = new ArrayList<LectorResources>();
		
		long t_comienzo = System.currentTimeMillis();
		for (int i = 0; i < hijos.length; i++) {
			File hijo = hijos[i];
			LectorResources lr = new LectorResources();
			Thread th = new Thread(lr, hijo.getName());
			
			hilos.add(th);
			lectores.add(lr);
			th.start();
		}
		
		for (Thread h : hilos) {
			try {
				h.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        long t_fin = System.currentTimeMillis();
        long tiempototal = t_fin-t_comienzo;
        System.out.println("El proceso total ha tardado= "+tiempototal+"mseg");

		
		for (LectorResources lr : lectores) {
			totalCaracteres += lr.numCaracteres;
		}
		
		System.out.println(totalCaracteres + " caracteres");
		
	}
}
