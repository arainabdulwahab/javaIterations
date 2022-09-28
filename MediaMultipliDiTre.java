package condizionaliECicli;

import java.util.Scanner;

public class MediaMultipliDiTre {

	public static void main(String[] args) {
		/*
		 * Scrivere un programma MediaMultipliDiTre che chiede all’utente di 
		 * inserire una sequenza di interi (chiedendo prima quanti numeri 
		 * voglia inserire) e poi stampa la media di tutti i numeri inseriti 
		 * che siano divisibili per tre. Per esempio, se si immettono i 
		 * valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovr`a essere 9. 
		 * Risolvere questo esercizio senza usare array.
		 * 
		 */
		 Scanner input = new Scanner(System.in);
		 int counter = 0;
		 int totalNum = 0;
		 int countDivThree = 0;
		 System.out.println("quanti numeri voi inserire ");
		 int num = input.nextInt();
		 while(counter < num) {
			 counter ++;
			 System.out.println("inserisci un numero ");
			 int nums = input.nextInt();
			 if(nums % 3 == 0) {
				 countDivThree ++;
				 totalNum += nums;
			 }
		 } // end while loop
		 int result = 0;
		 if(num != 0) {
			  result = totalNum / countDivThree;
		 }else {
			 result = 0;
		 }
		 System.out.println("il totale ::: " + result);
		 input.close();
	}
}
