public class CuentaBancaria {
	private String numero;
	private long saldo;
	private Cliente titular;

	public CuentaBancaria(String numero, long saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void ingreso(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		}
	}

	public void reintegro(double cantidad) {
		if (saldo > cantidad) {
			saldo -= cantidad;
		}
	}

	public String devolverDni() {
		return titular.getDni();
	}

}