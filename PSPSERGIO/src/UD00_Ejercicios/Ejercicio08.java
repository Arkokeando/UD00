package UD00_Ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Ejercicio08 {

	public static void main(String[] args) {
		
		ProcessBuilder procEnvironment = new ProcessBuilder();

		Map<String, String> variables = procEnvironment.environment();
		System.out.println(variables);
		List<String> listaComandos = new ArrayList<String>();
		listaComandos.add("CMD");
		listaComandos.add("/C");
		listaComandos.add("DIRR");
		listaComandos.add("ls"); // 8.2
		listaComandos.add("--help");
		ProcessBuilder procesBuild = new ProcessBuilder(listaComandos);
		System.out.println(procesBuild.command());
		// 8.2
		ProcessBuilder procAyuda = new ProcessBuilder(listaComandos);
		System.out.println(procAyuda.command());

		try {
			procesBuild.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
