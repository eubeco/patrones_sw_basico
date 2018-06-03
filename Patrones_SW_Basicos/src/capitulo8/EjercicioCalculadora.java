package capitulo8;

import java.awt.EventQueue;

public class EjercicioCalculadora {
	public static void main(String[] args ) {
		double a=7;
		double b=4;
		String operacion ="-"; 
		LoggingSingleton.getInstance().log("Se usa calculadora " + " para hacer: " + a+ " " + operacion +" " +b); 
		FachadaCalculadoraOps calc = new FachadaCalculadoraOps(a,b, operacion); 
		calc.operacion();	

//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FachadaCalculadoraOps calc = new FachadaCalculadoraOps();
//					calc.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});

	}
}

