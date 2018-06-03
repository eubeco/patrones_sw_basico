package capitulo8;

public class LoggingSingleton {

	int DEBUG=1;
	
	/**objeto Singleton*/
	private static LoggingSingleton miLogSingleton= new LoggingSingleton();
	
	private LoggingSingleton(){
		log("Eventos de Usuario:");
		log("");
	}
	
	public static LoggingSingleton getInstance() {
		return miLogSingleton;
	}
	
	public void log(String contenido) {
		if (DEBUG==1)
		{ System.out.println(contenido);}
	}
}