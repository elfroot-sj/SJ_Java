package _03_ArrayList;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> nomi = new ArrayList<>();
		
		nomi.add("Mario");
		nomi.add("Alice");
		nomi.remove("Mario");
		nomi.add("Bob");
		nomi.add("Carla");
		nomi.add("Gianni"); //rimosso Mario, Gianni è indice 3
		
		System.out.println("Nomi nella lista:");
		for (String nome : nomi) {
		    System.out.println(nome);
		}
		
		System.out.println("\n*aggiungo Luca*");
		nomi.set(3, "Luca"); //sovrascrivo il valore dell'indice 3
		
		System.out.println("\nLista aggiornata:");
		for (String nome : nomi) {
		    System.out.println(nome);
		}
		
		System.out.print("\nNumero elementi della lista: ");
		System.out.println(nomi.size());
		
	}
}