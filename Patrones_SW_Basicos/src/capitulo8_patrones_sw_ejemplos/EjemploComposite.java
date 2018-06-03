package capitulo8_patrones_sw_ejemplos;

/* COMPOSITE
 * El patr�n composite sirve para construir objetos complejos a partir de otros m�s simples y similares
 * entre si, gracias a la composici�n recursiva y a una estructura en forma de �rbol.
 * 
 * .- Nos permite crear una estructura que pueda tener cualquier nivel de complejidad y sea din�mica.
 * .- Simplifica el programa al tratar a todos los objetos de igual forma. Para ello lo que hace es
 * 	  tratar de forma uniforme toda la estructura del componente, utilizando operaciones comunes para
 *    toda la jerarqu�a.
 * .- Facilita agregar nuevas clases de componentes insert�ndolas en la jerarqu�a de clases como 
 *    subclases de componente o de hoja.
 *    
 * Para lograrlo en este patr�n se crea una jerarqu�a de objetos b�sicos y de composiciones de estos 
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