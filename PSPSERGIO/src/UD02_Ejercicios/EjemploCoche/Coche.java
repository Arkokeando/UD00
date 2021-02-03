package UD02_Ejercicios.EjemploCoche;

public class Coche extends Thread{
	String matricula;
	int kilometros;
	
	public Coche(String matricula, int kilometros) {
		this.matricula=matricula;
		this.kilometros=kilometros;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", kilometros=" + kilometros + "]";
	};

}
