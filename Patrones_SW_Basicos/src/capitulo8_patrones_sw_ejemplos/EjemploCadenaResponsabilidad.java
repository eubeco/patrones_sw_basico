package capitulo8_patrones_sw_ejemplos;

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
