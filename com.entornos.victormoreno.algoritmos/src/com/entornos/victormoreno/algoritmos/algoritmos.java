package com.entornos.victormoreno.algoritmos;

/**
 * 
 * @author victor
 * @version 1.0
 *
 */

public abstract class algoritmos {

	/**
	 * 
	 * @param numero
	 * @return
	 */
	
	public static int fibonacci(int numero) {
		if(numero < 2) return numero;
		return fibonacci(numero-1) + fibonacci(numero-2);
	}
	
	public static int factorial(int numero) {
		int factorial = 1;
		for(int i = 2; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
