package _02_Calcolatrice;

import java.util.Scanner;
 
public class Calcolatrice {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        float a, b, somma, differenza, prodotto, divisione;
        
        System.out.print("Inserire il primo numero: ");
        a = scanner.nextInt();
        
        System.out.print("Inserire il secondo numero: ");
        b = scanner.nextInt();
        
        scanner.close();
        
        somma = a + b;
        differenza = a - b;
        prodotto = a * b;
        divisione =  a / b ;
        
        
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);
		if (b != 0) {
			System.out.println("Divisione: " + divisione);
		} else {
			System.out.println("Non è possibile dividere per zero!");
		}
        
  }   
}