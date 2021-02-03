package UD02_Ejercicios.EjemploCoche;

public class FordFiesta extends Coche implements Runnable{

	int velocidad;
	public FordFiesta(String matricula, int kilometros, int velocidad){
		super(matricula, kilometros);
		this.velocidad=velocidad;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.kilometros=kilometros+velocidad;
			System.out.println("Coche con matricula "+this.matricula+" ,recorrido actualmente "+this.kilometros+" kilómetros");
		}
	}

	@Override
	public String toString() {
		return super.toString()+" velocidad=" + velocidad + "]";
	}

}
