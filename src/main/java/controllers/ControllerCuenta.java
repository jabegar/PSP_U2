package controllers;

import models.Cuenta;
import models.CuentaIngreso;
import models.CuentaRetiro;

public class ControllerCuenta {
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta(100);

		Thread th1 = new Thread(new CuentaIngreso(cuenta));
		Thread th2 = new Thread(new CuentaIngreso(cuenta));
		Thread th3 = new Thread(new CuentaRetiro(cuenta));
		Thread th4 = new Thread(new CuentaRetiro(cuenta));

		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
