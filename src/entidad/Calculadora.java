package entidad;

public class Calculadora {

	public int sumar(int a, int b)
	{
		int res= a+b;
		return res;
	}
	
	public boolean esPar(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	
}
