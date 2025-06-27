package _10_Eccezioni;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire numeratore: ");
        int numeratore = scanner.nextInt();
        System.out.println("Inserire denominatore: ");
        int denominatore = scanner.nextInt();

        //ECCEZIONI
      try {
         
	        int divisione = numeratore/denominatore;
	        System.out.println("Risultato: " + divisione);
      }
      catch (Exception e){
    	  System.out.println("Impossibile dividere per zero. Scegliere un altro denominatore.");
      } finally {
    	  //viene sempre eseguito anche se il codice va a buon fine
    	  scanner.close();
    	  
      }
		
	}
}
