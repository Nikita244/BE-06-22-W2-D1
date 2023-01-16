package esercizio2;

import java.util.Scanner;

public class Consumi {

	double km, carburante, consumo;

	Scanner in = new Scanner(System.in);

	public void calcolo() {
		try {
			System.out.println("Inserisci i km percorsi: ");
			km = Integer.parseInt(in.nextLine());
			System.out.println("Inserisci i litri di carburante consumati: ");
			carburante = Integer.parseInt(in.nextLine());
			if (carburante != (int) carburante) {
				throw new NumberFormatException();
			}
			if (carburante == 0.0) {
				throw new ArithmeticException("Errore, non è possibile dividere per zero!");
			}

			in.close();

		} catch (NumberFormatException e) {
			System.out.println("il valore non è consentito");
		}

		try {
			consumo = km / carburante;
			System.out.printf("Hai percorso %.1fkm / litro.", consumo);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
}
