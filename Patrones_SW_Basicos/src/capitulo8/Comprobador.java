package capitulo8;

abstract class Comprobador {

	protected Comprobador sucesor;
	
	public void setSucesor(Comprobador sucesor) {
		this.sucesor = sucesor;
	}
	
	public abstract void comprobarCadena(String cadena);
}

class ComprobarInicial extends Comprobador{
	@Override
	public void comprobarCadena(String cadena) {
		// TODO Auto-generated method stub
		String _first = cadena.substring(0,1); 
		if (_first.toUpperCase().equals(_first)) {
			System.out.println("La cadena " + cadena + " empieza por mayúscula");
		}		
		else{ 
			if (sucesor!=null) sucesor.comprobarCadena(cadena);
			}
	}
}
class ComprobarLongitud extends Comprobador{
	@Override
	public void comprobarCadena(String cadena) {
		
		if (cadena.length() > 5) {
			System.out.println("La cadena " + cadena + " tiene más de 5 caracteres.");					
		} else {
			if (sucesor!=null)
				sucesor.comprobarCadena(cadena);
		}
	}
}
class ComprobarNumero extends Comprobador{
	@Override
	public void comprobarCadena(String cadena) {

		try
		{
			Integer.parseInt(cadena);
			System.out.println("La cadena" + cadena + " es un numero.");
		}catch (Exception e)
				{
			System.out.println("La cadena " + cadena + " NO es un numero.");
				}
		if (sucesor!=null)
			sucesor.comprobarCadena(cadena);
	}
}

