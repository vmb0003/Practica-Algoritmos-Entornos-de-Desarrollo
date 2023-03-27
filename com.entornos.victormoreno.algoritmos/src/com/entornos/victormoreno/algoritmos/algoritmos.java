package com.entornos.victormoreno.algoritmos;

public abstract class algoritmos {

	public algoritmos() {
		
	}
	
	public static int fibonacci(int numero) {
		if(numero < 2) return numero;
		return fibonacci(numero-1) + fibonacci(numero-2);
	}
	
}
