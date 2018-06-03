package capitulo8;

import java.util.ArrayList;
import java.util.Iterator;

abstract class EmpleadoBase{
	public void add(EmpleadoBase empleadobase) {		
	}
	
	public EmpleadoBase getChild(int i) {
		return null;
	}
	
	public void remove(EmpleadoBase empleado) {		
	}
	
	public abstract void print();
}


class Comercial extends EmpleadoBase{
	
	// NO SOBREESCRIBIREMOS LOS METODOS DE add, getChild y remove porque
	// es un elemento HOJA
	private String nombre;	
	
	public Comercial (String nombre){
		this.nombre = nombre;		
	}
	public void print() { 
		System.out.println("Nombre = " + this.nombre);		 
		System.out.println("");
	}
}

class Directivo extends EmpleadoBase{
	private String nombre;
	private String cargo;
	
	ArrayList<EmpleadoBase> empleados = new ArrayList<EmpleadoBase>();
	
	public Directivo(String nombre, String cargo){
		this.nombre = nombre;		
		this.cargo = cargo;
	}
	public void add(EmpleadoBase empleado) { 
		empleados.add(empleado);
	}
	public EmpleadoBase getChild(int i) {
		return empleados.get(i);
	}
	public void print() {
		System.out.println("");
		System.out.println("Nombre: " + this.nombre);		 
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Empleados a su cargo:");
		Iterator<EmpleadoBase> empleadosIterator = empleados.iterator();
		while(empleadosIterator.hasNext()){
			EmpleadoBase empleado = empleadosIterator.next(); 
			empleado.print();
		}
	}
	public void remove(EmpleadoBase empleado) { 
		empleados.remove(empleado);
	}
}


public class JerarquiaEmpresa {
	

	public static void main(String[] args) {
		
		EmpleadoBase emp1 = new Comercial("Juan"); 
		EmpleadoBase emp2 = new Comercial("Pepe"); 
		EmpleadoBase emp3 = new Comercial("Carlos"); 
		EmpleadoBase emp4 = new Comercial("Josep");
		EmpleadoBase emp5 = new Directivo("Josep","Jefe de Zona"); 
		emp5.add(emp1);
		emp5.add(emp2);
		EmpleadoBase emp6 = new Directivo( "Enrique","Jefe de Zona"); 
		emp6.add(emp3);
		emp6.add(emp4);
		EmpleadoBase emp7 = new Directivo("Francisco","Director General"); 
		emp7.add(emp5);
		emp7.add(emp6);
		emp7.print(); 
		
	}

}
