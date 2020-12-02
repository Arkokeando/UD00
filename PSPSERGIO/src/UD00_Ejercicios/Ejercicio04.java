package UD00_Ejercicios;

public class Ejercicio04 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "lsss -help";
		String comandoWindows = "CMD /C DIRRRR";
		
		//String comando = comandoLinux;
		String comando = comandoWindows;

		Process p  = null;
		
		try {
			p = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int status;
		try {
			status = p.waitFor();
			System.out.println("El comando "+ comando + " ha resultado "+status);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
