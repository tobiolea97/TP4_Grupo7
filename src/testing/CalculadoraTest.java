package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import entidad.Calculadora;

class CalculadoraTest {

	private Calculadora cal = new Calculadora();
	
	@BeforeAll
	public static void beforeAllTest()
	{
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void afterAllTest()
	{
		System.out.println("After all");
	}
	
	@BeforeEach
	public void beforeEachTest()
	{
		System.out.println("Before each");
	}
	
	@AfterEach
	public void afterEachTest()
	{
		System.out.println("After each");
	}
	
	
	
	@Disabled
	@Test
	public void sumar_ambosNumerosPositivos()
	{
		int res=cal.sumar(5, 7);
		assertEquals(12, res, "Este es el mensaje de error que va a aparecer");
	}
	
	@Disabled
	@Test
	public void sumar_ambosNumerosNegativos()
	{
		int res=cal.sumar(-5, -7);
		assertEquals(-12, res);
	}
	
	
	@Tag("Produccion")
	@Test
	public void sumar_primerPositivo_segundoNegativo()
	{
		int res=cal.sumar(5, -7);
		assertEquals(-2, res);
	}
	
	@Test
	public void sumar_primerNegativo_segundoPositivo()
	{
		int res=cal.sumar(-5, 7);
		assertEquals(2, res);
	}
	
	@Test
	public void esPar()
	{
		assertEquals(true,  cal.esPar(4));
		assertTrue(cal.esPar(4));
		
	}
	
	
}
