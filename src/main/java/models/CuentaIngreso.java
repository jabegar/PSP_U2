package models;

public class CuentaIngreso implements Runnable {
	private Cuenta cuenta;
	
	public CuentaIngreso(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			int aleatorio=((int)(Math.random()*500+1));
			this.cuenta.ingresarDinero(aleatorio);		
		}
	}

}
