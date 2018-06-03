package capitulo8_patrones_sw_ejemplos;

/* COMPOSITE
 * El patrón composite sirve para construir objetos complejos a partir de otros más simples y similares
 * entre si, gracias a la composición recursiva y a una estructura en forma de árbol.
 * 
 * .- Nos permite crear una estructura que pueda tener cualquier nivel de complejidad y sea dinámica.
 * .- Simplifica el programa al tratar a todos los objetos de igual forma. Para ello lo que hace es
 * 	  tratar de forma uniforme toda la estructura del componente, utilizando operaciones comunes para
 *    toda la jerarquía.
 * .- Facilita agregar nuevas clases de componentes insertándolas en la jerarquía de clases como 
 *    subclases de componente o de hoja.
 *    
 * Para lograrlo en este patrón se crea una jerarquía de objetos básicos y de composiciones de estos 
 * de forma recursiva. 
 */

public class EjemploComposite {	
	public static void main(String[] args) {
		Empleado emp1=new Developer("John", 10000);
		Empleado emp2=new Developer("David", 15000);
		Empleado manager1=new Manager("Daniel",25000); 
		manager1.add(emp1);
		manager1.add(emp2);
		Empleado emp3=new Developer("Michael", 20000);
		Manager generalManager=new Manager("Mark", 50000); 
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();

	}
}