package capitulo8_patrones_sw_ejemplos;

/* CADENA DE RESPONSABILIDAD
 * Este patr�n de comportamiento evita acoplar el emisor de una petici�n a su receptor dando a m�s 
 * de un objeto la posibilidad de responder a una petici�n. Para ello se encadenan los receptores
 * y pasa la petici�n a trav�s de la cadena hasta que es procesada por alg�n objeto.
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
