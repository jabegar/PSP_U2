package controllers;

import java.util.Scanner;

public class PadreInterrumpe {

	public static void main(String[] args) {
		HiloInterrumpido h = new HiloInterrumpido();
		Thread th = new Thread(h);
		
		th.start();
		
		System.out.println("Pulsa enter para interrumpir");
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		th.interrupt();
	}

}
