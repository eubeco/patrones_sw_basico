package capitulo8_patrones_sw_ejemplos;

/* SINGLETON
 * Este patr�n de dise�o est� dise�ado para restringir la creaci�n de objetos pertenecientes a una clase.
 * Su intenci�n consiste en garantizar que una clase s�lo tanga una instancia y proporcionar un punto de
 * acceso global a ella.
 */

//Y para poder probarlo crearemos una nueva clase llamada PruebaSingleton cuyo c�digo ser�:
public class PruebaSingleton {
	
	public static void main(String[] args) { 
		Singleton.getInstance().log("Probando...."); 
		Singleton.getInstance().log("La clase singleton");
	}
}