package capitulo8_patrones_sw_ejemplos;

/* TEMPLATE
 * Este patr�n se caracteriza por la definici�n, dentro de una operaci�n de una superclase,
 * de los pasos de un algoritmo, de forma que todos o parte de estos pasos son redefinidos
 * en las subclases herederas de la citada superclase.
 * 
 * Es adecuada cuando:
 * .- Cuando contamos con un algoritmo con varios pasos que no cambian, de modo que dichos
 *    pasos invariantes ser�an implementados en una superclase, dejando la implementaci�n
 *    de los pasos que cambian para las subclases.
 * .- Para evitar la replicaci�n de c�digo mediante generalizaci�n: se factoriza el 
 *    comportamiento com�n de varias subclases en una �nica superclase.
 * .- Para controlar las extensiones de las subclases. Este m�todo utiliza m�todos especiales
 *    (m�todos de enganche o hooks) en ciertos puntos, siendo los �nicos puntos que pueden
 *    ser redefinidos y por tanto, los �nicos puntos donde es posible la extensi�n.   
 *    
 */

public class EjemploTemplate {
	public static void main(String[] args) {
		Automovil manual=new AutomovilManual(); 
		manual.desplazar();
		Automovil automatico=new AutomovilAutomatico(); 
		automatico.desplazar();
		}
}
