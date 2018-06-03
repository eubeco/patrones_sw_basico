package capitulo8_patrones_sw_ejemplos;

class Coche {
	Strategy c;
	public void setEstrategia(Strategy c) {
		this.c = c;
	}
	public void frenar()
	{
		c.comofrena();
	}
}
class EstrategiaABS implements Strategy{
	@Override
	public void comofrena() {
		System.out.println("Realizamos un frenado en 5 metros con ABS");
	}
}
class EstrategiaSinABS implements Strategy{
	@Override
	public void comofrena() {
		System.out.println("Realizamos un frenado en 10 metros sin ABS");
	}
}