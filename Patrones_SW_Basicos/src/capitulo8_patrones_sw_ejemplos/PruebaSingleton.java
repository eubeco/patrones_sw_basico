package capitulo8_patrones_sw_ejemplos;

/* SINGLETON
 * Este patrón de diseño está diseñado para restringir la creación de objetos pertenecientes a una clase.
 * Su intención consiste en garantizar que una clase sólo tanga una instancia y proporcionar un punto de
 * acceso global a ella.
 */

//Y para poder probarlo crearemos una nueva clase llamada PruebaSingleton cuyo código será:
public class PruebaSingleton {
	
	public static void main(String[] args) { 
		Singleton.getInstance().log("Probando...."); 
		Singleton.getInstance().log("La clase singleton");
	}
}