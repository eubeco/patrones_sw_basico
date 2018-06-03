package capitulo8_patrones_sw_ejemplos;

abstract class Manejador {


	protected Manejador sucesor;
	public void setSucesor(Manejador sucesor) {
		this.sucesor = sucesor;
	}
	public abstract void manejarPeticion(Peticion peticion);
}
class ComprobarPeticion extends Manejador{
	@Override
	public void manejarPeticion(Peticion peticion) {
		// TODO Auto-generated method stub
		if (peticion.getValue() == 0)
		{
			System.out.println("Su peticion no puede "
					+ "procesarse por solicitar al banco 0 €");
		}else
			if (peticion.getValue() < 0)
			{
				System.out.println("Su peticion no puede "
						+ "procesarse por solicitar "
						+ "al banco "+peticion.getValue()+" euros");
			}
			else
			{ if (sucesor!=null) sucesor.manejarPeticion(peticion);}
	}
}
class ComprobarDineroEnCuenta extends Manejador{
	@Override
	public void manejarPeticion(Peticion peticion) {
		int saldoExistente=100;//Tenemos 100 euros disponibles
		if (peticion.getValue() > saldoExistente) {
			System.out.println("Su peticion no puede procesarse "
					+ "por solicitar "
					+ "al banco "+peticion.getValue()+" euros "
					+ "cuando su saldo actual"
					+ " es de "+ saldoExistente +" euros");
		} else {
			if (sucesor!=null)
				sucesor.manejarPeticion(peticion);
		}
	}
}
class DarDinero extends Manejador{
	@Override
	public void manejarPeticion(Peticion peticion) {
		System.out.println("Pasamos a darle "
				+ "sus "+ peticion.getValue() +" euros");
		if (sucesor!=null)
			sucesor.manejarPeticion(peticion);
	}
}
class Peticion {
	private int value;
	public Peticion (int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
