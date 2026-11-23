package controllers;

import models.Contador;
import models.TareaIncremento;

public class CarreraEjemplo {
	public static void main(String[] args) throws InterruptedException {
		Contador contador = new Contador();
		Thread t1 = new Thread(new TareaIncremento(contador), "Hilo 1");
		Thread t2 = new Thread(new TareaIncremento(contador), "Hilo 2");
		Thread t3 = new Thread(new TareaIncremento(contador), "Hilo 3");
		Thread t4 = new Thread(new TareaIncremento(contador), "Hilo 4");
		Thread t5 = new Thread(new TareaIncremento(contador), "Hilo 5");
		Thread t6 = new Thread(new TareaIncremento(contador), "Hilo 6");
		long t_empieza = System.currentTimeMillis();
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		t6.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		long t_acaba = System.currentTimeMillis();
		System.out.println(t_acaba - t_empieza + " milisegundos");
		System.out.println("Valor final: " + contador.getValor()); // esperado: 200000
	}
}
