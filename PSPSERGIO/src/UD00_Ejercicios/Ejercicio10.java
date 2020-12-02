package UD00_Ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio10 {

	public static void main(String[] args) {
		List<String> lCmdLinux = new ArrayList<String>();
		lCmdLinux.add("/bin/bash");
		lCmdLinux.add("-c");
		lCmdLinux.add("echo $MI_NOMBRE");
		
		List<String> lCmdWindows = new ArrayList<String>();
		lCmdWindows.add("CMD");
		lCmdWindows.add("/C");
		lCmdWindows.add("echo");
		lCmdWindows.add("%MI_NOMBRE%");
		
		List<String> lComandos = null;
		
		if (System.getProperty("os.name").contains("Windows")) {
			lComandos=lCmdWindows;
		}else {
			lComandos=lCmdLinux;
		}
		ProcessBuilder pb = new ProcessBuilder(lComandos);
		
		//Creas un map con todas las variables de entorno (te lo devuelve el metodo environment)
		//y le añades la nueva.
		Map<String, String> vEnt = pb.environment();
		vEnt.put("MI_NOMBRE", "SERGIO");
		//pb.environment().put("MI_NOMBRE", "SERGIO");
		
		System.out.println(vEnt);
		pb.inheritIO();
		
		try {
			pb.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
