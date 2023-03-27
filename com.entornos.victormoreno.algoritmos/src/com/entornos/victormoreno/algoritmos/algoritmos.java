package com.entornos.victormoreno.algoritmos;

/**
 * 
 * @author victor
 * @version 1.0
 *
 */

public abstract class algoritmos {

	/**
	 * Metodo fobinacci
	 * Devuelve el numero fibonacci del numero que pasemos por parametro
	 * @param numero
	 * @return numero fibonacci
	 */
	
	public static int fibonacci(int numero) {
		int a = 0, b = 1, c;
		if(numero == 0) {
			return a;
		}
		for(int i = 2; i <= numero; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	/**
	 * Metodo factorial
	 * Devuelve el numero factorial del numero que introduzcamos
	 * @param numero
	 * @return factorial
	 */
	
	public static long factorial(int numero) {
		long factorial = 1;
		for(int i = 2; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	/**
	 * Metodo primo
	 * Devuelve un booleano que nos indica si el numero introducido es primo o no
	 * @param numero
	 * @return primo
	 */
	
	public static boolean primo(int numero) {
		boolean ok = true;
		int divisor = 2;
		
		while((ok) && (divisor!=numero)) {
			if(numero%divisor==0) {
				ok = false;
			} else {
				divisor++;
			}
		}
		return ok;
	}
}
