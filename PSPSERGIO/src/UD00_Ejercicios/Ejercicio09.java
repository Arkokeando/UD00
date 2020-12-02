package UD00_Ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio09 {

	public static void main(String[] args) {
		Process proceso = null;
		int estado = -1;
		String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR C:\\\\Users\\\\sergi\\\\git\\\\EjerciciosGit\\\\Ejercicios\\\\ficheros";
		String comando = comandoWindows;
		List<String> listaComandos = new ArrayList<String>();
		listaComandos.add("CMD");
		listaComandos.add("DIR");
		listaComandos.add("/C");
		listaComandos.add("C:\\Users\\sergi\\git\\EjerciciosGit\\Ejercicios\\ficheros");

		// Creamos el procesBuilder de la lista de comandos
		ProcessBuilder procesBuild = new ProcessBuilder(listaComandos);

		// Indicamos los respectivos ficheros de salida
		File ficheroSalida = new File(Cadenas.getCadenaFichero("salida_ejercicio9.txt"));
		File ficheroSalidaError = new File(Cadenas.getCadenaFichero("log_ejercicio9.txt"));
		procesBuild.redirectOutput(ficheroSalida);
		procesBuild.redirectError(ficheroSalidaError);

		try {

			proceso = procesBuild.start(); // iniciamos el proceso
			estado = proceso.waitFor();// El estado espera hasta que termine el proceso por completo
			System.out.println("El comando " + comando + " ha resultado " + estado);

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		if (estado == 0) {
			// Ha ido ok, se muestra el ficheroSalida
			System.out.println("Consultar salida en: " + ficheroSalida);

		} else {
			// Se muestra el fichero log
			System.out.println("Consultar log en: " + ficheroSalidaError);

		}

	}

}
