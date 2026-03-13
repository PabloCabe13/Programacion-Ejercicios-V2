package com.gsd.programacion;

public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double interes;
	private double saldo;

	public Cuenta() {
		this.nombre = "";
		this.numCuenta = "";
		this.interes = 0.0;
		this.saldo = 0.0;
	}

	public Cuenta(String nombre, String numCuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double dinero) {
		if (dinero > 0) {
			this.saldo += dinero;
			return true;
		} else {
			return false;
		}
	}

	public boolean reintegro(double cantidad) {
		if (cantidad > 0 && this.saldo >= cantidad) {
			this.saldo -= cantidad;
			return true;
		}
		return false;
	}

	public boolean transferencia(Cuenta cuentaDestino,double cantidad) {
		if(this.reintegro(cantidad)) {
			cuentaDestino.ingreso(cantidad);
			return true;
		}else {
			System.err.println("Transferencia fallida");
			return false;
		}
	}
}
