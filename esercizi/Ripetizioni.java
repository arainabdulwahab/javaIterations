package condizionaliECicli;

import java.util.Scanner;

public class Ripetizioni {

	public static void main(String[] args) {
		/*
		 * Scrivere un programma Ripetizioni che chiede all’utente di 
		 * inserire una sequenza di caratteri (chiedendo prima quanti 
		 * caratteri voglia inserire) e li ristampa man mano che 
		 * vengono inseriti. L’intero procedimento (chiedere quanti 
		 * caratteri voglia inserire, leggere i caratteri e man mano 
		 * stamparli) dovr`a essere ripetuto 5 volte. Risolvere questo 
		 * esercizio senza usare array. 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("quanti charatteri voi inserire un numero");
		int num = input.nextInt();
		int count = 0;
		while(count < num) {
			System.out.println("inserisci un charattere ");
			String letter = input.next().trim();
			System.out.println(letter.repeat(5));
			count ++;
		}
		System.out.println("End");
		input.close();
	}

}
