package UD00_Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio03 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR";
		
		//String comando = comandoLinux;
		String  comando = comandoWindows;
		
		Process p =null;
		
		try {
			p= rt.exec(comando);
			InputStream is = p.getInputStream();
			//hace que se lea linea a linea (convierte el flujo de bytes a flujo de caracteres(flujo de bytes)) 
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			BufferedWriter bw= new BufferedWriter( new FileWriter("archivo_comando.txt"));
			
			String linea;
			while ((linea=br.readLine())!=null) {
				bw.write(linea);
				bw.newLine();
			}
			bw.close();
			br.close();

	} catch (IOException e) {
		// TODO: handle exception
	}
	}

}
