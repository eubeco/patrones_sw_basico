package capitulo8_patrones_sw_ejemplos;

/* STRATEGY
 * El patr�n estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto
 * cliente puede elegir aque que le conviene e intercambiarlo din�micamente seg�n sus necesidades.
 * Aplicando el patr�n a una clase que defina m�ltiples comportamientos moviendo el c�digo a clases 
 * independientes donde se almacenar� cada estrategia.
 */

class EjemploEstrategia {
	public static void main(String args[])
	{
		Coche context = new Coche();
		//Usamos la estrategia A
		Strategy estrategia_inicial = new EstrategiaABS(); 
		context.setEstrategia(estrategia_inicial); 
		context.frenar();
		
		//Decidimos usar la estrategia B
		Strategy estrategia2 = new EstrategiaSinABS(); 
		context.setEstrategia(estrategia2); 
		context.frenar();
		//Finalmente,usamos de nuevo la estrategia A 
		context.setEstrategia(estrategia_inicial); 
		context.frenar();
	}
}