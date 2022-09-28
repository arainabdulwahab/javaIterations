package condizionaliECicli;

import java.util.Scanner;

public class TuttoPositivoPari {

	public static void main(String[] args) {
		/*				Esercizio 1
		 * Scrivere un programma TuttiPositiviPari che chiede all’utente
		 *  di inserire una sequenza di interi (chiedendo prima quanti 
		 *  numeri voglia inserire) e poi, al termine dell’inserimento 
		 *  dell’intera sequenza, stampa "Tutti positivi e pari" se i 
		 *  numeri inseriti sono tutti positivi e pari, altrimenti stampa 
		 *  "NO". Risolvere questo esercizio senza usare array
		 */
		Scanner input = new Scanner(System.in);
		
		int counter = 0; // start loop
		int numEquality = 0; // verify > 0 and % 2
		// prompt 
		System.out.println("Quanti numeri coi inserire");
		int totNum = input.nextInt();
		// loop that run the number of time that is inserted by the user
		while(counter < totNum) {
			System.out.println("inserisci un numero");
			int numVer = input.nextInt();
			counter ++;
			// number is greater than 0 and divided by 2 = 0
			if(totNum > 0 && numVer % 2 == 0) {
				numEquality ++;
			}
		} // end while
		
		if(numEquality == totNum) {
			System.out.println( "Tutti positivi e pari");
		}else {
			System.out.println("NO");
		}
		
		input.close();
	}
}
