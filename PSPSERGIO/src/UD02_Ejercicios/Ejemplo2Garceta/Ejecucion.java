package UD02_Ejercicios.Ejemplo2Garceta;

public class Ejecucion {
	public static void main(String[] args) {
		Tic tic = new Tic();
		Tac tac = new Tac();
		//Con el proceso demonio sólo se ejecutarían una sola vez
		tic.setDaemon(true);
		tac.setDaemon(true);
		
		tic.start();
		tac.start();

		//Para que el main dure 5 segundos se lo indicamos con el método sleep (5000 ms)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		//El proceso se parará por donde vaya ejecutándose a los 5 segundos
	}
}
