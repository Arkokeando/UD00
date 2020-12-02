package UD00_Ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio11 {

	public static void main(String[] args) {
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("java");
		lCommand.add("UD00_Ejercicios.Ejercicio10");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		
		String classpath = "C:\\Users\\sergi\\git\\repository\\PSPSERGIO\\bin";
		/*
		 * 
		 * Asi se crea variable de entorno en el cmd.
		 * SETX CLASSPATH "%CLASSPATH%; C:\\Users\\sergi\\git\\repository\\PSPSERGIO\\bin
		 * 
		 */
			
		pb.environment().put("CLASSPATH", classpath);
		pb.inheritIO();
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
