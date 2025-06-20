package _00_Helloworld;

import java.util.Scanner;

public class Calcolatrice {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in); // crea scanner per leggere input, il nome che ho dato allo scanner è "tastiera"

        System.out.print("Inserire numero: ");
        float num1 = tastiera.nextFloat();         // legge una riga da tastiera
        
        System.out.print("Inserire numero: ");
        float num2 = tastiera.nextFloat();         // legge una riga da tastiera
        
        tastiera.close(); // chiude lo scanner (buona pratica)
        
        // Dichiarazione della variabile per la somma
        //float somma = num1 + num2;

        float somma = somma(num1, num2);
        System.out.println("La somma è: " + somma); //print line va a capo da solo, print non va a capo
        
        float divisione = divisione(num1, num2);
        System.out.println("La divisione è: " + divisione);
        
        float differenza = differenza(num1, num2);
        System.out.println("La differenza è: " + differenza);
        
        float moltiplicazione = moltiplicazione(num1, num2);
        System.out.println("La moltiplicazione è: " + moltiplicazione);
        
   
        
		
	}
	
	 // Funzione che somma due interi
    public static float somma(float a, float b) {
        return a + b;
    }

    public static float divisione(float a, float b) {
    	if(b != 0) {
        	return a / b;
        }else {
            System.out.println("Errore: divisione per zero!");
            return 0; // oppure Float.NaN o altro valore di errore
        }
    	
    }
    public static float differenza(float a, float b) {
    	return a - b;
    }
    
    public static float moltiplicazione(float a, float b) {
    	return a * b;
    }
}
