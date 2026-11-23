package models;

public class HiloVocal implements Runnable {
	private char vocal;
	private ContadorVocalesTotales cvt;
	private String cadenaBuscar;
	
	public HiloVocal(char vocal, String cadenaBuscar, ContadorVocalesTotales cvt) {
		this.vocal = vocal;
		this.cadenaBuscar = cadenaBuscar.toLowerCase();
		this.cvt = cvt;
		
	}
	@Override
	public void run() {
		for (int i = 0; i < this.cadenaBuscar.length(); i++) {
			if(this.vocal == this.cadenaBuscar.charAt(i)) {
				this.cvt.incrementarVocales();
			}
		}
	}

}
