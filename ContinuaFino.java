package condizionaliECicli;

import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		/*
		 * Scrivere un programma ContinuaFino che chiede all’utente di
		 *  inserire una sequenza di interi. Il programma continua a 
		 *  chiedere all’utente di inserire valori fintanto che i 
		 *  valori inseriti soddisfano
		 *  almeno una delle seguenti condizioni:
		 *  • `e negativo e divisibile per 2
		 *  • `e positivo e divisibile per 3
		 *  Al termine il programma stampa la somma di tutti i valori 
		 *  inseriti escluso quello ha violato le condizioni.
		 *  Risolvere questo esercizio senza usare array.
		 */
		 Scanner input = new Scanner(System.in);
		 
		 boolean condition = false;
		 int totNum = 0; // contain total sum 
		 
		 System.out.println("inserisci un numero ");
		 int num =0;
		 while(condition == false) {
			 num = input.nextInt();
			 // verify if the condition met loop ends
			 if((num < 0 && num % 2 == 0) || (num > 0 && num % 3 == 0)) {
				 condition = true;
			 }
			 // ask again for number
			 if(condition != true) {
				 System.out.println("inserisci unaltro  numero ");
			 	 totNum += num;
			 }
		 }// end loop
		 
		 // result
		 System.out.println("total---> " + totNum);
	}

}
