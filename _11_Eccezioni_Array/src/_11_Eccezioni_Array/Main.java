package _11_Eccezioni_Array;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		/* String[] nomi = new String[5]; //creo un array di lunghezza 5
		nomi[0] = "Pirandello";
		nomi[1] = "Ungaretti";
		nomi[2] = "Verga";
		nomi[3] = "Dante";
		nomi[4] = "Leopardi"; */
		
		String[] nomi = {"Pirandello", "Ungaretti", "Leopardi", "Verga", "Dante"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scegliere indice: ");
        int index = input.nextInt();
        
        
        try {
        	System.out.println("Il nome associato a " + index + " è: " + nomi[index]);
        } catch (Exception e) {
        	System.out.println("Non esiste alcun nome associato a questo indice.");
        } finally {
        	 input.close();
        }	
		
	}
}
