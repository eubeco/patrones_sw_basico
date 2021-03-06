package capitulo8;

abstract class Operacion {

	double resultado = 0; 
	String operacion ="";

	public final void realizaOperacion(double a,double b)
	{
		muestraOperacion(a,b); 
		calcula(a,b); 
		muestraResultado();
	}
	private void muestraOperacion(double a, double b)
	{
		LoggingSingleton.getInstance().log("Operacion :" + a + operacion + b);
	}
	private void muestraResultado()
	{
		LoggingSingleton.getInstance().log("El resultado es " + resultado );
	}
	protected abstract void calcula(double a, double b);
}
