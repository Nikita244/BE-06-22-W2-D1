package esercizio3;

public class Banca {

	public static void main(String[] args) {

		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(500);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
			throw new BancaException("Errore durante il prelievo: ");
		} catch (BancaException e) {
			
			System.out.println(e);
			e.printStackTrace();
		}

		ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(600);

			conto2.stampaSaldo();
			
			throw new BancaException("Errore durante il prelievo: ");

		} catch (BancaException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}


/*Modificare la classe Banca in modo da catturare l’eccezione di tipo BancaException e stampare l’errore ogni volta che si richiama il metodo preleva*/




