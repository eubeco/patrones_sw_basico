package capitulo8;


public class FachadaCalculadoraOps extends Operacion {

	private double dOperando1;
	private double dOperando2;
	private String sOperacion = "@";


	protected FachadaCalculadoraOps(double a, double b, String operacion) {	

		dOperando1 = a;
		dOperando2 = b;
		sOperacion = operacion;		
	}


	protected void operacion(){			
		super.operacion = sOperacion;
		super.realizaOperacion(dOperando1, dOperando2);
	}


	@Override
	protected void calcula(double a, double b) {
		//dOperando1 = a;
		//dOperando2 = b;
		if (sOperacion == "+") {super.resultado = dOperando1+dOperando2;}
		else {super.resultado = dOperando1-dOperando2;}
		
	}


}
