package capitulo8_patrones_sw_ejemplos;

//clase Fachada que oculta la complejidad
class FachadaCalculadora {
	int numeroA = 0;
	int numeroB = 0;
	String operacion = null;
	//constructor que recibe los numeros a sumar o restar
	public FachadaCalculadora( int pA, int pB, String pOperacion){
		this.numeroA =pA;
		this.numeroB =pB;
		this.operacion=pOperacion;
	}
	public int operacion(){
		int resultado=0;
		if (operacion.equals("+")){
			SumaNumeros s = new SumaNumeros(); resultado = s.suma(numeroA,numeroB);
		}
		if (operacion.equals("-")){
			RestaNumeros s = new RestaNumeros(); resultado = s.resta(numeroA,numeroB);
		}
		return resultado;
	}
}

//clase que suma
class SumaNumeros {
	public int suma(int pA,int pB){
		return pA + pB;
	}
}
//clase que resta
class RestaNumeros{
	public int resta(int pA,int pB){
		return pA-pB;
	}
}