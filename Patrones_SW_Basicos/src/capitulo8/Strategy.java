package capitulo8;

public interface Strategy {
	public void comosaluda();

}

class Maquina{
	Strategy c;
	
	public void setEstrategia(Strategy c) {
		this.c = c;		
	}
	
	public void saludar() {
		c.comosaluda();
	}
}

class HablaEspanyol implements Strategy{
	
	public void comosaluda() {
		System.out.println("¡Buenos días!");
	}
}

class HablaFrances implements Strategy{
	
	public void comosaluda() {
		System.out.println("Bonjour");
	}
}
class HablaIngles implements Strategy{
	
	public void comosaluda() {
		System.out.println("Good morning!");
	}
}
class HablaAleman implements Strategy{
	
	public void comosaluda() {
		System.out.println("Guten Morgen");
	}
}