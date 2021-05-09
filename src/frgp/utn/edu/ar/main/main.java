package frgp.utn.edu.ar.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizAdyacencia mt = new MatrizAdyacencia(10);
		
		for(int i=0; i<10 ; i++) {
			for (int j=0; j<10;j++) {
				if( !mt.existeElemento(i, j)) {
					mt.agregarElemento(i, j);
				}
			}	
		}
		
		System.out.println(mt.getCantidadElementos());
				
	}
	
	
}
