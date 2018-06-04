package capitulo8_patrones_sw_ejemplos;

/* CADENA DE RESPONSABILIDAD
 * Este patrón de comportamiento evita acoplar el emisor de una petición a su receptor dando a más 
 * de un objeto la posibilidad de responder a una petición. Para ello se encadenan los receptores
 * y pasa la petición a través de la cadena hasta que es procesada por algún objeto.
 */

public class EjemploCadenaResponsabilidad {
	
		public static void main(String[] args)
		{
		Manejador m1 = new ComprobarPeticion();
		Manejador m2 = new ComprobarDineroEnCuenta();
		Manejador m3 = new DarDinero();
		m1.setSucesor(m2);
		m2.setSucesor(m3);
		m1.manejarPeticion(new Peticion(-20)); 
		m1.manejarPeticion(new Peticion(0)); 
		m1.manejarPeticion(new Peticion(105)); 
		m1.manejarPeticion(new Peticion(25));
		}
		}
