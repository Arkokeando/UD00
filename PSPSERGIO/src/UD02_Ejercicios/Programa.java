package UD02_Ejercicios;

public class Programa {
	public static void main(String[] args) {
		Tarea tarea = new Tarea();
		tarea.start();
		System.out.println("Yo soy el hilo principal y sigo haciendo mi trabajo.");
		System.out.println("Fin del hilo principal.");
	}
}
