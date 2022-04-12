package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaAhorroTest {

	@Test
	public void queSePuedaExtraerDineroDeUnaCajaDeAhorroConMonto() {
		
		Double saldoInicial = 1000.0;
		
		CajaAhorro caja1 = new CajaAhorro (saldoInicial,1);
		Double montoaRetirar = 300.0;
		Double valorEsperado = 700.0;
		
		
		
		//Boolean valorObtenido = caja1.extraer(montoaRetirar);
		//assertTrue(valorObtenido);
		
		
		caja1.extraer(montoaRetirar);
		Double valorObtenido = caja1.getSaldo();
		
		assertEquals(valorEsperado,valorObtenido);
		
		
	}
		
	@Test
	
	public void queSePuedaExtraerMasDeCincoVeces() {
		
Double saldoInicial = 1000.0;
		
		CajaAhorro caja2= new CajaAhorro (saldoInicial,1);
		Double montoaRetirar = 100.0;
		Double valorEsperado = 494.0;
				
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		
		Double valorObtenido = caja2.getSaldo();
		
		assertEquals(valorEsperado,valorObtenido);
		
		
		
		
		
	}
	
	@Test 
	
	public void queSiElMontoAExtraerEsMayorAMiSaldoNoSiga() {
		Double saldoInicial = 500.0;
		CajaAhorro caja2= new CajaAhorro (saldoInicial,1);
		Double montoaRetirar = 100.0;
		Double valorEsperado = 100.0;
				
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		caja2.extraer(montoaRetirar);
		
		Double valorObtenido = caja2.getSaldo();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

