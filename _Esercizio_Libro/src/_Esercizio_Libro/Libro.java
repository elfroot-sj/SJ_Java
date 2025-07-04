package _Esercizio_Libro;

public class Libro {
	String titolo;
	String autore;
	String editore;
	double prezzo;
	
	public Libro(String titolo, String autore, String editore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.prezzo = prezzo;
	}
	
	public void stampaInfo() {
		System.out.println("Dettagli libro:\nTitolo: " + titolo + "\n" + "Autore: " + autore + "\n" + 
	"Edizione: " + editore + "\n" + "Prezzo: " + prezzo);
	}
	
	
}
