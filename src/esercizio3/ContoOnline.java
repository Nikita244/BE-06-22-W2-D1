package esercizio3;

public class ContoOnline extends ContoCorrente{
	
	ContoOnline(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	double maxPrelievo;


	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) {
		if (x <= maxPrelievo) {
			super.preleva(x);
		}
		try {
			if(x>maxPrelievo) {
				throw new BancaException("Il prelievo non è disponibile");
			}
		}catch(BancaException e ) {
			System.out.println(e.getMessage());
		}
	}
}

/*Modificare il metodo preleva della sottoclasse ContoOnLine in modo che se x>maxPrelievo viene lanciata una eccezione di tipo BancaException istanziando l’eccezione con la stringa “il prelievo non è disponibile”.*/




