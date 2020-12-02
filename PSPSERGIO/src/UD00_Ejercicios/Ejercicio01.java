package UD00_Ejercicios;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio01 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux ="firefox iescristobaldemonroy.es";
		String comandoWindows= "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe iescristobaldemonroy.es";
		
		//String comando=comandoLinux;
		String comando=comandoWindows;
		
		try {
			//en windows hay que poner la ruta del ejecutable.
			rt.exec(comando);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
