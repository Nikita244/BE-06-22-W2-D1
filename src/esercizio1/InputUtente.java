package esercizio1;

import java.util.Scanner;

public class InputUtente {
	private Scanner in = new Scanner(System.in);
	private int num, pos;

	public void sceltaUtente() {

		boolean fine = false;
		while (!fine) {
			try {
				System.out.println("Inserisci un numero da 1 a 10 | Per uscire digita 0");
				num = Integer.parseInt(in.nextLine());
				 // se invi 0 esci dal sistema
				if (num == 0) {
					fine = true;
					System.out.println("Sei uscito dal sistema.");
					in.close();
					break;
				}
				// se non è un numero o supera i parametri
				if (num < 1 || num > 10 || num != (int) num) {

					throw new NumberFormatException();
				}

				System.out.println("Posiziona il numero " + num + " che hai appena scelto in una posizione dell'array [1 - 5]: ");
				pos = Integer.parseInt(in.nextLine());
				// se non è un numero o supera i parametri
				if (pos < 1 || pos > 5 || pos != (int) pos) {
					throw new NumberFormatException();
				}

				updateArray(num, pos); //aggiorna array

			} catch (NumberFormatException e) {
				System.out.println("Errore: devi inserire un valore tra 1 e 5."); // stampa il messaggio errato
			}
		}
		in.close();
	}

	public void updateArray(int num, int pos) {
		int[] array = Main.array;
		int posArray = pos - 1;
		array[posArray] = num;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array n." + (i + 1) + " = " + array[i]);
		}
	}
}
