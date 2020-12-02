package UD00_Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {

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
			System.out.println("La salida ha sido: ");
			
			InputStream  errorStream = p.getErrorStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(errorStream));
			
			String linea;
			
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
					
			}
			
			br.close();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}

	}

}
