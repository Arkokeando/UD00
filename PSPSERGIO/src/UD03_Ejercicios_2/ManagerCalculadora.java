package UD03_Ejercicios_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ManagerCalculadora {

	private String protocolo;
	private String urlEndPoint;
	private Integer apiKey;
	private boolean estaRegistrada;

	public ManagerCalculadora(String protocolo, String urlEndPoint, Integer apiKey, boolean estaRegistrada) {
		super();
		this.protocolo = protocolo;
		this.urlEndPoint = urlEndPoint;
		this.apiKey = apiKey;
		this.estaRegistrada = estaRegistrada;
	}

	public ManagerCalculadora() {
		super();
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getUrlEndPoint() {
		return urlEndPoint;
	}

	public void setUrlEndPoint(String urlEndPoint) {
		this.urlEndPoint = urlEndPoint;
	}

	public Integer getApiKey() {
		return apiKey;
	}

	public void setApiKey(Integer apiKey) {
		this.apiKey = apiKey;
	}

	public boolean isEstaRegistrada() {
		return estaRegistrada;
	}

	public void setEstaRegistrada(boolean estaRegistrada) {
		this.estaRegistrada = estaRegistrada;
	}

	public void sumar(int a, int b){ // a + b
		try {
			//direccion web
			protocolo = "https://psp2021site.000webhostapp.com/";
			//
			urlEndPoint = "realizaOperacion.php";
			//api obligatoria de la web
			apiKey = 177;
			//constructor de url
			URL url = new URL(protocolo + urlEndPoint + "?API_KEY=" + apiKey + "&TIPO_OPERACION=SUMA&SUMANDO_A=" + a
					+ "&SUMANDO_B=" + b);
			//conexión
			URLConnection urlCon = url.openConnection();
			//Lector de la web
			BufferedReader lector;
			InputStream inputStream = urlCon.getInputStream();
			lector = new BufferedReader(new InputStreamReader(inputStream));
			//almaceno el valor de la web en el String
			String inputLine;
			
			while ((inputLine = lector.readLine()) != null)
				System.out.println(inputLine);
			lector.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void restar(int a, int b) {
		try {
			protocolo = "https://psp2021site.000webhostapp.com/";
			urlEndPoint = "realizaOperacion.php";
			apiKey = 101;
			URL url = new URL(protocolo + urlEndPoint + "?API_KEY=" + apiKey + "&TIPO_OPERACION=RESTA&MINUENDO=" + a
					+ "&SUSTRAENDO=" + b);
			
			URLConnection urlCon = url.openConnection();
			BufferedReader lector;
			InputStream inputStream = urlCon.getInputStream();
			lector = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			while ((inputLine = lector.readLine()) != null)
				System.out.println(inputLine);
			lector.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void multiplicar(int a, int b) {
		try {
			protocolo = "https://psp2021site.000webhostapp.com/";
			urlEndPoint = "realizaOperacion.php";
			apiKey = 101;
			URL url = new URL(protocolo + urlEndPoint + "?API_KEY=" + apiKey + "&TIPO_OPERACION=MULTIPLICACION&OPERADOR_1=" + a
					+ "&OPERADOR_2=" + b);
			URLConnection urlCon = url.openConnection();
			BufferedReader lector;
			InputStream inputStream = urlCon.getInputStream();
			lector = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			while ((inputLine = lector.readLine()) != null)
				System.out.println(inputLine);
			lector.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
