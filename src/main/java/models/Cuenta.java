package models;

public class Cuenta {
	private double dineroTotal;
	
	public Cuenta(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}
	
	public synchronized double retirarDinero(double dineroRetirar) {
		if (this.dineroTotal > dineroRetirar) {
			this.dineroTotal -= dineroRetirar;
			System.out.println("Se ha retirado " + dineroRetirar + "€");
			return dineroRetirar;
		}
		else {
			System.out.println("Error retirando " + dineroRetirar + "€, saldo insifuciente");
			return 0;
		}
	}
	
	public synchronized void ingresarDinero(double dineroIngresar) {
		this.dineroTotal += dineroIngresar;
		System.out.println("Se ha añadido " + dineroIngresar + "€");
	}
}
