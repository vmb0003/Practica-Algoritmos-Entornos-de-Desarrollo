package com.entornos.victormoreno.arrays;

public abstract class Arrays {

	public static double media(int[] m) {
		int suma = 0;
		for(int i = 0; i < m.length; i++) {
			suma += m[i];
		}
		return suma/m.length;
	}
	
	public static int mediana(int[] m) {
		int mediana;
		java.util.Arrays.sort(m);
		
		if(m.length%2 == 0) {
			mediana = m[m.length/2] + m[(m.length)-1];
		} else {
			mediana = m[((int)m.length/2)];
		}
		return mediana;
	}
	
	public static int maximo(int[] m) {
		int max = m[0];
		for(int i = 1; i < m.length; i++) {
			if(m[i] > max) {
				max = m[i];
			}
		}
		return max;
	}
	
	public static int minimo(int[] m) {
		int min = m[0];
		for(int i = 1; i < m.length; i++) {
			if(m[i] < min) {
				min = m[i];
			}
		}
		return min;
	}
	
}
