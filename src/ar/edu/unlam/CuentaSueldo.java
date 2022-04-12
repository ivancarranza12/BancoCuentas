package ar.edu.unlam;

public class CuentaSueldo extends cuenta {
	
	
	
	public CuentaSueldo(Double saldo, Integer numeroCuenta) {
		super(saldo, numeroCuenta);
	
	}

	@Override
	public Boolean extraer (Double monto) {
		Boolean sePuedeEntrar = false;
		if(monto <= this.getSaldo() && monto > 0) {
			this.setSaldo(getSaldo()-monto);
			sePuedeEntrar =  true;
	}

		return sePuedeEntrar;
	}
}