package UD02_Ejercicios.EjemploCoche;

public class Ejecucion {
	public static void main(String[] args) {
		Thread FordFiesta = new FordFiesta("1", 0, 5);
		Thread seatIbiza = new SeatIbiza("2", 0, 10);
		
		FordFiesta.run();
		seatIbiza.run();
		
		System.out.println(FordFiesta);
		System.out.println(seatIbiza);
	}
}
