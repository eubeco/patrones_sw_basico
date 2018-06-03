package capitulo8_patrones_sw_ejemplos;

/* STRATEGY
 * El patrón estrategia permite mantener un conjunto de algoritmos de entre los cuales el objeto
 * cliente puede elegir aque que le conviene e intercambiarlo dinámicamente según sus necesidades.
 * Aplicando el patrón a una clase que defina múltiples comportamientos moviendo el código a clases 
 * independientes donde se almacenará cada estrategia.
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