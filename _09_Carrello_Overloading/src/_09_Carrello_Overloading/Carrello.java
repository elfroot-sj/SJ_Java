package _09_Carrello_Overloading;
import java.util.ArrayList;

public class Carrello {
	private ArrayList<String> prodotti; //String è un tipo; per pura questione dimostrativa lascio private ma non servirebbe realisticamente
	// lo uso come se fosse un attributo di questa classe

	public Carrello() { //costruttore della classe per inizializzare l'attributo sopra
		prodotti = new ArrayList<String>(); //prodotti deve essere uguale alla lista sopra, che è vuota
		
	}
	
	public void aggiungiProdotto(String nome) { //questo metodo mi serve per aggiungere il prodotto al carrello
		prodotti.add(nome);
	}
	
	
	public void aggiungiProdotto(String nome, int quantità) {
		String qta = String.valueOf(quantità);
		String prodotto = nome + " x" + qta;
		prodotti.add(prodotto);
		
		}
	
	//metodo che stampa tutti i prodotti nel carrello usando un foreach
	public String mostraProdotti() {
	    StringBuilder sb = new StringBuilder(); // usiamo StringBuilder per costruire la stringa finale
	    for (String prodotto : prodotti) {
	        sb.append(prodotto).append("\n"); // aggiunge ogni prodotto seguito da una nuova riga
	    }
	    return sb.toString(); //restituisce la stringa finale
	}

	
	
	
}
