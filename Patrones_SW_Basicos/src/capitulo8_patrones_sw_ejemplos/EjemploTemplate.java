package capitulo8_patrones_sw_ejemplos;

/* TEMPLATE
 * Este patrón se caracteriza por la definición, dentro de una operación de una superclase,
 * de los pasos de un algoritmo, de forma que todos o parte de estos pasos son redefinidos
 * en las subclases herederas de la citada superclase.
 * 
 * Es adecuada cuando:
 * .- Cuando contamos con un algoritmo con varios pasos que no cambian, de modo que dichos
 *    pasos invariantes serían implementados en una superclase, dejando la implementación
 *    de los pasos que cambian para las subclases.
 * .- Para evitar la replicación de código mediante generalización: se factoriza el 
 *    comportamiento común de varias subclases en una única superclase.
 * .- Para controlar las extensiones de las subclases. Este método utiliza métodos especiales
 *    (métodos de enganche o hooks) en ciertos puntos, siendo los únicos puntos que pueden
 *    ser redefinidos y por tanto, los únicos puntos donde es posible la extensión.   
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
