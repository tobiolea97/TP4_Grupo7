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
	
	@Test
	public void eliminarElementoTest() {
		int x,y;
		x = 3;
		y = 2;
		matrizAdyacencia.agregarElemento(x, y);
		assertTrue(matrizAdyacencia.existeElemento(x, y));
		matrizAdyacencia.eliminarElemento(x, y);
		assertFalse(matrizAdyacencia.existeElemento(x, y));
	}
	
	@Test
	public void eliminarElementoSimetricoTest() {
		int x,y;
		x = 3;
		y = 2;
		matrizAdyacencia.agregarElemento(x, y);
		assertTrue(matrizAdyacencia.existeElemento(x, y));
		assertTrue(matrizAdyacencia.existeElemento(y, x));
		matrizAdyacencia.eliminarElemento(x, y);
		assertFalse(matrizAdyacencia.existeElemento(x, y));
		assertEquals(false, matrizAdyacencia.existeElemento(y, x));
	}
	
	@Test
	public void contarRelacionesTest() {
		matrizAdyacencia.agregarElemento(1, 2);
		matrizAdyacencia.agregarElemento(2, 5);
		matrizAdyacencia.agregarElemento(3, 4);
		matrizAdyacencia.agregarElemento(4, 1);
		assertEquals(4, matrizAdyacencia.getCantidadElementos());
	}
	
	@Test
	public void existenTodosLosElementoTest () {
		int cant=10;
		MatrizAdyacencia mt = new MatrizAdyacencia(cant);
		
		//AGREGO LOS ELEMENTOS
		for(int i=0; i<10 ; i++) {
			for (int j=0; j<10;j++) {
				mt.agregarElemento(i, j);
			}	
		}
		
		//RECORRO LA MATRIZ PARA VERIFICAR SI SE AGREGO CORRECTAMENTE EN LA POS Y SU SIMETRICO TAMBIEN.
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				assertEquals(true, mt.existeElemento(i, j));
				assertEquals(true, mt.existeElemento(j, i));
			}
		}
	}
	
	@Test
	public void agregarElementoFilaNegativaTest() {
		int cant=10;
		MatrizAdyacencia mt = new MatrizAdyacencia(cant);
		
		
		assertThrows(ArrayIndexOutOfBoundsException.class,()-> mt.agregarElemento(-1, 1));
		
	}
	
	@Test
	public void agregarElementoColumnaNegativaTest() {
		int cant=10;
		MatrizAdyacencia mt = new MatrizAdyacencia(cant);
		
		
		assertThrows(ArrayIndexOutOfBoundsException.class,()-> mt.agregarElemento(1, -1));
	}
	
	@Test
	public void agregarElementoFueraRangoTest() {
		int cant=10;
		MatrizAdyacencia mt = new MatrizAdyacencia(cant);
		
		
		assertThrows(ArrayIndexOutOfBoundsException.class,()-> mt.agregarElemento(11, 11));
	}
}
