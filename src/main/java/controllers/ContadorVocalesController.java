package controllers;

import models.ContadorVocalesTotales;
import models.HiloVocal;

public class ContadorVocalesController {

	public static void main(String[] args) {
		ContadorVocalesTotales cvt = new ContadorVocalesTotales();
		String cadenaBuscar = "Esta es la cadena a buscar";
		HiloVocal hvA = new HiloVocal('a', cadenaBuscar, cvt);
		HiloVocal hvE = new HiloVocal('e', cadenaBuscar, cvt);
		HiloVocal hvI = new HiloVocal('i', cadenaBuscar, cvt);
		HiloVocal hvO = new HiloVocal('o', cadenaBuscar, cvt);
		HiloVocal hvU = new HiloVocal('u', cadenaBuscar, cvt);

		
		Thread thA = new Thread(hvA);
		Thread thE = new Thread(hvE);
		Thread thI = new Thread(hvI);
		Thread thO = new Thread(hvO);
		Thread thU = new Thread(hvU);
		
		thA.start();
		thE.start();
		thI.start();
		thO.start();
		thU.start();
		
		try {
			thA.join();
			thE.join();
			thI.join();
			thO.join();
			thU.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cvt.getNumVocalesTotales());
	}
}
