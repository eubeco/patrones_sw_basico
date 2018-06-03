package capitulo8_patrones_sw_ejemplos;

abstract class Automovil
{
	public final void desplazar()
	{
		acelerar();

		cambiarMarcha();
		frenar();
	}
	private void acelerar()
	{
		System.out.println("Acelerando...");
	}
	private void frenar()
	{
		System.out.println("Frenando...");
	}
	protected abstract void cambiarMarcha();
}

class AutomovilManual extends Automovil
{
	protected void cambiarMarcha()
	{
		System.out.println("Cambiando de marcha de forma manual");
	}
}

class AutomovilAutomatico extends Automovil
{
	protected void cambiarMarcha()
	{
		System.out.println("Cambiando de marcha de forma automática");
	}
}

