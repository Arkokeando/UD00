package UD00_Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls";
		String comandoWindows = "CMD /C DIR";
		
		//String comando = comandoLinux;
		String comando = comandoWindows;
		
		Process p =null;
		
		try {
			p= rt.exec(comando);
			InputStream lectorBytes = p.getInputStream();
			//hace que se lea linea a linea (convierte el flujo de bytes a flujo de caracteres(flujo de bytes)) 
			BufferedReader br = new BufferedReader(new InputStreamReader(lectorBytes));
			
			String linea;
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
				
			}
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
