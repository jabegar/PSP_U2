package models;

public class CuentaRetiro implements Runnable {

	private Cuenta cuenta;

	public CuentaRetiro(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			int aleatorio = ((int) (Math.random() * 500 + 1));
			this.cuenta.retirarDinero(aleatorio);
		}
	}

}
