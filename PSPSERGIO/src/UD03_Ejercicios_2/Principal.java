package UD03_Ejercicios_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Principal {

	private static String protocolo = "https://psp2021site.000webhostapp.com/";
	private static String urlEndPoint = "registrarAplicacion.php";
	private static Integer apiKey;
	private static boolean estaRegistrada=false;
	private static int numero1, numero2;
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {

		try {
			URL cogerApi = new URL(protocolo + urlEndPoint);
			URLConnection urlCon = cogerApi.openConnection();
			urlCon.connect();
			InputStream input = urlCon.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			String inputline;
			
			while ((inputline = br.readLine()) != null) {
				apiKey = Integer.parseInt(inputline);
				estaRegistrada = true;

			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Introduce el primer operador: ");
		numero1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el segundo operador: ");
		numero2=Integer.parseInt(teclado.nextLine());
		
		ManagerCalculadora mc = new ManagerCalculadora();
		if (estaRegistrada==true) {
			System.out.println("La suma de "+numero1+" + "+numero2+" es igual a: ");
			mc.sumar(numero1,numero2, apiKey);
			System.out.println("La resta de "+numero1+" - "+numero2+" es igual a: ");
			mc.restar(numero1,numero2, apiKey);
			System.out.println("El producto de "+numero1+" * "+numero2+" es igual a: ");
			mc.multiplicar(numero1,numero2, apiKey);
		}else {
			System.out.println("Error al recibir la apiKey");
		}
		

	}

}
