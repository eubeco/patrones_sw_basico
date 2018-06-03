package capitulo8_patrones_sw_ejemplos;
/* SINGLETON
 * Este patr�n de dise�o est� dise�ado para restringir la creaci�n de objetos pertenecientes a una clase.
 * Su intenci�n consiste en garantizar que una clase s�lo tanga una instancia y proporcionar un punto de
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
