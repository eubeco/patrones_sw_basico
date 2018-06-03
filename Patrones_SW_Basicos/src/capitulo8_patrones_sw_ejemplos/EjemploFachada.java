package capitulo8_patrones_sw_ejemplos;
/* FACHADA
 * El patr�n fachada viene motivado por la necesidad de estructurar un entorno de programaci�n
 * y reducir su complejidad con la divisi�n en subsistemas, minimizando las comunicaciones y 
 * dependencias entre �stos.
 * Se aplicar� cuando se necesite proporcionar una interfaz simple para un subsistema complejo.
 */



public class EjemploFachada{
	public static void main(String[] args) {
		int a=7;
		int b=4;
		String operacion="-";
		System.out.println("Se usa calculadora para hacer: "+a+" "+ operacion +" "+b);
		FachadaCalculadora calc = new FachadaCalculadora(a,b,operacion);
		System.out.println("Resultado de la operacion:" + calc.operacion());
	}
}
