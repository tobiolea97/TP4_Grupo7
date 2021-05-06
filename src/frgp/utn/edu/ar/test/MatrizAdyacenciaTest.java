package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	private MatrizAdyacencia matrizAdyacencia = new MatrizAdyacencia(10);
	
	@Test
	public void agregarElementoTest()
	{
		int i, j;
		i = j = 1;
		matrizAdyacencia.agregarElemento(i, j);
		assertEquals(true, matrizAdyacencia.existeElemento(i,j));
	}
	
	@Test
	public void agregarElementoSimetriaTest()
	{
		int i, j;
		i = 4;
		j = 3;
		matrizAdyacencia.agregarElemento(i, j);
		assertTrue(matrizAdyacencia.existeElemento(i,j));
		assertTrue(matrizAdyacencia.existeElemento(j,i));
	}
	

}
