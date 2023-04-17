package com.entornos.victormoreno.arrays;

/**
 * 
 * @author victor
 * @version 1.0
 *
 */

public abstract class Arrays {

	/**
	 * Metodo media
	 * Devuelve la media del array que pasamos por parametro
	 * @param m Un array del cual vamos a calcular la media
	 * @return Un double que representa la media del array
	 */
	
	public static double media(int[] m) {
		int suma = 0;
		for(int i = 0; i < m.length; i++) {
			suma += m[i];
		}
		return ((double)suma/m.length);
	}
	
	/**
	 * Metodo mediana
	 * Devuelve la mediana del array que pasamos por parametro
	 * @param m Un array del cual vamos a calcular la mediana
	 * @return Un int que representa la mediana del array
	 */
	
	public static double mediana(int[] m) {
		double mediana;
		java.util.Arrays.sort(m);
		
		if(m.length%2 == 0) {
			mediana = (double)(m[m.length/2] + m[(m.length)/2-1])/2;
		} else {
			mediana = m[((int)m.length/2)];
		}
		return mediana;
	}
	
	/**
	 * Metodo maximo
	 * Devuelve el valor maximo de un array
	 * @param m Un array del cual vamos a extraer el valor maximo
	 * @return Un int que representa el valor maximo del array
	 */
	
	public static int maximo(int[] m) {
		int max = m[0];
		for(int i = 1; i < m.length; i++) {
			if(m[i] > max) {
				max = m[i];
			}
		}
		return max;
	}
	
	/**
	 * Metodo minimo
	 * Devuelve el valor minimo de un array
	 * @param m Un array del cual vamos a extraer el valor minimo
	 * @return Un int que representa el valor minimo del array
	 */
	
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
