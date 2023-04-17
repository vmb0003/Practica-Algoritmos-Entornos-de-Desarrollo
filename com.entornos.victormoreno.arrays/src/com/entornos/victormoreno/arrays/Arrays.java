package com.entornos.victormoreno.arrays;

public abstract class Arrays {

	public static double media(int[] m) {
		int suma = 0;
		for(int i = 0; i < m.length; i++) {
			suma += m[i];
		}
		return suma/m.length;
	}
	
	
	
}
