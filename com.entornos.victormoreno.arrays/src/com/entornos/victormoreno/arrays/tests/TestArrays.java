package com.entornos.victormoreno.arrays.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.victormoreno.arrays.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestArrays {
	
	int a1[];
	int a2[];
	int a3[];
	
	@BeforeAll
	void inicializar() {
		a1 = new int[] {1,2,3,4,5};
		a2 = new int[] {5,3,4,6};
		a3 = new int[] {2,4,6};
	}
			
			
	@Test
	void testMedia() {
		double resultado1 = Arrays.media(a1);
		double resultadoEsperado1 = 3;
		double resultado2 = Arrays.media(a2);
		double resultadoEsperado2 = 4.5;
		double resultado3 = Arrays.media(a3);
		double resultadoEsperado3 = 4;
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	
	@Test
	void testMediana() {
		double resultado1 = Arrays.mediana(a1);
		double resultadoEsperado1 = 3;
		double resultado2 = Arrays.mediana(a2);
		double resultadoEsperado2 = 4.5;
		double resultado3 = Arrays.mediana(a3);
		double resultadoEsperado3 = 4;
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}

}
