package capitulo8;

public class Gramatica {

	public static void main(String[] args) {
		Comprobador m1 = new ComprobarLongitud(); 
		Comprobador m2 = new ComprobarInicial(); 
		Comprobador m3 = new ComprobarNumero();
		m1.setSucesor(m2); 
		m2.setSucesor(m3);
		m1.comprobarCadena("prueba"); 
		m1.comprobarCadena("EjemploEjercicio"); 
		m1.comprobarCadena("1234");
	}
}
