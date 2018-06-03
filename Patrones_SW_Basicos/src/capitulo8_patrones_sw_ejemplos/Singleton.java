package capitulo8_patrones_sw_ejemplos;
/* SINGLETON
 * Este patrón de diseño está diseñado para restringir la creación de objetos pertenecientes a una clase.
 * Su intención consiste en garantizar que una clase sólo tanga una instancia y proporcionar un punto de
 * acceso global a ella.
 */

public class Singleton {
	
	int DEBUG=1;
	
	/**objeto Singleton*/
	private static Singleton miLogSingleton= new Singleton();
	
	private Singleton(){
		log("Eventos de Usuario:");
		log("");
	}
	
	public static Singleton getInstance() {
		return miLogSingleton;
	}
	
	public void log(String contenido) {
		if (DEBUG==1)
		{ System.out.println(contenido);}
	}
}
