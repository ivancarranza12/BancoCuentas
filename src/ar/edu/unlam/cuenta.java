package ar.edu.unlam;

public class cuenta {
	
	private Double saldo;
	private Integer numeroCuenta;
	
	
	
	
	
	public cuenta(Double saldo, Integer numeroCuenta) {
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public Boolean extraer(Double monto){
		
		
			this.saldo -= monto;
		
		
		return true;
		
	}
	
	public void depositar(Double monto) {
		
		this.saldo += monto;
		
		
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	

}
