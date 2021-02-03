package UD02_Ejercicios;

public class HiloCuentaBancaria {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta(40);
		SacarDinero hAna = new SacarDinero("Ana", c);
		SacarDinero hJuan = new SacarDinero("Juan", c);
		hAna.start();
		hJuan.start();

	}

	static class Cuenta {
		private int saldo;

		Cuenta(int s) {
			saldo = s;
		} // inicializa saldo actual

		int getSaldo() {
			return saldo;
		} // devuelve el saldo

		void restar(int cantidad) { // se resta la cantidad al saldo
			saldo = saldo - cantidad;
		}
		//Ponemos aqui el synchronized porque es donde se van realizando las operaciones
		//de la cuenta, llamando al método restar. De esta manera, cuando el saldo llegue a 0
		// no se podrán seguir haciendo operaciones. Como Ana llega antes para retirar el dinero,
		//Juan no puede realizar sus operaciones.
		synchronized void retirarDinero(int cant, String nom) {
			if (getSaldo() >= cant) {
				System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}
				restar(cant);
				System.out.println(nom + " retira => " + cant + " ACTUAL(" + getSaldo() + ")");
			} else {
				System.out.println(nom + " No puede retirar dinero, NO HAY SALDO (" + getSaldo() + ")");
			}
			if (getSaldo() < 0) {
				System.out.println("SALDO NEGATIVO => " + getSaldo());
			}
		}// RetirarDinero
	}// Cuenta

	static class SacarDinero extends Thread {
		private Cuenta c;
		String nom;

		public SacarDinero(String n, Cuenta c) {
			super(n);
			this.c = c;
		}


		public void run() {
			for (int x = 1; x <= 4; x++) {
				c.retirarDinero(10, getName());
			}
		} // run
	}
}
