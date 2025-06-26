package _09_Carrello_Overloading;


public class Main {
	public static void main(String args[]) {
		
		Carrello carrello = new Carrello();
		
		carrello.aggiungiProdotto("Schefflera");
		carrello.aggiungiProdotto("Pothos");
		
		carrello.aggiungiProdotto("Echeveria", 2);
		carrello.aggiungiProdotto("Sansevieria", 3);
		
		System.out.println("Prodotti nel carrello:");
        System.out.println(carrello.mostraProdotti());
	}
}
