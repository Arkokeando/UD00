package UD00_Ejercicios;

import java.io.IOException;

public class Ejercicio07 {

	public static void main(String[] args) {
		String comandoLinux ="firefox";
		String comandoWindows="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		String comando = comandoWindows;
		String url ="iescristobaldemonroy.es";

		try {
			ProcessBuilder processBuilder = new ProcessBuilder(comando, url );
			processBuilder.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
